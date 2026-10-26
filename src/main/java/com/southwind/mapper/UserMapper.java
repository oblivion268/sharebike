package com.southwind.mapper;

import com.southwind.entity.User;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.southwind.vo.EchartsVO;
import org.apache.ibatis.annotations.Select;

import java.util.List;


public interface UserMapper extends BaseMapper<User> {

    @Select({"select username from user where id = #{id} "})
    public String getUserNameById(Integer id);

    @Select({"select sum(time) value,date name from operate  where uid = #{id} group by date"})
    public List<EchartsVO> line(Integer id);
}
