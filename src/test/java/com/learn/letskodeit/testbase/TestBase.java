package com.learn.letskodeit.testbase;

import com.learn.letskodeit.basepage.BasePage;
import com.learn.letskodeit.browserselector.BrowserSelector;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.util.concurrent.TimeUnit;

public class TestBase  extends BasePage {
    BrowserSelector browserSelector = new BrowserSelector();//object created
    String baseUrl = "https://learn.letskodeit.com";

    @BeforeMethod
    public void openBrowser() {
        browserSelector.selectBrowser("chrome");
        // driver.manage().window().setPosition(new Point(2000, 0));//display into second screen
        driver.manage().window().maximize();
        //driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get(baseUrl);
    }

    @AfterMethod
    public void tearDown() {
        driver.quit();


    }

}
