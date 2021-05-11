package org.example.features.filter;

import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Issue;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Pending;
import net.thucydides.core.annotations.Steps;
import org.example.steps.serenity.EndUserSteps;
import org.example.steps.serenity.EndUserStepsEmag;
import org.example.steps.serenity.EndUserStepsEmagFilter;
import org.example.steps.serenity.EndUserStepsEmagFilterSoftware;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

@RunWith(SerenityRunner.class)
public class FilterBySoftware {
    @Managed(uniqueSession = true)
    public WebDriver webdriver;

    @Steps
    public EndUserStepsEmagFilterSoftware anna;

    @Test(expected = AssertionError.class)
    public void filtering_by_software_fail() {
        anna.is_the_home_page();
        anna.looks_for();
        anna.should_see_definition("none");
    }

}
