package testcases;

import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import pages.SignInPage;
@RunWith(SerenityRunner.class)

public class LoginVMApplication {

    @Managed
    WebDriver driver;

    @Steps
    SignInPage sign;

    @Test
    public void LoginAsVivek() throws InterruptedException {

        driver.get("https://vmobsandbox.powerappsportals.com/");
        driver.manage().window().maximize();
        Thread.sleep(2000);
        sign.signInLink();
        sign.enterCredentials();
        sign.clickSignInBtn();
        driver.quit();

    }
}
