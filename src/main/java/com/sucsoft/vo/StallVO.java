package com.sucsoft.vo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.time.LocalDateTime;
@ApiModel("筛选条件实体")
public class StallVO {
    @ApiModelProperty("市场id")
    private Integer marketId;
    @ApiModelProperty("摊位状态")
    private String status;
    @ApiModelProperty("签约时间")
    private LocalDateTime signing;
    @ApiModelProperty("筛选条件")
    private String message;

    public Integer getMarketId() {
        return marketId;
    }

    public void setMarketId(Integer marketId) {
        this.marketId = marketId;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public LocalDateTime getSigning() {
        return signing;
    }

    public void setSigning(LocalDateTime signing) {
        this.signing = signing;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public StallVO() {
    }

    public StallVO(Integer marketId, String status, LocalDateTime signing, String message) {
        this.marketId = marketId;
        this.status = status;
        this.signing = signing;
        this.message = message;
    }

    @Override
    public String toString() {
        return "StallVO{" +
                "marketId=" + marketId +
                ", status='" + status + '\'' +
                ", signing=" + signing +
                ", message='" + message + '\'' +
                '}';
    }
}
