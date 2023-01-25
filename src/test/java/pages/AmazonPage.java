package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class AmazonPage {
    //Ilk once yapmamiz gereken bir tane Constructor olusturmak
    public AmazonPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(id="twotabsearchtextbox")
    public WebElement searchBox;

    @FindBy(id="(//*[@class='a-section a-spacing-small a-spacing-top-small'])[1]")
    public WebElement searchResult;

}
