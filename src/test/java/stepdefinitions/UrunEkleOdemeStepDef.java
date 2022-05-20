package stepdefinitions;

import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import pages.UrunEkleOdemePage;
import utilities.Driver;

import static utilities.Driver.waitFor;

public class UrunEkleOdemeStepDef {

    UrunEkleOdemePage urunEkleOdemePage = new UrunEkleOdemePage();
    Actions actions = new Actions(Driver.getDriver());

    @Then("Kullanici Dresses butonuna tiklar.")
    public void kullanici_dresses_butonuna_tiklar() {
        urunEkleOdemePage.dressesButton.click();
    }

    @Then("Kullanici acilan pencerede Summer Dresses butonuna tiklar.")
    public void kullanici_acilan_pencerede_summer_dresses_butonuna_tiklar() {
        waitFor(5);
        urunEkleOdemePage.summerDressesButton.click();

    }

    @Then("Kullanici dresseslerden bir tanesini sepete ekler.")
    public void kullanici_dresseslerden_bir_tanesini_sepete_ekler() {
        actions.moveToElement(urunEkleOdemePage.dress1).perform();
        urunEkleOdemePage.addDress.click();
        waitFor(5);
        urunEkleOdemePage.closeWindovButton.click();
    }

    @Then("Kullanici arama butonuna Summer yazarak search eder.")
    public void kullanici_arama_butonuna_summer_yazarak_search_eder() {
        urunEkleOdemePage.searchButton.sendKeys("Summer" + Keys.ENTER);
        waitFor(5);
    }

    @Then("Kullanici sonuc sayfasindan bir urun daha ekler.")
    public void kullanici_sonuc_sayfasindan_bir_urun_daha_ekler() {

        actions.moveToElement(urunEkleOdemePage.dress2).perform();
        waitFor(5);
        actions.click(urunEkleOdemePage.addDress2).perform();
        waitFor(5);
        urunEkleOdemePage.closeWindovButton.click();
    }

    @Then("Kullanici Cart menusune gelir.")
    public void kullanici_cart_menusune_gelir() {
        actions.sendKeys(Keys.PAGE_UP).perform();
        actions.moveToElement(urunEkleOdemePage.sepettekiUrunSayisi).perform();
    }

    @Then("Kullanici acilan alt menude Check out buttonuna tiklar.")
    public void kullanici_acilan_alt_menude_check_out_buttonuna_tiklar() {
        urunEkleOdemePage.checkoutButton.click();
    }

    @Then("Kullanicinin sepete ekledigi urun sayisinin iki oldugu ve fiyatlari assert edilir.")
    public void kullanicinin_sepete_ekledigi_urun_sayisinin_iki_oldugu_ve_fiyatlari_assert_edilir() {
        Assert.assertTrue(urunEkleOdemePage.sepettekiUrunSayisi.getText().contains("2"));
        Assert.assertTrue(urunEkleOdemePage.firstDressTotal.getText().contains("28.98"));
        Assert.assertTrue(urunEkleOdemePage.secondDressTotal.getText().contains("30.50"));

    }

    @Then("Kullanici Protected to checkout secenegine tiklar.")
    public void kullanici_protected_to_checkout_secenegine_tiklar() {
        urunEkleOdemePage.summmaryProtectedToCheckoutButton.click();
    }

    @Then("Kullanici adres secili oldugunu dogrular ve yeniden Proceed to checkout buttona tiklar.")
    public void kullanici_adres_secili_oldugunu_dogrular_ve_yeniden_proceed_to_checkout_buttona_tiklar() {
        actions.sendKeys(Keys.PAGE_DOWN).
                moveToElement(urunEkleOdemePage.adressYeriBulma).perform();
        Assert.assertTrue(urunEkleOdemePage.adress.getText().contains("15963"));
        actions.sendKeys(Keys.PAGE_DOWN).moveToElement(urunEkleOdemePage.adressSayfasiProtected).perform();
        urunEkleOdemePage.adressSayfasiProtected.click();

    }

    @Then("Kullanici hizmet sartlarini kabul eder ve Proceed to checkout buttona tiklar.")
    public void kullanici_hizmet_sartlarini_kabul_eder_ve_proceed_to_checkout_buttona_tiklar() {
        actions.moveToElement(urunEkleOdemePage.hizmetSartiKabulu).perform();
        urunEkleOdemePage.hizmetSartiKabulu.click();
        actions.moveToElement(urunEkleOdemePage.protectedToCheckoutButton).click().perform();

    }

    @Then("Kullanici acilan payment sayfasinda herhangi bir odeme secenegini isaretler.")
    public void kullanici_acilan_payment_sayfasinda_herhangi_bir_odeme_secenegini_isaretler() {
        urunEkleOdemePage.payByCheck.click();
    }

    @Then("Kullanici acilan pencerede I confirm my order buttona tiklar.")
    public void kullanici_acilan_pencerede_i_confirm_my_order_buttona_tiklar() {
        urunEkleOdemePage.siparisOnay.click();
    }

    @Then("Kullanici Back to orders yazisina tiklar.")
    public void kullanici_back_to_orders_yazisina_tiklar() {
        urunEkleOdemePage.backToOrders.click();
    }

    @Then("Kullanici acilan ORDER HISTORY sayfasindan siparisi ile ilgili details buttona tiklar.")
    public void kullanici_acilan_order_history_sayfasindan_siparisi_ile_ilgili_details_buttona_tiklar() {
        urunEkleOdemePage.siparisDetails.click();
    }

    @Then("Kullanici details sayfasinin acildigini assert eder.")
    public void kullanici_details_sayfasinin_acildigini_assert_eder() {

    }

}
