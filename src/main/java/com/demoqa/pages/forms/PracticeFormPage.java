package com.demoqa.pages.forms;

import org.openqa.selenium.By;

import static Utilities.javascriptUtility.clickJS;
import static Utilities.javascriptUtility.scrollToElements;

public class PracticeFormPage extends FormsPage {

    private By femaleRadioButton = By.id("gender-radio-2");
    private By sportsHobbyCheckbox = By.id("hobbies-checkbox-1");
    private By readingHobbyCheckbox = By.id("hobbies-checkbox-2");
    private By musicHobbyCheckbox = By.id("hobbies-checkbox-3");
    public void clickFemaleRadioButton(){
        scrollToElements(femaleRadioButton);
        clickJS(femaleRadioButton);
    }
    public boolean isFemaleSelected(){
        return find(femaleRadioButton).isSelected();
    }
    public void clickSportsCheckbox(){
        if(!find(sportsHobbyCheckbox).isSelected()){
            scrollToElements(sportsHobbyCheckbox);
            clickJS(sportsHobbyCheckbox);
        }
    }
    public void clickReadingCheckbox(){
        if(!find(readingHobbyCheckbox).isSelected()){
            scrollToElements(readingHobbyCheckbox);
            clickJS(readingHobbyCheckbox);
        }
    }
    public void clickMusicCheckbox(){
        if(!find(musicHobbyCheckbox).isSelected()){
            scrollToElements(musicHobbyCheckbox);
            clickJS(musicHobbyCheckbox);
        }
    }
    public void unclickReadingCheckbox() {
        if (find(readingHobbyCheckbox).isSelected()) {
            scrollToElements(readingHobbyCheckbox);
            clickJS(readingHobbyCheckbox);
        }
    }

    public boolean isReadingSelected(){
        return  find(readingHobbyCheckbox).isSelected();
    }
}
