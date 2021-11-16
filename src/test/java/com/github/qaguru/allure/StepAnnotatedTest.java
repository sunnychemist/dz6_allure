package com.github.qaguru.allure;

import org.junit.jupiter.api.Test;
import com.github.qaguru.allure.steps.WebSteps;

public class StepAnnotatedTest {

    private static final String REPOSITORY = "eroshenkoam/allure-example";
    private static final Integer ISSUE_NUMBER = 56;

    private WebSteps steps = new WebSteps();

    @Test
    public void testGithub(){
        steps.openMainPage();
        steps.searchForRepository(REPOSITORY);
        steps.goToRepository(REPOSITORY);
        steps.openIssueTab();
        steps.shouldSeeIssueWithNumber(ISSUE_NUMBER);
    }

}
