package stepdefinitions;

import com.github.javafaker.Faker;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import pages.KullaniciKaydiPage;
import utilities.ConfigReader;
import utilities.Driver;

import static utilities.Driver.waitFor;

public class KullaniciKaydiStepDef {


    KullaniciKaydiPage kullaniciKaydiPage = new KullaniciKaydiPage();
    Faker faker = new Faker();
    String email1 = faker.internet().emailAddress();
    Actions actions = new Actions(Driver.getDriver());



    @Given("Kullanici {string} sayfasina gider.")
    public void kullanici_automation_practise_sayfasina_gider(String webSite) {
        Driver.getDriver().get(ConfigReader.getProperty(webSite));
    }

    @Given("Kullanici istenen sayfasinin acildigini assert eder.")
    public void kullanici_istenen_sayfasinin_acildigini_assert_eder() {
        waitFor(5);
        Assert.assertTrue(kullaniciKaydiPage.signInButton.isDisplayed());
    }

    @Given("Kullanici Sign In buttona tiklar.")
    public void kullanici_sign_in_buttona_tiklar() {
        kullaniciKaydiPage.signInButton.click();
    }

    @Given("Kullanici valid email adresi girer.")
    public void kullanici_valid_email_adresi_girer() {
        kullaniciKaydiPage.emailCreate.sendKeys(email1);
        waitFor(5);
    }

    @Given("Kullanici Create Account secenegine tiklar.")
    public void kullanici_create_account_secenegine_tiklar() {
        kullaniciKaydiPage.createAccount.click();
    }

    @Given("Kullanici valid Title degerini secer.")
    public void kullanici_valid_title_degerini_secer() {
        kullaniciKaydiPage.mrButton.click();

    }

    @Given("Kullanici valid First Name girer.")
    public void kullanici_valid_first_name_girer() {
        String name = faker.name().firstName();
        kullaniciKaydiPage.firstName.sendKeys(name);
    }

    @Given("Kullanici valid Last Name girer.")
    public void kullanici_valid_last_name_girer() {
        String lastName = faker.name().lastName();
        kullaniciKaydiPage.lastName.sendKeys(lastName);
    }

    @Given("Kullanici valid email degeri girer.")
    public void kullanici_valid_email_degeri_girer() {
        kullaniciKaydiPage.email.sendKeys(email1);
        waitFor(5);
    }

    @Given("Kullanici valid minimum bes karakterli password girer.")
    public void kullanici_valid_minimum_bes_karakterli_password_girer() {
        kullaniciKaydiPage.password.sendKeys(faker.internet().password(5, 32, true, true, true));
    }

    @Given("Kullanici Date of Birth buttona valid degerleri girer.")
    public void kullanici_date_of_birth_buttona_valid_degerleri_girer() {
        Select select = new Select(kullaniciKaydiPage.days);
        Select select1 = new Select(kullaniciKaydiPage.months);
        Select select2 = new Select(kullaniciKaydiPage.years);
        kullaniciKaydiPage.days.click();
        select.selectByValue("22");
        // actions.click(kullaniciKaydiPage.days).sendKeys("22").perform();
        select1.selectByValue("6");
        select2.selectByValue("1996");
        //actions.click(kullaniciKaydiPage.months).sendKeys("June").perform();
        //actions.click(kullaniciKaydiPage.years).sendKeys("1996").perform();

    }


    @Given("Kullanici Adress kismina valid deger girer.")
    public void kullanici_adress_kismina_valid_deger_girer() {
        kullaniciKaydiPage.adress.sendKeys(faker.address().fullAddress());
    }

    @Given("Kullanici City buttondan valid secim yapar.")
    public void kullanici_city_buttondan_valid_secim_yapar() {
        kullaniciKaydiPage.city.sendKeys(faker.address().city());
    }

    @Given("Kullanici State buttondan valid deger secer.")
    public void kullanici_state_buttondan_valid_deger_secer() {

        actions.click(kullaniciKaydiPage.state).sendKeys("New York").perform();

    }

    @Given("Kullanici Zip Postal Code degeri girer.")
    public void kullanici_zip_postal_code_degeri_girer() {
        waitFor(5);
        kullaniciKaydiPage.postcode.sendKeys("15963");
    }


    @Given("Kullanici Mobile phone degeri girer.")
    public void kullanici_mobile_phone_degeri_girer() {
        kullaniciKaydiPage.phoneNumber.sendKeys(faker.phoneNumber().cellPhone());

    }

    @Given("Kullanici Assign an address alias for future reference buttona valid referans girer.")
    public void kullanici_assign_an_address_alias_for_future_reference_buttona_valid_referans_girer() {


    }

    @Given("Kullanici Register buttona tiklar.")
    public void kullanici_register_buttona_tiklar() {
        kullaniciKaydiPage.registerButton.click();
    }

    @Then("Kullanicinin olustugu assert edilir.")
    public void kullanicinin_olustugu_assert_edilir() {
        Assert.assertTrue(kullaniciKaydiPage.myAccountText.isDisplayed());
    }

}
