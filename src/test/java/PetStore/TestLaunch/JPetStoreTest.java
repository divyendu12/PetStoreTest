package PetStore.TestLaunch;


import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;




public class JPetStoreTest {
 
	@Test
    public static void TestLaunch () {
        
    	
        WebDriver driver = new FirefoxDriver();
        String baseUrl = "http://127.0.0.1:8081/JpetStore/";
        String expectedTitle = "Welcome to JPetStore 6";
        String actualTitle = "";
 
        
        driver.get(baseUrl);
 
        
        actualTitle = driver.getTitle();
 
        
        if (actualTitle.contentEquals(expectedTitle)){
            System.out.println("Test Passed!");
        } else {
            System.out.println("Test Failed");
        }
        
       
        driver.close();
        
        
       
    }
 
}
