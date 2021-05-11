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
public class EmagPageFilter extends PageObject {

    @FindBy(className = "navbar-aux-content__departments")
    private WebElementFacade produse;

    @FindBy(xpath = "//a[@href=\"/laptop-tablete-telefoane/d?ref=hdr_menu_department_1\"]")
    private WebElementFacade laptopTelefoaneButton;

    @FindBy(xpath = "//a[@href=\"/telefoane-mobile-accesorii/sd?ref=hp_menu_quick-nav_1_15&type=subdepartment\"]")
    private WebElementFacade telefoaneAccesorii;

    @FindBy(xpath = "//a[@href=\"/telefoane-mobile/c?ref=hp_menu_quick-nav_1_16&type=category\"]")
    private WebElementFacade telefoaneMobile;

    public void lookup_terms() {
        produse.click();
        laptopTelefoaneButton.click();
        telefoaneAccesorii.click();
        telefoaneMobile.click();
    }

    public List<String> getDefinitions() {
        WebElementFacade linksList = find(By.className("listing-page-title"));

        return linksList.findElements(By.tagName("span")).stream()
                .map(WebElement::getText)
                .collect(Collectors.toList());
    }
}

