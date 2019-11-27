package com.ruoyi.wxcustomer.service.impl;

  

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.util.ArrayList;
import java.util.Hashtable;
import java.util.Map;
import java.util.Properties;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.csource.common.NameValuePair;
import org.csource.fastdfs.ClientGlobal;
import org.csource.fastdfs.StorageClient;
import org.csource.fastdfs.StorageServer;
import org.csource.fastdfs.TrackerClient;
import org.csource.fastdfs.TrackerServer;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

import com.ruoyi.wxcustomer.domain.common.FileInfo;
import com.ruoyi.wxcustomer.service.IFileService;


@Service
@SuppressWarnings("all")
public class FileFastDFSImpl implements IFileService{
	protected static String FASTDFS_CONFIG_FILE="FASTDFS_CONFIG_FILE";
	protected static String CONF_FILE_NAME="fdfs_client.conf";
	protected static String GROUP_NAME_KEY="group.name";
	protected static String HTTPS_HOST_KEY="http.secret_key";
	protected static final Log logger=LogFactory.getLog(FileFastDFSImpl.class); 
	protected static Properties properties = new Properties();
	static {
	       try {
	    	   Map<String,String> env=System.getenv();  
	    	   //从系统环境变量获取文件路径
		       	String fdfsClientConfigFilePath = env.get(FASTDFS_CONFIG_FILE);
		       	if(fdfsClientConfigFilePath==null) {
		       		//没有则从classpath下获取fdfs_client.conf
		       		URL url = FileFastDFSImpl.class.getClassLoader().getSystemResource(CONF_FILE_NAME);
		       		if(url == null) {
		       			fdfsClientConfigFilePath = "fdfs_client.conf";
		       		}else {
		       			fdfsClientConfigFilePath = url.getFile();
		       		}
		       	}
		       	//fdfsClientConfigFilePath="c:\\fdfs_client.conf";
		 //           	String fdfsClientConfigFilePath = classPath + File.separator + CONF_FILE_NAME;               
		       	logger.info("Fast DFS configuration file path:" + fdfsClientConfigFilePath);  
		       	ClientGlobal.init(fdfsClientConfigFilePath);  
				logger.info("load fastdfs conf file successful.");
				InputStream in = new BufferedInputStream (new FileInputStream(fdfsClientConfigFilePath));
				properties.load(in);
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			} catch (Exception e) {
				e.printStackTrace();
			}
	}
	 
	protected static String getGroupName(){
		return properties.getProperty(GROUP_NAME_KEY);
	}
	 
	private FileInfo download(String groupName,String path) throws Exception{
		TrackerClient tracker = new TrackerClient();  
		TrackerServer trackerServer = null;
		byte[] b = null;
		FileInfo fileInfo=new FileInfo();
		try {
			trackerServer = tracker.getConnection();
			if(trackerServer!=null)
				logger.debug("trackerServer:"+trackerServer.getInetSocketAddress());
			else
				logger.error("trackerServer:is null,not found");
				
			StorageServer storageServer = null;  
			StorageClient  storageClient = new StorageClient(trackerServer, storageServer);
			
			//获取文件描述信息
			NameValuePair[] parameter=storageClient.get_metadata(groupName, path);
			fileInfo.setParameters(toMap(parameter));
			
			b = storageClient.download_file(groupName,path);
			if(b==null) {
				logger.error("download:groupName="+groupName+",path="+path+",file is not found");	
				throw new Exception("download:groupName="+groupName+",path="+path+",file is not found");
			}
			
			fileInfo.setFileSize(b.length);
			fileInfo.setBytes(b);
			return fileInfo;
		} catch (Exception e){
			logger.error("download:groupName="+groupName+",path="+path,e);
			throw new Exception("download:groupName="+groupName+",path="+path,e);
		}   finally{
			if(trackerServer!=null){
				 trackerServer.close();
			 }
		}
	}
	/**
	 * 
	 * @param groupName
	 * @param path
	 * @return
	 * @throws Exception
	 */
	private FileInfo getFileInfo(String groupName,String path) throws Exception{
		TrackerClient tracker = new TrackerClient();  
		TrackerServer trackerServer = null;
		FileInfo fileInfo=new FileInfo();
		try {
			trackerServer = tracker.getConnection();
			if(trackerServer!=null)
				logger.debug("trackerServer:"+trackerServer.getInetSocketAddress());
			else
				logger.error("trackerServer:is null,not found");
				
			StorageServer storageServer = null;  
			StorageClient  storageClient = new StorageClient(trackerServer, storageServer);
			
			//获取文件描述信息
			NameValuePair[] parameter=storageClient.get_metadata(groupName, path);
			fileInfo.setParameters(toMap(parameter));
			return fileInfo;
		} catch (IOException e){
			logger.error("getFileInfo:groupName="+groupName+",path="+path,e);
			throw new Exception("download:groupName="+groupName+",path="+path,e);
		} finally{
			if(trackerServer!=null){
				 trackerServer.close();
			 }
		}
	}

