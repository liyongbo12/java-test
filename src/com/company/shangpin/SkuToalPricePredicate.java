package com.company.shangpin;

/**
 *  对SKU的总价是否超出2000作为判断标准
 */
public class SkuToalPricePredicate implements SkuPredicate{

    /**
     * 大于2000是ture
     * @param sku
     * @return
     */
    @Override
    public boolean test(Sku sku) {
        return sku.getTotalPrice() > 2000;
    }
}
