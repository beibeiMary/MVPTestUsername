package com.zhsy.mvptest3;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.zhsy.mvptest3.presenter.UserPresenter;
import com.zhsy.mvptest3.view.IUserView;


public class MainActivity extends AppCompatActivity implements View.OnClickListener,
        IUserView {
    private EditText mFirstNameEditText, mLastNameEditText, mIdEditText;
    private Button mSaveButton, mLoadButton;
    private UserPresenter mUserPresenter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findWidgets();
        mUserPresenter = new UserPresenter(this);
        mSaveButton.setOnClickListener(this);
        mLoadButton.setOnClickListener(this);
    }
    void findWidgets() {
        mFirstNameEditText = (EditText) findViewById(R.id.first_name_edt);
        mLastNameEditText = (EditText) findViewById(R.id.last_name_edt);
        mIdEditText = (EditText) findViewById(R.id.id_edt);
        mSaveButton = (Button) findViewById(R.id.saveButton);
        mLoadButton = (Button) findViewById(R.id.loadButton);
    }
    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.saveButton:
                mUserPresenter.saveUser(getID(), getFristName(),
                        getLastName());
                break;
            case R.id.loadButton:
                mUserPresenter.loadUser(getID());
                break;
            default:
                break;
        }
    }

    @Override
    public int getID() {
        return Integer.parseInt(mIdEditText.getText().toString());
    }

    @Override
    public String getFristName() {
        return mFirstNameEditText.getText().toString();
    }

    @Override
    public String getLastName() {
        return mLastNameEditText.getText().toString();
    }

    @Override
    public void setFirstName(String firstName) {
        mFirstNameEditText.setText(firstName);
    }

    @Override
    public void setLastName(String lastName) {
        mLastNameEditText.setText(lastName);
    }
}
