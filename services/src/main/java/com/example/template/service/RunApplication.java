package com.example.template.service;

import com.example.template.common.util.DateUtil;
import lombok.extern.slf4j.Slf4j;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @title: RunApplication
 * @author: trifolium.wang
 * @date: 2024/2/1
 * @modified:
 */
@Slf4j
@SpringBootApplication(scanBasePackages = "com.example.template.service", proxyBeanMethods = false)
@MapperScan("com.example.template.service.dao.mapper")
public class RunApplication {

    public static void main(String[] args) {

        log.info("应用启动标记--time:{}", DateUtil.getDatetimeStr());
        SpringApplication.run(RunApplication.class, args);
    }
}
