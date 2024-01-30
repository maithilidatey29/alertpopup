package basePackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class handlingcheckbox {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

			
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\Maithili Datey\\OneDrive\\Desktop\\ecom\\Mystorev1\\Drivers\\chromedriver.exe");
	        ChromeOptions options = new ChromeOptions();
	        options.addArguments("--remote-allow-origins=*");

	        WebDriver driver = new ChromeDriver(options);
	        driver.get("https://www.spicejet.com/");
	        driver.manage().window().maximize();
	        Thread.sleep(2000);
	        
	   System.out.println(driver.findElement(By.xpath("//*[@id=\"main-container\"]/div/div[1]/div[3]/div[2]/div[6]/div/div[2]/div[2]/div/div[2]/div/div/div[2]/div")).isSelected());
	   WebElement seniorcitizen = driver.findElement(By.xpath("//*[@id=\"main-container\"]/div/div[1]/div[3]/div[2]/div[6]/div/div[2]/div[2]/div/div[2]/div/div/div[2]/div"));
	   seniorcitizen.click();
	   Thread.sleep(1000);
	   System.out.println(driver.findElement(By.xpath("//*[@id=\"main-container\"]/div/div[1]/div[3]/div[2]/div[6]/div/div[2]/div[2]/div/div[2]/div/div/div[2]/div")).isSelected());
	   
	   System.out.println(driver.findElements(By.xpath("//div[@class='css-76zvg2 r-cqee49 r-1enofrn r-1ozqkpa']")).size());
	   
	   driver.close();
	   
	   
	        

	}

}
