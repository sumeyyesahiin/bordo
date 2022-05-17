package stepdefinitions;

import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import pages.UrunEkleOdemePage;
import utilities.Driver;

public class UrunEkleOdemeStepDef {

    UrunEkleOdemePage urunEkleOdemePage = new UrunEkleOdemePage();
    Actions actions = new Actions(Driver.getDriver());

    @Then("Kullanici Dresses butonuna tiklar.")
    public void kullanici_dresses_butonuna_tiklar() {
        urunEkleOdemePage.dressesButton.click();
    }

    @Then("Kullanici acilan pencerede Summer Dresses butonuna tiklar.")
    public void kullanici_acilan_pencerede_summer_dresses_butonuna_tiklar() throws InterruptedException {
        Thread.sleep(4000);
        urunEkleOdemePage.summerDressesButton.click();

    }

    @Then("Kullanici dresseslerden bir tanesini sepete ekler.")
    public void kullanici_dresseslerden_bir_tanesini_sepete_ekler() throws InterruptedException {
        actions.moveToElement(urunEkleOdemePage.dress1).perform();
        urunEkleOdemePage.addDress.click();
        Thread.sleep(3000);
        urunEkleOdemePage.closeWindovButton.click();
    }

    @Then("Kullanici arama butonuna Summer yazarak search eder.")
    public void kullanici_arama_butonuna_summer_yazarak_search_eder() throws InterruptedException {
        urunEkleOdemePage.searchButton.sendKeys("Summer" + Keys.ENTER);
        Thread.sleep(5000);
    }

    @Then("Kullanici sonuc sayfasindan bir urun daha ekler.")
    public void kullanici_sonuc_sayfasindan_bir_urun_daha_ekler() throws InterruptedException {

        actions.moveToElement(urunEkleOdemePage.dress2).perform();
        Thread.sleep(2000);
        actions.click(urunEkleOdemePage.addDress2).perform();
        Thread.sleep(2000);
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
        urunEkleOdemePage.protectedToCheckoutButton.click();
    }

    @Then("Kullanici adres secili oldugunu dogrular ve yeniden Proceed to checkout buttona tiklar.")
    public void kullanici_adres_secili_oldugunu_dogrular_ve_yeniden_proceed_to_checkout_buttona_tiklar() {
        Assert.assertTrue(urunEkleOdemePage.adress.getText().contains("15963"));
        actions.moveToElement(urunEkleOdemePage.protectedToCheckoutButton).perform();
        urunEkleOdemePage.protectedToCheckoutButton.click();
    }

    @Then("Kullanici hizmet sartlarini kabul eder ve Proceed to checkout buttona tiklar.")
    public void kullanici_hizmet_sartlarini_kabul_eder_ve_proceed_to_checkout_buttona_tiklar() {
        urunEkleOdemePage.hizmetSartiKabulu.click();
        urunEkleOdemePage.protectedToCheckoutButton.click();
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
