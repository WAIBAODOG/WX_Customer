package com.ruoyi.wxcustomer.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;
import java.util.Date;

/**
 * 发样每周工作对象 kh_weekly_summary
 * 
 * @author ruoyi
 * @date 2019-12-01
 */
public class KhWeeklySummary extends BaseEntity{
    private static final long serialVersionUID = 1L;

    /** id */
    private String id;

    /** 盲加 */
    @Excel(name = "盲加")
    private String blindAdd;

    /** 加V */
    @Excel(name = "加V")
    private String addWechat;

    /** 发样 */
    @Excel(name = "发样")
    private String deliverGoods;

    /** 成交 */
    @Excel(name = "成交")
    private String clinchDeal;

    /** 周六经理分析 */
    @Excel(name = "周六经理分析")
    private String saturdayManagerAnalysis;

    /** 未达标解决方案 */
    @Excel(name = "未达标解决方案")
    private String substandardSolutions;

    /** 现已有数据 */
    @Excel(name = "现已有数据")
    private String havingData;

    /** 通话时长_计划_1 */
    @Excel(name = "通话时长_计划_1")
    private String callDurationPlan1;

    /** 盲加_计划_1 */
    @Excel(name = "盲加_计划_1")
    private String blindAddPlan1;

    /** 加V_计划_1 */
    @Excel(name = "加V_计划_1")
    private String addWechatPlan1;

    /** 发样_计划_1 */
    @Excel(name = "发样_计划_1")
    private String deliverGoodsPlan1;

    /** 意向跟进_计划_1 */
    @Excel(name = "意向跟进_计划_1")
    private String intentionFollowPlan1;

    /** 成交_计划_1 */
    @Excel(name = "成交_计划_1")
    private String clinchDealPlan1;

    /** 总微信数量_计划_1 */
    @Excel(name = "总微信数量_计划_1")
    private String totalWechatNumberPlan1;

    /** 发圈6条_结果_1 */
    @Excel(name = "发圈6条_结果_1")
    private String hairBandsRes1;

    /** 老板群群发_结果_1 */
    @Excel(name = "老板群群发_结果_1")
    private String bossMassTextingRes1;

    /** 点赞_结果_1 */
    @Excel(name = "点赞_结果_1")
    private String giveLikeRes1;

    /** 通话时长_结果_1 */
    @Excel(name = "通话时长_结果_1")
    private String callDurationRes1;

    /** 盲加_结果_1 */
    @Excel(name = "盲加_结果_1")
    private String blindAddRes1;

    /** 加V_结果_1 */
    @Excel(name = "加V_结果_1")
    private String addWechatRes1;

    /** 发样_结果_1 */
    @Excel(name = "发样_结果_1")
    private String deliverGoodsRes1;

    /** 意向跟进_结果_1 */
    @Excel(name = "意向跟进_结果_1")
    private String intentionFollowRes1;

    /** 成交_结果_1 */
    @Excel(name = "成交_结果_1")
    private String clinchDealRes1;

    /** 总微信数量_结果_1 */
    @Excel(name = "总微信数量_结果_1")
    private String totalWechatNumberRes1;

    /** 问题_1 */
    @Excel(name = "问题_1")
    private String problem1;

    /** 改进方法_1 */
    @Excel(name = "改进方法_1")
    private String improvedMethod1;

    /** 明日计划/建议_1 */
    @Excel(name = "明日计划/建议_1")
    private String tomorrowPlan1;

    /** 经理工作建议_1 */
    @Excel(name = "经理工作建议_1")
    private String managerWorkSuggestion1;

    /** 通话时长_计划_2 */
    @Excel(name = "通话时长_计划_2")
    private String callDurationPlan2;

    /** 盲加_计划_2 */
    @Excel(name = "盲加_计划_2")
    private String blindAddPlan2;

    /** 加V_计划_2 */
    @Excel(name = "加V_计划_2")
    private String addWechatPlan2;

    /** 发样_计划_2 */
    @Excel(name = "发样_计划_2")
    private String deliverGoodsPlan2;

    /** 意向跟进_计划_2 */
    @Excel(name = "意向跟进_计划_2")
    private String intentionFollowPlan2;

    /** 成交_计划_2 */
    @Excel(name = "成交_计划_2")
    private String clinchDealPlan2;

    /** 总微信数量_计划_2 */
    @Excel(name = "总微信数量_计划_2")
    private String totalWechatNumberPlan2;

    /** 发圈6条_结果_2 */
    @Excel(name = "发圈6条_结果_2")
    private String hairBandsRes2;

    /** 老板群群发_结果_2 */
    @Excel(name = "老板群群发_结果_2")
    private String bossMassTextingRes2;

    /** 点赞_结果_2 */
    @Excel(name = "点赞_结果_2")
    private String giveLikeRes2;

    /** 通话时长_结果_2 */
    @Excel(name = "通话时长_结果_2")
    private String callDurationRes2;

    /** 盲加_结果_2 */
    @Excel(name = "盲加_结果_2")
    private String blindAddRes2;

    /** 加V_结果_2 */
    @Excel(name = "加V_结果_2")
    private String addWechatRes2;

    /** 发样_结果_2 */
    @Excel(name = "发样_结果_2")
    private String deliverGoodsRes2;

    /** 意向跟进_结果_2 */
    @Excel(name = "意向跟进_结果_2")
    private String intentionFollowRes2;

    /** 成交_结果_2 */
    @Excel(name = "成交_结果_2")
    private String clinchDealRes2;

    /** 总微信数量_结果_2 */
    @Excel(name = "总微信数量_结果_2")
    private String totalWechatNumberRes2;

    /** 问题_2 */
    @Excel(name = "问题_2")
    private String problem2;

    /** 改进方法_2 */
    @Excel(name = "改进方法_2")
    private String improvedMethod2;

    /** 明日计划/建议_2 */
    @Excel(name = "明日计划/建议_2")
    private String tomorrowPlan2;

    /** 经理工作建议_2 */
    @Excel(name = "经理工作建议_2")
    private String managerWorkSuggestion2;

    /** 通话时长_计划_3 */
    @Excel(name = "通话时长_计划_3")
    private String callDurationPlan3;

    /** 盲加_计划_3 */
    @Excel(name = "盲加_计划_3")
    private String blindAddPlan3;

    /** 加V_计划_3 */
    @Excel(name = "加V_计划_3")
    private String addWechatPlan3;

    /** 发样_计划_3 */
    @Excel(name = "发样_计划_3")
    private String deliverGoodsPlan3;

    /** 意向跟进_计划_3 */
    @Excel(name = "意向跟进_计划_3")
    private String intentionFollowPlan3;

    /** 成交_计划_3 */
    @Excel(name = "成交_计划_3")
    private String clinchDealPlan3;

