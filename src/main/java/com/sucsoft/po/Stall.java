package com.sucsoft.po;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel("摊位实体")
@TableName("stall")
public class Stall {
    @TableId
    @ApiModelProperty("摊位id")
    private Integer id;
    @ApiModelProperty("市场id")
    private Integer marketId;
    @ApiModelProperty("摊位具体位置")
    private String place;
    @ApiModelProperty("摊位状态")
    private String status;


    public long getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }


    public long getMarketId() {
        return marketId;
    }

    public void setMarketId(Integer marketId) {
        this.marketId = marketId;
    }


    public String getPlace() {
        return place;
    }

    public void setPlace(String place) {
        this.place = place;
    }


    public String getStatu() {
        return status;
    }

    public void setStatu(String status) {
        this.status = status;
    }



    public Stall() {
    }

    public Stall(Integer id, Integer marketId, String place, String status) {
        this.id = id;
        this.marketId = marketId;
        this.place = place;
        this.status = status;
    }
}
