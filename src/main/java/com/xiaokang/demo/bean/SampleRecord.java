package com.xiaokang.demo.bean;

import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import java.time.LocalDate;
import com.baomidou.mybatisplus.annotation.TableId;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
import java.util.Date;

/**
 * <p>
 * 
 * </p>
 *
 * @author 恶龙咆哮
 * @since 2019-05-23
 */
@TableName("sample_record")
public class SampleRecord extends Model<SampleRecord> {

private static final long serialVersionUID=1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    private String entrustmentNumber;

    private Integer sampleBatch;

    private Integer sampleNumber;

    private Double experimentalData;

    private String testMembersNumber;

    private String type;

    private String machineType;

    private String machineNumber;

    @JsonFormat(timezone = "GMT+8", pattern = "yyyy-MM-dd HH:mm:ss")
    private Date createDate;

    private String state;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getEntrustmentNumber() {
        return entrustmentNumber;
    }

    public void setEntrustmentNumber(String entrustmentNumber) {
        this.entrustmentNumber = entrustmentNumber;
    }

    public Integer getSampleBatch() {
        return sampleBatch;
    }

    public void setSampleBatch(Integer sampleBatch) {
        this.sampleBatch = sampleBatch;
    }

    public Integer getSampleNumber() {
        return sampleNumber;
    }

    public void setSampleNumber(Integer sampleNumber) {
        this.sampleNumber = sampleNumber;
    }

    public Double getExperimentalData() {
        return experimentalData;
    }

    public void setExperimentalData(Double experimentalData) {
        this.experimentalData = experimentalData;
    }

    public String getTestMembersNumber() {
        return testMembersNumber;
    }

    public void setTestMembersNumber(String testMembersNumber) {
        this.testMembersNumber = testMembersNumber;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getMachineType() {
        return machineType;
    }

    public void setMachineType(String machineType) {
        this.machineType = machineType;
    }

    public String getMachineNumber() {
        return machineNumber;
    }

    public void setMachineNumber(String machineNumber) {
        this.machineNumber = machineNumber;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    @Override
    protected Serializable pkVal() {
        return this.id;
    }

    @Override
    public String toString() {
        return "SampleRecord{" +
        "id=" + id +
        ", entrustmentNumber=" + entrustmentNumber +
        ", sampleBatch=" + sampleBatch +
        ", sampleNumber=" + sampleNumber +
        ", experimentalData=" + experimentalData +
        ", testMembersNumber=" + testMembersNumber +
        ", type=" + type +
        ", machineType=" + machineType +
        ", machineNumber=" + machineNumber +
        ", createDate=" + createDate +
        ", state=" + state +
        "}";
    }
}
