Feature:

  Background: Kullanici Kaydi

    Given Kullanici "AutomationPractise" sayfasina gider.
    And Kullanici istenen sayfasinin acildigini assert eder.
    And Kullanici Sign In buttona tiklar.
    And Kullanici valid email adresi girer.
    And Kullanici Create Account secenegine tiklar.
    And Kullanici valid Title degerini secer.
    And Kullanici valid First Name girer.
    And Kullanici valid Last Name girer.
    And Kullanici valid minimum bes karakterli password girer.
    And Kullanici Date of Birth buttona valid degerleri girer.
    And Kullanici valid First Name girer.
    And Kullanici valid Last Name girer.
    And Kullanici Company text buttona valid deger girer.
    And Kullanici Adress kismina valid deger girer.
    And Kullanici City buttondan valid secim yapar.
    And Kullanici State buttondan valid deger secer.
    And Kullanici Zip Postal Code degeri girer.
    And Kullanici Country secer.
    And Kullanici Mobile phone degeri girer.
    And Kullanici Assign an address alias for future reference buttona valid referans girer.
    * Kullanici Register buttona tiklar.
    Then Kullanicinin olustugu assert edilir.


  Scenario: TC 001 Urun sepete ekleme ve odeme islemi.

    * Kullanici Dresses butonuna tiklar.
    * Kullanici acilan pencerede Summer Dresses butonuna tiklar.
    * Kullanici dresseslerden bir tanesini sepete ekler.
    * Kullanici arama butonuna Summer yazarak search eder.
    * Kullanici sonuc sayfasindan bir urun daha ekler.
    * Kullanici Cart menusune gelir.
    * Kullanici acilan alt menude Check out buttonuna tiklar.
    * Kullanicinin sepete ekledigi urun sayisinin iki oldugu ve fiyatlari assert edilir.
    * Kullanici Protected to checkout secenegine tiklar.
    * Kullanici adres secili oldugunu dogrular ve yeniden Proceed to checkout buttona tiklar.
    * Kullanici hizmet sartlarini kabul eder ve Proceed to checkout buttona tiklar.
    * Kullanici acilan payment sayfasinda herhangi bir odeme secenegini isaretler.
    * Kullanici acilan pencerede I confirm my order buttona tiklar.
    * Kullanici Back to orders yazisina tiklar.
    * Kullanici acilan ORDER HISTORY sayfasindan siparisi ile ilgili details buttona tiklar.
    * Kullanici details sayfasinin acildigini assert eder.

