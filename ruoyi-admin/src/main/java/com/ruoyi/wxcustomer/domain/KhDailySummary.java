package com.ruoyi.wxcustomer.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;
import java.util.Date;

/**
 * 工作总结对象 kh_daily_summary
 * 
 * @author ruoyi
 * @date 2019-11-19
 */
public class KhDailySummary extends BaseEntity{
    private static final long serialVersionUID = 1L;

    /** ID */
    private String id;

    /** 今日数据 */
    private String todayData;

    /** 今日问题 */
    private String todayProblems;

    /** 改进方法 */
    private String improvedMethod;

    /** 明日计划 */
    private String tomorrowPlan;

    /** 总结类型 */
    @Excel(name = "总结类型")
    private String summaryType;

    /** 总结时间 */
    @Excel(name = "总结时间", width = 30, dateFormat = "yyyy-MM-dd")
    private Date conclusionTime;

    /** 创建人id */
    private String creatorId;

    /** 创建人 */
    @Excel(name = "创建人")
    private String creator;

    /** 创建时间 */
    @Excel(name = "创建时间", width = 30, dateFormat = "yyyy-MM-dd")
    private Date creationTime;

    /** 备用字段1 */
    private String alternateField1;

    /** 备用字段2 */
    private String alternateField2;

    /** 备用字段3 */
    private String alternateField3;

    /** 备用字段4 */
    private String alternateField4;

    /** 备用字段5 */
    private String alternateField5;

    public void setId(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }
    public void setTodayData(String todayData) {
        this.todayData = todayData;
    }

    public String getTodayData() {
        return todayData;
    }
    public void setTodayProblems(String todayProblems) {
        this.todayProblems = todayProblems;
    }

    public String getTodayProblems() {
        return todayProblems;
    }
    public void setImprovedMethod(String improvedMethod) {
        this.improvedMethod = improvedMethod;
    }

    public String getImprovedMethod() {
        return improvedMethod;
    }
    public void setTomorrowPlan(String tomorrowPlan) {
        this.tomorrowPlan = tomorrowPlan;
    }

    public String getTomorrowPlan() {
        return tomorrowPlan;
    }
    public void setSummaryType(String summaryType) {
        this.summaryType = summaryType;
    }

    public String getSummaryType() {
        return summaryType;
    }
    public void setConclusionTime(Date conclusionTime) {
        this.conclusionTime = conclusionTime;
    }

    public Date getConclusionTime() {
        return conclusionTime;
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
    public void setCreationTime(Date creationTime) {
        this.creationTime = creationTime;
    }

    public Date getCreationTime() {
        return creationTime;
    }
    public void setAlternateField1(String alternateField1) {
        this.alternateField1 = alternateField1;
    }

    public String getAlternateField1() {
        return alternateField1;
    }
    public void setAlternateField2(String alternateField2) {
        this.alternateField2 = alternateField2;
    }

    public String getAlternateField2() {
        return alternateField2;
    }
    public void setAlternateField3(String alternateField3) {
        this.alternateField3 = alternateField3;
    }

    public String getAlternateField3() {
        return alternateField3;
    }
    public void setAlternateField4(String alternateField4) {
        this.alternateField4 = alternateField4;
    }

    public String getAlternateField4() {
        return alternateField4;
    }
    public void setAlternateField5(String alternateField5) {
        this.alternateField5 = alternateField5;
    }

    public String getAlternateField5() {
        return alternateField5;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("todayData", getTodayData())
            .append("todayProblems", getTodayProblems())
            .append("improvedMethod", getImprovedMethod())
            .append("tomorrowPlan", getTomorrowPlan())
            .append("summaryType", getSummaryType())
            .append("conclusionTime", getConclusionTime())
            .append("creatorId", getCreatorId())
            .append("creator", getCreator())
            .append("creationTime", getCreationTime())
            .append("alternateField1", getAlternateField1())
            .append("alternateField2", getAlternateField2())
            .append("alternateField3", getAlternateField3())
            .append("alternateField4", getAlternateField4())
            .append("alternateField5", getAlternateField5())
            .toString();
    }
}
