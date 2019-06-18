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
@TableName("wire_data")
public class WireData extends Model<WireData> {

private static final long serialVersionUID=1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    private String entrustmentNumber;

    private Double nDiamete;

    private Double diamete;

    private String diameteJudge;

    private Double breakTensile;

    private String tensileJudge;

    private Double tensileStrength;

    private String strengthJudge;

    private Double knotTension;

    private Double knotRate;

    private String knotJudge;

    private Integer turnTimes;

    private String turnJudge;

    private Integer windingTimes;

    private Integer twineTimes;

    private Double zincWeight;

    private String zincJudge;

    private String state;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getEntrustmentNumber() {
        return entrustmentNumber;
    }

    public void setEntrustmentNumber(String entrustmentNumber) {
        this.entrustmentNumber = entrustmentNumber;
    }

    public Double getnDiamete() {
        return nDiamete;
    }

    public void setnDiamete(Double nDiamete) {
        this.nDiamete = nDiamete;
    }

    public Double getDiamete() {
        return diamete;
    }

    public void setDiamete(Double diamete) {
        this.diamete = diamete;
    }

    public String getDiameteJudge() {
        return diameteJudge;
    }

    public void setDiameteJudge(String diameteJudge) {
        this.diameteJudge = diameteJudge;
    }

    public Double getBreakTensile() {
        return breakTensile;
    }

    public void setBreakTensile(Double breakTensile) {
        this.breakTensile = breakTensile;
    }

    public String getTensileJudge() {
        return tensileJudge;
    }

    public void setTensileJudge(String tensileJudge) {
        this.tensileJudge = tensileJudge;
    }

    public Double getTensileStrength() {
        return tensileStrength;
    }

    public void setTensileStrength(Double tensileStrength) {
        this.tensileStrength = tensileStrength;
    }

    public String getStrengthJudge() {
        return strengthJudge;
    }

    public void setStrengthJudge(String strengthJudge) {
        this.strengthJudge = strengthJudge;
    }

    public Double getKnotTension() {
        return knotTension;
    }

    public void setKnotTension(Double knotTension) {
        this.knotTension = knotTension;
    }

    public Double getKnotRate() {
        return knotRate;
    }

    public void setKnotRate(Double knotRate) {
        this.knotRate = knotRate;
    }

    public String getKnotJudge() {
        return knotJudge;
    }

    public void setKnotJudge(String knotJudge) {
        this.knotJudge = knotJudge;
    }

    public Integer getTurnTimes() {
        return turnTimes;
    }

    public void setTurnTimes(Integer turnTimes) {
        this.turnTimes = turnTimes;
    }

    public String getTurnJudge() {
        return turnJudge;
    }

    public void setTurnJudge(String turnJudge) {
        this.turnJudge = turnJudge;
    }

    public Integer getWindingTimes() {
        return windingTimes;
    }

    public void setWindingTimes(Integer windingTimes) {
        this.windingTimes = windingTimes;
    }

    public Integer getTwineTimes() {
        return twineTimes;
    }

    public void setTwineTimes(Integer twineTimes) {
        this.twineTimes = twineTimes;
    }

    public Double getZincWeight() {
        return zincWeight;
    }

    public void setZincWeight(Double zincWeight) {
        this.zincWeight = zincWeight;
    }

    public String getZincJudge() {
        return zincJudge;
    }

    public void setZincJudge(String zincJudge) {
        this.zincJudge = zincJudge;
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
        return "WireData{" +
        "id=" + id +
        ", entrustmentNumber=" + entrustmentNumber +
        ", nDiamete=" + nDiamete +
        ", diamete=" + diamete +
        ", diameteJudge=" + diameteJudge +
        ", breakTensile=" + breakTensile +
        ", tensileJudge=" + tensileJudge +
        ", tensileStrength=" + tensileStrength +
        ", strengthJudge=" + strengthJudge +
        ", knotTension=" + knotTension +
        ", knotRate=" + knotRate +
        ", knotJudge=" + knotJudge +
        ", turnTimes=" + turnTimes +
        ", turnJudge=" + turnJudge +
        ", windingTimes=" + windingTimes +
        ", twineTimes=" + twineTimes +
        ", zincWeight=" + zincWeight +
        ", zincJudge=" + zincJudge +
        ", state=" + state +
        "}";
    }
}
