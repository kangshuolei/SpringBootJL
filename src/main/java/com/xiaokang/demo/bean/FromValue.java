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
@TableName("from_value")
public class FromValue extends Model<FromValue> {

private static final long serialVersionUID=1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    private String standardNum;

    private String ratedStrength;

    private String surfaceState;

    private String twistingMethod;

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

    public String getTwistingMethod() {
        return twistingMethod;
    }

    public void setTwistingMethod(String twistingMethod) {
        this.twistingMethod = twistingMethod;
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
        return "FromValue{" +
        "id=" + id +
        ", standardNum=" + standardNum +
        ", ratedStrength=" + ratedStrength +
        ", surfaceState=" + surfaceState +
        ", twistingMethod=" + twistingMethod +
        ", state=" + state +
        "}";
    }
}
