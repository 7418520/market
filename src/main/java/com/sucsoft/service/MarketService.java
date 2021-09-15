package com.sucsoft.service;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;

import com.sucsoft.mapper.MarketDao;
import com.sucsoft.po.Market;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MarketService extends ServiceImpl<MarketDao, Market>  {
    @Autowired
    private  MarketDao marketDao;

    /**
     * 查询所有的市场
     */
    public List<Market>queryMarket(){
        return  marketDao.selectList(new QueryWrapper<Market> ());
    }
}
