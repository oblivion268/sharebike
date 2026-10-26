package com.southwind.mapper;

import com.southwind.common.TreeNode;
import com.southwind.entity.Menu;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;


public interface MenuMapper extends BaseMapper<Menu> {

    @Select({"select title,href,icon from menu,menu_authority where menu.id = menu_authority.mid and menu_authority.uid = #{id} "})
    public List<TreeNode> getMenuById(Integer id);

}
