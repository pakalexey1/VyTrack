package com.cydeo.step_definitions;
import com.cydeo.utilities.Driver;
import io.cucumber.java.Scenario;
import org.junit.After;
import org.junit.AfterClass;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
public class Hooks {
       // @Before
        //public void setUpScenario(){}
@After
        public void teardownScenario(Scenario scenario){
            System.out.println("--> It is coming from @After in Hooks ");
            byte[] screenshot = ((TakesScreenshot) Driver.getDriver()).getScreenshotAs(OutputType.BYTES);
            scenario.attach(screenshot,"image/png",scenario.getName());
            Driver.closeDriver();}
@AfterClass
    public void close_window(){
    Driver.closeDriver();
}}