    /** 总微信数量_计划_3 */
    @Excel(name = "总微信数量_计划_3")
    private String totalWechatNumberPlan3;

    /** 发圈6条_结果_3 */
    @Excel(name = "发圈6条_结果_3")
    private String hairBandsRes3;

    /** 老板群群发_结果_3 */
    @Excel(name = "老板群群发_结果_3")
    private String bossMassTextingRes3;

    /** 点赞_结果_3 */
    @Excel(name = "点赞_结果_3")
    private String giveLikeRes3;

    /** 通话时长_结果_3 */
    @Excel(name = "通话时长_结果_3")
    private String callDurationRes3;

    /** 盲加_结果_3 */
    @Excel(name = "盲加_结果_3")
    private String blindAddRes3;

    /** 加V_结果_3 */
    @Excel(name = "加V_结果_3")
    private String addWechatRes3;

    /** 发样_结果_3 */
    @Excel(name = "发样_结果_3")
    private String deliverGoodsRes3;

    /** 意向跟进_结果_3 */
    @Excel(name = "意向跟进_结果_3")
    private String intentionFollowRes3;

    /** 成交_结果_3 */
    @Excel(name = "成交_结果_3")
    private String clinchDealRes3;

    /** 总微信数量_结果_3 */
    @Excel(name = "总微信数量_结果_3")
    private String totalWechatNumberRes3;

    /** 问题_3 */
    @Excel(name = "问题_3")
    private String problem3;

    /** 改进方法_3 */
    @Excel(name = "改进方法_3")
    private String improvedMethod3;

    /** 明日计划/建议_3 */
    @Excel(name = "明日计划/建议_3")
    private String tomorrowPlan3;

    /** 经理工作建议_3 */
    @Excel(name = "经理工作建议_3")
    private String managerWorkSuggestion3;

    /** 通话时长_计划_4 */
    @Excel(name = "通话时长_计划_4")
    private String callDurationPlan4;

    /** 盲加_计划_4 */
    @Excel(name = "盲加_计划_4")
    private String blindAddPlan4;

    /** 加V_计划_4 */
    @Excel(name = "加V_计划_4")
    private String addWechatPlan4;

    /** 发样_计划_4 */
    @Excel(name = "发样_计划_4")
    private String deliverGoodsPlan4;

    /** 意向跟进_计划_4 */
    @Excel(name = "意向跟进_计划_4")
    private String intentionFollowPlan4;

    /** 成交_计划_4 */
    @Excel(name = "成交_计划_4")
    private String clinchDealPlan4;

    /** 总微信数量_计划_4 */
    @Excel(name = "总微信数量_计划_4")
    private String totalWechatNumberPlan4;

    /** 发圈6条_结果_4 */
    @Excel(name = "发圈6条_结果_4")
    private String hairBandsRes4;

    /** 老板群群发_结果_4 */
    @Excel(name = "老板群群发_结果_4")
    private String bossMassTextingRes4;

    /** 点赞_结果_4 */
    @Excel(name = "点赞_结果_4")
    private String giveLikeRes4;

    /** 通话时长_结果_4 */
    @Excel(name = "通话时长_结果_4")
    private String callDurationRes4;

    /** 盲加_结果_4 */
    @Excel(name = "盲加_结果_4")
    private String blindAddRes4;

    /** 加V_结果_4 */
    @Excel(name = "加V_结果_4")
    private String addWechatRes4;

    /** 发样_结果_4 */
    @Excel(name = "发样_结果_4")
    private String deliverGoodsRes4;

    /** 意向跟进_结果_4 */
    @Excel(name = "意向跟进_结果_4")
    private String intentionFollowRes4;

    /** 成交_结果_4 */
    @Excel(name = "成交_结果_4")
    private String clinchDealRes4;

    /** 总微信数量_结果_4 */
    @Excel(name = "总微信数量_结果_4")
    private String totalWechatNumberRes4;

    /** 问题_4 */
    @Excel(name = "问题_4")
    private String problem4;

    /** 改进方法_4 */
    @Excel(name = "改进方法_4")
    private String improvedMethod4;

    /** 明日计划/建议_4 */
    @Excel(name = "明日计划/建议_4")
    private String tomorrowPlan4;

    /** 经理工作建议_4 */
    @Excel(name = "经理工作建议_4")
    private String managerWorkSuggestion4;

    /** 通话时长_计划_5 */
    @Excel(name = "通话时长_计划_5")
    private String callDurationPlan5;

    /** 盲加_计划_5 */
    @Excel(name = "盲加_计划_5")
    private String blindAddPlan5;

    /** 加V_计划_5 */
    @Excel(name = "加V_计划_5")
    private String addWechatPlan5;

    /** 发样_计划_5 */
    @Excel(name = "发样_计划_5")
    private String deliverGoodsPlan5;

    /** 意向跟进_计划_5 */
    @Excel(name = "意向跟进_计划_5")
    private String intentionFollowPlan5;

    /** 成交_计划_5 */
    @Excel(name = "成交_计划_5")
    private String clinchDealPlan5;

    /** 总微信数量_计划_5 */
    @Excel(name = "总微信数量_计划_5")
    private String totalWechatNumberPlan5;

    /** 发圈6条_结果_5 */
    @Excel(name = "发圈6条_结果_5")
    private String hairBandsRes5;

    /** 老板群群发_结果_5 */
    @Excel(name = "老板群群发_结果_5")
    private String bossMassTextingRes5;

    /** 点赞_结果_5 */
    @Excel(name = "点赞_结果_5")
    private String giveLikeRes5;

    /** 通话时长_结果_5 */
    @Excel(name = "通话时长_结果_5")
    private String callDurationRes5;

    /** 盲加_结果_5 */
    @Excel(name = "盲加_结果_5")
    private String blindAddRes5;

    /** 加V_结果_5 */
    @Excel(name = "加V_结果_5")
    private String addWechatRes5;

    /** 发样_结果_5 */
    @Excel(name = "发样_结果_5")
    private String deliverGoodsRes5;

    /** 意向跟进_结果_5 */
    @Excel(name = "意向跟进_结果_5")
    private String intentionFollowRes5;

    /** 成交_结果_5 */
    @Excel(name = "成交_结果_5")
    private String clinchDealRes5;

    /** 总微信数量_结果_5 */
    @Excel(name = "总微信数量_结果_5")
    private String totalWechatNumberRes5;

    /** 问题_5 */
    @Excel(name = "问题_5")
    private String problem5;

    /** 改进方法_5 */
    @Excel(name = "改进方法_5")
    private String improvedMethod5;

    /** 明日计划/建议_5 */
    @Excel(name = "明日计划/建议_5")
    private String tomorrowPlan5;

    /** 经理工作建议_5 */
    @Excel(name = "经理工作建议_5")
    private String managerWorkSuggestion5;

    /** 通话时长_计划_6 */
    @Excel(name = "通话时长_计划_6")
    private String callDurationPlan6;

