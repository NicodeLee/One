package com.nicodelee.one.login;

import android.content.Context;
import android.os.Handler;
import com.nicodelee.one.login.LoginContract.LoginPresenter;

/**
 * Created by NocodeLee on 2017/9/27.
 * Email：lirizhilirizhi@163.com
 */

public class LoginPresenterImpl implements LoginPresenter {

  private Context mContext;
  private LoginContract.LoginView mView;
  private LoginModel mModel;

  LoginPresenterImpl(Context context,LoginContract.LoginView view){
    mContext = context;
    mView = view;
    mModel = new LoginModel();
  }

  @Override public void login(String name, String pwd) {
    //模拟登录操作
    doLogin(name,pwd);
  }

  private void doLogin(String nane,String pwd){

    new Handler().postDelayed(new Runnable() {
      @Override public void run() {
        if (Math.random() > 0.6) {
          mView.loginSuccess();
        } else {
          mView.loginFail("登录失败");
        }
      }
    }, 1000);
  }


}
