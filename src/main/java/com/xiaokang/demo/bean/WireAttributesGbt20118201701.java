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
@TableName("wire_attributes_gbt20118_201701")
public class WireAttributesGbt20118201701 extends Model<WireAttributesGbt20118201701> {

private static final long serialVersionUID=1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    private String structure;

    private Double minimumBreakingForce;

    private Double tanningLossFactor;

    private Integer partialIntensityLow;

    private Integer partialReverseLow;

    private Integer intensityLow;

    private Integer reverseLow;

    private Double twistDistance;

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

    public Double getTwistDistance() {
        return twistDistance;
    }

    public void setTwistDistance(Double twistDistance) {
        this.twistDistance = twistDistance;
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
        return "WireAttributesGbt20118201701{" +
        "id=" + id +
        ", structure=" + structure +
        ", minimumBreakingForce=" + minimumBreakingForce +
        ", tanningLossFactor=" + tanningLossFactor +
        ", partialIntensityLow=" + partialIntensityLow +
        ", partialReverseLow=" + partialReverseLow +
        ", intensityLow=" + intensityLow +
        ", reverseLow=" + reverseLow +
        ", twistDistance=" + twistDistance +
        ", state=" + state +
        "}";
    }
}
