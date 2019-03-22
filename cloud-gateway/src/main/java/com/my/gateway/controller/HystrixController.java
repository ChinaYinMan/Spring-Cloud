package com.my.gateway.controller;


import com.common.base.result.Result;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


/**
 * @description 熔断器
 * @author mantou
 */
@RestController
@RequestMapping(value = "/hystrix")
@Slf4j
public class HystrixController {


    /**
     * 降级处理
     * @return
     */
    @RequestMapping(value = "/fallback")
    public Result fallback(){
        return getExceptionResult();
    }


    public Result getExceptionResult() {
        log.info("                            --------");
        log.info("                       ------------------");
        log.info("                --------------------------------");
        log.info("         ----------------------------------------------");
        log.info("------------------服务请求失败,服务降级处理----------------------");
        log.info("         ----------------------------------------------");
        log.info("                ---------------------------------");
        log.info("                       ------------------");
        log.info("                            --------");
        //服务异常
        return Result.serviceException();
    }

}
