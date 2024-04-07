package org.opencart.stepdefinitions;

import io.cucumber.java.After;
import io.cucumber.java.AfterAll;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeAll;
import org.opencart.utils.TestContextSetup;

public class Hooks {

    TestContextSetup testContextSetup;

    public Hooks(TestContextSetup testContextSetup) {
        this.testContextSetup = testContextSetup;
    }

    @BeforeAll
    public static void frameworkInitialize() {
        System.out.println("***** Framework Initialized *****");
    }

    @AfterAll
    public static void frameworkComplete() {
        System.out.println("***** Framework Completed *****");
    }

    @Before
    public void beforeScenario() {
        System.out.println("***** Scenario Started *****");
    }


    @After
    public void afterScenario() {
        testContextSetup.testBase.initializeDriver().quit();
        System.out.println("***** Scenario Completed *****");
    }
}
