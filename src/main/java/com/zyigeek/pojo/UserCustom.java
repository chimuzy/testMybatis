package com.zyigeek.pojo;

import java.util.Date;
import java.util.List;

//UserCustom继承了User，可以在其中拓展新的属性、功能
public class UserCustom extends User{
    //一对多关联订单
    private List<OrdersCustom> orderList;

    public UserCustom(){
    }

    public UserCustom(List<OrdersCustom> orderList) {
        this.orderList = orderList;
    }

    public UserCustom(String username, String sex, Date birthday, String address, List<OrdersCustom> orderList) {
        super(username, sex, birthday, address);
        this.orderList = orderList;
    }

    public UserCustom(Integer id, String username, String sex, Date birthday, String address, List<OrdersCustom> orderList) {
        super(id, username, sex, birthday, address);
        this.orderList = orderList;
    }

    public List<OrdersCustom> getOrderList() {
        return orderList;
    }

    public void setOrdersList(List<OrdersCustom> orderList) {
        this.orderList = orderList;
    }

    @Override
    public String toString() {
        return "UserCustom{" +
                super.toString()+
                ", orderList=" + orderList +
                '}';
    }
}
