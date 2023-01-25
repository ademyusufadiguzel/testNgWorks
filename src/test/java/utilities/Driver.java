package utilities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.time.Duration;

public class Driver {
/*
    Driver'daki temel mantik extents yontemiyle degil yani TestBase class'ina extend etmek yerine
    Driver classindan static methodlar kullanarak driver olusturulur.

    Ilk olarak "public static WebDriver getDriver()" method'unu olusturmak. Bu method bize bir driver getirecek
    Driver'i kapatacağımız zaman da public static void closeDriver() methodu oluşturmak. İstediğimiz zaman
    bu methodla driver'i kapatacağız
*/
    static WebDriver driver;
    public static WebDriver getDriver(){
        if (driver == null){
            switch (ConfigReader.getProperty("browser")){
                case "chrome":
                    WebDriverManager.chromedriver().setup();
                    driver = new ChromeDriver();
                    break;
                case "edge":
                    WebDriverManager.edgedriver().setup();
                    driver = new EdgeDriver();
                    break;
                case "firefox":
                    WebDriverManager.firefoxdriver().setup();
                    driver = new FirefoxDriver();
                    break;
            }
            driver = new ChromeDriver();
            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        }
        return driver;
    }

    public static void closeDriver(){
        if (driver != null){
            driver.close();
            driver=null;
        }
    }
}
