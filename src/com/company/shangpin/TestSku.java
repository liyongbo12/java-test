package com.company.shangpin;

import org.junit.Test;

import java.util.List;

/**
 *  敲完这些总结：1.查询出所有的商品做判断
 *               2.枚举做判断参数
 *               3.查询（判断）到另一种商品保存到集合对象里面
 *               4.静态方法返回查询到的商品
 *               5.静态方法里面的参数就是用户输入的
 *  1.需求：查询电子商品类
 *  2.需求：每类商品都有那些
 */
public class TestSku {

    /**
     * 硬编码
     */
    @Test
    public void filt(){
        //查询所有得商品
        List<Sku> cartSkuList = CartService.getCartSkuList();
        //根据所有得商品查出电子类
        List<Sku> skus = CartService.filterElectronicesSkus(cartSkuList);
        System.out.println(skus);
    }

    /**
     *  根据传入的单一参数
     *
     *  找出书得类型，根据传入得类型参数
     */
    @Test
    public void filt2(){
        List<Sku> cartSkuList = CartService.getCartSkuList();
        List<Sku> list = CartService.filter(cartSkuList, SkuCategoryEnum.BOOKS);
        System.out.println(list);
    }

    /**
     *  找出商品总价大于2000
     */
    @Test
    public void filterSkus(){
        List<Sku> cartSkuList = CartService.getCartSkuList();

        //找出商品总价大于2000的商品
        List<Sku> skus = CartService.filterSkus(cartSkuList, new SkuToalPricePredicate());

        System.out.println(skus);
    }

    @Test
    public void filterSkus2(){
        List<Sku> cartSkuList = CartService.getCartSkuList();
        List<Sku> result = CartService.filterSkus(cartSkuList, new SkuPredicate() {
            @Override
            public boolean test(Sku sku) {
                return sku.getSkuPrice() > 1000;
            }
        });
        System.out.println(result);
    }

    @Test
    public void filterSkus3() {
        List<Sku> cartSkuList = CartService.getCartSkuList();
        //找出商品总价大于2000的商品
        List<Sku> skus = CartService.filterSkus(cartSkuList, (Sku sku) -> sku.getSkuPrice() > 1000);

        System.out.println(skus);
    }
}