	public String upload(String extName,byte[] bytes,NameValuePair[] parameters) throws Exception{
		String groupName=getGroupName();
		TrackerClient tracker = new TrackerClient();  
		TrackerServer trackerServer = null;
		String rtn;
		try {
			trackerServer = tracker.getConnection();
			if(trackerServer!=null)
				logger.info("trackerServer:"+trackerServer.getInetSocketAddress());
			else
				logger.error("trackerServer:is null,not found");
				
			StorageServer storageServer = null;  
			StorageClient  storageClient = new StorageClient(trackerServer, storageServer);
			//String[] paths = storageClient.upload_file(groupName, bytes, extName,parameters);
			String[] paths = storageClient.upload_file(bytes, extName,parameters);
			rtn=toString(paths);
			logger.info("upload:groupName="+groupName+",extName="+extName+",rtn="+rtn);	
		}  catch (IOException e){
			logger.error("upload:groupName="+groupName+",extName="+extName,e);
			throw new Exception("upload:groupName="+groupName+",extName="+extName,e);
		} finally{
			if(trackerServer!=null){
				 trackerServer.close();
			 }
		}
		return rtn;
	}
	
	public void delete(@RequestParam("path")String path) throws Exception{
		String[] strs=toStrings(path);
		if(strs.length<=1)
			throw new Exception("path format error:path="+path+"format=groupName,filePath");

		String groupName=strs[0];
		String filePath=strs[1];
		TrackerClient tracker = new TrackerClient();  
		TrackerServer trackerServer = null;
		int rtn =-1;
		try {
			trackerServer = tracker.getConnection();
			if(trackerServer!=null)
				logger.info("trackerServer:"+trackerServer.getInetSocketAddress());
			else
				logger.error("trackerServer:is null,not found");
				
			StorageServer storageServer = null;  
			StorageClient  storageClient = new StorageClient(trackerServer, storageServer);
			rtn = storageClient.delete_file(groupName,filePath);
			logger.debug("delete:groupName="+groupName+",path="+filePath+",returncode="+rtn);	
		}catch (IOException e){
			logger.error("delete:groupName="+groupName+",path="+filePath,e);
			throw new Exception("delete:groupName="+groupName+",path="+filePath,e);
		} finally{
			 if(trackerServer!=null){
				 trackerServer.close();
			 }
		}
	}
	public static String toString(String[] strs) {
		StringBuffer sb=new StringBuffer();
		if(strs==null)
			return "";
		for(int i=0;i<strs.length;i++) {
			if(i>0)
				sb.append(",");
			sb.append(strs[i]);
		}
		return sb.toString();
	}
	public static String[] toStrings(String str) {
		if(str==null)
			return new String[0];
		return str.split(",");
	}
	@Override
	public String upload(@RequestBody FileInfo file) throws Exception {
		return this.upload(file.getExtName(), file.getBytes(), toNameValuePair(file.getParameters()));
	}
	@Override
	public FileInfo download(@RequestParam("path") String path) throws Exception {
		String[] strs=toStrings(path);
		if(strs.length<=1)
			throw new Exception("path format error:path="+path+"format=groupName,filePath");
		// TODO Auto-generated method stub
		return this.download(strs[0],strs[1]);
	}
	public static NameValuePair[] toNameValuePair(Map<String,String> parameters) {
		if(parameters==null)
			return new  NameValuePair[0];
		
		ArrayList<NameValuePair> nameValuePairs=new ArrayList<NameValuePair> ();
		for(String key:parameters.keySet()) {
			if(key == null)
				continue;
			NameValuePair nameValuePair=new NameValuePair();
			nameValuePair.setName(key);
			nameValuePair.setValue(parameters.get(key));
			nameValuePairs.add(nameValuePair);
		}
		NameValuePair[] np=new NameValuePair[nameValuePairs.size()];
		return nameValuePairs.toArray(np);
	}
	public static Map<String,String> toMap(NameValuePair[]  parameters) {
		Hashtable<String,String> values=new  Hashtable<String,String>();
		if(parameters==null)
			return values;
		for(int i=0;i<parameters.length;i++) {
			values.put(parameters[i].getName(),parameters[i].getValue());
		}
		return values;
	}
	@Override
	public FileInfo getFileInfo(@RequestParam("path") String path) throws Exception {
		String[] strs=toStrings(path);
		if(strs.length<=1)
			throw new Exception("path format error:path="+path+"format=groupName,filePath");
		// TODO Auto-generated method stub
		return this.getFileInfo(strs[0],strs[1]);
	}
}
