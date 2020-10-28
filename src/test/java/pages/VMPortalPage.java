package pages;

import net.thucydides.core.pages.PageObject;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import testcases.LoginVMApplication;

import java.util.WeakHashMap;

public class VMPortalPage extends PageObject {

    public void verifyTitle()
    {
        String title=getDriver().getTitle();
        Assert.assertTrue(title.contains("Home&nbsp;· Customer Self-Service"));
    }

    public void signInLink() throws InterruptedException {

//        $(By.xpath("//li[@role='none']//a[@title='Sign in'][contains(normalize-space(),'Sign in')]")).click();
        $(By.xpath("//a[@title='Sign in']")).click();
    }

    public void enterUsernamePassword()
    {

        $(By.xpath("//input[@id='Username']")).type("Vivek");
        $(By.xpath("//input[@id='Password']")).type("Tu3sday2020");
    }

    public void signInBtn()
    {
       $(By.xpath("//*[@id='submit-signin-local']")).click();
    }

}
