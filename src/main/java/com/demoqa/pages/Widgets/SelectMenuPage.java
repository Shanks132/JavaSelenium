package com.demoqa.pages.Widgets;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

import static Utilities.DropdownUtility.*;
import static Utilities.javascriptUtility.scrollToElements;

public class SelectMenuPage extends WidgetsPage{
    private By standardMultiSelect = By.id("cars");
    public void standardSelectMulti(String text){
        //separate class to select items from a drop-down in selenium
        SelectByVisibleTextUtil(standardMultiSelect,text);

    }
    public void standardDeselectMulti(String text){
        //separate class to select items from a drop-down in selenium
        deselectByVisibleTextUtil(standardMultiSelect,text);

    }
    public void standardSelectMulti(int index){
        //separate class to select items from a drop-down in selenium
        SelectByIndexUtil(standardMultiSelect,index);

    }
    public void standardDeselectMulti(int index){
        //separate class to select items from a drop-down in selenium
        deselectByIndexUtil(standardMultiSelect,index);

    }
    public List<String> getAllSelectedStandardMultiOptions(){
        return getAllSelectedOptions(standardMultiSelect)  ;
    }




}
