package com.ruoyi.wxcustomer.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;
import java.util.Date;

/**
 * 问答库对象 kh_qa_library
 * 
 * @author ruoyi
 * @date 2019-11-20
 */
public class KhQaLibrary extends BaseEntity{
    private static final long serialVersionUID = 1L;

    /** id */
    private String id;

    /** 问题 */
    @Excel(name = "问题")
    private String problem;

    /** 回答 */
    @Excel(name = "回答")
    private String answer;

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

    public void setId(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }
    public void setProblem(String problem) {
        this.problem = problem;
    }

    public String getProblem() {
        return problem;
    }
    public void setAnswer(String answer) {
        this.answer = answer;
    }

    public String getAnswer() {
        return answer;
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

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("problem", getProblem())
            .append("answer", getAnswer())
            .append("remark", getRemark())
            .append("creatorId", getCreatorId())
            .append("creator", getCreator())
            .append("creationTime", getCreationTime())
            .append("alternateField1", getAlternateField1())
            .append("alternateField2", getAlternateField2())
            .toString();
    }
}