    /** 盲加_计划_6 */
    @Excel(name = "盲加_计划_6")
    private String blindAddPlan6;

    /** 加V_计划_6 */
    @Excel(name = "加V_计划_6")
    private String addWechatPlan6;

    /** 发样_计划_6 */
    @Excel(name = "发样_计划_6")
    private String deliverGoodsPlan6;

    /** 意向跟进_计划_6 */
    @Excel(name = "意向跟进_计划_6")
    private String intentionFollowPlan6;

    /** 成交_计划_6 */
    @Excel(name = "成交_计划_6")
    private String clinchDealPlan6;

    /** 总微信数量_计划_6 */
    @Excel(name = "总微信数量_计划_6")
    private String totalWechatNumberPlan6;

    /** 发圈6条_结果_6 */
    @Excel(name = "发圈6条_结果_6")
    private String hairBandsRes6;

    /** 老板群群发_结果_6 */
    @Excel(name = "老板群群发_结果_6")
    private String bossMassTextingRes6;

    /** 点赞_结果_6 */
    @Excel(name = "点赞_结果_6")
    private String giveLikeRes6;

    /** 通话时长_结果_6 */
    @Excel(name = "通话时长_结果_6")
    private String callDurationRes6;

    /** 盲加_结果_6 */
    @Excel(name = "盲加_结果_6")
    private String blindAddRes6;

    /** 加V_结果_6 */
    @Excel(name = "加V_结果_6")
    private String addWechatRes6;

    /** 发样_结果_6 */
    @Excel(name = "发样_结果_6")
    private String deliverGoodsRes6;

    /** 意向跟进_结果_6 */
    @Excel(name = "意向跟进_结果_6")
    private String intentionFollowRes6;

    /** 成交_结果_6 */
    @Excel(name = "成交_结果_6")
    private String clinchDealRes6;

    /** 总微信数量_结果_6 */
    @Excel(name = "总微信数量_结果_6")
    private String totalWechatNumberRes6;

    /** 问题_6 */
    @Excel(name = "问题_6")
    private String problem6;

    /** 改进方法_6 */
    @Excel(name = "改进方法_6")
    private String improvedMethod6;

    /** 明日计划/建议_6 */
    @Excel(name = "明日计划/建议_6")
    private String tomorrowPlan6;

    /** 经理工作建议_6 */
    @Excel(name = "经理工作建议_6")
    private String managerWorkSuggestion6;

    /** 创建时间 */
    @Excel(name = "创建时间", width = 30, dateFormat = "yyyy-MM-dd")
    private Date creationTime;

    /** 创建人id */
    @Excel(name = "创建人id")
    private String creatorId;

    /** 创建人 */
    @Excel(name = "创建人")
    private String creator;

    /** 开始时间 */
    @Excel(name = "开始时间", width = 30, dateFormat = "yyyy-MM-dd")
    private Date startTime;

    /** 结束时间 */
    @Excel(name = "结束时间", width = 30, dateFormat = "yyyy-MM-dd")
    private Date endTime;

    /** 周次 */
    @Excel(name = "周次")
    private String weekly;

    public void setId(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }
    public void setBlindAdd(String blindAdd) {
        this.blindAdd = blindAdd;
    }

    public String getBlindAdd() {
        return blindAdd;
    }
    public void setAddWechat(String addWechat) {
        this.addWechat = addWechat;
    }

    public String getAddWechat() {
        return addWechat;
    }
    public void setDeliverGoods(String deliverGoods) {
        this.deliverGoods = deliverGoods;
    }

    public String getDeliverGoods() {
        return deliverGoods;
    }
    public void setClinchDeal(String clinchDeal) {
        this.clinchDeal = clinchDeal;
    }

    public String getClinchDeal() {
        return clinchDeal;
    }
    public void setSaturdayManagerAnalysis(String saturdayManagerAnalysis) {
        this.saturdayManagerAnalysis = saturdayManagerAnalysis;
    }

    public String getSaturdayManagerAnalysis() {
        return saturdayManagerAnalysis;
    }
    public void setSubstandardSolutions(String substandardSolutions) {
        this.substandardSolutions = substandardSolutions;
    }

    public String getSubstandardSolutions() {
        return substandardSolutions;
    }
    public void setHavingData(String havingData) {
        this.havingData = havingData;
    }

    public String getHavingData() {
        return havingData;
    }
    public void setCallDurationPlan1(String callDurationPlan1) {
        this.callDurationPlan1 = callDurationPlan1;
    }

    public String getCallDurationPlan1() {
        return callDurationPlan1;
    }
    public void setBlindAddPlan1(String blindAddPlan1) {
        this.blindAddPlan1 = blindAddPlan1;
    }

    public String getBlindAddPlan1() {
        return blindAddPlan1;
    }
    public void setAddWechatPlan1(String addWechatPlan1) {
        this.addWechatPlan1 = addWechatPlan1;
    }

    public String getAddWechatPlan1() {
        return addWechatPlan1;
    }
    public void setDeliverGoodsPlan1(String deliverGoodsPlan1) {
        this.deliverGoodsPlan1 = deliverGoodsPlan1;
    }

    public String getDeliverGoodsPlan1() {
        return deliverGoodsPlan1;
    }
    public void setIntentionFollowPlan1(String intentionFollowPlan1) {
        this.intentionFollowPlan1 = intentionFollowPlan1;
    }

    public String getIntentionFollowPlan1() {
        return intentionFollowPlan1;
    }
    public void setClinchDealPlan1(String clinchDealPlan1) {
        this.clinchDealPlan1 = clinchDealPlan1;
    }

    public String getClinchDealPlan1() {
        return clinchDealPlan1;
    }
    public void setTotalWechatNumberPlan1(String totalWechatNumberPlan1) {
        this.totalWechatNumberPlan1 = totalWechatNumberPlan1;
    }

    public String getTotalWechatNumberPlan1() {
        return totalWechatNumberPlan1;
    }
    public void setHairBandsRes1(String hairBandsRes1) {
        this.hairBandsRes1 = hairBandsRes1;
    }

    public String getHairBandsRes1() {
        return hairBandsRes1;
    }
    public void setBossMassTextingRes1(String bossMassTextingRes1) {
        this.bossMassTextingRes1 = bossMassTextingRes1;
    }

    public String getBossMassTextingRes1() {
        return bossMassTextingRes1;
    }
    public void setGiveLikeRes1(String giveLikeRes1) {
        this.giveLikeRes1 = giveLikeRes1;
    }

    public String getGiveLikeRes1() {
        return giveLikeRes1;
    }
    public void setCallDurationRes1(String callDurationRes1) {
        this.callDurationRes1 = callDurationRes1;
    }

    public String getCallDurationRes1() {
        return callDurationRes1;
    }
    public void setBlindAddRes1(String blindAddRes1) {
        this.blindAddRes1 = blindAddRes1;
    }

