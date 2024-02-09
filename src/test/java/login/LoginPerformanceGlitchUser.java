package login;

import com.codeborne.selenide.Condition;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class LoginPerformanceGlitchUser {

    String performanceGlitchUser = "performance_glitch_user";
    String password = "secret_sauce";

    @Test
    void loginStandardUser() {

        open("https://www.saucedemo.com/");
        $("#user-name").setValue(performanceGlitchUser);
        $("#password").setValue(password);
        $("#login-button").click();
        $(".title").shouldHave(Condition.exactText("Products"));
    }
}
