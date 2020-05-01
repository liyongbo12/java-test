package com.company;


import java.io.Serializable;
import java.util.List;

public enum ErrorCodeEnum {

    SUCCESS("0", "success"),
    FAILED("1", "failed"),
    //...

    COMMON_ACCOUNT_ERROR("1001", "账号错误"),
    COMMON_TOKEN_ERROR("1002", "token已过期"),
    COMMON_PARAM_EMPTY("1003", "必选参数为空"),
    COMMON_PARAM_ERROR("1004", "参数格式错误"),
    //...

    FILE_NOT_EXIST("1101", "文件不存在"),
    //...

    SYSTEM_UNKNOWN_ERROR("-1", "系统繁忙，请稍后再试....");
    private String code;
    private String desc;

    ErrorCodeEnum(String code, String desc) {
        this.code = code;
        this.desc = desc;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }
}
class Resp<T> implements Serializable{
    private static final long serialVersionUID = 1L;

    private String code;
    private String desc;
    private T data;
    private List<T> dataList;

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public List<T> getDataList() {
        return dataList;
    }

    public void setDataList(List<T> dataList) {
        this.dataList = dataList;
    }

    private Resp<T> code(String code){
        this.code = code;
        return this;
    }

    private Resp<T> desc(String desc){
        this.desc = desc;
        return this;
    }

    private Resp<T> data(T data){
        this.data = data;
        return this;
    }

    private Resp<T> dataList(List<T> dataList){
        this.dataList = dataList;
        return this;
    }

    public Resp<T> success(T data){
        return code(ErrorCodeEnum.SUCCESS.getCode()).desc(ErrorCodeEnum.SUCCESS.getDesc()).data(data);
    }
    public Resp<T> success(List<T> dataList){
        return code(ErrorCodeEnum.SUCCESS.getCode()).desc(ErrorCodeEnum.SUCCESS.getDesc()).dataList(dataList);
    }

    public Resp<T> failed(ErrorCodeEnum errorCodeEnum){
        return code(errorCodeEnum.getCode()).desc(errorCodeEnum.getDesc());
    }

    public static void main(String[] args) {
        Resp<String> objectResp = new Resp<>();
        objectResp.failed(ErrorCodeEnum.COMMON_TOKEN_ERROR);

    }

}

