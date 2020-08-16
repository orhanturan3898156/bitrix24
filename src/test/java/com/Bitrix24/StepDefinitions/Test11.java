package com.Bitrix24.StepDefinitions;

import com.Bitrix24.Pages.LoginPage;
import com.Bitrix24.Utilities.ConfigurationReader;
import com.Bitrix24.Utilities.Driver;
import org.testng.annotations.Test;

public class Test11 {


    @Test
    public void test() {

        Driver.getDriver().get(ConfigurationReader.getProperty("url"));
        LoginPage.login("helpdesk");
    }

}
