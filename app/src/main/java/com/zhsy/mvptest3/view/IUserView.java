package com.zhsy.mvptest3.view;

/**
 * View可以对ID、FirstName、LastName这三个EditText进行读操作，对FirstName和LastName进行写操作，由此定义IUserView接口：
 */
public interface IUserView {
    int getID();
    String getFristName();
    String getLastName();
    void setFirstName (String firstName);
    void setLastName (String lastName);
}
