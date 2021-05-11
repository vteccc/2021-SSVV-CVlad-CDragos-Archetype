package org.example.features.filter;

import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Issue;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Pending;
import net.thucydides.core.annotations.Steps;
import org.example.steps.serenity.EndUserSteps;
import org.example.steps.serenity.EndUserStepsEmag;
import org.example.steps.serenity.EndUserStepsEmagFilter;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

@RunWith(SerenityRunner.class)
public class FilterByTelefoane {
    @Managed(uniqueSession = true)
    public WebDriver webdriver;

    @Steps
    public EndUserStepsEmagFilter anna;

    @Test
    public void filtering_by_phones_should_display_the_corresponding_title() {
        anna.is_the_home_page();
        anna.looks_for();
        anna.should_see_definition("Telefoane Mobile");
    }

}
