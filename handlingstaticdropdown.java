package basePackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class handlingstaticdropdown {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Maithili Datey\\OneDrive\\Desktop\\ecom\\Mystorev1\\Drivers\\chromedriver.exe");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");

        WebDriver driver = new ChromeDriver(options);
        driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
        driver.manage().window().maximize();
        Thread.sleep(2000);
        
        WebElement staticdropdown = driver.findElement(By.xpath("//select[@id='ctl00_mainContent_DropDownListCurrency']"));
        
        Select dropdown = new Select(staticdropdown);
        Thread.sleep(100);
        dropdown.selectByIndex(3);
        System.out.println(dropdown.getFirstSelectedOption().getText());
        
        dropdown.selectByVisibleText("AED");
        Thread.sleep(2000);
        System.out.println(dropdown.getFirstSelectedOption().getText());
        
        dropdown.selectByValue("INR");
        Thread.sleep(2000);
        System.out.println(dropdown.getFirstSelectedOption().getText());
        
        driver.close();
        
        
        


	}

}
