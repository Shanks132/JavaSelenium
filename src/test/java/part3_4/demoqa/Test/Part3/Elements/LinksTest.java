package part3_4.demoqa.Test.Part3.Elements;

import org.testng.Assert;
import org.testng.annotations.Test;
import part3_4.demoqa.base.BaseTest;

public class LinksTest extends BaseTest {
    @Test
    public void TestLinks(){
        var linksPage = homePage.goToElements().clickLinks();
        linksPage.badReqLinkClick();
        String actualResponse = linksPage.getResponse();
        Assert.assertTrue(actualResponse.contains("400")&&
                                    actualResponse.contains("Bad Request"),"\n  \n");
    }
}