    public String getBlindAddRes1() {
        return blindAddRes1;
    }
    public void setAddWechatRes1(String addWechatRes1) {
        this.addWechatRes1 = addWechatRes1;
    }

    public String getAddWechatRes1() {
        return addWechatRes1;
    }
    public void setDeliverGoodsRes1(String deliverGoodsRes1) {
        this.deliverGoodsRes1 = deliverGoodsRes1;
    }

    public String getDeliverGoodsRes1() {
        return deliverGoodsRes1;
    }
    public void setIntentionFollowRes1(String intentionFollowRes1) {
        this.intentionFollowRes1 = intentionFollowRes1;
    }

    public String getIntentionFollowRes1() {
        return intentionFollowRes1;
    }
    public void setClinchDealRes1(String clinchDealRes1) {
        this.clinchDealRes1 = clinchDealRes1;
    }

    public String getClinchDealRes1() {
        return clinchDealRes1;
    }
    public void setTotalWechatNumberRes1(String totalWechatNumberRes1) {
        this.totalWechatNumberRes1 = totalWechatNumberRes1;
    }

    public String getTotalWechatNumberRes1() {
        return totalWechatNumberRes1;
    }
    public void setProblem1(String problem1) {
        this.problem1 = problem1;
    }

    public String getProblem1() {
        return problem1;
    }
    public void setImprovedMethod1(String improvedMethod1) {
        this.improvedMethod1 = improvedMethod1;
    }

    public String getImprovedMethod1() {
        return improvedMethod1;
    }
    public void setTomorrowPlan1(String tomorrowPlan1) {
        this.tomorrowPlan1 = tomorrowPlan1;
    }

    public String getTomorrowPlan1() {
        return tomorrowPlan1;
    }
    public void setManagerWorkSuggestion1(String managerWorkSuggestion1) {
        this.managerWorkSuggestion1 = managerWorkSuggestion1;
    }

    public String getManagerWorkSuggestion1() {
        return managerWorkSuggestion1;
    }
    public void setCallDurationPlan2(String callDurationPlan2) {
        this.callDurationPlan2 = callDurationPlan2;
    }

    public String getCallDurationPlan2() {
        return callDurationPlan2;
    }
    public void setBlindAddPlan2(String blindAddPlan2) {
        this.blindAddPlan2 = blindAddPlan2;
    }

    public String getBlindAddPlan2() {
        return blindAddPlan2;
    }
    public void setAddWechatPlan2(String addWechatPlan2) {
        this.addWechatPlan2 = addWechatPlan2;
    }

    public String getAddWechatPlan2() {
        return addWechatPlan2;
    }
    public void setDeliverGoodsPlan2(String deliverGoodsPlan2) {
        this.deliverGoodsPlan2 = deliverGoodsPlan2;
    }

    public String getDeliverGoodsPlan2() {
        return deliverGoodsPlan2;
    }
    public void setIntentionFollowPlan2(String intentionFollowPlan2) {
        this.intentionFollowPlan2 = intentionFollowPlan2;
    }

    public String getIntentionFollowPlan2() {
        return intentionFollowPlan2;
    }
    public void setClinchDealPlan2(String clinchDealPlan2) {
        this.clinchDealPlan2 = clinchDealPlan2;
    }

    public String getClinchDealPlan2() {
        return clinchDealPlan2;
    }
    public void setTotalWechatNumberPlan2(String totalWechatNumberPlan2) {
        this.totalWechatNumberPlan2 = totalWechatNumberPlan2;
    }

    public String getTotalWechatNumberPlan2() {
        return totalWechatNumberPlan2;
    }
    public void setHairBandsRes2(String hairBandsRes2) {
        this.hairBandsRes2 = hairBandsRes2;
    }

    public String getHairBandsRes2() {
        return hairBandsRes2;
    }
    public void setBossMassTextingRes2(String bossMassTextingRes2) {
        this.bossMassTextingRes2 = bossMassTextingRes2;
    }

    public String getBossMassTextingRes2() {
        return bossMassTextingRes2;
    }
    public void setGiveLikeRes2(String giveLikeRes2) {
        this.giveLikeRes2 = giveLikeRes2;
    }

    public String getGiveLikeRes2() {
        return giveLikeRes2;
    }
    public void setCallDurationRes2(String callDurationRes2) {
        this.callDurationRes2 = callDurationRes2;
    }

    public String getCallDurationRes2() {
        return callDurationRes2;
    }
    public void setBlindAddRes2(String blindAddRes2) {
        this.blindAddRes2 = blindAddRes2;
    }

    public String getBlindAddRes2() {
        return blindAddRes2;
    }
    public void setAddWechatRes2(String addWechatRes2) {
        this.addWechatRes2 = addWechatRes2;
    }

    public String getAddWechatRes2() {
        return addWechatRes2;
    }
    public void setDeliverGoodsRes2(String deliverGoodsRes2) {
        this.deliverGoodsRes2 = deliverGoodsRes2;
    }

    public String getDeliverGoodsRes2() {
        return deliverGoodsRes2;
    }
    public void setIntentionFollowRes2(String intentionFollowRes2) {
        this.intentionFollowRes2 = intentionFollowRes2;
    }

    public String getIntentionFollowRes2() {
        return intentionFollowRes2;
    }
    public void setClinchDealRes2(String clinchDealRes2) {
        this.clinchDealRes2 = clinchDealRes2;
    }

    public String getClinchDealRes2() {
        return clinchDealRes2;
    }
    public void setTotalWechatNumberRes2(String totalWechatNumberRes2) {
        this.totalWechatNumberRes2 = totalWechatNumberRes2;
    }

    public String getTotalWechatNumberRes2() {
        return totalWechatNumberRes2;
    }
    public void setProblem2(String problem2) {
        this.problem2 = problem2;
    }

    public String getProblem2() {
        return problem2;
    }
    public void setImprovedMethod2(String improvedMethod2) {
        this.improvedMethod2 = improvedMethod2;
    }

    public String getImprovedMethod2() {
        return improvedMethod2;
    }
    public void setTomorrowPlan2(String tomorrowPlan2) {
        this.tomorrowPlan2 = tomorrowPlan2;
    }

    public String getTomorrowPlan2() {
        return tomorrowPlan2;
    }
    public void setManagerWorkSuggestion2(String managerWorkSuggestion2) {
        this.managerWorkSuggestion2 = managerWorkSuggestion2;
    }

    public String getManagerWorkSuggestion2() {
        return managerWorkSuggestion2;
    }
    public void setCallDurationPlan3(String callDurationPlan3) {
        this.callDurationPlan3 = callDurationPlan3;
    }

    public String getCallDurationPlan3() {
        return callDurationPlan3;
    }
    public void setBlindAddPlan3(String blindAddPlan3) {
        this.blindAddPlan3 = blindAddPlan3;
    }

