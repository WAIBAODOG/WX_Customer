package com.ruoyi.wxcustomer.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 文件保存表对象 kh_file
 * 
 * @author ruoyi
 * @date 2019-11-23
 */
public class KhFile extends BaseEntity{
    private static final long serialVersionUID = 1L;

    /** 主键id */
    private String id;

    /** 业务id */
    private String businessId;

    /** 业务类型 */
    private String businessYype;

    /** 文件名称 */
    private String fileName;

    /** 文件服务器路径 */
    private String filePath;

    /** 文件大小 */
    private double fileSize;

    /** 文件类型后缀 */
    private String fileType;

    /** 排序 */
    private String sort;

    /** 创建人id */
    private String creatorId;

    public void setId(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }
    public void setBusinessId(String businessId) {
        this.businessId = businessId;
    }

    public String getBusinessId() {
        return businessId;
    }
    public void setBusinessYype(String businessYype) {
        this.businessYype = businessYype;
    }

    public String getBusinessYype() {
        return businessYype;
    }
    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public String getFileName() {
        return fileName;
    }
    public void setFilePath(String filePath) {
        this.filePath = filePath;
    }

    public String getFilePath() {
        return filePath;
    }
    public void setFileSize(double fileSize) {
        this.fileSize = fileSize;
    }

    public double getFileSize() {
        return fileSize;
    }
    public void setFileType(String fileType) {
        this.fileType = fileType;
    }

    public String getFileType() {
        return fileType;
    }
    public void setSort(String sort) {
        this.sort = sort;
    }

    public String getSort() {
        return sort;
    }
    public void setCreatorId(String creatorId) {
        this.creatorId = creatorId;
    }

    public String getCreatorId() {
        return creatorId;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("businessId", getBusinessId())
            .append("businessYype", getBusinessYype())
            .append("fileName", getFileName())
            .append("filePath", getFilePath())
            .append("fileSize", getFileSize())
            .append("fileType", getFileType())
            .append("createTime", getCreateTime())
            .append("sort", getSort())
            .append("creatorId", getCreatorId())
            .toString();
    }
}
