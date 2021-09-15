package com.sucsoft.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.sucsoft.po.Vendor;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface VendorDao extends  BaseMapper<Vendor> {
}
