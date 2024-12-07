package part2.com.shanks.tests.login;
import org.testng.Assert;
import org.testng.annotations.Test;
import part2.com.shanks.base.BaseTest;

public class LoginTests extends BaseTest {

    @Test
    public void TestLoginErrorMessage(){
        loginPage.setUsername("standard_user");
        loginPage.setPassword("xyz3400");
        loginPage.clickLoginButton();
        //no need to get the var productPage = loginPage.clickLoginButton(); because we are
        // checking only the Error message appearing

        String actualMessage = loginPage.getErrorMessage();
        Assert.assertTrue(actualMessage.contains("Epic sadface"));
    }
}
