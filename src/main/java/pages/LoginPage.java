package pages;

import Base.BaseTest;
import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.testng.Assert;

public class LoginPage extends BaseTest {

   @Step("E-posta doldurulur")
    public LoginPage fillEmail(String text){
        driver.findElement(By.id("login-email")).clear();
        driver.findElement(By.id("login-email")).sendKeys(text);
        return this;
    }

    @Step("Password doldurulur")
    public LoginPage fillPassword(String text){
        driver.findElement(By.name("login-password")).sendKeys(text);
        return this;
    }

    @Step("Login butonuna tıklanır")
    public LoginPage clickLogin(){
        driver.findElement(By.cssSelector("[class='q-primary q-fluid q-button-medium q-button submit']")).click();
        return this;
    }

    @Step("Error mesaj kontrolü")
    public LoginPage errorMessageControl(String message){
        Assert.assertEquals(driver.findElement(By.cssSelector("[class='message']")).getText(), message);
        screenshot();
        return this;

    }
}
