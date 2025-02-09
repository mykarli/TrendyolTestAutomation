import Base.BaseTest;
import org.testng.annotations.Test;
import pages.LoginPage;
import pages.MainPage;

import java.security.PublicKey;

public class LoginTest extends BaseTest {
    LoginPage loginPage = new LoginPage();
    MainPage mainPage = new MainPage();

    @Test(description = "başarılı kullanıcı girişi kontorlü")
    public void loginSuccessful() {
        loginPage.fillEmail(email)
                .fillPassword(password)
                .clickLogin();

        sleep(3000);
        mainPage.accountControl("Hesabım");
    }

    @Test(description = "başarısız kullanıcı girişi kontorlü")
    public void loginUnSuccessful(){
        loginPage.fillEmail(email)
                .fillPassword("asd123")
                .clickLogin();
        sleep(3000);

        loginPage.errorMessageControl("E-posta adresiniz ve/veya şifreniz hatalı.")
                .fillEmail("asd@gmail.com")
                .clickLogin();
        sleep(3000);

        loginPage.errorMessageControl("E-posta adresiniz ve/veya şifreniz hatalı.");
    }

    @Test(description = "zorunlu karakter kontrolü")
    public void requiredControl(){
        loginPage.clickLogin()
                .errorMessageControl("Lütfen geçerli bir e-posta adresi giriniz.")
                .fillEmail(email)
                .clickLogin()
                .errorMessageControl("Lütfen şifrenizi giriniz.")
                .fillPassword(password)
                .clickLogin();
        sleep(3000);
        mainPage.accountControl("Hesabım");

    }

    @Test(description = "max-min karakter kontrolü")
    public void maxMinCharControl(){
        loginPage.fillEmail("a")
                .fillPassword("a")
                .clickLogin()
                .errorMessageControl("E-posta alanı minimum 10 karakter olmalıdır")
                .fillEmail("ahsasadjhsjhsdkjfhkjhkjshgskjhdgjhdskahsasadjhsjhsdkjfhkjhkjshgskjhdgjhdskjahsasadjhsjhsdkjfhkjhkjshgskjhdgjhdskjahsasadjhsjhsdkjfhkjhkjshgskjhdgjhdskjahsasadjhsjhsdkjfhkjhkjshgskjhdgjhdskjahsasadjhsjhsdkjfhkjhkjshgskjhdgjhdskjahsasadjhsjhsdkjfhkjhkjshgskjhdgjhdskjj")
                .fillPassword("ahsasadjhsjhsdkjfhkjhkjshgskjhahsasadjhsjhsdkjfhkjhkjshgskjhdgjhdskjahsasadjhsjhsdkjfhkjhkjshgskjhdgjhdskjahsasadjhsjhsdkjfhkjhkjshgskjhdgjhdskjahsasadjhsjhsdkjfhkjhkjshgskjhdgjhdskjdgjhdskjahsasadjhsjhsdkjfhkjhkjshgskjhdgjhdskj")
                .clickLogin()
                .errorMessageControl("E-posta alanına maximum 50 karakter olmalıdır");
    }




}
