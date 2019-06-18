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
@TableName("reverse_bending")
public class ReverseBending extends Model<ReverseBending> {

private static final long serialVersionUID=1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    private String standardNumber;

    private String ratedStrength;

    private String surfaceState;

    private Double diameteMin;

    private Double diameteMax;

    private Integer valueRob;

    private String type;

    private String state;

    private String usage;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getStandardNumber() {
        return standardNumber;
    }

    public void setStandardNumber(String standardNumber) {
        this.standardNumber = standardNumber;
    }

    public String getRatedStrength() {
        return ratedStrength;
    }

    public void setRatedStrength(String ratedStrength) {
        this.ratedStrength = ratedStrength;
    }

    public String getSurfaceState() {
        return surfaceState;
    }

    public void setSurfaceState(String surfaceState) {
        this.surfaceState = surfaceState;
    }

    public Double getDiameteMin() {
        return diameteMin;
    }

    public void setDiameteMin(Double diameteMin) {
        this.diameteMin = diameteMin;
    }

    public Double getDiameteMax() {
        return diameteMax;
    }

    public void setDiameteMax(Double diameteMax) {
        this.diameteMax = diameteMax;
    }

    public Integer getValueRob() {
        return valueRob;
    }

    public void setValueRob(Integer valueRob) {
        this.valueRob = valueRob;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getUsage() {
        return usage;
    }

    public void setUsage(String usage) {
        this.usage = usage;
    }

    @Override
    protected Serializable pkVal() {
        return this.id;
    }

    @Override
    public String toString() {
        return "ReverseBending{" +
        "id=" + id +
        ", standard Number=" + standardNumber +
        ", ratedStrength=" + ratedStrength +
        ", surfaceState=" + surfaceState +
        ", diameteMin=" + diameteMin +
        ", diameteMax=" + diameteMax +
        ", valueRob=" + valueRob +
        ", type=" + type +
        ", state=" + state +
        ", usage=" + usage +
        "}";
    }
}
