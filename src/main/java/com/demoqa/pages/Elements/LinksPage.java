package com.demoqa.pages.Elements;

import org.openqa.selenium.By;

import static Utilities.javascriptUtility.clickJS;
import static Utilities.javascriptUtility.scrollToElements;

public class LinksPage extends ElementsPage{
    private By badReqLink = By.id("bad-request");
    private By responseLink = By.id("linkResponse");


    public void badReqLinkClick(){
        scrollToElements(badReqLink);
        clickJS(badReqLink);

    }

    public String getResponse(){
        delay(2000);
        return find(responseLink).getText();
    }

}
