package PetStore.TestLaunch;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;




public class JPetStoreTest {
	
	protected static WebDriver wd;

    protected static String result;

    @BeforeClass

public static void setup()  {

    wd = new FirefoxDriver();

    wd.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
    wd.manage().window().maximize();
   }
 
	@Test
    public static void TestLaunch () {
        
    	
       // WebDriver driver = new FirefoxDriver();
        String baseUrl = "http://127.0.0.1:8081/JpetStore/";
        String expectedTitle = "Welcome to JPetStore 6";
        String actualTitle = "";
 
        
       wd.get(baseUrl);
 
        
        actualTitle = wd.getTitle();
 
        
        if (actualTitle.contentEquals(expectedTitle)){
            System.out.println("Test Passed!");
        } else {
            System.out.println("Test Failed");
        }
        
       
        wd.close();
        
        
       
    }
 
}