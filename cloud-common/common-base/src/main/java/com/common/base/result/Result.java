package com.common.base.result;


import com.common.base.constant.Constant;
import lombok.Builder;
import lombok.Data;
import lombok.RequiredArgsConstructor;

/**
 * 注解@Builder建造者模式创建对象
 * 注解@RequiredArgsConstructor实现静态的构造方法
 * @description 返回结果
 * @author mantou
 */
@Data
@Builder
public class Result {

    /**
     * 返回码
     */
    private String retCode;
    /**
     * 返回基础信息
     */
    private String retInfo;

    /**
     * 返回数据
     */
    private Object data;

    /**
     * 请求成功构造方法
     * @return
     */
    public static Result success() {
        return new Result(Constant.RET_CODE_SUCCESS, Constant.RET_INFO_SUCCESS);
    }

    /**
     * 用户不存在构造方法
     * @return
     */
    public static Result userNotExist() {
        return new Result(Constant.RET_CODE_USER_NOT_EXIST, Constant.RET_INFO_USER_NOT_EXIST);
    }

    /**
     * 请求成功构造方法  自定义返回数据
     * @param data
     * @return
     */
    public static Result success(Object data) {
        return new Result(Constant.RET_CODE_SUCCESS, Constant.RET_INFO_SUCCESS, data);
    }

    /**
     * 请求失败构造方法
     * @return
     */
    public static Result error() {
        return new Result(Constant.RET_CODE_ERROR, Constant.RET_INFO_ERROR);
    }

    /**
     * 请求失败构造方法 自定义返回基础信息
     * @param retInfo
     * @return
     */
    public static Result error(String retInfo) {
        return new Result(Constant.RET_CODE_ERROR, retInfo);
    }

    /**
     * 参数不能为Null构造方法
     * @return
     */
    public static Result paramNull() {
        return new Result(Constant.RET_CODE_PARAM_NULL, Constant.RET_INFO_PARAM_NULL);
    }

    /**
     * ID不能为空构造方法
     * @return
     */
    public static Result idNull() {
        return new Result(Constant.RET_CODE_ID_NULL, Constant.RET_INFO_ID_NULL);
    }

    /**
     * 对象不能为空构造方法
     * @return
     */
    public static Result objNull() {
        return new Result(Constant.RET_CODE_OBJ_NULL, Constant.RET_INFO_OBJ_NULL);
    }

    /**
     * 自定义返回码,返回基础信息 构造方法
     * @param retCode
     * @param retInfo
     */
    public Result(String retCode, String retInfo) {
        this.retCode = retCode;
        this.retInfo = retInfo;
    }

    /**
     * 自定义返回码,返回基础信息,返回数据 构造方法
     * @param retCode
     * @param retInfo
     * @param data
     */
    public Result(String retCode, String retInfo, Object data) {
        this.retCode = retCode;
        this.retInfo = retInfo;
        this.data = data;
    }

    /**
     * set 返回码, 返回基础信息
     * @param retCode
     * @param retInfo
     */
    public void setCodeInfo(String retCode, String retInfo) {
        this.retCode = retCode;
        this.retInfo = retInfo;
    }

    /**
     * 服务异常构造方法
     * @return
     */
    public static Result serviceException() {
        return new Result(Constant.RET_CODE_SERVICE_EXCEPTION, Constant.RET_INFO_SERVICE_EXCEPTION);
    }



}
