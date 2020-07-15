package com.zyigeek.pojo;

import java.sql.Timestamp;

public class Orders {
    private Integer id;
    private Integer userid;
    private Timestamp createtime;
    private String number;
    private String note;

    public Orders(){

    }
    public Orders(Integer id, Integer userid, Timestamp createtime, String number, String note) {
        this.id = id;
        this.userid = userid;
        this.createtime = createtime;
        this.number = number;
        this.note = note;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    public Timestamp getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Timestamp createtime) {
        this.createtime = createtime;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    @Override
    public String toString() {
        return "Orders{" +
                "id=" + id +
                ", userid=" + userid +
                ", createtime=" + createtime +
                ", number='" + number + '\'' +
                ", note='" + note + '\'' +
                '}';
    }
}
