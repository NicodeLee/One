package com.nicodelee.one.login;

/**
 * Created by NocodeLee on 2017/9/22.
 * Email：lirizhilirizhi@163.com
 */

public class LoginContract {

  interface LoginView{
    void loginSuccess();

    void loginFail(CharSequence msg);
  }

  interface LoginPresenter{
    void login(String name, String pwd);
  }

}
