package com.kukespace.distributed.service.config;

import com.kukespace.distributed.service.id.IdService;
import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.annotation.Configuration;

import java.util.HashMap;
import java.util.Map;

/**
 * @author chensk
 * @date 2020/3/29
 */
@Configuration
public class IdServiceConfig implements ApplicationContextAware {

    private Map<String, IdService> idServiceMap = new HashMap<>();

    public IdService getIdServiceByType(String type) {
        return idServiceMap.get(type);
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        String[] beanNames = applicationContext.getBeanNamesForType(IdService.class);

        if (beanNames == null || beanNames.length == 0) {
            return;
        }

        for (String beanName : beanNames) {
            IdService idService = applicationContext.getBean(beanName, IdService.class);
            idServiceMap.put(idService.getType(), idService);
        }
    }
}
