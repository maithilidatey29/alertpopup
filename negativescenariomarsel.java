
package basePackage;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;

import com.google.common.io.Files;

public class negativescenario {

    public static void main(String[] args) throws InterruptedException, IOException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Maithili Datey\\OneDrive\\Desktop\\ecom\\Mystorev1\\Drivers\\chromedriver.exe");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");

        WebDriver driver = new ChromeDriver(options);
        driver.get("https://new-online-2-0.myshopify.com/products/wide-leg-trousers");
        driver.manage().window().maximize();
        Thread.sleep(2000);
        
      

        WebElement password = driver.findElement(By.xpath("//input[@type='password']"));
        password.sendKeys("coderapper@123");
        Thread.sleep(2500);

        WebElement homepage = driver.findElement(By.xpath("//button[@type='submit']"));
        homepage.click();
        Thread.sleep(2000);
        

        JavascriptExecutor js1 = (JavascriptExecutor) driver;
        js1.executeScript("window.scrollBy(0,1000)");
        Thread.sleep(2000);

        WebElement productclick = driver.findElement(By.xpath("//*[@id=\"Slide-template--15758545223912__featured_collection-3\"]/div/div/div[2]/div[1]/h3/a"));
        productclick.click();
        Thread.sleep(2500);

        JavascriptExecutor js2 = (JavascriptExecutor) driver;
        js2.executeScript("window.scrollBy(0,1000)");
        Thread.sleep(3000);

        try {
        WebElement fbt = driver.findElement(By.xpath("//div[@data-recomm_type='frequently_bought']"));
        
        if (fbt.isDisplayed()) {
            System.out.println("FBT is available.");
        } else {
            System.out.println("FBT is not available.");
        }
        
        } catch (org.openqa.selenium.NoSuchElementException e) {
            System.out.println("FBT is not available.");
        } finally {
           
        
    }

        try{
        	WebElement abt = driver.findElement(By.xpath("//div[@data-recomm_type='also_bought']"));
        	
        	if(abt.isDisplayed()) {
        		System.out.println("ABT is available");
        		
        	} else {
        		System.out.println("ABT is not available");
        	}
        } catch (org.openqa.selenium.NoSuchElementException e) {
        	System.out.println("ABT is not available");
        	
        } finally {
        	  File	source	=	((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
              Files.copy(source, new File("C:\\Users\\Maithili Datey\\Downloads\\download eclipse.jpg"));      
              
        	driver.quit();
        }
        
        
        
    }
}

