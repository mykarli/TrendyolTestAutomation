import Base.BaseTest;
import org.testng.annotations.Test;
import pages.LoginPage;
import pages.MainPage;
import pages.ProductDetailPage;
import pages.ProductListPage;

import java.util.ArrayList;

public class ProductTest extends BaseTest {
    LoginPage loginPage=new LoginPage();
    MainPage mainPage=new MainPage();
    ProductListPage productListPage=new ProductListPage();
    ProductDetailPage productDetailPage=new ProductDetailPage();

    @Test(description = "ürün adı detay kontrolü")
    public void productDetailNameControl(){
        loginPage.fillEmail(email)
                .fillPassword(password)
                .clickLogin();
        sleep(3000);
        mainPage.searchSendKeys("iphone 13 128 gb");

      String productName= productListPage.getFirstProductName();
        ArrayList<String> tabs= new ArrayList<>(driver.getWindowHandles());
        driver.switchTo().window(tabs.get(1));
        productDetailPage.productNameControl(productName);
    }


}
