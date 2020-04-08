package com.learn.letskodeit.testsuite;

import com.learn.letskodeit.pages.HomePage;
import com.learn.letskodeit.testbase.TestBase;
import org.testng.annotations.Test;


public class HomePageTest extends TestBase {
    HomePage homePage =new HomePage();
    @Test
    public void verifyLoginLinkIsDisplayed() {
        homePage.displayedLoginLink();
    }@Test
    public void verifyUserCanNavigateToPracticePage(){
        homePage.clickOnPracticeLink();
    }@Test
    public void verifyUserShouldNavigateToSignUpPage(){
        homePage.clickOnSignUpLink();
    }

}





