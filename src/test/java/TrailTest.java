import org.testng.annotations.Test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class TrailTest {

    Properties prop = new Properties();



    public TrailTest() throws FileNotFoundException {
    }

    @Test
    public void test4() throws IOException {
        System.out.println("This is test case 4");
        String myProperty = System.getProperty("myproperty");
        System.out.println("My properties file is "+ myProperty);
        FileInputStream fis = new FileInputStream(System.getProperty("user.dir") + "/src/main/java/test/" + myProperty);
        prop.load(fis);
        String browser = prop.getProperty("browser");
        System.out.println(browser);
    }
    
}
