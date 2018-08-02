package com.zhsy.mvptest3.presenter;

import com.zhsy.mvptest3.bean.UserBean;
import com.zhsy.mvptest3.model.IUserModel;
import com.zhsy.mvptest3.model.UserModel;
import com.zhsy.mvptest3.view.IUserView;

/**
 * 通过接口与View及Model进行交互
 */
public class UserPresenter {
    private IUserModel mUserModel;
    private IUserView mUserView;

    public UserPresenter (IUserView view) {
        mUserView = view;
        mUserModel = new UserModel();
    }

    public void saveUser( int id , String firstName , String lastName) {
        mUserModel .setID (id );
        mUserModel .setFirstName (firstName );
        mUserModel .setLastName (lastName );
    }

    public void loadUser( int id ) {
        UserBean user = mUserModel .load (id );
        mUserView .setFirstName (user .getFirstName ());//通过调用IUserView的方法来更新显示
        mUserView .setLastName (user .getLastName ());
    }

}
