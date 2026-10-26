package com.southwind.service.impl;

import com.southwind.entity.Record;
import com.southwind.mapper.RecordMapper;
import com.southwind.service.RecordService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

@Service
public class RecordServiceImpl extends ServiceImpl<RecordMapper, Record> implements RecordService {

}
