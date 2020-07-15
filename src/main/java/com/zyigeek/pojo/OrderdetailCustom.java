package com.zyigeek.pojo;

public class OrderdetailCustom extends Orderdetail {
    //一对一关联订单信息
    private ItemsCustom itemsCustom;

    public OrderdetailCustom(){
    }

    public OrderdetailCustom(Integer id, Integer ordersId, Integer itemsId, Integer itemsNum, ItemsCustom itemsCustom) {
        super(id, ordersId, itemsId, itemsNum);
        this.itemsCustom = itemsCustom;
    }

    public ItemsCustom getItemsCustom() {
        return itemsCustom;
    }

    public void setItemsCustom(ItemsCustom itemsCustom) {
        this.itemsCustom = itemsCustom;
    }

    @Override
    public String toString() {
        return "OrderdetailCustom{" +
                "itemsCustom=" + itemsCustom +
                '}';
    }
}
