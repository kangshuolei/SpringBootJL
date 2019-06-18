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
@TableName("wire_attributes_gbt20067_2017")
public class WireAttributesGbt200672017 extends Model<WireAttributesGbt200672017> {

private static final long serialVersionUID=1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    private String structure;

    private Double minimumBreakingForce;

    private Double tanningLossFactor;

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
        return "WireAttributesGbt200672017{" +
        "id=" + id +
        ", structure=" + structure +
        ", minimumBreakingForce=" + minimumBreakingForce +
        ", tanningLossFactor=" + tanningLossFactor +
        ", state=" + state +
        "}";
    }
}
