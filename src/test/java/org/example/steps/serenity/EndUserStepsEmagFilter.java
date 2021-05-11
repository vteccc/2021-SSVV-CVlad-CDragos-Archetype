package org.example.steps.serenity;

import net.thucydides.core.annotations.Step;
import org.example.pages.EmagPage;
import org.example.pages.EmagPageFilter;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.containsString;
import static org.hamcrest.Matchers.hasItem;

public class EndUserStepsEmagFilter {
    EmagPageFilter emagPage;


    @Step
    public void starts_search() {
        emagPage.lookup_terms();
    }

    @Step
    public void should_see_definition(String definition) {
        assertThat(emagPage.getDefinitions(), hasItem(containsString(definition)));
    }

    @Step
    public void is_the_home_page() {
        emagPage.open();
    }

    @Step
    public void looks_for() {
        starts_search();
    }
}
