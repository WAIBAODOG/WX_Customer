package com.ruoyi.wxcustomer.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;
import java.util.Date;

/**
 * 售后情况对象 kh_after_sale_member
 * 
 * @author WBG
 * @date 2019-10-24
 */
public class KhAfterSaleMember extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** id */
    private String id;

    /** 客户编号 */
    private String customerId;

    /** 跟进结果类型 */
    @Excel(name = "跟进结果类型")
    private String followResultType;

    /** 成交金额 */
    @Excel(name = "成交金额")
    private Double dealAmount;

    /** 发样/成交清单 */
    private String sendSampleList;

    /** 赠品清单 */
    private String giftsList;

    /** 成交日期 */
    @Excel(name = "成交日期", width = 30, dateFormat = "yyyy-MM-dd")
    private Date dealTime;

    /** 问题点 */
    private String troubleSpots;

    /** 意向点 */
    private String intentionPoint;

    /** 跟进次数 */
    @Excel(name = "跟进次数")
    private Long followTimes;

    /** 跟进情况 */
    private String followResult;

    /** 通话时长-时 */
    private Long durationHour;

    /** 通话时长-分 */
    private Long durationMinute;

    /** 通话时长-秒 */
    private Long durationSecond;

    /** 下次跟进时间 */
    private Date nextFollowTime;

    /** 下次跟进思路 */
    private String nextFollowMentality;

    /** 对接业务员id */
    private String creatorId;

    /** 对接业务员 */
    @Excel(name = "对接业务员")
    private String creator;

    /** 发件人 */
    private String sender;

    /** 发件人电话 */
    private String senderPhone;

    /** 发件人地址 */
    private String senderAddress;

    /** 发货日期 */
    private Date sendTime;

    /** 快递单号 */
    private String courierNumber;

    /** 物流公司 */
    private String logisticsCompany;

    /** 代收金额 */
    private Double collectingAmount;

    /** 保价金额 */
    private Double insuranceAmount;

    /** 邮费 */
    private Long postage;

    /** 是否成交（0，是 1否） */
    @Excel(name = "是否成交", readConverterExp = "0=，是,1=否")
    private String isDeal;

    public void setId(String id) 
    {
        this.id = id;
    }

    public String getId() 
    {
        return id;
    }
    public void setCustomerId(String customerId) 
    {
        this.customerId = customerId;
    }

    public String getCustomerId() 
    {
        return customerId;
    }
    public void setFollowResultType(String followResultType) 
    {
        this.followResultType = followResultType;
    }

    public String getFollowResultType() 
    {
        return followResultType;
    }
    public void setDealAmount(Double dealAmount) 
    {
        this.dealAmount = dealAmount;
    }

    public Double getDealAmount() 
    {
        return dealAmount;
    }
    public void setSendSampleList(String sendSampleList) 
    {
        this.sendSampleList = sendSampleList;
    }

    public String getSendSampleList() 
    {
        return sendSampleList;
    }
    public void setGiftsList(String giftsList) 
    {
        this.giftsList = giftsList;
    }

    public String getGiftsList() 
    {
        return giftsList;
    }
    public void setDealTime(Date dealTime) 
    {
        this.dealTime = dealTime;
    }

    public Date getDealTime() 
    {
        return dealTime;
    }
    public void setTroubleSpots(String troubleSpots) 
    {
        this.troubleSpots = troubleSpots;
    }

    public String getTroubleSpots() 
    {
        return troubleSpots;
    }
    public void setIntentionPoint(String intentionPoint) 
    {
        this.intentionPoint = intentionPoint;
    }

    public String getIntentionPoint() 
    {
        return intentionPoint;
    }
    public void setFollowTimes(Long followTimes) 
    {
        this.followTimes = followTimes;
    }

    public Long getFollowTimes() 
    {
        return followTimes;
    }
    public void setFollowResult(String followResult) 
    {
        this.followResult = followResult;
    }

    public String getFollowResult() 
    {
        return followResult;
    }
    public void setDurationHour(Long durationHour) 
    {
        this.durationHour = durationHour;
    }

    public Long getDurationHour() 
    {
        return durationHour;
    }
    public void setDurationMinute(Long durationMinute) 
    {
        this.durationMinute = durationMinute;
    }

    public Long getDurationMinute() 
    {
        return durationMinute;
    }
    public void setDurationSecond(Long durationSecond) 
    {
        this.durationSecond = durationSecond;
    }

    public Long getDurationSecond() 
    {
        return durationSecond;
    }
    public void setNextFollowTime(Date nextFollowTime) 
    {
        this.nextFollowTime = nextFollowTime;
    }

    public Date getNextFollowTime() 
    {
        return nextFollowTime;
    }
    public void setNextFollowMentality(String nextFollowMentality) 
    {
        this.nextFollowMentality = nextFollowMentality;
    }

    public String getNextFollowMentality() 
    {
        return nextFollowMentality;
    }
    public void setCreatorId(String creatorId) 
    {
        this.creatorId = creatorId;
    }

    public String getCreatorId() 
    {
        return creatorId;
    }
    public void setCreator(String creator) 
    {
        this.creator = creator;
    }

    public String getCreator() 
    {
        return creator;
    }
    public void setSender(String sender) 
    {
        this.sender = sender;
    }

    public String getSender() 
    {
        return sender;
    }
    public void setSenderPhone(String senderPhone) 
    {
        this.senderPhone = senderPhone;
    }

    public String getSenderPhone() 
    {
        return senderPhone;
    }
    public void setSenderAddress(String senderAddress) 
    {
        this.senderAddress = senderAddress;
    }

    public String getSenderAddress() 
    {
        return senderAddress;
    }
    public void setSendTime(Date sendTime) 
    {
        this.sendTime = sendTime;
    }

    public Date getSendTime() 
    {
        return sendTime;
    }
    public void setCourierNumber(String courierNumber) 
    {
        this.courierNumber = courierNumber;
    }

    public String getCourierNumber() 
    {
        return courierNumber;
    }
    public void setLogisticsCompany(String logisticsCompany) 
    {
        this.logisticsCompany = logisticsCompany;
    }

    public String getLogisticsCompany() 
    {
        return logisticsCompany;
    }
    public void setCollectingAmount(Double collectingAmount) 
    {
        this.collectingAmount = collectingAmount;
    }

    public Double getCollectingAmount() 
    {
        return collectingAmount;
    }
    public void setInsuranceAmount(Double insuranceAmount) 
    {
        this.insuranceAmount = insuranceAmount;
    }

    public Double getInsuranceAmount() 
    {
        return insuranceAmount;
    }
    public void setPostage(Long postage) 
    {
        this.postage = postage;
    }

    public Long getPostage() 
    {
        return postage;
    }
    public void setIsDeal(String isDeal) 
    {
        this.isDeal = isDeal;
    }

    public String getIsDeal() 
    {
        return isDeal;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("customerId", getCustomerId())
            .append("followResultType", getFollowResultType())
            .append("dealAmount", getDealAmount())
            .append("sendSampleList", getSendSampleList())
            .append("giftsList", getGiftsList())
            .append("dealTime", getDealTime())
            .append("troubleSpots", getTroubleSpots())
            .append("intentionPoint", getIntentionPoint())
            .append("followTimes", getFollowTimes())
            .append("followResult", getFollowResult())
            .append("durationHour", getDurationHour())
            .append("durationMinute", getDurationMinute())
            .append("durationSecond", getDurationSecond())
            .append("nextFollowTime", getNextFollowTime())
            .append("nextFollowMentality", getNextFollowMentality())
            .append("creatorId", getCreatorId())
            .append("creator", getCreator())
            .append("sender", getSender())
            .append("senderPhone", getSenderPhone())
            .append("senderAddress", getSenderAddress())
            .append("sendTime", getSendTime())
            .append("courierNumber", getCourierNumber())
            .append("logisticsCompany", getLogisticsCompany())
            .append("collectingAmount", getCollectingAmount())
            .append("insuranceAmount", getInsuranceAmount())
            .append("postage", getPostage())
            .append("isDeal", getIsDeal())
            .toString();
    }
}
