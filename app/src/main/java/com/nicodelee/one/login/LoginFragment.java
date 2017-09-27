package com.nicodelee.one.login;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.Snackbar;
import android.support.design.widget.TextInputEditText;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.Unbinder;
import com.nicodelee.one.R;

/**
 * Created by NocodeLee on 2017/9/22.
 * Email：lirizhilirizhi@163.com
 */

public class LoginFragment extends Fragment implements LoginContract.LoginView {

  @BindView(R.id.et_username) TextInputEditText etUsername;
  @BindView(R.id.et_password) TextInputEditText etPassword;
  @BindView(R.id.login) Button login;
  Unbinder unbinder;

  private LoginContract.LoginPresenter mPresenter;

  @Nullable @Override
  public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container,
      @Nullable Bundle savedInstanceState) {
    View view = inflater.inflate(R.layout.login_fragment, container, false);
    unbinder = ButterKnife.bind(this, view);
    return view;
  }

  @Override public void onActivityCreated(@Nullable Bundle savedInstanceState) {
    super.onActivityCreated(savedInstanceState);
    mPresenter = new LoginPresenterImpl(getActivity(),this);
    login.setOnClickListener(new View.OnClickListener() {
      @Override public void onClick(View view) {
        mPresenter.login("","");
      }
    });
  }

  @Override public void loginSuccess() {
    Snackbar.make(login,"登录成功",Snackbar.LENGTH_SHORT).show();
  }

  @Override public void loginFail(CharSequence msg) {
    Snackbar.make(login,msg,Snackbar.LENGTH_SHORT).show();
  }

  @Override public void onDestroyView() {
    super.onDestroyView();
    unbinder.unbind();
  }
}
