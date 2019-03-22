package com.business.base.exception;

import com.common.base.constant.ExceptionConstant;
import com.common.base.result.Result;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.HttpRequestMethodNotSupportedException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

/**
 * @description 全局异常处理
 * @author mantou
 */
@RestControllerAdvice
@Slf4j
public class GlobalExceptionHandler {

    /**
     * 请求方法不正确
     * @param exception
     * @return
     */
    @ExceptionHandler(HttpRequestMethodNotSupportedException.class)
    public Result HttpRequestMethodNotSupportedException(HttpRequestMethodNotSupportedException exception) {
        //打印日志
        log(exception);
        return new Result(ExceptionConstant.RETURN_CODE_REQUEST_EXCEPTION, ExceptionConstant.RETURN_INFO_REQUEST_EXCEPTION);
    }

    /**
     * Exception异常处理
     * @param e
     * @return
     */
    @ExceptionHandler(value = Exception.class)
    public Result defaultErrorHandler(Exception e){
        //打印日志
        log(e);
        return new Result(ExceptionConstant.RETURN_CODE_SERVICE_EXCEPTION, ExceptionConstant.RETURN_INFO_SERVICE_EXCEPTION);
    }

    /**
     * 打印日志(堆信息)
     * @param e
     */
    private void log(Exception e) {
        log.error("************************异常开始*******************************");
        log.error(e.getMessage());
        for (StackTraceElement stackTraceElement : e.getStackTrace()) {
            log.error(stackTraceElement.toString());
        }
        log.error("************************异常结束*******************************");
    }
}
