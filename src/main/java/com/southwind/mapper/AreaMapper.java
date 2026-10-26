package com.southwind.mapper;

import com.southwind.entity.Area;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Select;


public interface AreaMapper extends BaseMapper<Area> {

    @Select({"select area from area where id = #{id}"})
    public String getAreaById(Integer id);
}
