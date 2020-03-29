package com.kukespace.distributed.id;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author chensk
 * */
@SpringBootApplication(scanBasePackages = "com.kukespace.distributed")
public class DistributedIdApplication {
    public static void main(String[] args) {
        SpringApplication.run(DistributedIdApplication.class, args);
    }
}