    public String getBlindAddPlan3() {
        return blindAddPlan3;
    }
    public void setAddWechatPlan3(String addWechatPlan3) {
        this.addWechatPlan3 = addWechatPlan3;
    }

    public String getAddWechatPlan3() {
        return addWechatPlan3;
    }
    public void setDeliverGoodsPlan3(String deliverGoodsPlan3) {
        this.deliverGoodsPlan3 = deliverGoodsPlan3;
    }

    public String getDeliverGoodsPlan3() {
        return deliverGoodsPlan3;
    }
    public void setIntentionFollowPlan3(String intentionFollowPlan3) {
        this.intentionFollowPlan3 = intentionFollowPlan3;
    }

    public String getIntentionFollowPlan3() {
        return intentionFollowPlan3;
    }
    public void setClinchDealPlan3(String clinchDealPlan3) {
        this.clinchDealPlan3 = clinchDealPlan3;
    }

    public String getClinchDealPlan3() {
        return clinchDealPlan3;
    }
    public void setTotalWechatNumberPlan3(String totalWechatNumberPlan3) {
        this.totalWechatNumberPlan3 = totalWechatNumberPlan3;
    }

    public String getTotalWechatNumberPlan3() {
        return totalWechatNumberPlan3;
    }
    public void setHairBandsRes3(String hairBandsRes3) {
        this.hairBandsRes3 = hairBandsRes3;
    }

    public String getHairBandsRes3() {
        return hairBandsRes3;
    }
    public void setBossMassTextingRes3(String bossMassTextingRes3) {
        this.bossMassTextingRes3 = bossMassTextingRes3;
    }

    public String getBossMassTextingRes3() {
        return bossMassTextingRes3;
    }
    public void setGiveLikeRes3(String giveLikeRes3) {
        this.giveLikeRes3 = giveLikeRes3;
    }

    public String getGiveLikeRes3() {
        return giveLikeRes3;
    }
    public void setCallDurationRes3(String callDurationRes3) {
        this.callDurationRes3 = callDurationRes3;
    }

    public String getCallDurationRes3() {
        return callDurationRes3;
    }
    public void setBlindAddRes3(String blindAddRes3) {
        this.blindAddRes3 = blindAddRes3;
    }

    public String getBlindAddRes3() {
        return blindAddRes3;
    }
    public void setAddWechatRes3(String addWechatRes3) {
        this.addWechatRes3 = addWechatRes3;
    }

    public String getAddWechatRes3() {
        return addWechatRes3;
    }
    public void setDeliverGoodsRes3(String deliverGoodsRes3) {
        this.deliverGoodsRes3 = deliverGoodsRes3;
    }

    public String getDeliverGoodsRes3() {
        return deliverGoodsRes3;
    }
    public void setIntentionFollowRes3(String intentionFollowRes3) {
        this.intentionFollowRes3 = intentionFollowRes3;
    }

    public String getIntentionFollowRes3() {
        return intentionFollowRes3;
    }
    public void setClinchDealRes3(String clinchDealRes3) {
        this.clinchDealRes3 = clinchDealRes3;
    }

    public String getClinchDealRes3() {
        return clinchDealRes3;
    }
    public void setTotalWechatNumberRes3(String totalWechatNumberRes3) {
        this.totalWechatNumberRes3 = totalWechatNumberRes3;
    }

    public String getTotalWechatNumberRes3() {
        return totalWechatNumberRes3;
    }
    public void setProblem3(String problem3) {
        this.problem3 = problem3;
    }

    public String getProblem3() {
        return problem3;
    }
    public void setImprovedMethod3(String improvedMethod3) {
        this.improvedMethod3 = improvedMethod3;
    }

    public String getImprovedMethod3() {
        return improvedMethod3;
    }
    public void setTomorrowPlan3(String tomorrowPlan3) {
        this.tomorrowPlan3 = tomorrowPlan3;
    }

    public String getTomorrowPlan3() {
        return tomorrowPlan3;
    }
    public void setManagerWorkSuggestion3(String managerWorkSuggestion3) {
        this.managerWorkSuggestion3 = managerWorkSuggestion3;
    }

    public String getManagerWorkSuggestion3() {
        return managerWorkSuggestion3;
    }
    public void setCallDurationPlan4(String callDurationPlan4) {
        this.callDurationPlan4 = callDurationPlan4;
    }

    public String getCallDurationPlan4() {
        return callDurationPlan4;
    }
    public void setBlindAddPlan4(String blindAddPlan4) {
        this.blindAddPlan4 = blindAddPlan4;
    }

    public String getBlindAddPlan4() {
        return blindAddPlan4;
    }
    public void setAddWechatPlan4(String addWechatPlan4) {
        this.addWechatPlan4 = addWechatPlan4;
    }

    public String getAddWechatPlan4() {
        return addWechatPlan4;
    }
    public void setDeliverGoodsPlan4(String deliverGoodsPlan4) {
        this.deliverGoodsPlan4 = deliverGoodsPlan4;
    }

    public String getDeliverGoodsPlan4() {
        return deliverGoodsPlan4;
    }
    public void setIntentionFollowPlan4(String intentionFollowPlan4) {
        this.intentionFollowPlan4 = intentionFollowPlan4;
    }

    public String getIntentionFollowPlan4() {
        return intentionFollowPlan4;
    }
    public void setClinchDealPlan4(String clinchDealPlan4) {
        this.clinchDealPlan4 = clinchDealPlan4;
    }

    public String getClinchDealPlan4() {
        return clinchDealPlan4;
    }
    public void setTotalWechatNumberPlan4(String totalWechatNumberPlan4) {
        this.totalWechatNumberPlan4 = totalWechatNumberPlan4;
    }

    public String getTotalWechatNumberPlan4() {
        return totalWechatNumberPlan4;
    }
    public void setHairBandsRes4(String hairBandsRes4) {
        this.hairBandsRes4 = hairBandsRes4;
    }

    public String getHairBandsRes4() {
        return hairBandsRes4;
    }
    public void setBossMassTextingRes4(String bossMassTextingRes4) {
        this.bossMassTextingRes4 = bossMassTextingRes4;
    }

    public String getBossMassTextingRes4() {
        return bossMassTextingRes4;
    }
    public void setGiveLikeRes4(String giveLikeRes4) {
        this.giveLikeRes4 = giveLikeRes4;
    }

    public String getGiveLikeRes4() {
        return giveLikeRes4;
    }
    public void setCallDurationRes4(String callDurationRes4) {
        this.callDurationRes4 = callDurationRes4;
    }

    public String getCallDurationRes4() {
        return callDurationRes4;
    }
    public void setBlindAddRes4(String blindAddRes4) {
        this.blindAddRes4 = blindAddRes4;
    }

