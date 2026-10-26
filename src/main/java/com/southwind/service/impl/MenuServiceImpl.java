package com.southwind.service.impl;

import com.southwind.entity.Menu;
import com.southwind.mapper.MenuMapper;
import com.southwind.service.MenuService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;


@Service
public class MenuServiceImpl extends ServiceImpl<MenuMapper, Menu> implements MenuService {

}
