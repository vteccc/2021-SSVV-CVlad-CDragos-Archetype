package org.example.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

import java.util.List;
import java.util.stream.Collectors;

@DefaultUrl("https://www.emag.ro/")
public class EmagPage extends PageObject {

    @FindBy(name = "query")
    private WebElementFacade searchTerms;

    @FindBy(className = "searchbox-submit-button")
    private WebElementFacade lookupButton;

    public void enter_keywords(String keyword) {
        searchTerms.type(keyword);
    }

    public void lookup_terms() {
        lookupButton.click();
    }

    public List<String> getDefinitions() {
        WebElementFacade definitionList = find(By.id("card_grid"));
        return definitionList.findElements(By.tagName("div")).stream()
                .map(element -> element.getAttribute("data-name"))
                .collect(Collectors.toList());
    }
}

