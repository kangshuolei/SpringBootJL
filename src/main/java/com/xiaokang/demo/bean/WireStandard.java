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
@TableName("wire_standard")
public class WireStandard extends Model<WireStandard> {

private static final long serialVersionUID=1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    private String standardNumber;

    private String wireTable;

    private String proName;

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

    public String getWireTable() {
        return wireTable;
    }

    public void setWireTable(String wireTable) {
        this.wireTable = wireTable;
    }

    public String getProName() {
        return proName;
    }

    public void setProName(String proName) {
        this.proName = proName;
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
        return "WireStandard{" +
        "id=" + id +
        ", standardNumber=" + standardNumber +
        ", wireTable=" + wireTable +
        ", proName=" + proName +
        ", state=" + state +
        "}";
    }
}
