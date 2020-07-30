package propertiesfile;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ReadPropertiesFile {
    public static void main(String[] args) throws IOException {

        File f=new File("./ConfigurationDetails/applicationcongiguration.properties");
        FileInputStream fis=new FileInputStream(f);
        Properties properties=new Properties();
        properties.load(fis);
        //get the property value from the properties file

        System.out.println(properties.getProperty("EXECUTE"));
        // GET THE ENVIRONEMNT URL

        System.out.println(properties.getProperty(properties.getProperty("EXECUTE")+"_APPLICATION_URL"));

    }

}
