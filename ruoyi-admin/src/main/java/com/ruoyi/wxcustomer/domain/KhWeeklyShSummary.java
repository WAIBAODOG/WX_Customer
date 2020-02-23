package com.ruoyi.wxcustomer.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;
import java.util.Date;

/**
 * 售后每周工作对象 kh_weekly_sh_summary
 * 
 * @author ruoyi
 * @date 2019-12-07
 */
public class KhWeeklyShSummary extends BaseEntity{
    private static final long serialVersionUID = 1L;

    /** null */
    private String id;

    /** 成交 */
    @Excel(name = "成交")
    private String clinchDeal;

    /** 发样 */
    @Excel(name = "发样")
    private String hairSample;

    /** 培训 */
    @Excel(name = "培训")
    private String training;

    /** 活动促销 */
    @Excel(name = "活动促销")
    private String promotionalActivities;

    /** 视频制作 */
    @Excel(name = "视频制作")
    private String videoProduction;

    /** 周六经理分析 */
    @Excel(name = "周六经理分析")
    private String saturdayManagerAnalysis;

    /** 未达标解决方案 */
    @Excel(name = "未达标解决方案")
    private String substandardSolutions;

    /** 现已有数据 */
    @Excel(name = "现已有数据")
    private String havingData;

    /** 客户_1 */
    @Excel(name = "客户_1")
    private String customer1;

    /** 发样_计划_1 */
    @Excel(name = "发样_计划_1")
    private String hairSamplePlan1;

    /** 成交_计划_1 */
    @Excel(name = "成交_计划_1")
    private String clinchDealPlan1;

    /** 培训_计划_1 */
    @Excel(name = "培训_计划_1")
    private String trainingPlan1;

    /** 活动促销_计划_1 */
    @Excel(name = "活动促销_计划_1")
    private String promotionalActivitiesPlan1;

    /** 视频制作_计划_1 */
    @Excel(name = "视频制作_计划_1")
    private String videoProductionPlan1;

    /** 发圈6条_结果_1 */
    @Excel(name = "发圈6条_结果_1")
    private String hairBandsRes1;

    /** 老板群群发_结果_1 */
    @Excel(name = "老板群群发_结果_1")
    private String bossMassTextingRes1;

    /** 点赞_结果_1 */
    @Excel(name = "点赞_结果_1")
    private String giveLikeRes1;

    /** 发样_结果_1 */
    @Excel(name = "发样_结果_1")
    private String hairSampleRes1;

    /** 成交_结果_1 */
    @Excel(name = "成交_结果_1")
    private String clinchDealRes1;

    /** 培训_结果_1 */
    @Excel(name = "培训_结果_1")
    private String trainingRes1;

    /** 活动促销_结果_1 */
    @Excel(name = "活动促销_结果_1")
    private String promotionalActivitiesRes1;

    /** 视频制作_结果_1 */
    @Excel(name = "视频制作_结果_1")
    private String videoProductionRes1;

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

    /** 客户_2 */
    @Excel(name = "客户_2")
    private String customer2;

    /** 发样_计划_2 */
    @Excel(name = "发样_计划_2")
    private String hairSamplePlan2;

    /** 成交_计划_2 */
    @Excel(name = "成交_计划_2")
    private String clinchDealPlan2;

    /** 培训_计划_2 */
    @Excel(name = "培训_计划_2")
    private String trainingPlan2;

    /** 活动促销_计划_2 */
    @Excel(name = "活动促销_计划_2")
    private String promotionalActivitiesPlan2;

    /** 视频制作_计划_2 */
    @Excel(name = "视频制作_计划_2")
    private String videoProductionPlan2;

    /** 发圈6条_结果_2 */
    @Excel(name = "发圈6条_结果_2")
    private String hairBandsRes2;

    /** 老板群群发_结果_2 */
    @Excel(name = "老板群群发_结果_2")
    private String bossMassTextingRes2;

    /** 点赞_结果_2 */
    @Excel(name = "点赞_结果_2")
    private String giveLikeRes2;

    /** 发样_结果_2 */
    @Excel(name = "发样_结果_2")
    private String hairSampleRes2;

