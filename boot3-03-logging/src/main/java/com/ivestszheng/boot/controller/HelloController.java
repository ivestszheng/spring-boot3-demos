package com.ivestszheng.boot.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
public class HelloController {
//    Logger logger = LoggerFactory.getLogger(getClass());
    @GetMapping("/h")
    public String hello(String a,String b){
//        logger.info("方法进来了");
        log.trace("trace 日志");
        log.debug("debug 日志");
        // SpringBoot 底层日志默认级别是 info
        log.info("info 日志..... 参数a:{} b: {}",a,b);
        log.warn("warn 日志");
        log.error("error 日志");
        return "hello";
    }
}
