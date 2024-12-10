package com.demoqa.pages;

import com.base.BasePage;
import com.demoqa.pages.Elements.ElementsPage;
import com.demoqa.pages.Widgets.WidgetsPage;
import com.demoqa.pages.forms.FormsPage;
import org.openqa.selenium.By;

import static Utilities.javascriptUtility.clickJS;
import static Utilities.javascriptUtility.scrollToElements;

public class HomePage extends BasePage {

    private By formsCard = By.xpath("//div[@id='app']//h5[text()='Forms']");
    public FormsPage goToForms(){
        scrollToElements(formsCard);
        click(formsCard);
        return new FormsPage();
    }
    private By elementsCard = By.xpath("//div[@id=\"app\"]//h5[text()=\"Elements\"]");
    public ElementsPage goToElements(){
        scrollToElements(elementsCard);
        clickJS(elementsCard);
        return new ElementsPage();
    }

    private By widgetsCard = By.xpath("//div[@id='app']         //h5[text()='Widgets']");
    public WidgetsPage goToWidgets(){
        scrollToElements(widgetsCard);
        clickJS(widgetsCard);
        return new WidgetsPage();
    }

}
