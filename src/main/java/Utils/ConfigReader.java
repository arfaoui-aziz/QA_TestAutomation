package Utils;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigReader {
    private Properties prop;

    public Properties init_props(){
        prop = new Properties();
        try {
            FileInputStream ip = new FileInputStream("./src/test/resources/Configs/config.properties");
            prop.load(ip);
        } catch (IOException e){
            e.printStackTrace();
        }
        System.out.println(prop);
        return prop;
    }
}
