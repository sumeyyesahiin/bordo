package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class UrunEkleOdemePage extends BasePage {


    @FindBy(xpath = "(//*[text()='Dresses'])[2]")
    public WebElement dressesButton;

    @FindBy(xpath = "(//*[text()='Summer Dresses'])[4]")
    public WebElement summerDressesButton;

    @FindBy(xpath = "(//div[@class='product-image-container'])[1]")
    public WebElement dress1;

    @FindBy(xpath = "(//div[@class='product-image-container'])[2]")
    public WebElement dress2;

    @FindBy(xpath = "(//*[text()='Add to cart'])[1]")
    public WebElement addDress;

    @FindBy(xpath = "(//*[text()='Add to cart'])[2]")
    public WebElement addDress2;

    @FindBy(xpath = "//span[@class='continue btn btn-default button exclusive-medium']")
    public WebElement continueShoppingButton;

    @FindBy(id = "search_query_top")
    public WebElement searchButton;

    @FindBy(xpath = "//span[@class='ajax_cart_product_txt_s  unvisible']")
    public WebElement urunSayisiText;

    @FindBy(xpath = "(//span[@class='price'])[4]")
    public WebElement firstDressTotal;

    @FindBy(xpath = "(//span[@class='price'])[7]")
    public WebElement secondDressTotal;

    @FindBy(xpath = "//a[@class='button btn btn-default standard-checkout button-medium']")
    public WebElement protectedToCheckoutButton;

    @FindBy(xpath ="//span[@title='Close window']")
    public WebElement closeWindovButton;

//    @FindBy(xpath ="//span[@title='View my shopping cart']")
//    public WebElement cartButton;

    @FindBy(xpath ="(//i[@class='icon-chevron-right right'])[1]")
    public WebElement checkoutButton;

    @FindBy(xpath = "(//span[@class='ajax_cart_quantity'])[1]")
    public WebElement sepettekiUrunSayisi;

    @FindBy(xpath = " (//li[@class='address_city address_state_name address_postcode'])[1]")
    public WebElement adress;

    @FindBy(id = "cgv")
    public WebElement hizmetSartiKabulu;

    @FindBy(xpath = "//a[@class='cheque']")
    public WebElement payByCheck;

    @FindBy(xpath = "//*[text()='I confirm my order']")
    public WebElement siparisOnay;

    @FindBy(xpath = "//a[@class='button-exclusive btn btn-default']")
    public WebElement backToOrders;

    @FindBy(xpath = "(//a[@class='btn btn-default button button-small'])[2]")
    public WebElement siparisDetails;









}
