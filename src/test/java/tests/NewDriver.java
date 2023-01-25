package tests;

import org.testng.annotations.Test;
import utilities.ConfigReader;
import utilities.Driver;

public class NewDriver {
    @Test
    public void test1() throws InterruptedException {
        Driver.getDriver().get(ConfigReader.getProperty("amazon_url"));
    }
}
