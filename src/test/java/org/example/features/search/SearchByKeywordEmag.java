package org.example.features.search;

import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Issue;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Pending;
import net.thucydides.core.annotations.Steps;
import org.example.steps.serenity.EndUserSteps;
import org.example.steps.serenity.EndUserStepsEmag;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

@RunWith(SerenityRunner.class)
public class SearchByKeywordEmag {
    @Managed(uniqueSession = true)
    public WebDriver webdriver;

    @Steps
    public EndUserStepsEmag anna;

    @Test
    public void searching_by_keyword_Samsung_Galaxy_S21_Ultra_Black_should_display_the_corresponding_title() {
        anna.is_the_home_page();
        anna.looks_for("Samsung Galaxy S21 Ultra Black");
        anna.should_see_definition("Telefon mobil Samsung Galaxy S21 Ultra, Dual SIM, 128GB, 12GB RAM, 5G, Phantom Black");

    }

    @Test(expected = AssertionError.class)
    public void searching_by_keyword_Iphone_12_Pro_Max_Blue_should_display_the_corresponding_title() {
        anna.is_the_home_page();
        anna.looks_for("iphone 12 pro max blue");
        anna.should_see_definition("None");

    }
}
