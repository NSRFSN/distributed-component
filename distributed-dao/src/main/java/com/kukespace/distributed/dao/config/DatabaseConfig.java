package com.kukespace.distributed.dao.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

/**
 * @author chensk
 * @date 2020/3/29
 */
@Configuration
@MapperScan(basePackages = "com.kukespace.distributed.dao.mapper")
public class DatabaseConfig {

}