    /** 成交_结果_2 */
    @Excel(name = "成交_结果_2")
    private String clinchDealRes2;

    /** 培训_结果_2 */
    @Excel(name = "培训_结果_2")
    private String trainingRes2;

    /** 活动促销_结果_2 */
    @Excel(name = "活动促销_结果_2")
    private String promotionalActivitiesRes2;

    /** 视频制作_结果_2 */
    @Excel(name = "视频制作_结果_2")
    private String videoProductionRes2;

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

    /** 客户_3 */
    @Excel(name = "客户_3")
    private String customer3;

    /** 发样_计划_3 */
    @Excel(name = "发样_计划_3")
    private String hairSamplePlan3;

    /** 成交_计划_3 */
    @Excel(name = "成交_计划_3")
    private String clinchDealPlan3;

    /** 培训_计划_3 */
    @Excel(name = "培训_计划_3")
    private String trainingPlan3;

    /** 活动促销_计划_3 */
    @Excel(name = "活动促销_计划_3")
    private String promotionalActivitiesPlan3;

    /** 视频制作_计划_3 */
    @Excel(name = "视频制作_计划_3")
    private String videoProductionPlan3;

    /** 发圈6条_结果_3 */
    @Excel(name = "发圈6条_结果_3")
    private String hairBandsRes3;

    /** 老板群群发_结果_3 */
    @Excel(name = "老板群群发_结果_3")
    private String bossMassTextingRes3;

    /** 点赞_结果_3 */
    @Excel(name = "点赞_结果_3")
    private String giveLikeRes3;

    /** 发样_结果_3 */
    @Excel(name = "发样_结果_3")
    private String hairSampleRes3;

    /** 成交_结果_3 */
    @Excel(name = "成交_结果_3")
    private String clinchDealRes3;

    /** 培训_结果_3 */
    @Excel(name = "培训_结果_3")
    private String trainingRes3;

    /** 活动促销_结果_3 */
    @Excel(name = "活动促销_结果_3")
    private String promotionalActivitiesRes3;

    /** 视频制作_结果_3 */
    @Excel(name = "视频制作_结果_3")
    private String videoProductionRes3;

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

    /** 客户_4 */
    @Excel(name = "客户_4")
    private String customer4;

    /** 发样_计划_4 */
    @Excel(name = "发样_计划_4")
    private String hairSamplePlan4;

    /** 成交_计划_4 */
    @Excel(name = "成交_计划_4")
    private String clinchDealPlan4;

    /** 培训_计划_4 */
    @Excel(name = "培训_计划_4")
    private String trainingPlan4;

    /** 活动促销_计划_4 */
    @Excel(name = "活动促销_计划_4")
    private String promotionalActivitiesPlan4;

    /** 视频制作_计划_4 */
    @Excel(name = "视频制作_计划_4")
    private String videoProductionPlan4;

    /** 发圈6条_结果_4 */
    @Excel(name = "发圈6条_结果_4")
    private String hairBandsRes4;

    /** 老板群群发_结果_4 */
    @Excel(name = "老板群群发_结果_4")
    private String bossMassTextingRes4;

    /** 点赞_结果_4 */
    @Excel(name = "点赞_结果_4")
    private String giveLikeRes4;

    /** 发样_结果_4 */
    @Excel(name = "发样_结果_4")
    private String hairSampleRes4;

    /** 成交_结果_4 */
    @Excel(name = "成交_结果_4")
    private String clinchDealRes4;

    /** 培训_结果_4 */
    @Excel(name = "培训_结果_4")
    private String trainingRes4;

    /** 活动促销_结果_4 */
    @Excel(name = "活动促销_结果_4")
    private String promotionalActivitiesRes4;

    /** 视频制作_结果_4 */
    @Excel(name = "视频制作_结果_4")
    private String videoProductionRes4;

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

    /** 客户_5 */
    @Excel(name = "客户_5")
    private String customer5;

    /** 发样_计划_5 */
    @Excel(name = "发样_计划_5")
    private String hairSamplePlan5;

    /** 成交_计划_5 */
    @Excel(name = "成交_计划_5")
    private String clinchDealPlan5;

    /** 培训_计划_5 */
    @Excel(name = "培训_计划_5")
    private String trainingPlan5;

