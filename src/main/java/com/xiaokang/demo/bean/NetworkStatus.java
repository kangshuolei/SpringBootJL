package com.xiaokang.demo.bean;

import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import com.baomidou.mybatisplus.annotation.TableId;
import java.time.LocalDateTime;
import java.io.Serializable;

/**
 * <p>
 * 
 * </p>
 *
 * @author 恶龙咆哮
 * @since 2019-05-23
 */
@TableName("network_status")
public class NetworkStatus extends Model<NetworkStatus> {

private static final long serialVersionUID=1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    private Integer addressCoding;

    private String networkingStatus;

    private String type;

    private String machineType;

    private String machineNumber;

    private Integer portNumber;

    private LocalDateTime createDate;

    private String machineAddr;

    private String state;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getAddressCoding() {
        return addressCoding;
    }

    public void setAddressCoding(Integer addressCoding) {
        this.addressCoding = addressCoding;
    }

    public String getNetworkingStatus() {
        return networkingStatus;
    }

    public void setNetworkingStatus(String networkingStatus) {
        this.networkingStatus = networkingStatus;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getMachineType() {
        return machineType;
    }

    public void setMachineType(String machineType) {
        this.machineType = machineType;
    }

    public String getMachineNumber() {
        return machineNumber;
    }

    public void setMachineNumber(String machineNumber) {
        this.machineNumber = machineNumber;
    }

    public Integer getPortNumber() {
        return portNumber;
    }

    public void setPortNumber(Integer portNumber) {
        this.portNumber = portNumber;
    }

    public LocalDateTime getCreateDate() {
        return createDate;
    }

    public void setCreateDate(LocalDateTime createDate) {
        this.createDate = createDate;
    }

    public String getMachineAddr() {
        return machineAddr;
    }

    public void setMachineAddr(String machineAddr) {
        this.machineAddr = machineAddr;
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
        return "NetworkStatus{" +
        "id=" + id +
        ", addressCoding=" + addressCoding +
        ", networkingStatus=" + networkingStatus +
        ", type=" + type +
        ", machineType=" + machineType +
        ", machineNumber=" + machineNumber +
        ", portNumber=" + portNumber +
        ", createDate=" + createDate +
        ", machineAddr=" + machineAddr +
        ", state=" + state +
        "}";
    }
}
