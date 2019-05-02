package com.sparta.siq.stepdefs;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class MyStepdefs {
    @Given("cucumber is set up correctly")
    public void cucumberIsSetUpCorrectly() {
        System.out.println("I have Given a Test");
    }

    @When("I run the tests")
    public void iRunTheTests() {
        System.out.println("I have Run a When test");
    }

    @Then("I can see them run")
    public void iCanSeeThemRun() {
        System.out.println("I have run a result test");
    }
}
