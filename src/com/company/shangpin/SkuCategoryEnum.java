package com.company.shangpin;

/**
 * 商品类型
 */
public enum SkuCategoryEnum {
    CLOTHING(10,"衣服类"),

    ELECT(11,"数码类"),

    SPORTS(12,"运动类"),

    BOOKS(40,"图书类");

    /**编号*/
    private Integer code;

    /**商品名称*/
    private String name;

    SkuCategoryEnum(Integer code, String name) {
        this.code = code;
        this.name = name;
    }
}
