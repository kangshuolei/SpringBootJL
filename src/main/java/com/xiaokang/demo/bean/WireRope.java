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
@TableName("wire_rope")
public class WireRope extends Model<WireRope> {

private static final long serialVersionUID=1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    private String enstrustmentNumber;

    private String producerNumber;

    private String reportNumber;

    private String reportDate;

    private String specification;

    private String structure;

    private String strengthLevel;

    private String surfaceState;

    private String twistingMethod;

    private Double measureBreakTensile;

    private Double minBreakTensile;

    private Double diamete;

    private Double diameteNonRundness;

    private String stockSplitMethod;

    private String trialClass;

    private String nonTrialClass;

    private Double centerDiamete;

    private String centerStrength;

    private String temperature;

    private String evaluation;

    private String memo;

    private String testStandard;

    private String recorderNumber;

    private String recorderMemo;

    private String state;

    private String judgeStandard;

    private String sampleState;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getEnstrustmentNumber() {
        return enstrustmentNumber;
    }

    public void setEnstrustmentNumber(String enstrustmentNumber) {
        this.enstrustmentNumber = enstrustmentNumber;
    }

    public String getProducerNumber() {
        return producerNumber;
    }

    public void setProducerNumber(String producerNumber) {
        this.producerNumber = producerNumber;
    }

    public String getReportNumber() {
        return reportNumber;
    }

    public void setReportNumber(String reportNumber) {
        this.reportNumber = reportNumber;
    }

    public String getReportDate() {
        return reportDate;
    }

    public void setReportDate(String reportDate) {
        this.reportDate = reportDate;
    }

    public String getSpecification() {
        return specification;
    }

    public void setSpecification(String specification) {
        this.specification = specification;
    }

    public String getStructure() {
        return structure;
    }

    public void setStructure(String structure) {
        this.structure = structure;
    }

    public String getStrengthLevel() {
        return strengthLevel;
    }

    public void setStrengthLevel(String strengthLevel) {
        this.strengthLevel = strengthLevel;
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

    public Double getMeasureBreakTensile() {
        return measureBreakTensile;
    }

    public void setMeasureBreakTensile(Double measureBreakTensile) {
        this.measureBreakTensile = measureBreakTensile;
    }

    public Double getMinBreakTensile() {
        return minBreakTensile;
    }

    public void setMinBreakTensile(Double minBreakTensile) {
        this.minBreakTensile = minBreakTensile;
    }

    public Double getDiamete() {
        return diamete;
    }

    public void setDiamete(Double diamete) {
        this.diamete = diamete;
    }

    public Double getDiameteNonRundness() {
        return diameteNonRundness;
    }

    public void setDiameteNonRundness(Double diameteNonRundness) {
        this.diameteNonRundness = diameteNonRundness;
    }

    public String getStockSplitMethod() {
        return stockSplitMethod;
    }

    public void setStockSplitMethod(String stockSplitMethod) {
        this.stockSplitMethod = stockSplitMethod;
    }

    public String getTrialClass() {
        return trialClass;
    }

    public void setTrialClass(String trialClass) {
        this.trialClass = trialClass;
    }

    public String getNonTrialClass() {
        return nonTrialClass;
    }

    public void setNonTrialClass(String nonTrialClass) {
        this.nonTrialClass = nonTrialClass;
    }

    public Double getCenterDiamete() {
        return centerDiamete;
    }

    public void setCenterDiamete(Double centerDiamete) {
        this.centerDiamete = centerDiamete;
    }

    public String getCenterStrength() {
        return centerStrength;
    }

    public void setCenterStrength(String centerStrength) {
        this.centerStrength = centerStrength;
    }

    public String getTemperature() {
        return temperature;
    }

    public void setTemperature(String temperature) {
        this.temperature = temperature;
    }

    public String getEvaluation() {
        return evaluation;
    }

    public void setEvaluation(String evaluation) {
        this.evaluation = evaluation;
    }

    public String getMemo() {
        return memo;
    }

    public void setMemo(String memo) {
        this.memo = memo;
    }

    public String getTestStandard() {
        return testStandard;
    }

    public void setTestStandard(String testStandard) {
        this.testStandard = testStandard;
    }

    public String getRecorderNumber() {
        return recorderNumber;
    }

    public void setRecorderNumber(String recorderNumber) {
        this.recorderNumber = recorderNumber;
    }

    public String getRecorderMemo() {
        return recorderMemo;
    }

    public void setRecorderMemo(String recorderMemo) {
        this.recorderMemo = recorderMemo;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getJudgeStandard() {
        return judgeStandard;
    }

    public void setJudgeStandard(String judgeStandard) {
        this.judgeStandard = judgeStandard;
    }

    public String getSampleState() {
        return sampleState;
    }

    public void setSampleState(String sampleState) {
        this.sampleState = sampleState;
    }

    @Override
    protected Serializable pkVal() {
        return this.id;
    }

    @Override
    public String toString() {
        return "WireRope{" +
        "id=" + id +
        ", enstrustmentNumber=" + enstrustmentNumber +
        ", producerNumber=" + producerNumber +
        ", reportNumber=" + reportNumber +
        ", reportDate=" + reportDate +
        ", specification=" + specification +
        ", structure=" + structure +
        ", strengthLevel=" + strengthLevel +
        ", surfaceState=" + surfaceState +
        ", twistingMethod=" + twistingMethod +
        ", measureBreakTensile=" + measureBreakTensile +
        ", minBreakTensile=" + minBreakTensile +
        ", diamete=" + diamete +
        ", diameteNonRundness=" + diameteNonRundness +
        ", stockSplitMethod=" + stockSplitMethod +
        ", trialClass=" + trialClass +
        ", nonTrialClass=" + nonTrialClass +
        ", centerDiamete=" + centerDiamete +
        ", centerStrength=" + centerStrength +
        ", temperature=" + temperature +
        ", evaluation=" + evaluation +
        ", memo=" + memo +
        ", testStandard=" + testStandard +
        ", recorderNumber=" + recorderNumber +
        ", recorderMemo=" + recorderMemo +
        ", state=" + state +
        ", judgeStandard=" + judgeStandard +
        ", sampleState=" + sampleState +
        "}";
    }
}
