package login;

import org.junit.jupiter.api.Test;
import pages.LoginPage;

public class LoginVisualUserTest {

    private final String LOGIN = "visual_user";
    private final String PASSWORD = "secret_sauce";

    LoginPage loginPage = new LoginPage();

    @Test
    void loginStandardUser() {
        loginPage.openLoginPage();
        loginPage.setLogin(LOGIN);
        loginPage.setPassword(PASSWORD);
        loginPage.clickLoginButton();
    }
}