package com.academy.web.pages;

import org.openqa.selenium.WebDriver;

public class HomePage extends BasePage {

    /**
     * Constructor.
     * @param driver : WebDriver
     */
    public HomePage(WebDriver driver, String url) {
        super(driver);
        driver.get(url);
    }
}
