package part3_4.demoqa.Test.Part3.Elements;

import org.testng.Assert;
import org.testng.annotations.Test;
import part3_4.demoqa.base.BaseTest;

public class WebTablesTest extends BaseTest {
    @Test
    public void testWebTable(){
        var webTablePage = homePage.goToElements().clickWebTables();
        String expectedAge = "69";
        String email = "kierra@example.com";
        webTablePage.clickEdit(email);
        webTablePage.setAge(expectedAge);
        webTablePage.clickSubmitButton();
        String actualAge = webTablePage.getTableAge(email);

        Assert.assertEquals(actualAge,expectedAge,"\nActual and expected age value not matching\n");


    }
}
