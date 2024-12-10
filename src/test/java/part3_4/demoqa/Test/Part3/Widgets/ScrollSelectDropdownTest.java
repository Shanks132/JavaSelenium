package part3_4.demoqa.Test.Part3.Widgets;

import org.testng.Assert;
import org.testng.annotations.Test;
import part3_4.demoqa.base.BaseTest;

import java.util.List;

public class ScrollSelectDropdownTest extends BaseTest {
    @Test
    public void testMultiSelectDropdown(){
        var selectMenuPage = homePage.goToWidgets().clickSelectMenu();
        selectMenuPage.standardSelectMulti("Volvo");
        selectMenuPage.standardSelectMulti(1);
        selectMenuPage.standardSelectMulti("Audi");
        selectMenuPage.standardSelectMulti(2);


        selectMenuPage.standardDeselectMulti("Audi");

        List<String>  actualSelectedOptions =  selectMenuPage.getAllSelectedStandardMultiOptions();
        Assert.assertTrue(actualSelectedOptions.contains("Volvo"));
        Assert.assertTrue(actualSelectedOptions.contains("Opel"));

        Assert.assertFalse(actualSelectedOptions.contains("Audi"));
    }
}
