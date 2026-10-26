package com.southwind.service.impl;

import com.southwind.entity.Admin;
import com.southwind.mapper.AdminMapper;
import com.southwind.service.AdminService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;


@Service
public class AdminServiceImpl extends ServiceImpl<AdminMapper, Admin> implements AdminService {

}
