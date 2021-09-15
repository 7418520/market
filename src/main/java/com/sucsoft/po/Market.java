package com.sucsoft.po;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@TableName("market")
@ApiModel("市场实体")
public class Market {
    @TableId
    @ApiModelProperty("市场id")
    private Integer id;
    @ApiModelProperty("市场名称")
    private String marketName;
    @ApiModelProperty("市场地址")
    private String address;
    @ApiModelProperty("市场负责人")
    private String fzr;
    @ApiModelProperty("联系电话")
    private String telphone;
    @ApiModelProperty("摊位数")
    private String stallCount;
    @ApiModelProperty("已租摊位数")
    private Integer rentCount;
    @ApiModelProperty("未租摊位数")
    private Integer notRent;
    @ApiModelProperty("投资时间")
    private String time;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getMarketName() {
        return marketName;
    }

    public void setMarketName(String marketName) {
        this.marketName = marketName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPrincipal() {
        return fzr;
    }

    public void setPrincipal(String fzr) {
        this.fzr = fzr;
    }

    public String getTelphone() {
        return telphone;
    }

    public void setTelphone(String telphone) {
        this.telphone = telphone;
    }

    public String getStallCount() {
        return stallCount;
    }

    public void setStallCount(String stallCount) {
        this.stallCount = stallCount;
    }

    public Integer getRentCount() {
        return rentCount;
    }

    public void setRentCount(Integer rentCount) {
        this.rentCount = rentCount;
    }

    public Integer getNotRent() {
        return notRent;
    }

    public void setNotRent(Integer notRent) {
        this.notRent = notRent;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public Market(Integer id, String marketName, String address, String fzr, String telphone, String stallCount, Integer rentCount, Integer notRent, String time) {
        this.id = id;
        this.marketName = marketName;
        this.address = address;
        this.fzr = fzr;
        this.telphone = telphone;
        this.stallCount = stallCount;
        this.rentCount = rentCount;
        this.notRent = notRent;
        this.time = time;
    }

    public Market() {
    }
}
