package com.zyigeek.pojo;

import java.sql.Timestamp;
import java.util.List;

public class OrdersCustom extends Orders {

    //一对一的关联查询
    private UserCustom userCustom;

    //一对多的关联查询
    private List<OrderdetailCustom> detailList;

    public OrdersCustom(){
    }

    public OrdersCustom(Integer id, Integer userid, Timestamp createtime, String number, String note, UserCustom userCustom, List<OrderdetailCustom> detailList) {
        super(id, userid, createtime, number, note);
        this.userCustom = userCustom;
        this.detailList = detailList;
    }

    public UserCustom getUserCustom() {
        return userCustom;
    }

    public void setUserCustom(UserCustom userCustom) {
        this.userCustom = userCustom;
    }

    public List<OrderdetailCustom> getDetailList() {
        return detailList;
    }

    public void setDetailList(List<OrderdetailCustom> detailList) {
        this.detailList = detailList;
    }

    @Override
    public String toString() {
        return "OrdersCustom{" +
                super.toString()+
                "userCustom=" + userCustom +
                ", detailList=" + detailList +
                '}';
    }
}
