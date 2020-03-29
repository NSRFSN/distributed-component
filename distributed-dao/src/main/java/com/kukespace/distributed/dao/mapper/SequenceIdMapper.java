package com.kukespace.distributed.dao.mapper;


import com.kukespace.distributed.model.entities.SequenceId;
import org.apache.ibatis.annotations.Mapper;

/**
 * @author chensk
 * */
@Mapper
public interface SequenceIdMapper {
    int deleteByPrimaryKey(Long id);

    int insert(SequenceId record);

    int insertSelective(SequenceId record);

    SequenceId selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(SequenceId record);

    int updateByPrimaryKey(SequenceId record);

    void generateId(SequenceId sequenceId);
}