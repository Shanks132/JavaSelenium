package part3_4.demoqa.Test.Part3.Widgets;

import com.demoqa.pages.Widgets.DatePickerMenuPage;
import org.testng.Assert;
import org.testng.annotations.Test;
import part3_4.demoqa.base.BaseTest;

public class DateTest extends BaseTest {
    @Test
    public void testSelectingDate(){
        String month = "December";
        String monthNumber = "12";
        String date = "31";
        String year = "2034";
        DatePickerMenuPage datePickerMenuPage = homePage.goToWidgets().clickDatePicker();
        datePickerMenuPage.clickDateField();
        datePickerMenuPage.clickDay(date);

        datePickerMenuPage.selectMonth(month);
        datePickerMenuPage.selectYear(year);

        String actualDate = datePickerMenuPage.getDate();

        String expectedDate = monthNumber+"/"+date+"/"+year;
        Assert.assertEquals(actualDate,expectedDate,"\nActual date - "+actualDate +"\n"+"expected date - "+expectedDate);

    }

}
