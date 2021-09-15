package com.sucsoft.controller;

import com.sucsoft.DTO.BoothRentalDTO;
import com.sucsoft.service.StallService;
import com.sucsoft.vo.StallVO;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@Api(tags = "摊位")
public class StallController {
    @Autowired
    private StallService stallService;
    @GetMapping("queryBooth")
    @ApiOperation("查询摊位以及租赁信息")
    @ApiImplicitParams(@ApiImplicitParam(name="stallVO",value = "筛选条件，marketId不能为空，其余可以为空" ))
    private List<BoothRentalDTO> queryBooth(@RequestBody StallVO stallVO){
        return stallService.queryResult(stallVO);
    }
}
