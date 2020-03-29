package com.kukespace.distributed.service.id;

/**
 * @author chensk
 * @date 2020/3/29
 */
public interface IdService {
    String getType();

    String generateId();
}
