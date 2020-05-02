package com.company.shangpin;

import java.util.ArrayList;
import java.util.List;

/**
 * 购物车服务类
 */
public class CartService {

    private static List<Sku> cartSkuList = new ArrayList<Sku>(){
        {
            add(new Sku(654032,"无人机",4999.00,1, 4999.00,SkuCategoryEnum.ELECT));
            add(new Sku(642933,"VR一体机",4999.00,1, 4999.00,SkuCategoryEnum.ELECT));
            add(new Sku(654034,"衣服",4999.00,1, 4999.00,SkuCategoryEnum.ELECT));
            add(new Sku(654035,"跑步机",4999.00,1, 4999.00,SkuCategoryEnum.ELECT));
            add(new Sku(654036,"书",4999.00,1, 4999.00,SkuCategoryEnum.BOOKS));
        }
    };

    /**
     * 找出购物车中电子产品
     * 获取购物车商品信息
     * @return
     */
    public static List<Sku> getCartSkuList(){
        return cartSkuList;
    }

    public static List<Sku> filterElectronicesSkus(List<Sku> cartSkuList){
        List<Sku> skus = new ArrayList<>();
        for (Sku sku : cartSkuList) {
          //如果商品类型等于电子类
            if (SkuCategoryEnum.ELECT.equals(sku.getSkuCategory())){
                skus.add(sku);
            }
            
        }
        return skus;
    }

    /**
     * 根据用户传入得商品类型参数，找出购物车中同种商品类型列表
     * @return
     */
    public static List<Sku> filter(List<Sku> cartSkuList,SkuCategoryEnum skuCategoryEnum){
        List<Sku> skus = new ArrayList<>();
        for (Sku sku : cartSkuList) {
            if (skuCategoryEnum.equals(sku.getSkuCategory())){
                skus.add(sku);
            }
        }
        return skus;
    }

    /**
     *  商品类型 categoryOrPrice
     *  总价 totalprice
     *  来过滤商品
     */
    public static List<Sku> filterSkus(List<Sku> cartSkuList,SkuCategoryEnum category,Double totalprice,
                                       Boolean categoryOrPrice){
        List<Sku> skus = new ArrayList<>();
        for (Sku sku : cartSkuList) {
            if (
                    (categoryOrPrice && category.equals(sku.getSkuCategory())
                    ||(categoryOrPrice && sku.getTotalPrice() > totalprice)));
                skus.add(sku);
        }
        return skus;

    }

    /**
     * 根据不同的SKU判断，对SKU列表进行过滤
     * @param cartSkuList
     * @param predicate 不同的SKU标准 接口
     * @return
     */
    public static List<Sku> filterSkus(List<Sku> cartSkuList,SkuPredicate predicate){
        List<Sku> skus = new ArrayList<>();
        for (Sku sku : cartSkuList) {
            //根据不同的SKU标准策略对sku判断
            if (predicate.test(sku)){
                skus.add(sku);
            }
        }
        return skus;
    }
}
