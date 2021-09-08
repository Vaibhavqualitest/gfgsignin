import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Logintest {

	public static void main(String[] args) {
		//1. Define the web driver
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\vaibhav.bajpai\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        
        driver.manage().window().maximize();
		
		//2. Open web browser and navigate to page
		driver.get("https://www.geeksforgeeks.org/");
		
		//Find Elements: Locate the element, Determine the action, Pass the parameter
		
		driver.findElement(By.xpath("//*[@id=\"userProfileId\"]/a")).click();
		
		//3. Enter Email address
		driver.findElement(By.id("luser")).sendKeys("vaibhavbajpai07059@gmail.com");
		
		//4. Enter Password
		driver.findElement(By.name("pass")).sendKeys("Vaibhav@888");
		
		//5. Click login
		driver.findElement(By.xpath("//*[@id=\"Login\"]/button")).click();
		
		//6. Get Confirmation
		/*
		String message = driver.findElement(By.id("conf_message")).getText();
		System.out.println("Confirmation: "+ message);
		
		String pageTitle = driver.getTitle();
		System.out.println(pageTitle);
		*/
		
		//7. Close the browser
//		driver.close();
		
	}

}
