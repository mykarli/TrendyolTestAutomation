package pages;

import Base.BaseTest;
import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.testng.Assert;

public class ProductDetailPage extends BaseTest {
    @Step("Ürün adı kontrolü")
    public ProductDetailPage productNameControl(String text){
        Assert.assertEquals(text,driver.findElement(By.cssSelector("[class='pr-new-br']")).getText());
        screenshot();
        return this;
    }
}
