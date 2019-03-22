package com.business.base.exception;

import com.common.base.constant.ExceptionConstant;

/**
 * @description 业务异常
 * @author mantou
 */
public class BusinessException extends RuntimeException {

    private String info;
    private String code;

    public BusinessException() {
        this.code = ExceptionConstant.RETURN_CODE_BUSINESS_EXCEPTION;
        this.info = ExceptionConstant.RETURN_INFO_BUSINESS_EXCEPTION;
    }


}
