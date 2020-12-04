package com.kodilla.testing2.facebook;

import com.kodilla.testing2.config.WebDriverConfig;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FacebookTestingApp {
    public static final String XPATH_SELECT_DAY = "//span[contains(@class, \"_5k_4\")]/span/select[1]";
    public static final String XPATH_SELECT_MONTH = "//span[contains(@class, \"_5k_4\")]/span/select[2]";
    public static final String XPATH_SELECT_YEAR = "//span[contains(@class, \"_5k_4\")]/span/select[3]";

    public static void main(String[] args) throws Exception {
        WebDriver driver = WebDriverConfig.getDriver(WebDriverConfig.CHROME);
        driver.get("https://www.facebook.com");
        Thread.sleep(7000);
        WebElement element = (new WebDriverWait(driver, 10))
                .until(ExpectedConditions.elementToBeClickable(By.id("u_0_2")));
        element.click();

        Thread.sleep(1000);

        WebElement selectComboDay = driver.findElement(By.xpath(XPATH_SELECT_DAY));
        WebElement selectComboMonth = driver.findElement(By.xpath(XPATH_SELECT_MONTH));
        WebElement selectComboYear = driver.findElement(By.xpath(XPATH_SELECT_YEAR));

        Select selectDay = new Select(selectComboDay);
        Select selectMonth = new Select(selectComboMonth);
        Select selectYear = new Select(selectComboYear);

        selectDay.selectByValue("21");
        selectMonth.selectByIndex(7);
        selectYear.selectByValue("1988");
    }
}