    /** 活动促销_计划_5 */
    @Excel(name = "活动促销_计划_5")
    private String promotionalActivitiesPlan5;

    /** 视频制作_计划_5 */
    @Excel(name = "视频制作_计划_5")
    private String videoProductionPlan5;

    /** 发圈6条_结果_5 */
    @Excel(name = "发圈6条_结果_5")
    private String hairBandsRes5;

    /** 老板群群发_结果_5 */
    @Excel(name = "老板群群发_结果_5")
    private String bossMassTextingRes5;

    /** 点赞_结果_5 */
    @Excel(name = "点赞_结果_5")
    private String giveLikeRes5;

    /** 发样_结果_5 */
    @Excel(name = "发样_结果_5")
    private String hairSampleRes5;

    /** 成交_结果_5 */
    @Excel(name = "成交_结果_5")
    private String clinchDealRes5;

    /** 培训_结果_5 */
    @Excel(name = "培训_结果_5")
    private String trainingRes5;

    /** 活动促销_结果_5 */
    @Excel(name = "活动促销_结果_5")
    private String promotionalActivitiesRes5;

    /** 视频制作_结果_5 */
    @Excel(name = "视频制作_结果_5")
    private String videoProductionRes5;

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

    /** 客户_6 */
    @Excel(name = "客户_6")
    private String customer6;

    /** 发样_计划_6 */
    @Excel(name = "发样_计划_6")
    private String hairSamplePlan6;

    /** 成交_计划_6 */
    @Excel(name = "成交_计划_6")
    private String clinchDealPlan6;

    /** 培训_计划_6 */
    @Excel(name = "培训_计划_6")
    private String trainingPlan6;

    /** 活动促销_计划_6 */
    @Excel(name = "活动促销_计划_6")
    private String promotionalActivitiesPlan6;

    /** 视频制作_计划_6 */
    @Excel(name = "视频制作_计划_6")
    private String videoProductionPlan6;

    /** 发圈6条_结果_6 */
    @Excel(name = "发圈6条_结果_6")
    private String hairBandsRes6;

    /** 老板群群发_结果_6 */
    @Excel(name = "老板群群发_结果_6")
    private String bossMassTextingRes6;

    /** 点赞_结果_6 */
    @Excel(name = "点赞_结果_6")
    private String giveLikeRes6;

    /** 发样_结果_6 */
    @Excel(name = "发样_结果_6")
    private String hairSampleRes6;

    /** 成交_结果_6 */
    @Excel(name = "成交_结果_6")
    private String clinchDealRes6;

    /** 培训_结果_6 */
    @Excel(name = "培训_结果_6")
    private String trainingRes6;

    /** 活动促销_结果_6 */
    @Excel(name = "活动促销_结果_6")
    private String promotionalActivitiesRes6;

    /** 视频制作_结果_6 */
    @Excel(name = "视频制作_结果_6")
    private String videoProductionRes6;

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

    private String dataRightUserIds;
    
    public void setId(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }
    public void setClinchDeal(String clinchDeal) {
        this.clinchDeal = clinchDeal;
    }

    public String getClinchDeal() {
        return clinchDeal;
    }
    public void setHairSample(String hairSample) {
        this.hairSample = hairSample;
    }

    public String getHairSample() {
        return hairSample;
    }
    public void setTraining(String training) {
        this.training = training;
    }

    public String getTraining() {
        return training;
    }
    public void setPromotionalActivities(String promotionalActivities) {
        this.promotionalActivities = promotionalActivities;
    }

    public String getPromotionalActivities() {
        return promotionalActivities;
    }
    public void setVideoProduction(String videoProduction) {
        this.videoProduction = videoProduction;
    }

