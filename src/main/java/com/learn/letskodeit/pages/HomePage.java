package com.learn.letskodeit.pages;


import com.learn.letskodeit.utilty.Utility;
import org.openqa.selenium.By;

public class HomePage extends Utility {//homepage extends utility

        By loginLink = By.partialLinkText("Login");
        By practiceLink = By.partialLinkText("Practi");
        By signUpLink = By.id("header-sign-up-btn");

        //clicking on login button
        public void clickOnLogin(){
            clickOnElement(loginLink);
        }
        //clicking on practice button
        public void clickOnPracticeLink(){
            clickOnElement(practiceLink);
        }
        //clicking on sign up button
        public void clickOnSignUpLink(){
            clickOnElement(signUpLink);
        }
        //login button is displayed or not in homepage
        public void displayedLoginLink(){
            verifyThatElementIsDisplayed(loginLink);
        }


    }





