package com.sucsoft.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;

import com.sucsoft.DTO.BoothRentalDTO;
import com.sucsoft.po.Stall;
import com.sucsoft.vo.StallVO;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;


@Mapper
public interface StallDao extends BaseMapper<Stall> {
    List<BoothRentalDTO> queryResult(@Param("stallVO") StallVO stallVO);
}
