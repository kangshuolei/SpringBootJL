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
@TableName("wire_attributes_gbt8918_2006")
public class WireAttributesGbt89182006 extends Model<WireAttributesGbt89182006> {

private static final long serialVersionUID=1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    private String structure;

    private Double minimumBreakingForce;

    private Double tanningLossFactor;

    private String state;

    private String classification;

    private String shape;

    private Double diamateMin;

    private Double diamateMax;


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

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getClassification() {
        return classification;
    }

    public void setClassification(String classification) {
        this.classification = classification;
    }

    public String getShape() {
        return shape;
    }

    public void setShape(String shape) {
        this.shape = shape;
    }

    public Double getDiamateMin() {
        return diamateMin;
    }

    public void setDiamateMin(Double diamateMin) {
        this.diamateMin = diamateMin;
    }

    public Double getDiamateMax() {
        return diamateMax;
    }

    public void setDiamateMax(Double diamateMax) {
        this.diamateMax = diamateMax;
    }

    @Override
    protected Serializable pkVal() {
        return this.id;
    }

    @Override
    public String toString() {
        return "WireAttributesGbt89182006{" +
        "id=" + id +
        ", structure=" + structure +
        ", minimumBreakingForce=" + minimumBreakingForce +
        ", tanningLossFactor=" + tanningLossFactor +
        ", state=" + state +
        ", classification=" + classification +
        ", shape=" + shape +
        ", diamateMin=" + diamateMin +
        ", diamateMax=" + diamateMax +
        "}";
    }
}
