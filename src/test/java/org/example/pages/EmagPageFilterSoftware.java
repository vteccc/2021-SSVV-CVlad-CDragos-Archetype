package org.example.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;
import java.util.stream.Collectors;

@DefaultUrl("https://www.emag.ro/")
public class EmagPageFilterSoftware extends PageObject {

    @FindBy(className = "navbar-aux-content__departments")
    private WebElementFacade produse;

    @FindBy(xpath = "//a[@href=\"javascript:void(0)\"]")
    private WebElementFacade pcSoftwareButton;

    @FindBy(xpath = "//a[@href=\"/software/sd?ref=hp_menu_quick-nav_23_17&type=subdepartment\"]")
    private WebElementFacade software;

    @FindBy(xpath = "//a[@href=\"/sisteme-operare/c?ref=hp_menu_quick-nav_23_18&type=category\"]")
    private WebElementFacade so;

    public void lookup_terms() {
        produse.click();
        pcSoftwareButton.click();
        software.click();
        so.click();
    }

    public List<String> getDefinitions() {
        WebElementFacade linksList = find(By.className("listing-page-title"));

        return linksList.findElements(By.tagName("span")).stream()
                .map(WebElement::getText)
                .collect(Collectors.toList());
    }
}

