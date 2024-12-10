package com.demoqa.pages.Widgets;

import org.openqa.selenium.By;

import static Utilities.DropdownUtility.SelectByVisibleTextUtil;

public class DatePickerMenuPage extends WidgetsPage{

    private By selectDateField = By.id("datePickerMonthYearInput");
    private By monthDropdown = By.cssSelector(".react-datepicker__month-select");
    private By yearDropdown = By.cssSelector(".react-datepicker__year-select");


    private By dayValue(String day){
        System.out.println("//div[contains(@class,'react-datepicker__day--0"+day+"')][text()='"+day+"']");
        return By.xpath("//div[contains(@class,'react-datepicker__day--0"+day+"')][text()='"+day+"']");

    }

    public void clickDay(String day){
        click(dayValue(day));
    }
    public boolean isDayInMonth(String day){
        return find(dayValue(day)).isDisplayed();
    }
    public void clickDateField(){
        click(selectDateField);
    }

    public String getDate(){
        return find(selectDateField).getAttribute("value");

    }
    public void selectMonth(String month){
        SelectByVisibleTextUtil(monthDropdown,month);

    }

    public void selectYear(String year){
        SelectByVisibleTextUtil(yearDropdown,year);
    }


}
