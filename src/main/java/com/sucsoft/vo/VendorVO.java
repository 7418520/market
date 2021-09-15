package com.sucsoft.vo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.web.multipart.MultipartFile;

import java.time.LocalDateTime;
@ApiModel("插入摊主VO")
public class VendorVO {
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
    @ApiModelProperty("摊主照片")
    private MultipartFile photo;
    @ApiModelProperty("经营许可证(图片)")
    private MultipartFile businessCertificate;
    @ApiModelProperty("合同附件(图片)")
    private MultipartFile contract;

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

    public MultipartFile getPhoto() {
        return photo;
    }

    public void setPhoto(MultipartFile photo) {
        this.photo = photo;
    }

    public MultipartFile getBusinessCertificate() {
        return businessCertificate;
    }

    public void setBusinessCertificate(MultipartFile businessCertificate) {
        this.businessCertificate = businessCertificate;
    }

    public MultipartFile getContract() {
        return contract;
    }

    public void setContract(MultipartFile contract) {
        this.contract = contract;
    }

    public VendorVO() {
    }

    public VendorVO(Integer id, String name, String telphone, LocalDateTime signing, LocalDateTime expire, Integer rental, String mode, String chargingTime, String shunt, String bank, String cardNo, Integer marketId, Integer stallId, MultipartFile photo, MultipartFile businessCertificate, MultipartFile contract) {
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
        this.photo = photo;
        this.businessCertificate = businessCertificate;
        this.contract = contract;
    }
}
