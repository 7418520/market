package com.sucsoft.controller;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.sucsoft.DTO.BoothRentalDTO;
import com.sucsoft.service.StallService;
import com.sucsoft.vo.StallVO;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@Api(tags = "摊位")
@RequestMapping("/api/market")
public class StallController {
    @Autowired
    private StallService stallService;

    @GetMapping("queryBooth")
    @ApiOperation("查询摊位以及租赁信息")
    @ApiImplicitParams(@ApiImplicitParam(name = "stallVO", value = "筛选条件，marketId不能为空，其余可以为空"))
    private List<BoothRentalDTO> queryBooth(@RequestBody StallVO stallVO) {
        System.out.println(stallVO);
        return stallService.queryResult(stallVO);
    }

    @GetMapping("queryAllStall")
    @ApiOperation("查询所有市场摊位")
    @ApiImplicitParams(@ApiImplicitParam(name = "marketId", value = "筛选条件，marketId不能为空，其余可以为空"))
    public Page queryBooth(Integer marketId, @RequestParam(value = "pageNum", defaultValue = "1") Integer pageNum, @RequestParam(value = "pageSize", defaultValue = "1") Integer pageSize) {
        return stallService.queryAllStall(marketId, pageNum, pageSize);
    }

    @DeleteMapping("/delStall")
    @ApiOperation("删除摊位")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "marketId", value = "市场id"),
            @ApiImplicitParam(name = "stallId", value = "摊位id")})

    public void delStall(Integer marketId, Integer stallId) throws Exception {
        stallService.delStall(marketId, stallId);
    }
}