    public String getVideoProduction() {
        return videoProduction;
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
    public void setCustomer1(String customer1) {
        this.customer1 = customer1;
    }

    public String getCustomer1() {
        return customer1;
    }
    public void setHairSamplePlan1(String hairSamplePlan1) {
        this.hairSamplePlan1 = hairSamplePlan1;
    }

    public String getHairSamplePlan1() {
        return hairSamplePlan1;
    }
    public void setClinchDealPlan1(String clinchDealPlan1) {
        this.clinchDealPlan1 = clinchDealPlan1;
    }

    public String getClinchDealPlan1() {
        return clinchDealPlan1;
    }
    public void setTrainingPlan1(String trainingPlan1) {
        this.trainingPlan1 = trainingPlan1;
    }

    public String getTrainingPlan1() {
        return trainingPlan1;
    }
    public void setPromotionalActivitiesPlan1(String promotionalActivitiesPlan1) {
        this.promotionalActivitiesPlan1 = promotionalActivitiesPlan1;
    }

    public String getPromotionalActivitiesPlan1() {
        return promotionalActivitiesPlan1;
    }
    public void setVideoProductionPlan1(String videoProductionPlan1) {
        this.videoProductionPlan1 = videoProductionPlan1;
    }

    public String getVideoProductionPlan1() {
        return videoProductionPlan1;
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
    public void setHairSampleRes1(String hairSampleRes1) {
        this.hairSampleRes1 = hairSampleRes1;
    }

    public String getHairSampleRes1() {
        return hairSampleRes1;
    }
    public void setClinchDealRes1(String clinchDealRes1) {
        this.clinchDealRes1 = clinchDealRes1;
    }

    public String getClinchDealRes1() {
        return clinchDealRes1;
    }
    public void setTrainingRes1(String trainingRes1) {
        this.trainingRes1 = trainingRes1;
    }

    public String getTrainingRes1() {
        return trainingRes1;
    }
    public void setPromotionalActivitiesRes1(String promotionalActivitiesRes1) {
        this.promotionalActivitiesRes1 = promotionalActivitiesRes1;
    }

    public String getPromotionalActivitiesRes1() {
        return promotionalActivitiesRes1;
    }
    public void setVideoProductionRes1(String videoProductionRes1) {
        this.videoProductionRes1 = videoProductionRes1;
    }

    public String getVideoProductionRes1() {
        return videoProductionRes1;
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
    public void setCustomer2(String customer2) {
        this.customer2 = customer2;
    }

    public String getCustomer2() {
        return customer2;
    }
    public void setHairSamplePlan2(String hairSamplePlan2) {
        this.hairSamplePlan2 = hairSamplePlan2;
    }

    public String getHairSamplePlan2() {
        return hairSamplePlan2;
    }
    public void setClinchDealPlan2(String clinchDealPlan2) {
        this.clinchDealPlan2 = clinchDealPlan2;
    }

    public String getClinchDealPlan2() {
        return clinchDealPlan2;
    }
    public void setTrainingPlan2(String trainingPlan2) {
        this.trainingPlan2 = trainingPlan2;
    }

    public String getTrainingPlan2() {
        return trainingPlan2;
    }
    public void setPromotionalActivitiesPlan2(String promotionalActivitiesPlan2) {
        this.promotionalActivitiesPlan2 = promotionalActivitiesPlan2;
    }

    public String getPromotionalActivitiesPlan2() {
        return promotionalActivitiesPlan2;
    }
    public void setVideoProductionPlan2(String videoProductionPlan2) {
        this.videoProductionPlan2 = videoProductionPlan2;
    }

    public String getVideoProductionPlan2() {
        return videoProductionPlan2;
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
    public void setHairSampleRes2(String hairSampleRes2) {
        this.hairSampleRes2 = hairSampleRes2;
    }

    public String getHairSampleRes2() {
        return hairSampleRes2;
    }
    public void setClinchDealRes2(String clinchDealRes2) {
        this.clinchDealRes2 = clinchDealRes2;
    }

    public String getClinchDealRes2() {
        return clinchDealRes2;
    }
    public void setTrainingRes2(String trainingRes2) {
        this.trainingRes2 = trainingRes2;
    }

    public String getTrainingRes2() {
        return trainingRes2;
    }
    public void setPromotionalActivitiesRes2(String promotionalActivitiesRes2) {
        this.promotionalActivitiesRes2 = promotionalActivitiesRes2;
    }

    public String getPromotionalActivitiesRes2() {
        return promotionalActivitiesRes2;
    }
    public void setVideoProductionRes2(String videoProductionRes2) {
        this.videoProductionRes2 = videoProductionRes2;
    }

    public String getVideoProductionRes2() {
        return videoProductionRes2;
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
    public void setCustomer3(String customer3) {
        this.customer3 = customer3;
    }

    public String getCustomer3() {
        return customer3;
    }
    public void setHairSamplePlan3(String hairSamplePlan3) {
        this.hairSamplePlan3 = hairSamplePlan3;
    }

    public String getHairSamplePlan3() {
        return hairSamplePlan3;
    }
    public void setClinchDealPlan3(String clinchDealPlan3) {
        this.clinchDealPlan3 = clinchDealPlan3;
    }

    public String getClinchDealPlan3() {
        return clinchDealPlan3;
    }
    public void setTrainingPlan3(String trainingPlan3) {
        this.trainingPlan3 = trainingPlan3;
    }

    public String getTrainingPlan3() {
        return trainingPlan3;
    }
    public void setPromotionalActivitiesPlan3(String promotionalActivitiesPlan3) {
        this.promotionalActivitiesPlan3 = promotionalActivitiesPlan3;
    }

    public String getPromotionalActivitiesPlan3() {
        return promotionalActivitiesPlan3;
    }
    public void setVideoProductionPlan3(String videoProductionPlan3) {
        this.videoProductionPlan3 = videoProductionPlan3;
    }

    public String getVideoProductionPlan3() {
        return videoProductionPlan3;
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
    public void setHairSampleRes3(String hairSampleRes3) {
        this.hairSampleRes3 = hairSampleRes3;
    }

    public String getHairSampleRes3() {
        return hairSampleRes3;
    }
    public void setClinchDealRes3(String clinchDealRes3) {
        this.clinchDealRes3 = clinchDealRes3;
    }

    public String getClinchDealRes3() {
        return clinchDealRes3;
    }
    public void setTrainingRes3(String trainingRes3) {
        this.trainingRes3 = trainingRes3;
    }

    public String getTrainingRes3() {
        return trainingRes3;
    }
    public void setPromotionalActivitiesRes3(String promotionalActivitiesRes3) {
        this.promotionalActivitiesRes3 = promotionalActivitiesRes3;
    }

    public String getPromotionalActivitiesRes3() {
        return promotionalActivitiesRes3;
    }
    public void setVideoProductionRes3(String videoProductionRes3) {
        this.videoProductionRes3 = videoProductionRes3;
    }

    public String getVideoProductionRes3() {
        return videoProductionRes3;
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
    public void setCustomer4(String customer4) {
        this.customer4 = customer4;
    }

    public String getCustomer4() {
        return customer4;
    }
    public void setHairSamplePlan4(String hairSamplePlan4) {
        this.hairSamplePlan4 = hairSamplePlan4;
    }

    public String getHairSamplePlan4() {
        return hairSamplePlan4;
    }
    public void setClinchDealPlan4(String clinchDealPlan4) {
        this.clinchDealPlan4 = clinchDealPlan4;
    }

    public String getClinchDealPlan4() {
        return clinchDealPlan4;
    }
    public void setTrainingPlan4(String trainingPlan4) {
        this.trainingPlan4 = trainingPlan4;
    }

    public String getTrainingPlan4() {
        return trainingPlan4;
    }
    public void setPromotionalActivitiesPlan4(String promotionalActivitiesPlan4) {
        this.promotionalActivitiesPlan4 = promotionalActivitiesPlan4;
    }

    public String getPromotionalActivitiesPlan4() {
        return promotionalActivitiesPlan4;
    }
    public void setVideoProductionPlan4(String videoProductionPlan4) {
        this.videoProductionPlan4 = videoProductionPlan4;
    }

    public String getVideoProductionPlan4() {
        return videoProductionPlan4;
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
    public void setHairSampleRes4(String hairSampleRes4) {
        this.hairSampleRes4 = hairSampleRes4;
    }

    public String getHairSampleRes4() {
        return hairSampleRes4;
    }
    public void setClinchDealRes4(String clinchDealRes4) {
        this.clinchDealRes4 = clinchDealRes4;
    }

    public String getClinchDealRes4() {
        return clinchDealRes4;
    }
    public void setTrainingRes4(String trainingRes4) {
        this.trainingRes4 = trainingRes4;
    }

    public String getTrainingRes4() {
        return trainingRes4;
    }
    public void setPromotionalActivitiesRes4(String promotionalActivitiesRes4) {
        this.promotionalActivitiesRes4 = promotionalActivitiesRes4;
    }

    public String getPromotionalActivitiesRes4() {
        return promotionalActivitiesRes4;
    }
    public void setVideoProductionRes4(String videoProductionRes4) {
        this.videoProductionRes4 = videoProductionRes4;
    }

    public String getVideoProductionRes4() {
        return videoProductionRes4;
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
    public void setCustomer5(String customer5) {
        this.customer5 = customer5;
    }

    public String getCustomer5() {
        return customer5;
    }
    public void setHairSamplePlan5(String hairSamplePlan5) {
        this.hairSamplePlan5 = hairSamplePlan5;
    }

    public String getHairSamplePlan5() {
        return hairSamplePlan5;
    }
    public void setClinchDealPlan5(String clinchDealPlan5) {
        this.clinchDealPlan5 = clinchDealPlan5;
    }

    public String getClinchDealPlan5() {
        return clinchDealPlan5;
    }
    public void setTrainingPlan5(String trainingPlan5) {
        this.trainingPlan5 = trainingPlan5;
    }

    public String getTrainingPlan5() {
        return trainingPlan5;
    }
    public void setPromotionalActivitiesPlan5(String promotionalActivitiesPlan5) {
        this.promotionalActivitiesPlan5 = promotionalActivitiesPlan5;
    }

    public String getPromotionalActivitiesPlan5() {
        return promotionalActivitiesPlan5;
    }
    public void setVideoProductionPlan5(String videoProductionPlan5) {
        this.videoProductionPlan5 = videoProductionPlan5;
    }

    public String getVideoProductionPlan5() {
        return videoProductionPlan5;
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
    public void setHairSampleRes5(String hairSampleRes5) {
        this.hairSampleRes5 = hairSampleRes5;
    }

    public String getHairSampleRes5() {
        return hairSampleRes5;
    }
    public void setClinchDealRes5(String clinchDealRes5) {
        this.clinchDealRes5 = clinchDealRes5;
    }

    public String getClinchDealRes5() {
        return clinchDealRes5;
    }
    public void setTrainingRes5(String trainingRes5) {
        this.trainingRes5 = trainingRes5;
    }

    public String getTrainingRes5() {
        return trainingRes5;
    }
    public void setPromotionalActivitiesRes5(String promotionalActivitiesRes5) {
        this.promotionalActivitiesRes5 = promotionalActivitiesRes5;
    }

    public String getPromotionalActivitiesRes5() {
        return promotionalActivitiesRes5;
    }
    public void setVideoProductionRes5(String videoProductionRes5) {
        this.videoProductionRes5 = videoProductionRes5;
    }

    public String getVideoProductionRes5() {
        return videoProductionRes5;
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
    public void setCustomer6(String customer6) {
        this.customer6 = customer6;
    }

    public String getCustomer6() {
        return customer6;
    }
    public void setHairSamplePlan6(String hairSamplePlan6) {
        this.hairSamplePlan6 = hairSamplePlan6;
    }

    public String getHairSamplePlan6() {
        return hairSamplePlan6;
    }
    public void setClinchDealPlan6(String clinchDealPlan6) {
        this.clinchDealPlan6 = clinchDealPlan6;
    }

    public String getClinchDealPlan6() {
        return clinchDealPlan6;
    }
    public void setTrainingPlan6(String trainingPlan6) {
        this.trainingPlan6 = trainingPlan6;
    }

    public String getTrainingPlan6() {
        return trainingPlan6;
    }
    public void setPromotionalActivitiesPlan6(String promotionalActivitiesPlan6) {
        this.promotionalActivitiesPlan6 = promotionalActivitiesPlan6;
    }

    public String getPromotionalActivitiesPlan6() {
        return promotionalActivitiesPlan6;
    }
    public void setVideoProductionPlan6(String videoProductionPlan6) {
        this.videoProductionPlan6 = videoProductionPlan6;
    }

    public String getVideoProductionPlan6() {
        return videoProductionPlan6;
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
    public void setHairSampleRes6(String hairSampleRes6) {
        this.hairSampleRes6 = hairSampleRes6;
    }

    public String getHairSampleRes6() {
        return hairSampleRes6;
    }
    public void setClinchDealRes6(String clinchDealRes6) {
        this.clinchDealRes6 = clinchDealRes6;
    }

    public String getClinchDealRes6() {
        return clinchDealRes6;
    }
    public void setTrainingRes6(String trainingRes6) {
        this.trainingRes6 = trainingRes6;
    }

    public String getTrainingRes6() {
        return trainingRes6;
    }
    public void setPromotionalActivitiesRes6(String promotionalActivitiesRes6) {
        this.promotionalActivitiesRes6 = promotionalActivitiesRes6;
    }

    public String getPromotionalActivitiesRes6() {
        return promotionalActivitiesRes6;
    }
    public void setVideoProductionRes6(String videoProductionRes6) {
        this.videoProductionRes6 = videoProductionRes6;
    }

    public String getVideoProductionRes6() {
        return videoProductionRes6;
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

    public String getDataRightUserIds() {
		return dataRightUserIds;
	}

	public void setDataRightUserIds(String dataRightUserIds) {
		this.dataRightUserIds = dataRightUserIds;
	}

	@Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("clinchDeal", getClinchDeal())
            .append("hairSample", getHairSample())
            .append("training", getTraining())
            .append("promotionalActivities", getPromotionalActivities())
            .append("videoProduction", getVideoProduction())
            .append("saturdayManagerAnalysis", getSaturdayManagerAnalysis())
            .append("substandardSolutions", getSubstandardSolutions())
            .append("havingData", getHavingData())
            .append("customer1", getCustomer1())
            .append("hairSamplePlan1", getHairSamplePlan1())
            .append("clinchDealPlan1", getClinchDealPlan1())
            .append("trainingPlan1", getTrainingPlan1())
            .append("promotionalActivitiesPlan1", getPromotionalActivitiesPlan1())
            .append("videoProductionPlan1", getVideoProductionPlan1())
            .append("hairBandsRes1", getHairBandsRes1())
            .append("bossMassTextingRes1", getBossMassTextingRes1())
            .append("giveLikeRes1", getGiveLikeRes1())
            .append("hairSampleRes1", getHairSampleRes1())
            .append("clinchDealRes1", getClinchDealRes1())
            .append("trainingRes1", getTrainingRes1())
            .append("promotionalActivitiesRes1", getPromotionalActivitiesRes1())
            .append("videoProductionRes1", getVideoProductionRes1())
            .append("problem1", getProblem1())
            .append("improvedMethod1", getImprovedMethod1())
            .append("tomorrowPlan1", getTomorrowPlan1())
            .append("managerWorkSuggestion1", getManagerWorkSuggestion1())
            .append("customer2", getCustomer2())
            .append("hairSamplePlan2", getHairSamplePlan2())
            .append("clinchDealPlan2", getClinchDealPlan2())
            .append("trainingPlan2", getTrainingPlan2())
            .append("promotionalActivitiesPlan2", getPromotionalActivitiesPlan2())
            .append("videoProductionPlan2", getVideoProductionPlan2())
            .append("hairBandsRes2", getHairBandsRes2())
            .append("bossMassTextingRes2", getBossMassTextingRes2())
            .append("giveLikeRes2", getGiveLikeRes2())
            .append("hairSampleRes2", getHairSampleRes2())
            .append("clinchDealRes2", getClinchDealRes2())
            .append("trainingRes2", getTrainingRes2())
            .append("promotionalActivitiesRes2", getPromotionalActivitiesRes2())
            .append("videoProductionRes2", getVideoProductionRes2())
            .append("problem2", getProblem2())
            .append("improvedMethod2", getImprovedMethod2())
            .append("tomorrowPlan2", getTomorrowPlan2())
            .append("managerWorkSuggestion2", getManagerWorkSuggestion2())
            .append("customer3", getCustomer3())
            .append("hairSamplePlan3", getHairSamplePlan3())
            .append("clinchDealPlan3", getClinchDealPlan3())
            .append("trainingPlan3", getTrainingPlan3())
            .append("promotionalActivitiesPlan3", getPromotionalActivitiesPlan3())
            .append("videoProductionPlan3", getVideoProductionPlan3())
            .append("hairBandsRes3", getHairBandsRes3())
            .append("bossMassTextingRes3", getBossMassTextingRes3())
            .append("giveLikeRes3", getGiveLikeRes3())
            .append("hairSampleRes3", getHairSampleRes3())
            .append("clinchDealRes3", getClinchDealRes3())
            .append("trainingRes3", getTrainingRes3())
            .append("promotionalActivitiesRes3", getPromotionalActivitiesRes3())
            .append("videoProductionRes3", getVideoProductionRes3())
            .append("problem3", getProblem3())
            .append("improvedMethod3", getImprovedMethod3())
            .append("tomorrowPlan3", getTomorrowPlan3())
            .append("managerWorkSuggestion3", getManagerWorkSuggestion3())
            .append("customer4", getCustomer4())
            .append("hairSamplePlan4", getHairSamplePlan4())
            .append("clinchDealPlan4", getClinchDealPlan4())
            .append("trainingPlan4", getTrainingPlan4())
            .append("promotionalActivitiesPlan4", getPromotionalActivitiesPlan4())
            .append("videoProductionPlan4", getVideoProductionPlan4())
            .append("hairBandsRes4", getHairBandsRes4())
            .append("bossMassTextingRes4", getBossMassTextingRes4())
            .append("giveLikeRes4", getGiveLikeRes4())
            .append("hairSampleRes4", getHairSampleRes4())
            .append("clinchDealRes4", getClinchDealRes4())
            .append("trainingRes4", getTrainingRes4())
            .append("promotionalActivitiesRes4", getPromotionalActivitiesRes4())
            .append("videoProductionRes4", getVideoProductionRes4())
            .append("problem4", getProblem4())
            .append("improvedMethod4", getImprovedMethod4())
            .append("tomorrowPlan4", getTomorrowPlan4())
            .append("managerWorkSuggestion4", getManagerWorkSuggestion4())
            .append("customer5", getCustomer5())
            .append("hairSamplePlan5", getHairSamplePlan5())
            .append("clinchDealPlan5", getClinchDealPlan5())
            .append("trainingPlan5", getTrainingPlan5())
            .append("promotionalActivitiesPlan5", getPromotionalActivitiesPlan5())
            .append("videoProductionPlan5", getVideoProductionPlan5())
            .append("hairBandsRes5", getHairBandsRes5())
            .append("bossMassTextingRes5", getBossMassTextingRes5())
            .append("giveLikeRes5", getGiveLikeRes5())
            .append("hairSampleRes5", getHairSampleRes5())
            .append("clinchDealRes5", getClinchDealRes5())
            .append("trainingRes5", getTrainingRes5())
            .append("promotionalActivitiesRes5", getPromotionalActivitiesRes5())
            .append("videoProductionRes5", getVideoProductionRes5())
            .append("problem5", getProblem5())
            .append("improvedMethod5", getImprovedMethod5())
            .append("tomorrowPlan5", getTomorrowPlan5())
            .append("managerWorkSuggestion5", getManagerWorkSuggestion5())
            .append("customer6", getCustomer6())
            .append("hairSamplePlan6", getHairSamplePlan6())
            .append("clinchDealPlan6", getClinchDealPlan6())
            .append("trainingPlan6", getTrainingPlan6())
            .append("promotionalActivitiesPlan6", getPromotionalActivitiesPlan6())
            .append("videoProductionPlan6", getVideoProductionPlan6())
            .append("hairBandsRes6", getHairBandsRes6())
            .append("bossMassTextingRes6", getBossMassTextingRes6())
            .append("giveLikeRes6", getGiveLikeRes6())
            .append("hairSampleRes6", getHairSampleRes6())
            .append("clinchDealRes6", getClinchDealRes6())
            .append("trainingRes6", getTrainingRes6())
            .append("promotionalActivitiesRes6", getPromotionalActivitiesRes6())
            .append("videoProductionRes6", getVideoProductionRes6())
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