package com.southwind.service.impl;

import com.southwind.entity.Fault;
import com.southwind.mapper.FaultMapper;
import com.southwind.service.FaultService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;


@Service
public class FaultServiceImpl extends ServiceImpl<FaultMapper, Fault> implements FaultService {

}
