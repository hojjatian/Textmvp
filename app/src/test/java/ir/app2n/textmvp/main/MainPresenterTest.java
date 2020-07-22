package ir.app2n.textmvp.main;

import android.view.View;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import static org.junit.Assert.*;
import static org.mockito.Mockito.verify;

public class MainPresenterTest {
     @Mock
     private MainContract.MvpView mView;
    private MainContract.Presenter mPresenter;
    @Before
    public void setUp() throws Exception {
        MockitoAnnotations.initMocks(this);
        mPresenter=new MainPresenter(mView);
    }

    @Test
    public void handleSigninButtonClick() {
        mPresenter.HandleSigninButtonClick(null);
        verify(mView).ShowSigninScreen();
    }

    @Test
    public void handleSignOutButtonClick() {
        mPresenter.HandleSignOutButtonClick(null);
        verify(mView).ShowsignOutScreen();
    }
}