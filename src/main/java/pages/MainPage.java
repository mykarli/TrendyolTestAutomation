package pages;

import Base.BaseTest;
import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.Assert;

public class MainPage extends BaseTest {

    @Step("Kullanıcı alanı kontrolü")
    public MainPage accountControl(String text){
        String value = driver.findElements(By.cssSelector("[class='link-text']")).get(0).getText();
        Assert.assertEquals(value,text);
        return this;
    }

    @Step("Search alanına veri girişi sağlanır")
    public  MainPage searchSendKeys(String text){
        driver.findElement(By.cssSelector("[data-testid=\"suggestion\"]")).sendKeys(text, Keys.ENTER);
        return this;
    }
}
