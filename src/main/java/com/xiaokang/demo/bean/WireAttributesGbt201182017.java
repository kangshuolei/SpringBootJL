package com.xiaokang.demo.bean;

import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.extension.activerecord.Model;
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
@TableName("wire_attributes_gbt20118_2017")
public class WireAttributesGbt201182017 extends Model<WireAttributesGbt201182017> {

private static final long serialVersionUID=1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    private String structure;

    private Double minimumBreakingForce;

    private Double smallMinimumBreakingForce;

    private Double tanningLossFactor;

    private Integer partialIntensityLow;

    private Integer partialReverseLow;

    private Integer intensityLow;

    private Integer reverseLow;

    private Double twistDiatance;

    private String state;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getStructure() {
        return structure;
    }

    public void setStructure(String structure) {
        this.structure = structure;
    }

    public Double getMinimumBreakingForce() {
        return minimumBreakingForce;
    }

    public void setMinimumBreakingForce(Double minimumBreakingForce) {
        this.minimumBreakingForce = minimumBreakingForce;
    }

    public Double getSmallMinimumBreakingForce() {
        return smallMinimumBreakingForce;
    }

    public void setSmallMinimumBreakingForce(Double smallMinimumBreakingForce) {
        this.smallMinimumBreakingForce = smallMinimumBreakingForce;
    }

    public Double getTanningLossFactor() {
        return tanningLossFactor;
    }

    public void setTanningLossFactor(Double tanningLossFactor) {
        this.tanningLossFactor = tanningLossFactor;
    }

    public Integer getPartialIntensityLow() {
        return partialIntensityLow;
    }

    public void setPartialIntensityLow(Integer partialIntensityLow) {
        this.partialIntensityLow = partialIntensityLow;
    }

    public Integer getPartialReverseLow() {
        return partialReverseLow;
    }

    public void setPartialReverseLow(Integer partialReverseLow) {
        this.partialReverseLow = partialReverseLow;
    }

    public Integer getIntensityLow() {
        return intensityLow;
    }

    public void setIntensityLow(Integer intensityLow) {
        this.intensityLow = intensityLow;
    }

    public Integer getReverseLow() {
        return reverseLow;
    }

    public void setReverseLow(Integer reverseLow) {
        this.reverseLow = reverseLow;
    }

    public Double getTwistDiatance() {
        return twistDiatance;
    }

    public void setTwistDiatance(Double twistDiatance) {
        this.twistDiatance = twistDiatance;
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
        return "WireAttributesGbt201182017{" +
        "id=" + id +
        ", structure=" + structure +
        ", minimumBreakingForce=" + minimumBreakingForce +
        ", smallMinimumBreakingForce=" + smallMinimumBreakingForce +
        ", tanningLossFactor=" + tanningLossFactor +
        ", partialIntensityLow=" + partialIntensityLow +
        ", partialReverseLow=" + partialReverseLow +
        ", intensityLow=" + intensityLow +
        ", reverseLow=" + reverseLow +
        ", twistDiatance=" + twistDiatance +
        ", state=" + state +
        "}";
    }
}
