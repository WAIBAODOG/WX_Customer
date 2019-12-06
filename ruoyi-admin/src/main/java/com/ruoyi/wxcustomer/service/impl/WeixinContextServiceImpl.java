package com.ruoyi.wxcustomer.service.impl;

import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.UUID;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ruoyi.common.core.text.Convert;
import com.ruoyi.common.utils.DateUtils;
import com.ruoyi.wxcustomer.domain.KhFile;
import com.ruoyi.wxcustomer.domain.WeixinContext;
import com.ruoyi.wxcustomer.domain.common.FileInfo;
import com.ruoyi.wxcustomer.mapper.KhFileMapper;
import com.ruoyi.wxcustomer.mapper.WeixinContextMapper;
import com.ruoyi.wxcustomer.service.IFileService;
import com.ruoyi.wxcustomer.service.IWeixinContextService;

/**
 * 微信朋友圈内容Service业务层处理
 * 
 * @author ruoyi
 * @date 2019-11-23
 */
@Service
public class WeixinContextServiceImpl implements IWeixinContextService {
	@Autowired
	private WeixinContextMapper weixinContextMapper;
	@Autowired
	private IFileService fileService;
	@Autowired
	private KhFileMapper khFileMapper;

	/**
	 * 查询微信朋友圈内容
	 * 
	 * @param id 微信朋友圈内容ID
	 * @return 微信朋友圈内容
	 */
	@Override
	public WeixinContext selectWeixinContextById(String id) {
		return weixinContextMapper.selectWeixinContextById(id);
	}

	/**
	 * 查询微信朋友圈内容列表
	 * 
	 * @param weixinContext 微信朋友圈内容
	 * @return 微信朋友圈内容
	 */
	@Override
	public List<WeixinContext> selectWeixinContextList(WeixinContext weixinContext) {
		return weixinContextMapper.selectWeixinContextList(weixinContext);
	}

	/**
	 * 新增微信朋友圈内容
	 * 
	 * @param weixinContext 微信朋友圈内容
	 * @return 结果
	 */
	@Override
	public int insertWeixinContext(WeixinContext weixinContext) {
		weixinContext.setCreateTime(DateUtils.getNowDate());
		return weixinContextMapper.insertWeixinContext(weixinContext);
	}

	/**
	 * 修改微信朋友圈内容
	 * 
	 * @param weixinContext 微信朋友圈内容
	 * @return 结果
	 */
	@Override
	public int updateWeixinContext(WeixinContext weixinContext) {
		weixinContext.setUpdateTime(DateUtils.getNowDate());
		return weixinContextMapper.updateWeixinContext(weixinContext);
	}

	/**
	 * 删除微信朋友圈内容对象
	 * 
	 * @param ids 需要删除的数据ID
	 * @return 结果
	 */
	@Override
	public int deleteWeixinContextByIds(String ids) {
		String[] id = Convert.toStrArray(ids);
		Set<String> paths = new HashSet<String>();
		Set<String> fileIds = new HashSet<String>();
		for (int i = 0; i < id.length; i++) {
			KhFile file = new KhFile();
			file.setBusinessId(id[i]);
			file.setBusinessYype("WXC");
			List<KhFile> fileList = khFileMapper.selectKhFileList(file);
			for (int j = 0; j < fileList.size(); j++) {
				paths.add(fileList.get(j).getFilePath());
				fileIds.add(fileList.get(j).getId());
			}

		}
		weixinContextMapper.deleteWeixinContextByIds(Convert.toStrArray(ids));
		try {
			khFileMapper.deleteKhFileByIds(Convert.toStrArray(fileIds.toString()));
			if (paths.size() > 0)
				for (String path : paths) {
					fileService.delete(path);
				}
		} catch (Exception e) {
			return 0;
		}
		return 1;
	}

	/**
	 * 删除微信朋友圈内容信息
	 * 
	 * @param id 微信朋友圈内容ID
	 * @return 结果
	 */
	@Override
	public int deleteWeixinContextById(String id) {
		return weixinContextMapper.deleteWeixinContextById(id);
	}

	public int addContext(List<FileInfo> fileList, WeixinContext weixinContext) {
		try {
			if (StringUtils.isEmpty(weixinContext.getId())) {
				String id = UUID.randomUUID().toString().replaceAll("-", "");
				weixinContext.setId(id);
				weixinContext.setCreateTime(DateUtils.getNowDate());
				weixinContextMapper.insertWeixinContext(weixinContext);
			} else {
				weixinContextMapper.updateWeixinContext(weixinContext);
			}

			fileUpload(fileList, weixinContext, "WXC");
		} catch (Exception e) {
			weixinContextMapper.deleteWeixinContextById(weixinContext.getId());
			return 0;
		}

		return 1;
	}

	public synchronized void fileUpload(List<FileInfo> fileList, WeixinContext weixinContext, String businessType)
			throws Exception {
		Set<String> set = new HashSet<>();
		try {

			for (FileInfo file : fileList) {
				KhFile khFile = new KhFile();
				String filePath = fileService.upload(file);
				set.add(filePath);
				khFile.setId(UUID.randomUUID().toString().replaceAll("-", ""));
				khFile.setBusinessId(weixinContext.getId());
				khFile.setBusinessYype(businessType);
				khFile.setCreateTime(new Date());
				khFile.setFileName(file.getFileName());
				khFile.setFilePath(filePath);
				khFile.setFileSize(Double.valueOf(file.getFileSize()));
				khFile.setFileType(file.getExtName());
				khFile.setCreatorId(weixinContext.getCreatorId());
				khFileMapper.insertKhFile(khFile);
			}
		} catch (Exception e) {
			if (set.size() > 0)
				for (String path : set) {
					fileService.delete(path);
				}

			throw new RuntimeException();
		}

	}
}
