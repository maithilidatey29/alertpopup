package basePackage;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class negativeScenariohomepage {

	public static void main(String[] args) throws InterruptedException {
		
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
        js1.executeScript("window.scrollBy(0,1500)");
        Thread.sleep(2000);
         
       WebElement productclick = driver.findElement(By.xpath("//*[@id=\"Slide-template--15758545223912__featured_collection-1\"]/div/div/div[2]/div[1]/h3/a"));
       productclick.click();
       Thread.sleep(1000);
       
       JavascriptExecutor js2 = (JavascriptExecutor) driver;
       js2.executeScript("window.scrollBy(0,2000)");
       Thread.sleep(3000);
       
       try {
           WebElement similaritem = driver.findElement(By.xpath("//*[@id=\"shopify-block-7389788e-c9f6-452b-9066-63615a5402dd\"]/div/div/h2"));
           
           if (similaritem.isDisplayed()) {
               System.out.println("Similar item is available.");
           } else {
               System.out.println("Similar item is not available.");
           }
           
           } catch (org.openqa.selenium.NoSuchElementException e) {
               System.out.println("Similar item is not available.");
           } finally {
              
           
       }
       
       WebElement product = driver.findElement(By.xpath("//img[@data-handle='arandi']"));
       product.click();
       Thread.sleep(2000);
       
       JavascriptExecutor js3 = (JavascriptExecutor) driver;
       js3.executeScript("window.scrollBy(0,3500)");
       Thread.sleep(3000);
		
        try {
        	
        	WebElement recentlyvw = driver.findElement(By.xpath("//div[@data-recomm_type='recently_viewed']"));
        	
        	if(recentlyvw.isDisplayed()) {
        		System.out.println("Recently viewed is available");
        	} else {
        		System.out.println("Recently viewed is not available");}
        	} catch (org.openqa.selenium.NoSuchElementException e) {
                System.out.println("Similar item is not available.");
            } finally {
               
            
        }
        driver.close();
        	
        	
        }
	}

																																																			
