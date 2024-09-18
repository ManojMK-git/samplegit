package com.ctestrunner;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import com.bassclass.Base_Class;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
    features = "src/test/java/com/afeatures",
    glue = "com.bstepdef",
    plugin = {
        "pretty",
        "html:Reports/Cucumber_Html",
        "json:Reports/Json_Reports.json",
        "com.cucumber.listener.ExtentCucumberFormatter:Reports/Extent_Report.html"
    },
    monochrome = true,
    strict = false,
    dryRun = false)

public class TestRunnerClass extends Base_Class {
//
//    @BeforeClass
//    public static void setUp() {
//        // Launch browser
//        browserLaunch("chrome");
//    }
//
//    @AfterClass
//    public static void tearDown() {
        // Close browser
        //driver.quit();ṇṃ̇ 
    
}

