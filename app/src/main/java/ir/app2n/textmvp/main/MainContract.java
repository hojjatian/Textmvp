package ir.app2n.textmvp.main;

public interface MainContract {
    interface MvpView{
         void ShowSigninScreen();
         void ShowsignOutScreen();
    }
    interface Presenter{
        void HandleSigninButtonClick();
        void HandleSignOutButtonClick();
    }
}
