
package AmazonProductAddToCart;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;


public class LoginAmazonFlowOne {

public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\sumit.kumar\\\\Downloads\\\\selenium\\\\chromedriver_win32\\\\chromedriver_win32\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		driver.get("https://www.amazon.com/sign-in");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//input[@id='ap_email']")).sendKeys("tyagi.prince45@gmail.com");
		driver.findElement(By.xpath("//*[@id='continue']")).click();
		
		driver.findElement(By.xpath("//input[@id='ap_password']")).sendKeys("tyagi.prince45");
		driver.findElement(By.id("signInSubmit")).click();
	
				
		driver.findElement(By.xpath("//*[@id='twotabsearchtextbox']")).sendKeys("addidas shoes", Keys.ENTER);
		driver.findElement(By.xpath("//div[contains(@class,'a-spacing-medium') and descendant::span[@class=\"a-price-whole\" and text()='68']]/descendant::a[./span[text()=\"adidas Originals Men's X_PLR Running Shoe\"]]")).click();
		
		
		
		String ExpectedPageTitle = "Amazon.com | adidas Originals Men's X_PLR Running Shoe | Fashion Sneakers";
		
		String PageTitle = driver.getTitle();
		
		int TitleLength = PageTitle.length();
		
		System.out.println("Title of the page is : " + PageTitle); 
		 System.out.println("Length of the title is : "+ TitleLength);
		 
		//Assert.assertEquals(PageTitle, ExpectedPageTitle);
		 
		 if (PageTitle.equals(ExpectedPageTitle)){ 
			 System.out.println("Verification Successful - The correct Title is opened.");
			 }
			 else {
			 System.out.println("Verification Failed - An incorrect Title is opened."); 
			 System.out.println("Actual URL is : " + PageTitle); 
			 System.out.println("Expected URL is : " + ExpectedPageTitle);
			 }
		 
		 driver.findElement(By.xpath("//span[@id='dropdown_selected_size_name']/descendant::span[@class= 'a-dropdown-prompt' and normalize-space(text())='Select']")).click();
		 driver.findElement(By.xpath("//a[@class='a-dropdown-link' and text()='9']")).click();
		 
		 Thread.sleep(4000);		 
		 driver.findElement(By.xpath("//input[@id='add-to-cart-button' and @type='submit']")).click();
		 driver.findElement(By.xpath("//a[@id='nav-link-accountList']/descendant::span[@class='nav-line-2 ' and text()='Account & Lists']")).click();
		 driver.findElement(By.xpath("//a//span[text()='Sign Out']")).click();
		 System.out.println("Operation successfull");
		
		 driver.close();
		
		
	}

}
