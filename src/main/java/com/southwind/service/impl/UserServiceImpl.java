package com.southwind.service.impl;

import com.southwind.entity.User;
import com.southwind.mapper.UserMapper;
import com.southwind.service.UserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService {

}