    public String getBlindAddRes4() {
        return blindAddRes4;
    }
    public void setAddWechatRes4(String addWechatRes4) {
        this.addWechatRes4 = addWechatRes4;
    }

    public String getAddWechatRes4() {
        return addWechatRes4;
    }
    public void setDeliverGoodsRes4(String deliverGoodsRes4) {
        this.deliverGoodsRes4 = deliverGoodsRes4;
    }

    public String getDeliverGoodsRes4() {
        return deliverGoodsRes4;
    }
    public void setIntentionFollowRes4(String intentionFollowRes4) {
        this.intentionFollowRes4 = intentionFollowRes4;
    }

    public String getIntentionFollowRes4() {
        return intentionFollowRes4;
    }
    public void setClinchDealRes4(String clinchDealRes4) {
        this.clinchDealRes4 = clinchDealRes4;
    }

    public String getClinchDealRes4() {
        return clinchDealRes4;
    }
    public void setTotalWechatNumberRes4(String totalWechatNumberRes4) {
        this.totalWechatNumberRes4 = totalWechatNumberRes4;
    }

    public String getTotalWechatNumberRes4() {
        return totalWechatNumberRes4;
    }
    public void setProblem4(String problem4) {
        this.problem4 = problem4;
    }

    public String getProblem4() {
        return problem4;
    }
    public void setImprovedMethod4(String improvedMethod4) {
        this.improvedMethod4 = improvedMethod4;
    }

    public String getImprovedMethod4() {
        return improvedMethod4;
    }
    public void setTomorrowPlan4(String tomorrowPlan4) {
        this.tomorrowPlan4 = tomorrowPlan4;
    }

    public String getTomorrowPlan4() {
        return tomorrowPlan4;
    }
    public void setManagerWorkSuggestion4(String managerWorkSuggestion4) {
        this.managerWorkSuggestion4 = managerWorkSuggestion4;
    }

    public String getManagerWorkSuggestion4() {
        return managerWorkSuggestion4;
    }
    public void setCallDurationPlan5(String callDurationPlan5) {
        this.callDurationPlan5 = callDurationPlan5;
    }

    public String getCallDurationPlan5() {
        return callDurationPlan5;
    }
    public void setBlindAddPlan5(String blindAddPlan5) {
        this.blindAddPlan5 = blindAddPlan5;
    }

    public String getBlindAddPlan5() {
        return blindAddPlan5;
    }
    public void setAddWechatPlan5(String addWechatPlan5) {
        this.addWechatPlan5 = addWechatPlan5;
    }

    public String getAddWechatPlan5() {
        return addWechatPlan5;
    }
    public void setDeliverGoodsPlan5(String deliverGoodsPlan5) {
        this.deliverGoodsPlan5 = deliverGoodsPlan5;
    }

    public String getDeliverGoodsPlan5() {
        return deliverGoodsPlan5;
    }
    public void setIntentionFollowPlan5(String intentionFollowPlan5) {
        this.intentionFollowPlan5 = intentionFollowPlan5;
    }

    public String getIntentionFollowPlan5() {
        return intentionFollowPlan5;
    }
    public void setClinchDealPlan5(String clinchDealPlan5) {
        this.clinchDealPlan5 = clinchDealPlan5;
    }

    public String getClinchDealPlan5() {
        return clinchDealPlan5;
    }
    public void setTotalWechatNumberPlan5(String totalWechatNumberPlan5) {
        this.totalWechatNumberPlan5 = totalWechatNumberPlan5;
    }

    public String getTotalWechatNumberPlan5() {
        return totalWechatNumberPlan5;
    }
    public void setHairBandsRes5(String hairBandsRes5) {
        this.hairBandsRes5 = hairBandsRes5;
    }

    public String getHairBandsRes5() {
        return hairBandsRes5;
    }
    public void setBossMassTextingRes5(String bossMassTextingRes5) {
        this.bossMassTextingRes5 = bossMassTextingRes5;
    }

    public String getBossMassTextingRes5() {
        return bossMassTextingRes5;
    }
    public void setGiveLikeRes5(String giveLikeRes5) {
        this.giveLikeRes5 = giveLikeRes5;
    }

    public String getGiveLikeRes5() {
        return giveLikeRes5;
    }
    public void setCallDurationRes5(String callDurationRes5) {
        this.callDurationRes5 = callDurationRes5;
    }

    public String getCallDurationRes5() {
        return callDurationRes5;
    }
    public void setBlindAddRes5(String blindAddRes5) {
        this.blindAddRes5 = blindAddRes5;
    }

    public String getBlindAddRes5() {
        return blindAddRes5;
    }
    public void setAddWechatRes5(String addWechatRes5) {
        this.addWechatRes5 = addWechatRes5;
    }

    public String getAddWechatRes5() {
        return addWechatRes5;
    }
    public void setDeliverGoodsRes5(String deliverGoodsRes5) {
        this.deliverGoodsRes5 = deliverGoodsRes5;
    }

    public String getDeliverGoodsRes5() {
        return deliverGoodsRes5;
    }
    public void setIntentionFollowRes5(String intentionFollowRes5) {
        this.intentionFollowRes5 = intentionFollowRes5;
    }

    public String getIntentionFollowRes5() {
        return intentionFollowRes5;
    }
    public void setClinchDealRes5(String clinchDealRes5) {
        this.clinchDealRes5 = clinchDealRes5;
    }

    public String getClinchDealRes5() {
        return clinchDealRes5;
    }
    public void setTotalWechatNumberRes5(String totalWechatNumberRes5) {
        this.totalWechatNumberRes5 = totalWechatNumberRes5;
    }

    public String getTotalWechatNumberRes5() {
        return totalWechatNumberRes5;
    }
    public void setProblem5(String problem5) {
        this.problem5 = problem5;
    }

    public String getProblem5() {
        return problem5;
    }
    public void setImprovedMethod5(String improvedMethod5) {
        this.improvedMethod5 = improvedMethod5;
    }

    public String getImprovedMethod5() {
        return improvedMethod5;
    }
    public void setTomorrowPlan5(String tomorrowPlan5) {
        this.tomorrowPlan5 = tomorrowPlan5;
    }

    public String getTomorrowPlan5() {
        return tomorrowPlan5;
    }
    public void setManagerWorkSuggestion5(String managerWorkSuggestion5) {
        this.managerWorkSuggestion5 = managerWorkSuggestion5;
    }

    public String getManagerWorkSuggestion5() {
        return managerWorkSuggestion5;
    }
    public void setCallDurationPlan6(String callDurationPlan6) {
        this.callDurationPlan6 = callDurationPlan6;
    }

    public String getCallDurationPlan6() {
        return callDurationPlan6;
    }
    public void setBlindAddPlan6(String blindAddPlan6) {
        this.blindAddPlan6 = blindAddPlan6;
    }

