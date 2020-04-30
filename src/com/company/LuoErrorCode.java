package com.company;

public enum LuoErrorCode {

    NULL_OBJ("LUO001","对象为空"),
    ERROR_ADD_USER("LUO002","添加用户失败"),
    UNKNOWN_ERROR("LUO999","系统繁忙，请稍后再试....");

    private String value;
    private String desc;

    private LuoErrorCode(String value, String desc) {
        this.setValue(value);
        this.setDesc(desc);
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    @Override
    public String toString() {
        return "[" + this.value + "]" + this.desc;
    }
}
class TestError extends RuntimeException{

    public TestError(Object object){
        super(object.toString());
    }
}
class TestErrorRuntime{
    public static void main(String[] args) {
        String nane = null;
        if (nane == null){
            throw new TestError(LuoErrorCode.NULL_OBJ.getDesc());
        }
    }
}