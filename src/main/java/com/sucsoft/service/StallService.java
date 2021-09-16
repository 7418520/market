package com.sucsoft.service;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.sucsoft.DTO.BoothRentalDTO;
import com.sucsoft.mapper.StallDao;
import com.sucsoft.po.Stall;
import com.sucsoft.vo.StallVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StallService extends ServiceImpl<StallDao, Stall> {
    @Autowired
    private StallDao stallDao;
    /**
     * 查询该市场下的所有摊位
     */
    public Page queryAllStall(Integer id,Integer pageNum,Integer pageSize){
        Page page = new Page(pageNum, pageSize);
        QueryWrapper<Stall> stallQueryWrapper = new QueryWrapper<>();
        stallQueryWrapper.eq("market_id",id);
        return  stallDao.selectPage(page, stallQueryWrapper);
    }
    /**
     * 查询市场的摊位以及租赁人的信息
     */
    public List<BoothRentalDTO> queryResult(StallVO stallVO ){
        return stallDao.queryResult(stallVO);
    }

    public void delStall(Integer marketId, Integer stallId) throws Exception {
        QueryWrapper queryWrapper = new QueryWrapper();
        queryWrapper.eq("id",stallId);
        queryWrapper.eq("market_id",marketId);
        Stall stall = stallDao.selectOne(queryWrapper);
        if(stall==null) {
            throw new Exception("不存在该摊位");
        }else{
            stallDao.deleteById(stall.getId());
        }
    }
}
