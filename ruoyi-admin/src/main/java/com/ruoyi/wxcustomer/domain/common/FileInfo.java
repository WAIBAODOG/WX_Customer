package com.ruoyi.wxcustomer.domain.common;

import java.util.Hashtable;
import java.util.Map;

public class FileInfo {
	Map<String,String> parameters=new Hashtable<String,String>();
	public final static String EXT_NAME_KEY="extName";
	public final static String FILE_NAME_KEY="fileName";
	public final static String FILE_SIZE_KEY="fileSize";
	public final static String SOURCE_PATH_KEY="sourcePath";
	private byte[] bytes;
	public Object getParameter(String key) {
		return parameters.get(key);
	}
	public void setParameter(String key, String vlaue) {
		this.parameters.put(key, vlaue);
	}
	public String getExtName() {
		return this.parameters.get(EXT_NAME_KEY);
	}
	public void setExtName(String extName) {
		this.parameters.put(EXT_NAME_KEY, extName);
	}
	public byte[] getBytes() {
		return bytes;
	}
	public void setBytes(byte[] bytes) {
		this.bytes = bytes;
		if(bytes==null)
			this.parameters.put(FILE_SIZE_KEY, "0");
		else
			this.parameters.put(FILE_SIZE_KEY, String.valueOf(bytes.length));
	}			//file context
	public void setFileName(String fileName) {
		this.parameters.put(FILE_NAME_KEY, fileName);
	}
	public void setFileSize(Integer fileSize) {
		this.parameters.put(FILE_SIZE_KEY, String.valueOf(fileSize));		
	}
	public void setSourcePath(String sourcePath) {
		this.parameters.put(SOURCE_PATH_KEY, sourcePath);		
	}
	public String getFileName() {
		String value=this.parameters.get(FILE_NAME_KEY);		
		if(value==null)
			return "";
		return value;
	}
	public String getSourcePath() {
		String value=this.parameters.get(SOURCE_PATH_KEY);		
		if(value==null)
			return "";
		return value;
	}
	public Integer getFileSize() {
		String value=this.parameters.get(FILE_SIZE_KEY);		
		if(value==null)
			return null;
		try {
			return Integer.valueOf(value);
		}
		catch(Exception e) {
			return null;
		}
	}

	public static String toString(Map<String,String> parameters) {
		StringBuffer sb=new StringBuffer();
		Object value;
		for (String key : parameters.keySet()) {
			   value = parameters.get(key);
			   if(value==null)
				   sb.append(key+"=null,");
			   else
				   sb.append(key+"="+value+",");
		}
		return sb.toString();
	}
	public Map<String, String> getParameters() {
		return parameters;
	}
	public void setParameters(Map<String, String> parameters) {
		this.parameters = parameters;
	}
	
	@Override
	public String toString() {
		if(bytes==null)
			return "FileInfo [parameters=" + toString(parameters) + ", size=0" + "]";
		else
			return "FileInfo [parameters=" + toString(parameters) + ", size="+bytes.length + "]";
	}
}
