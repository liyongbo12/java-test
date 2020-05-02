package com.company.shangpin;

/**
 * 下单商品信息对象
 */
public class Sku {

    /**编号*/
    private Integer skuId;

    private String skuName;

    private Double skuPrice;

    private Integer tokalNum;

    /**商品 总价*/
    private Double totalPrice;

    /**商品类型*/
    private Enum skuCategory;

    public Sku(Integer skuId, String skuName, Double skuPrice, Integer tokalNum, Double totalPrice, Enum skuCategory) {
        this.skuId = skuId;
        this.skuName = skuName;
        this.skuPrice = skuPrice;
        this.tokalNum = tokalNum;
        this.totalPrice = totalPrice;
        this.skuCategory = skuCategory;
    }


    public Integer getSkuId() {
        return skuId;
    }

    public void setSkuId(Integer skuId) {
        this.skuId = skuId;
    }

    public String getSkuName() {
        return skuName;
    }

    public void setSkuName(String skuName) {
        this.skuName = skuName;
    }

    public Double getSkuPrice() {
        return skuPrice;
    }

    public void setSkuPrice(Double skuPrice) {
        this.skuPrice = skuPrice;
    }

    public Integer getTokalNum() {
        return tokalNum;
    }

    public void setTokalNum(Integer tokalNum) {
        this.tokalNum = tokalNum;
    }

    public Double getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(Double totalPrice) {
        this.totalPrice = totalPrice;
    }

    public Enum getSkuCategory() {
        return skuCategory;
    }

    public void setSkuCategory(Enum skuCategory) {
        this.skuCategory = skuCategory;
    }

    @Override
    public String toString() {
        return "Sku{" +
                "skuId=" + skuId +
                ", skuName='" + skuName + '\'' +
                ", skuPrice=" + skuPrice +
                ", tokalNum=" + tokalNum +
                ", totalPrice=" + totalPrice +
                ", skuCategory=" + skuCategory +
                '}';
    }
}
