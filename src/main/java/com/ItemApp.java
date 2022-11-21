package com;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

/**
 * @author cs
 * @date 2022/11/18 11:19
 */
@SpringBootApplication
@ComponentScan(basePackages = {"com.cs.item.controller","com.cs.item.service"})
public class ItemApp {

    private static final Logger log = LoggerFactory.getLogger(ItemApp.class);

    public static void main(String[] args) {
        SpringApplication.run(ItemApp.class,args);
        log.info("item服务启动成功!");
    }
}
