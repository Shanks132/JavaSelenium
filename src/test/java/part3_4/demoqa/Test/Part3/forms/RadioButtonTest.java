package part3_4.demoqa.Test.Part3.forms;

import org.testng.Assert;
import org.testng.annotations.Test;
import part3_4.demoqa.base.BaseTest;

public class RadioButtonTest extends BaseTest {
    @Test
    public void testRadioButton(){
        var formsPage = homePage.goToForms().clickPracticeForm();
        formsPage.clickFemaleRadioButton();
        boolean femaleRadioButtonSelected = formsPage.isFemaleSelected();
        Assert.assertTrue(femaleRadioButtonSelected,"\nFailed - Female is not selected \n");
    }
}
