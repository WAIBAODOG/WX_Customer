package com.ruoyi.wxcustomer.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;
import java.util.Date;

/**
 * 微信朋友圈内容对象 kh_weixin_context
 * 
 * @author ruoyi
 * @date 2019-11-23
 */
public class WeixinContext extends BaseEntity{
    private static final long serialVersionUID = 1L;

    /** 主键id */
    private String id;

    /** 内容 */
    private String context;

    /** 创建人id */
    private String creatorId;

    /** 创建人 */
    private String creatorName;

    /** 发布时间_起 */
    private Date sendStartTime;

    /** 发布时间_止 */
    private Date sendEndTime;

    public void setId(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }
    public void setContext(String context) {
        this.context = context;
    }

    public String getContext() {
        return context;
    }
    public void setCreatorId(String creatorId) {
        this.creatorId = creatorId;
    }

    public String getCreatorId() {
        return creatorId;
    }
    public void setCreatorName(String creatorName) {
        this.creatorName = creatorName;
    }

    public String getCreatorName() {
        return creatorName;
    }
    public void setSendStartTime(Date sendStartTime) {
        this.sendStartTime = sendStartTime;
    }

    public Date getSendStartTime() {
        return sendStartTime;
    }
    public void setSendEndTime(Date sendEndTime) {
        this.sendEndTime = sendEndTime;
    }

    public Date getSendEndTime() {
        return sendEndTime;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("context", getContext())
            .append("createTime", getCreateTime())
            .append("creatorId", getCreatorId())
            .append("creatorName", getCreatorName())
            .append("remark", getRemark())
            .append("sendStartTime", getSendStartTime())
            .append("sendEndTime", getSendEndTime())
            .toString();
    }
}
