package com.Bitrix24.Pages;

import com.Bitrix24.Utilities.Driver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public abstract class BasePage {

    protected static WebDriverWait wait = new WebDriverWait(Driver.getDriver(), 15);


    public BasePage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }


}
