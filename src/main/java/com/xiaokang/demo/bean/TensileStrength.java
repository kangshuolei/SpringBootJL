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
@TableName("tensile_strength")
public class TensileStrength extends Model<TensileStrength> {

private static final long serialVersionUID=1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    private String standardNumber;

    private Integer strengthValue;

    private String ratedStrength;

    private String type;

    private String state;


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

    public Integer getStrengthValue() {
        return strengthValue;
    }

    public void setStrengthValue(Integer strengthValue) {
        this.strengthValue = strengthValue;
    }

    public String getRatedStrength() {
        return ratedStrength;
    }

    public void setRatedStrength(String ratedStrength) {
        this.ratedStrength = ratedStrength;
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

    @Override
    protected Serializable pkVal() {
        return this.id;
    }

    @Override
    public String toString() {
        return "TensileStrength{" +
        "id=" + id +
        ", standardNumber=" + standardNumber +
        ", strengthValue=" + strengthValue +
        ", ratedStrength=" + ratedStrength +
        ", type=" + type +
        ", state=" + state +
        "}";
    }
}
