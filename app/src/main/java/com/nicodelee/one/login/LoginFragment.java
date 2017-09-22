package com.nicodelee.one.login;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.nicodelee.one.R;

/**
 * Created by NocodeLee on 2017/9/22.
 * Email：lirizhilirizhi@163.com
 */

public class LoginFragment extends Fragment implements LoginContract.LoginView {

  @Nullable
  @Override
  public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container,
      @Nullable Bundle savedInstanceState) {
    return inflater.inflate(R.layout.login_fragment, container, false);
  }

}
