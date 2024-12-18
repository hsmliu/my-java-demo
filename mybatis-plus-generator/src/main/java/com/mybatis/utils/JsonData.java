package com.mybatis.utils;

/**
 * @author 张峰
 * @create 2022/2/21 20:37
 */
public class JsonData {
    /**
     * 状态码
     */
    private Integer code;
    /**
     * 数据
     */
    private Object data;
    /**
     * 状态信息
     */
    private String msg;
    public JsonData(){}
    public JsonData(Integer code,Object data,String msg){
        this.code = code;
        this.data = data;
        this.msg = msg;
    }

    /**
     * 成功
     */
    public static JsonData buildSuccess(){
        return new JsonData(0,null,"OK");
    }

    /**
     * 成功
     * @param data 数据
     */
    public static JsonData buildSuccess(Object data){
        return new JsonData(0,data,"OK");
    }

    /**
     * 成功
     * @param data 数据
     * @param msg 状态信息
     */
    public static JsonData buildSuccess(Object data,String msg){
        return new JsonData(0,data,msg);
    }

    /**
     * 失败
     * @param msg 数据
     */
    public static JsonData buildError(String msg){
        return new JsonData(-1,null,msg);
    }

    /**
     * 失败
     * @param code 状态码
     * @param msg 数据
     */
    public static JsonData buildError(Integer code,String msg){
        return new JsonData(code,null,msg);
    }
    public Integer getCode() {
        return code;
    }
    public void setCode(Integer code) {
        this.code = code;
    }
    public Object getData() {
        return data;
    }
    public void setData(Object data) {
        this.data = data;
    }
    public String getMsg() {
        return msg;
    }
    public void setMsg(String msg) {
        this.msg = msg;
    }
}
