package pages;

import net.thucydides.core.annotations.Step;
import org.openqa.selenium.WebDriver;

public class SignInPage {

    VMPortalPage portal;

    @Step("Click on SignIn link")
    public void signInLink() throws InterruptedException {
        portal.signInLink();
    }

    @Step("Enter Username & Password")
    public void enterCredentials()
    {
        portal.enterUsernamePassword();
    }

    @Step
    public void clickSignInBtn()
    {
       portal.signInBtn();
    }
}
