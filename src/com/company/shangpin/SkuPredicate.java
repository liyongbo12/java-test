package com.company.shangpin;

public interface SkuPredicate {

    /**
     * 判断标准策略
     * @param sku
     * @return
     */
    boolean test(Sku sku);
}
