package com.common.base.constant;

/**
 * @description 异常定义常量
 * @author mantou
 */
public class ExceptionConstant {

    /**-----------------------------操作类----------------------------*/
    /**
     * 操作成功定义: 前端发起请求->后端响应内容  期间无任何Java异常则视为操作成功
     */
    public static final String RETURN_CODE_SUCCESS = "00000";
    public static final String RETURN_INFO_SUCCESS = "操作成功";
    /**
     * 操作失败定义: 前端发起请求->后端响应内容  期间发生任何Java异常可视为操作失败
     */
    public static final String RETURN_CODE_ERROR = "00001";
    public static final String RETURN_INFO_ERROR = "操作失败";
    /**-----------------------------操作类----------------------------*/


    /**-----------------------------服务类----------------------------*/
    /**
     * 服务异常定义: 服务连接超时,gateway网关服务降级等视为服务异常
     */
    public static final String RETURN_CODE_SERVICE_EXCEPTION = "00004";
    public static final String RETURN_INFO_SERVICE_EXCEPTION = "服务异常";
    /**-----------------------------服务类----------------------------*/


    /**-----------------------------业务类----------------------------*/
    /**
     * 业务异常定义: 例如,删除角色,但存在用户绑定了该角色,存在业务关联,不允许删除,则视为业务异常
     */
    public static final String RETURN_CODE_BUSINESS_EXCEPTION = "00006";
    public static final String RETURN_INFO_BUSINESS_EXCEPTION = "业务异常";

    /**
     * id对应的对象不存在定义: 通过id获取对象,对象为不存在,则视为id对应的对象不存在
     */
    public static final String RETURN_CODE_OBJ_NULL = "00102";
    public static final String RETURN_INFO_OBJ_NULL = "id对应的对象不存在";

    /**
     * 当前用户为空或不存在定义: 通过userId验证用户是否存在,用户不存在,则视为当前用户为空或不存在
     */
    public static final String RETURN_CODE_USER_NOT_EXIST = "00003";
    public static final String RETURN_INFO_USER_NOT_EXIST = "当前用户为空或不存在";
    /**-----------------------------业务类----------------------------*/


    /**----------------------------请求/参数类----------------------------*/
    /**
     * HTTP请求不正确定义: 后端接口HTTP.METHOD定义与前端发起的HTTP.METHOD不符,则视为HTTP请求不正确
     */
    public static final String RETURN_CODE_REQUEST_EXCEPTION = "00005";
    public static final String RETURN_INFO_REQUEST_EXCEPTION = "HTTP请求不正确(GET POST DELETE PUT)";

    /**
     * 参数为空定义: 前端请求参数不存在,则视为参数为空
     */
    public static final String RETURN_CODE_PARAM_NULL = "00100";
    public static final String RETURN_INFO_PARAM_NULL = "参数为空";

    /**
     * id为空定义: 前端请求id为empty,则视为id为空
     */
    public static final String RETURN_CODE_ID_NULL = "00101";
    public static final String RETURN_INFO_ID_NULL = "id为空";

    /**----------------------------请求/参数类----------------------------*/


    /**
     * 项目全局统一编码UTF-8
     */
    public static final String ENCODING_UTF_8 = "UTF-8";

}
