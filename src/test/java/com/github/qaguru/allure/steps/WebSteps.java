package com.github.qaguru.allure.steps;

import com.codeborne.selenide.Condition;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Selectors.withText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;
import static org.openqa.selenium.By.linkText;
import static org.openqa.selenium.By.partialLinkText;

public class WebSteps {

    @Step("Open main page")
    public void openMainPage() {
        open("https://github.com");
    }

    @Step("Find repository {repository}")
    public void searchForRepository(String repository) {
        $(".header-search-input").click();
        $(".header-search-input").sendKeys(repository);
        $(".header-search-input").submit();
    }

    @Step("Go to repository {repository}")
    public void goToRepository(String repository) {
        $(linkText("eroshenkoam/allure-example")).click();
    }

    @Step("Open tab Issues")
    public void openIssueTab() {
        $(partialLinkText("Issues")).click();
    }

    @Step("Check existing Issues with number {number}")
    public void shouldSeeIssueWithNumber(int number) {
        $(withText("#" + number)).should(Condition.visible);
    }
}
