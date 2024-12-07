package com.demoqa.pages.forms;

import org.openqa.selenium.By;

import static Utilities.javascriptUtility.clickJS;
import static Utilities.javascriptUtility.scrollToElements;

public class PracticeFormPage extends FormsPage {

    private By femaleRadioButton = By.id("gender-radio-2");

    public void clickFemaleRadioButton(){
        scrollToElements(femaleRadioButton);
        clickJS(femaleRadioButton);
    }
    public boolean isFemaleSelected(){
        return find(femaleRadioButton).isSelected();
    }
}
