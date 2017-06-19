package com.bean.vo;

import javax.persistence.*;

/**
 * Created by mac on 2017. 6. 18..
 */
@Entity
@Table(name = "USER_TAB")
public class User {

    @Id
    @Column
    private String userid;

    @Column
    private String password;

    public User() {}

    public String getUserid() {
        return userid;
    }

    public void setUserid(String userid) {
        this.userid = userid;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "userid : " + userid + "password : " + password;
    }
}
