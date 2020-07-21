package ir.app2n.textmvp.main;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import ir.app2n.textmvp.R;

public class MainActivity extends AppCompatActivity implements MainContract.MvpView {
    private MainPresenter mPresenter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mPresenter=new MainPresenter(this);
    }


    @Override
    public void ShowSigninScreen() {

    }

    @Override
    public void ShowsignOutScreen() {

    }
}