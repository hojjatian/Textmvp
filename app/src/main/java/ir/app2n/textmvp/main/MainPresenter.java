package ir.app2n.textmvp.main;

import android.app.usage.ConfigurationStats;

public class MainPresenter implements MainContract.Presenter {
    private MainContract.MvpView  mapView;
    public MainPresenter(MainContract.MvpView view) {
        mapView=view;
    }

    @Override
    public void HandleSigninButtonClick() {

    }

    @Override
    public void HandleSignOutButtonClick() {

    }
}
