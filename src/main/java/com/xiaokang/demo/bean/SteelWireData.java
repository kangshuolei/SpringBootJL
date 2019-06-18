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
@TableName("steel_wire_data")
public class SteelWireData extends Model<SteelWireData> {

private static final long serialVersionUID=1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    private String entrustmentNumber;

    private String productionNumber;

    private Double pDiamete;

    private Double fDiamete;

    private Double nDiamete;

    private String use;

    private String surface;

    private Double breakTensile;

    private Double tensileStrength;

    private Double knotTension;

    private Double knotRate;

    private Integer torsionTimes;

    private Integer bendingTimes;

    private Integer steelLength;

    private String judge;

    private Integer board;

    private String wheelNumber;

    private String gradeSteel;

    private String producer;

    private String recorderNumber;

    /**
     * 备注
     */
    private String memo1;

    private String state;

    private Integer sampleBatch;

    private String memo2;

    private String strengthLevel;


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

    public String getProductionNumber() {
        return productionNumber;
    }

    public void setProductionNumber(String productionNumber) {
        this.productionNumber = productionNumber;
    }

    public Double getpDiamete() {
        return pDiamete;
    }

    public void setpDiamete(Double pDiamete) {
        this.pDiamete = pDiamete;
    }

    public Double getfDiamete() {
        return fDiamete;
    }

    public void setfDiamete(Double fDiamete) {
        this.fDiamete = fDiamete;
    }

    public Double getnDiamete() {
        return nDiamete;
    }

    public void setnDiamete(Double nDiamete) {
        this.nDiamete = nDiamete;
    }

    public String getUse() {
        return use;
    }

    public void setUse(String use) {
        this.use = use;
    }

    public String getSurface() {
        return surface;
    }

    public void setSurface(String surface) {
        this.surface = surface;
    }

    public Double getBreakTensile() {
        return breakTensile;
    }

    public void setBreakTensile(Double breakTensile) {
        this.breakTensile = breakTensile;
    }

    public Double getTensileStrength() {
        return tensileStrength;
    }

    public void setTensileStrength(Double tensileStrength) {
        this.tensileStrength = tensileStrength;
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

    public Integer getTorsionTimes() {
        return torsionTimes;
    }

    public void setTorsionTimes(Integer torsionTimes) {
        this.torsionTimes = torsionTimes;
    }

    public Integer getBendingTimes() {
        return bendingTimes;
    }

    public void setBendingTimes(Integer bendingTimes) {
        this.bendingTimes = bendingTimes;
    }

    public Integer getSteelLength() {
        return steelLength;
    }

    public void setSteelLength(Integer steelLength) {
        this.steelLength = steelLength;
    }

    public String getJudge() {
        return judge;
    }

    public void setJudge(String judge) {
        this.judge = judge;
    }

    public Integer getBoard() {
        return board;
    }

    public void setBoard(Integer board) {
        this.board = board;
    }

    public String getWheelNumber() {
        return wheelNumber;
    }

    public void setWheelNumber(String wheelNumber) {
        this.wheelNumber = wheelNumber;
    }

    public String getGradeSteel() {
        return gradeSteel;
    }

    public void setGradeSteel(String gradeSteel) {
        this.gradeSteel = gradeSteel;
    }

    public String getProducer() {
        return producer;
    }

    public void setProducer(String producer) {
        this.producer = producer;
    }

    public String getRecorderNumber() {
        return recorderNumber;
    }

    public void setRecorderNumber(String recorderNumber) {
        this.recorderNumber = recorderNumber;
    }

    public String getMemo1() {
        return memo1;
    }

    public void setMemo1(String memo1) {
        this.memo1 = memo1;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public Integer getSampleBatch() {
        return sampleBatch;
    }

    public void setSampleBatch(Integer sampleBatch) {
        this.sampleBatch = sampleBatch;
    }

    public String getMemo2() {
        return memo2;
    }

    public void setMemo2(String memo2) {
        this.memo2 = memo2;
    }

    public String getStrengthLevel() {
        return strengthLevel;
    }

    public void setStrengthLevel(String strengthLevel) {
        this.strengthLevel = strengthLevel;
    }

    @Override
    protected Serializable pkVal() {
        return this.id;
    }

    @Override
    public String toString() {
        return "SteelWireData{" +
        "id=" + id +
        ", entrustmentNumber=" + entrustmentNumber +
        ", productionNumber=" + productionNumber +
        ", pDiamete=" + pDiamete +
        ", fDiamete=" + fDiamete +
        ", nDiamete=" + nDiamete +
        ", use=" + use +
        ", surface=" + surface +
        ", breakTensile=" + breakTensile +
        ", tensileStrength=" + tensileStrength +
        ", knotTension=" + knotTension +
        ", knotRate=" + knotRate +
        ", torsionTimes=" + torsionTimes +
        ", bendingTimes=" + bendingTimes +
        ", steelLength=" + steelLength +
        ", judge=" + judge +
        ", board=" + board +
        ", wheelNumber=" + wheelNumber +
        ", gradeSteel=" + gradeSteel +
        ", producer=" + producer +
        ", recorderNumber=" + recorderNumber +
        ", memo1=" + memo1 +
        ", state=" + state +
        ", sampleBatch=" + sampleBatch +
        ", memo2=" + memo2 +
        ", strengthLevel=" + strengthLevel +
        "}";
    }
}
