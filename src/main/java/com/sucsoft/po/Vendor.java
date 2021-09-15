package com.sucsoft.po;


import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.time.LocalDateTime;
@ApiModel("摊主实体")
@TableName("vendor")
public class Vendor {
  @ApiModelProperty("摊主id")
  private Integer id;
  @ApiModelProperty("摊主姓名")
  private String name;
  @ApiModelProperty("联系电话")
  private String telphone;
  @ApiModelProperty("签约时间")
  private LocalDateTime signing;
  @ApiModelProperty("到期时间")
  private LocalDateTime expire;
  @ApiModelProperty("租金")
  private Integer rental;
  @ApiModelProperty("支付方式")
  private String mode;
  @ApiModelProperty("租金缴纳时间")
  private String chargingTime;
  @ApiModelProperty("收润比例")
  private String shunt;
  @ApiModelProperty("开户银行")
  private String bank;
  @ApiModelProperty("开户账号")
  private String cardNo;
  @ApiModelProperty("市场id")
  private Integer marketId;
  @ApiModelProperty("摊位id")
  private Integer stallId;

  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
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

  public Integer getRental() {
    return rental;
  }

  public void setRental(Integer rental) {
    this.rental = rental;
  }

  public String getMode() {
    return mode;
  }

  public void setMode(String mode) {
    this.mode = mode;
  }

  public String getChargingTime() {
    return chargingTime;
  }

  public void setChargingTime(String chargingTime) {
    this.chargingTime = chargingTime;
  }

  public String getShunt() {
    return shunt;
  }

  public void setShunt(String shunt) {
    this.shunt = shunt;
  }

  public String getBank() {
    return bank;
  }

  public void setBank(String bank) {
    this.bank = bank;
  }

  public String getCardNo() {
    return cardNo;
  }

  public void setCardNo(String cardNo) {
    this.cardNo = cardNo;
  }

  public Integer getMarketId() {
    return marketId;
  }

  public void setMarketId(Integer marketId) {
    this.marketId = marketId;
  }

  public Integer getStallId() {
    return stallId;
  }

  public void setStallId(Integer stallId) {
    this.stallId = stallId;
  }

  public Vendor() {
  }

  public Vendor(Integer id, String name, String telphone, LocalDateTime signing, LocalDateTime expire, Integer rental, String mode, String chargingTime, String shunt, String bank, String cardNo, Integer marketId, Integer stallId) {
    this.id = id;
    this.name = name;
    this.telphone = telphone;
    this.signing = signing;
    this.expire = expire;
    this.rental = rental;
    this.mode = mode;
    this.chargingTime = chargingTime;
    this.shunt = shunt;
    this.bank = bank;
    this.cardNo = cardNo;
    this.marketId = marketId;
    this.stallId = stallId;
  }
}
