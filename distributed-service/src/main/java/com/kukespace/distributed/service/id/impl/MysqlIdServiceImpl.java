package com.kukespace.distributed.service.id.impl;

import com.kukespace.distributed.dao.mapper.SequenceIdMapper;
import com.kukespace.distributed.model.entities.SequenceId;
import com.kukespace.distributed.service.id.IdService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author chensk
 * @date 2020/3/29
 */
@Service
public class MysqlIdServiceImpl implements IdService {

    @Autowired
    private SequenceIdMapper sequenceIdMapper;

    @Override
    public String getType() {
        return "mysql";
    }

    @Override
    public String generateId() {
        SequenceId sequenceId = new SequenceId();
        sequenceIdMapper.generateId(sequenceId);
        return String.valueOf(sequenceId.getId());
    }
}
