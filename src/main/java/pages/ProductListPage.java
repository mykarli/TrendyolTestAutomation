package pages;

import Base.BaseTest;
import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class ProductListPage extends BaseTest {

    @Step("İlk sıradaki ürünün bilgisi alınır")
    public String getFirstProductName(){
        String brand= driver.findElements(By.cssSelector("[class='prdct-desc-cntnr-ttl']")).get(0).getText();
        WebElement element= driver.findElements(By.cssSelector("[class='prdct-desc-cntnr-name hasRatings']")).get(0);
        String productName= element.getText();
        String description=driver.findElements(By.cssSelector("[class='product-desc-sub-text']")).get(0).getText();
        String product= brand+" " +productName+" "+description;
        System.out.println(product);
        element.click();
        return product;
    }
}
