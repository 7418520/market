package com.sucsoft.DTO;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.time.LocalDateTime;
@ApiModel("摊位对象DTO")
public class BoothRentalDTO {
    @ApiModelProperty("摊位id")
    private Integer id;
    @ApiModelProperty("摊位地址")
    private String address;
    @ApiModelProperty("摊位状态")
    private String status;
    @ApiModelProperty("摊位类别")
    private String workingGroup;
    @ApiModelProperty("摊主姓名")
    private String name;
    @ApiModelProperty("联系电话")
    private String telphone;
    @ApiModelProperty("签约时间")
    private LocalDateTime signing;
    @ApiModelProperty("到期时间")
    private LocalDateTime expire;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getWorkingGroup() {
        return workingGroup;
    }

    public void setWorkingGroup(String workingGroup) {
        this.workingGroup = workingGroup;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTelphone() {
        return telphone;
    }

    public void setTelphone(String telphone) {
        this.telphone = telphone;
    }

    public LocalDateTime getSigning() {
        return signing;
    }

    public void setSigning(LocalDateTime signing) {
        this.signing = signing;
    }

    public LocalDateTime getExpire() {
        return expire;
    }

    public void setExpire(LocalDateTime expire) {
        this.expire = expire;
    }

    public BoothRentalDTO() {
    }

    public BoothRentalDTO(Integer id, String address, String status, String workingGroup, String name, String telphone, LocalDateTime signing, LocalDateTime expire) {
        this.id = id;
        this.address = address;
        this.status = status;
        this.workingGroup = workingGroup;
        this.name = name;
        this.telphone = telphone;
        this.signing = signing;
        this.expire = expire;
    }
}
