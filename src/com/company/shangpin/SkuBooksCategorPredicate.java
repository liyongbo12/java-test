package com.company.shangpin;

/**
 * 对SKU的商品类型为图书类的判断标准
 */
public class SkuBooksCategorPredicate  implements SkuPredicate{


    @Override
    public boolean test(Sku sku) {
        return SkuCategoryEnum.BOOKS.equals(sku.getSkuCategory());
    }
}
