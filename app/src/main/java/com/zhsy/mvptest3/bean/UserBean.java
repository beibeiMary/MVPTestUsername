package com.zhsy.mvptest3.bean;
/**
 * 用来保存用户信息
 */
public class UserBean {
    private String mFirstName ;
    private String mLastName ;
    public UserBean (String firstName, String lastName) {
        this .mFirstName = firstName;
        this .mLastName = lastName;
    }
    public String getFirstName() {
        return mFirstName ;
    }
    public String getLastName() {
        return mLastName ;
    }

}
