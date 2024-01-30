package basePackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class handlingalertpopup {

	public static void main(String[] args) throws InterruptedException {
		
		String text = "Maithili datey";
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Maithili Datey\\OneDrive\\Desktop\\ecom\\Mystorev1\\Drivers\\chromedriver.exe");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");

        WebDriver driver = new ChromeDriver(options);
        driver.get("https://rahulshettyacademy.com/AutomationPractice/");
        driver.manage().window().maximize();
        Thread.sleep(2000);
        
        WebElement name = driver.findElement(By.id("name"));
        name.sendKeys(text);
        Thread.sleep(1500);
        
        WebElement alertbtn = driver.findElement(By.id("alertbtn"));
        alertbtn.click();
        Thread.sleep(1000);
        
        System.out.println(driver.switchTo().alert().getText());
        driver.switchTo().alert().accept();
        Thread.sleep(2000);
        
        WebElement confirmbtn = driver.findElement(By.id("confirmbtn"));
        confirmbtn.click();
        Thread.sleep(2000);
        
        System.out.println(driver.switchTo().alert().getText());
        driver.switchTo().alert().dismiss();
        Thread.sleep(2000);
        
        driver.close();
        
        
        
        
        
        
        
	}

}
