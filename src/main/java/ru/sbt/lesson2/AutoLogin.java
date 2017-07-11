package ru.sbt.lesson2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/**
 * Created by MaxK on 10.07.2017.
 */
public class AutoLogin {
    WebDriver driver;
    By userName = By.id("mailbox__login");
    By password = By.id("mailbox__password");
    By login = By.id("mailbox__auth__button");

    public AutoLogin(WebDriver driver){
        this.driver = driver;
    }

    public void setUserName(String strUserName){
        driver.findElement(userName).sendKeys(strUserName);
    }

    //Set password in password textbox
    public void setPassword(String strPassword){
        driver.findElement(password).sendKeys(strPassword);
    }

    //Click on login button
    public void clickLogin(){
        driver.findElement(login).click();
    }

    public void loginToAuto(String strUserName,String strPasword){
        //Fill user name
        this.setUserName(strUserName);
        //Fill password
        this.setPassword(strPasword);
        //Click Login button
        this.clickLogin();
    }
}
