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
@TableName("diameter_deviation")
public class DiameterDeviation extends Model<DiameterDeviation> {

private static final long serialVersionUID=1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    private String standardNum;

    private Double diameteMin;

    private Double diameteMax;

    private String type;

    private Double value;

    private String state;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getStandardNum() {
        return standardNum;
    }

    public void setStandardNum(String standardNum) {
        this.standardNum = standardNum;
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

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Double getValue() {
        return value;
    }

    public void setValue(Double value) {
        this.value = value;
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
        return "DiameterDeviation{" +
        "id=" + id +
        ", standardNum=" + standardNum +
        ", diameteMin=" + diameteMin +
        ", diameteMax=" + diameteMax +
        ", type=" + type +
        ", value=" + value +
        ", state=" + state +
        "}";
    }
}
