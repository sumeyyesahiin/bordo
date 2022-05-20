package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.junit.Assert;

import java.util.ArrayList;

import static io.restassured.RestAssured.given;
import static utilities.ConfigReader.getProperty;

public class ApiPracticeStep {

    Response response;

    @And("Swagger client sayisi olan {int} ile response donen client sayisi assert edilmesi.")
    public void swaggerClientSayisiIleResponseDonenClientSayisiAssertEdilmesi(int expectedSize) {
        ArrayList<String> actualData = response.as(ArrayList.class);
        System.out.println(actualData);
        Assert.assertEquals(expectedSize, actualData.size());
    }


    @And("Status code {int} assert edilmesi.")
    public void statusCodeAssertEdilmesi(int expectedStatusCode) {
        System.out.println(response.statusCode());
        response.then().assertThat().statusCode(expectedStatusCode);
    }


    @Given("Kullanici {string} endpointine istek atar.")
    public void kullaniciIcinPathParamsAyarlariniYapar(String arg0) {
        response = given().
                accept(ContentType.JSON).
                when().
                get(getProperty("base_url") + arg0);
    }
}
