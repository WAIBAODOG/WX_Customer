package com.ruoyi.wxcustomer.service;


import com.ruoyi.wxcustomer.domain.common.FileInfo;

public interface IFileService {
 
	public  String upload( FileInfo file) throws Exception;
 
	public  FileInfo download(String path) throws Exception;
 
	public  void delete(String path) throws Exception;
	
 
	public  FileInfo getFileInfo(String path) throws Exception;
}
