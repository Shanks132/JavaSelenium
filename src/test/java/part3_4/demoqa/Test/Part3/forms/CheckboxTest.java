package part3_4.demoqa.Test.Part3.forms;

import org.testng.Assert;
import org.testng.annotations.Test;
import part3_4.demoqa.base.BaseTest;

public class CheckboxTest extends BaseTest {
    @Test
    public void testCheckbox(){
        var formsPage = homePage.goToForms().clickPracticeForm();
        formsPage.clickReadingCheckbox();
        formsPage.clickSportsCheckbox();
        formsPage.clickMusicCheckbox();
        formsPage.unclickReadingCheckbox();
        Assert.assertFalse(formsPage.isReadingSelected(),"");
    }
}