    public String getBlindAddPlan6() {
        return blindAddPlan6;
    }
    public void setAddWechatPlan6(String addWechatPlan6) {
        this.addWechatPlan6 = addWechatPlan6;
    }

    public String getAddWechatPlan6() {
        return addWechatPlan6;
    }
    public void setDeliverGoodsPlan6(String deliverGoodsPlan6) {
        this.deliverGoodsPlan6 = deliverGoodsPlan6;
    }

    public String getDeliverGoodsPlan6() {
        return deliverGoodsPlan6;
    }
    public void setIntentionFollowPlan6(String intentionFollowPlan6) {
        this.intentionFollowPlan6 = intentionFollowPlan6;
    }

    public String getIntentionFollowPlan6() {
        return intentionFollowPlan6;
    }
    public void setClinchDealPlan6(String clinchDealPlan6) {
        this.clinchDealPlan6 = clinchDealPlan6;
    }

    public String getClinchDealPlan6() {
        return clinchDealPlan6;
    }
    public void setTotalWechatNumberPlan6(String totalWechatNumberPlan6) {
        this.totalWechatNumberPlan6 = totalWechatNumberPlan6;
    }

    public String getTotalWechatNumberPlan6() {
        return totalWechatNumberPlan6;
    }
    public void setHairBandsRes6(String hairBandsRes6) {
        this.hairBandsRes6 = hairBandsRes6;
    }

    public String getHairBandsRes6() {
        return hairBandsRes6;
    }
    public void setBossMassTextingRes6(String bossMassTextingRes6) {
        this.bossMassTextingRes6 = bossMassTextingRes6;
    }

    public String getBossMassTextingRes6() {
        return bossMassTextingRes6;
    }
    public void setGiveLikeRes6(String giveLikeRes6) {
        this.giveLikeRes6 = giveLikeRes6;
    }

    public String getGiveLikeRes6() {
        return giveLikeRes6;
    }
    public void setCallDurationRes6(String callDurationRes6) {
        this.callDurationRes6 = callDurationRes6;
    }

    public String getCallDurationRes6() {
        return callDurationRes6;
    }
    public void setBlindAddRes6(String blindAddRes6) {
        this.blindAddRes6 = blindAddRes6;
    }

    public String getBlindAddRes6() {
        return blindAddRes6;
    }
    public void setAddWechatRes6(String addWechatRes6) {
        this.addWechatRes6 = addWechatRes6;
    }

    public String getAddWechatRes6() {
        return addWechatRes6;
    }
    public void setDeliverGoodsRes6(String deliverGoodsRes6) {
        this.deliverGoodsRes6 = deliverGoodsRes6;
    }

    public String getDeliverGoodsRes6() {
        return deliverGoodsRes6;
    }
    public void setIntentionFollowRes6(String intentionFollowRes6) {
        this.intentionFollowRes6 = intentionFollowRes6;
    }

    public String getIntentionFollowRes6() {
        return intentionFollowRes6;
    }
    public void setClinchDealRes6(String clinchDealRes6) {
        this.clinchDealRes6 = clinchDealRes6;
    }

    public String getClinchDealRes6() {
        return clinchDealRes6;
    }
    public void setTotalWechatNumberRes6(String totalWechatNumberRes6) {
        this.totalWechatNumberRes6 = totalWechatNumberRes6;
    }

    public String getTotalWechatNumberRes6() {
        return totalWechatNumberRes6;
    }
    public void setProblem6(String problem6) {
        this.problem6 = problem6;
    }

    public String getProblem6() {
        return problem6;
    }
    public void setImprovedMethod6(String improvedMethod6) {
        this.improvedMethod6 = improvedMethod6;
    }

    public String getImprovedMethod6() {
        return improvedMethod6;
    }
    public void setTomorrowPlan6(String tomorrowPlan6) {
        this.tomorrowPlan6 = tomorrowPlan6;
    }

    public String getTomorrowPlan6() {
        return tomorrowPlan6;
    }
    public void setManagerWorkSuggestion6(String managerWorkSuggestion6) {
        this.managerWorkSuggestion6 = managerWorkSuggestion6;
    }

    public String getManagerWorkSuggestion6() {
        return managerWorkSuggestion6;
    }
    public void setCreationTime(Date creationTime) {
        this.creationTime = creationTime;
    }

    public Date getCreationTime() {
        return creationTime;
    }
    public void setCreatorId(String creatorId) {
        this.creatorId = creatorId;
    }

    public String getCreatorId() {
        return creatorId;
    }
    public void setCreator(String creator) {
        this.creator = creator;
    }

