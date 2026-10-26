package com.southwind.service.impl;

import com.southwind.entity.Violation;
import com.southwind.mapper.ViolationMapper;
import com.southwind.service.ViolationService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;


@Service
public class ViolationServiceImpl extends ServiceImpl<ViolationMapper, Violation> implements ViolationService {

}
