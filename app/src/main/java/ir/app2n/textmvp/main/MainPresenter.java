package ir.app2n.textmvp.main;

import android.app.usage.ConfigurationStats;
import android.view.View;

public class MainPresenter implements MainContract.Presenter {
    private MainContract.MvpView mapView;

    public MainPresenter(MainContract.MvpView view) {
        mapView = view;
    }

    @Override
    public void HandleSigninButtonClick(View view) {
        mapView.ShowSigninScreen();
    }

    @Override
    public void HandleSignOutButtonClick(View view) {
        mapView.ShowsignOutScreen();
    }
}
