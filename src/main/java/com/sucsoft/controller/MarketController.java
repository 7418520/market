package com.sucsoft.controller;

import com.sucsoft.po.Market;
import com.sucsoft.service.MarketService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/market")
@Api(tags = "查询市场")
public class MarketController {
    @Autowired
    private MarketService marketService;
    @ApiOperation("查询所有的市场")
    @GetMapping("/queryMarket")
    public List<Market> queryMarket(){
        return marketService.queryMarket();
    }
}
