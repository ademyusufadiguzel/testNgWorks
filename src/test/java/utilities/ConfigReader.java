package utilities;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ConfigReader {
    /*
       METHOD'U DEVREYE SOKABILMEK ICIN FILEINPUTSTREAM ILE DOSYA YOLUNU BELIRTMEMIZ GEREKIR
       METHODDAN ONCE CALISMASI ICIN STATIC BLOC ICERISINE FILEINPUTSTREAM'I OLUSTURMAMIZ GEREKIR.
     */

    public static Properties properties ;

    static {
        String path = "config.properties";
        try {
            FileInputStream fileInputStream = new FileInputStream(path);
            properties = new Properties();
            properties.load(fileInputStream);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }

    public static String getProperty(String key){
        //Test method'undan gnderdigimiz string key degerini alip Properties class'indan
        //getProperty() method'unu kullanarak bu key'e ait value'u bize getirir.

        return properties.getProperty(key);
    }

}
