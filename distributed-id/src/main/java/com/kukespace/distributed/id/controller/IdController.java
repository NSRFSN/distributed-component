package com.kukespace.distributed.id.controller;

import com.kukespace.distributed.service.config.IdServiceConfig;
import com.kukespace.distributed.service.id.IdService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.Objects;

/**
 * @author chensk
 * @date 2020/3/29
 */
@RestController
@RequestMapping(value = "/id")
public class IdController {

    @Autowired
    private IdServiceConfig idServiceConfig;

    @RequestMapping(value = "/{type}/get", method = RequestMethod.GET)
    public String getId(@PathVariable("type") String type) {
        IdService idService = idServiceConfig.getIdServiceByType(type);
        if (Objects.isNull(idService)) {
            return "";
        } else {
            return idService.generateId();
        }
    }
}
