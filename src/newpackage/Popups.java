package newpackage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Popups {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		String baseUrl = "https://demo.guru99.com/test/delete_customer.php";
		driver.get(baseUrl);
		//Implicit wait
		//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		//Explicit wait
		//WebDriverWait wait = new WebDriverWait (driver,20);
		
		//WebElement wait = wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("cusid")));
		driver.findElement(By.name("cusid")).sendKeys("123123");
		driver.findElement(By.name("submit")).submit();
		
		//switch to the alert
		Alert alert = driver.switchTo().alert();
		String alertmessage = driver.switchTo().alert().getText();
		//Get message of the alert
		System.out.println(alertmessage);
		Thread.sleep(500);
		alert.accept();
		//alert.dismiss();
	}

}
