package tests;

import org.openqa.selenium.Keys;
import org.testng.annotations.Test;
import pages.AmazonPage;
import utilities.Driver;

public class PageKullanimi {
    //amazona gidelim
    //iphone aratalım
    //sonuc yazısının iphone içerdiğini test edelim

    @Test
    public void test1(){
        Driver.getDriver().get("https://www.amazon.com/");
        AmazonPage amazonpage = new AmazonPage();

        amazonpage.searchBox.sendKeys("iPhone", Keys.ENTER);

        assert amazonpage.searchResult.getText().contains("iphone");
    }
}
