package com.xiaokang.demo.bean;

import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import java.time.LocalDate;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;

/**
 * <p>
 * 
 * </p>
 *
 * @author 恶龙咆哮
 * @since 2019-05-23
 */
@TableName("entrustment_data")
public class EntrustmentData extends Model<EntrustmentData> {

private static final long serialVersionUID=1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    private String entrustmentNumber;

    private LocalDate date;

    private String productName;

    private String reviewer;

    private Integer steelNumber;

    private String testClerkNumber;

    private String testMachine;

    private String standard;

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

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getReviewer() {
        return reviewer;
    }

    public void setReviewer(String reviewer) {
        this.reviewer = reviewer;
    }

    public Integer getSteelNumber() {
        return steelNumber;
    }

    public void setSteelNumber(Integer steelNumber) {
        this.steelNumber = steelNumber;
    }

    public String getTestClerkNumber() {
        return testClerkNumber;
    }

    public void setTestClerkNumber(String testClerkNumber) {
        this.testClerkNumber = testClerkNumber;
    }

    public String getTestMachine() {
        return testMachine;
    }

    public void setTestMachine(String testMachine) {
        this.testMachine = testMachine;
    }

    public String getStandard() {
        return standard;
    }

    public void setStandard(String standard) {
        this.standard = standard;
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
        return "EntrustmentData{" +
        "id=" + id +
        ", entrustmentNumber=" + entrustmentNumber +
        ", date=" + date +
        ", productName=" + productName +
        ", reviewer=" + reviewer +
        ", steelNumber=" + steelNumber +
        ", testClerkNumber=" + testClerkNumber +
        ", testMachine=" + testMachine +
        ", standard=" + standard +
        ", state=" + state +
        "}";
    }
}
