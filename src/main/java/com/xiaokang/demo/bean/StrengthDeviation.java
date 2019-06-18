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
@TableName("strength_deviation")
public class StrengthDeviation extends Model<StrengthDeviation> {

private static final long serialVersionUID=1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    private String standardNum;

    private Double diamateMin;

    private Double diamateMax;

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
        return "StrengthDeviation{" +
        "id=" + id +
        ", standardNum=" + standardNum +
        ", diamateMin=" + diamateMin +
        ", diamateMax=" + diamateMax +
        ", value=" + value +
        ", state=" + state +
        "}";
    }
}
