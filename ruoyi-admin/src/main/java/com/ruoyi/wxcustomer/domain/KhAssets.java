package com.ruoyi.wxcustomer.domain;

import java.util.ArrayList;
import java.util.List;

import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 资产管理对象 kh_assets
 * 
 * @author ruoyi
 * @date 2020-02-09
 */
public class KhAssets extends BaseEntity{
    private static final long serialVersionUID = 1L;

    /** 主键 */
    
    private String id;

    /** 使用人id */
    private String userId;
    /** 使用人*/
    @Excel(name = "使用人")
    private String userName;

    /** 微信数量 */
    @Excel(name = "微信数量")
    private Integer countWechat;

    /** 负责的群 */
    @Excel(name = "负责的群")
    private String respGroup;

    /** 群总人数 */
    @Excel(name = "群总人数")
    private Integer groupPeople;

    /** 群发素材数量 */
    @Excel(name = "群发素材数量")
    private Integer countMaterial;
    
    private String detailInfo;
    
    private String dataRightUserIds;

    private List<KhAssetsDetail> detailList;
    public void setId(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }
    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getUserId() {
        return userId;
    }
    public void setCountWechat(Integer countWechat) {
        this.countWechat = countWechat;
    }

    public Integer getCountWechat() {
        return countWechat;
    }
    public void setRespGroup(String respGroup) {
        this.respGroup = respGroup;
    }

    public String getRespGroup() {
        return respGroup;
    }
    public void setGroupPeople(Integer groupPeople) {
        this.groupPeople = groupPeople;
    }

    public Integer getGroupPeople() {
        return groupPeople;
    }
    public void setCountMaterial(Integer countMaterial) {
        this.countMaterial = countMaterial;
    }

    public Integer getCountMaterial() {
        return countMaterial;
    }

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public List<KhAssetsDetail> getDetailList() {
		return detailList;
	}

	public void setDetailList(List<KhAssetsDetail> detailList) {
		this.detailList = detailList;
	}

	public String getDetailInfo() {
		return detailInfo;
	}

	public void setDetailInfo(String detailInfo) {
		this.detailInfo = detailInfo;
	}

	public String getDataRightUserIds() {
		return dataRightUserIds;
	}

	public void setDataRightUserIds(String dataRightUserIds) {
		this.dataRightUserIds = dataRightUserIds;
	}

    
}
