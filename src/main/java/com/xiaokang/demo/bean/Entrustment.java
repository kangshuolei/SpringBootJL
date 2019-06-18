package com.xiaokang.demo.bean;

import com.baomidou.mybatisplus.annotation.TableLogic;
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
@TableName("entrustment")
public class Entrustment extends Model<Entrustment> {

private static final long serialVersionUID=1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    private Integer sampleBatch;

    private String entrustmentNumber;

    @TableLogic
    private String state;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getSampleBatch() {
        return sampleBatch;
    }

    public void setSampleBatch(Integer sampleBatch) {
        this.sampleBatch = sampleBatch;
    }

    public String getEntrustmentNumber() {
        return entrustmentNumber;
    }

    public void setEntrustmentNumber(String entrustmentNumber) {
        this.entrustmentNumber = entrustmentNumber;
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
        return "Entrustment{" +
        "id=" + id +
        ", sampleBatch=" + sampleBatch +
        ", entrustmentNumber=" + entrustmentNumber +
        ", state=" + state +
        "}";
    }
}
