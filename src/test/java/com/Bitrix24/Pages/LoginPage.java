package com.Bitrix24.Pages;

import com.Bitrix24.Utilities.ConfigurationReader;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class LoginPage extends BasePage {

    @FindBy(xpath = "//input[@name='USER_LOGIN']")
    public WebElement usernameInputBox;

    @FindBy(xpath = "//input[@name='USER_PASSWORD']")
    public WebElement passwordInputBox;

    @FindBy(xpath = "//input[@class='login-btn']")
    public WebElement loginButton;

    @FindBy(xpath = "//a[.='Forgot your password?']")
    public WebElement forgotPasswordLink;

    public static void login(String role) {
        LoginPage loginPage = new LoginPage();

        wait.until(ExpectedConditions.visibilityOf(loginPage.usernameInputBox));
        wait.until(ExpectedConditions.visibilityOf(loginPage.passwordInputBox));
        wait.until(ExpectedConditions.visibilityOf(loginPage.loginButton));


        if (role.toLowerCase().equals("helpdesk")) {
            String username = ConfigurationReader.getProperty("helpdesk.username");
            loginPage.usernameInputBox.sendKeys(username);

        } else if (role.toLowerCase().equals("marketing")) {
            String username = ConfigurationReader.getProperty("marketing.username");
        }
        String password = ConfigurationReader.getProperty("password");
        loginPage.passwordInputBox.sendKeys(password);
        loginPage.loginButton.click();


    }


}
