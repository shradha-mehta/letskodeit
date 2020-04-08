package com.learn.letskodeit.testsuite;


import com.learn.letskodeit.pages.HomePage;
import com.learn.letskodeit.pages.LoginPage;
import com.learn.letskodeit.testbase.TestBase;
import org.testng.annotations.Test;

public class LoginTest extends TestBase {
    HomePage homePage = new HomePage();
    LoginPage loginPage = new LoginPage();

    @Test
    public void verifyUserCanNavigateToLoginPage(){
        homePage.clickOnLogin();

    }@Test
    public void verifyUserIsAbleToLoginSuccesfully(){
        loginPage.setEmailField();
        loginPage.setPasswordField();
        loginPage.setClickOnLoginButton();




    }
}