    public String getCreator() {
        return creator;
    }
    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    public Date getStartTime() {
        return startTime;
    }
    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }

    public Date getEndTime() {
        return endTime;
    }
    public void setWeekly(String weekly) {
        this.weekly = weekly;
    }

    public String getWeekly() {
        return weekly;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("blindAdd", getBlindAdd())
            .append("addWechat", getAddWechat())
            .append("deliverGoods", getDeliverGoods())
            .append("clinchDeal", getClinchDeal())
            .append("saturdayManagerAnalysis", getSaturdayManagerAnalysis())
            .append("substandardSolutions", getSubstandardSolutions())
            .append("havingData", getHavingData())
            .append("callDurationPlan1", getCallDurationPlan1())
            .append("blindAddPlan1", getBlindAddPlan1())
            .append("addWechatPlan1", getAddWechatPlan1())
            .append("deliverGoodsPlan1", getDeliverGoodsPlan1())
            .append("intentionFollowPlan1", getIntentionFollowPlan1())
            .append("clinchDealPlan1", getClinchDealPlan1())
            .append("totalWechatNumberPlan1", getTotalWechatNumberPlan1())
            .append("hairBandsRes1", getHairBandsRes1())
            .append("bossMassTextingRes1", getBossMassTextingRes1())
            .append("giveLikeRes1", getGiveLikeRes1())
            .append("callDurationRes1", getCallDurationRes1())
            .append("blindAddRes1", getBlindAddRes1())
            .append("addWechatRes1", getAddWechatRes1())
            .append("deliverGoodsRes1", getDeliverGoodsRes1())
            .append("intentionFollowRes1", getIntentionFollowRes1())
            .append("clinchDealRes1", getClinchDealRes1())
            .append("totalWechatNumberRes1", getTotalWechatNumberRes1())
            .append("problem1", getProblem1())
            .append("improvedMethod1", getImprovedMethod1())
            .append("tomorrowPlan1", getTomorrowPlan1())
            .append("managerWorkSuggestion1", getManagerWorkSuggestion1())
            .append("callDurationPlan2", getCallDurationPlan2())
            .append("blindAddPlan2", getBlindAddPlan2())
            .append("addWechatPlan2", getAddWechatPlan2())
            .append("deliverGoodsPlan2", getDeliverGoodsPlan2())
            .append("intentionFollowPlan2", getIntentionFollowPlan2())
            .append("clinchDealPlan2", getClinchDealPlan2())
            .append("totalWechatNumberPlan2", getTotalWechatNumberPlan2())
            .append("hairBandsRes2", getHairBandsRes2())
            .append("bossMassTextingRes2", getBossMassTextingRes2())
            .append("giveLikeRes2", getGiveLikeRes2())
            .append("callDurationRes2", getCallDurationRes2())
            .append("blindAddRes2", getBlindAddRes2())
            .append("addWechatRes2", getAddWechatRes2())
            .append("deliverGoodsRes2", getDeliverGoodsRes2())
            .append("intentionFollowRes2", getIntentionFollowRes2())
            .append("clinchDealRes2", getClinchDealRes2())
            .append("totalWechatNumberRes2", getTotalWechatNumberRes2())
            .append("problem2", getProblem2())
            .append("improvedMethod2", getImprovedMethod2())
            .append("tomorrowPlan2", getTomorrowPlan2())
            .append("managerWorkSuggestion2", getManagerWorkSuggestion2())
            .append("callDurationPlan3", getCallDurationPlan3())
            .append("blindAddPlan3", getBlindAddPlan3())
            .append("addWechatPlan3", getAddWechatPlan3())
            .append("deliverGoodsPlan3", getDeliverGoodsPlan3())
            .append("intentionFollowPlan3", getIntentionFollowPlan3())
            .append("clinchDealPlan3", getClinchDealPlan3())
            .append("totalWechatNumberPlan3", getTotalWechatNumberPlan3())
            .append("hairBandsRes3", getHairBandsRes3())
            .append("bossMassTextingRes3", getBossMassTextingRes3())
            .append("giveLikeRes3", getGiveLikeRes3())
            .append("callDurationRes3", getCallDurationRes3())
            .append("blindAddRes3", getBlindAddRes3())
            .append("addWechatRes3", getAddWechatRes3())
            .append("deliverGoodsRes3", getDeliverGoodsRes3())
            .append("intentionFollowRes3", getIntentionFollowRes3())
            .append("clinchDealRes3", getClinchDealRes3())
            .append("totalWechatNumberRes3", getTotalWechatNumberRes3())
            .append("problem3", getProblem3())
            .append("improvedMethod3", getImprovedMethod3())
            .append("tomorrowPlan3", getTomorrowPlan3())
            .append("managerWorkSuggestion3", getManagerWorkSuggestion3())
            .append("callDurationPlan4", getCallDurationPlan4())
            .append("blindAddPlan4", getBlindAddPlan4())
            .append("addWechatPlan4", getAddWechatPlan4())
            .append("deliverGoodsPlan4", getDeliverGoodsPlan4())
            .append("intentionFollowPlan4", getIntentionFollowPlan4())
            .append("clinchDealPlan4", getClinchDealPlan4())
            .append("totalWechatNumberPlan4", getTotalWechatNumberPlan4())
            .append("hairBandsRes4", getHairBandsRes4())
            .append("bossMassTextingRes4", getBossMassTextingRes4())
            .append("giveLikeRes4", getGiveLikeRes4())
            .append("callDurationRes4", getCallDurationRes4())
            .append("blindAddRes4", getBlindAddRes4())
            .append("addWechatRes4", getAddWechatRes4())
            .append("deliverGoodsRes4", getDeliverGoodsRes4())
            .append("intentionFollowRes4", getIntentionFollowRes4())
            .append("clinchDealRes4", getClinchDealRes4())
            .append("totalWechatNumberRes4", getTotalWechatNumberRes4())
            .append("problem4", getProblem4())
            .append("improvedMethod4", getImprovedMethod4())
            .append("tomorrowPlan4", getTomorrowPlan4())
            .append("managerWorkSuggestion4", getManagerWorkSuggestion4())
            .append("callDurationPlan5", getCallDurationPlan5())
            .append("blindAddPlan5", getBlindAddPlan5())
            .append("addWechatPlan5", getAddWechatPlan5())
            .append("deliverGoodsPlan5", getDeliverGoodsPlan5())
            .append("intentionFollowPlan5", getIntentionFollowPlan5())
            .append("clinchDealPlan5", getClinchDealPlan5())
            .append("totalWechatNumberPlan5", getTotalWechatNumberPlan5())
            .append("hairBandsRes5", getHairBandsRes5())
            .append("bossMassTextingRes5", getBossMassTextingRes5())
            .append("giveLikeRes5", getGiveLikeRes5())
            .append("callDurationRes5", getCallDurationRes5())
            .append("blindAddRes5", getBlindAddRes5())
            .append("addWechatRes5", getAddWechatRes5())
            .append("deliverGoodsRes5", getDeliverGoodsRes5())
            .append("intentionFollowRes5", getIntentionFollowRes5())
            .append("clinchDealRes5", getClinchDealRes5())
            .append("totalWechatNumberRes5", getTotalWechatNumberRes5())
            .append("problem5", getProblem5())
            .append("improvedMethod5", getImprovedMethod5())
            .append("tomorrowPlan5", getTomorrowPlan5())
            .append("managerWorkSuggestion5", getManagerWorkSuggestion5())
            .append("callDurationPlan6", getCallDurationPlan6())
            .append("blindAddPlan6", getBlindAddPlan6())
            .append("addWechatPlan6", getAddWechatPlan6())
            .append("deliverGoodsPlan6", getDeliverGoodsPlan6())
            .append("intentionFollowPlan6", getIntentionFollowPlan6())
            .append("clinchDealPlan6", getClinchDealPlan6())
            .append("totalWechatNumberPlan6", getTotalWechatNumberPlan6())
            .append("hairBandsRes6", getHairBandsRes6())
            .append("bossMassTextingRes6", getBossMassTextingRes6())
            .append("giveLikeRes6", getGiveLikeRes6())
            .append("callDurationRes6", getCallDurationRes6())
            .append("blindAddRes6", getBlindAddRes6())
            .append("addWechatRes6", getAddWechatRes6())
            .append("deliverGoodsRes6", getDeliverGoodsRes6())
            .append("intentionFollowRes6", getIntentionFollowRes6())
            .append("clinchDealRes6", getClinchDealRes6())
            .append("totalWechatNumberRes6", getTotalWechatNumberRes6())
            .append("problem6", getProblem6())
            .append("improvedMethod6", getImprovedMethod6())
            .append("tomorrowPlan6", getTomorrowPlan6())
            .append("managerWorkSuggestion6", getManagerWorkSuggestion6())
            .append("creationTime", getCreationTime())
            .append("creatorId", getCreatorId())
            .append("creator", getCreator())
            .append("startTime", getStartTime())
            .append("endTime", getEndTime())
            .append("weekly", getWeekly())
            .toString();
    }
}
