package newpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class radioHomework {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		//Set base url
		String baseUrl = "https://demo.guru99.com/test/newtours/reservation.php";
		
		//select one way radio button
		WebElement radio1 = driver.findElement(By.cssSelector("input[type='radio'][value = 'oneway']"));
		radio1.click();
		
		//Select New York from the dropdown list
		Select select = new Select(driver.findElement(By.name("fromPort")));
		select.selectByVisibleText("New York");
		
		//Select First class radio button
		WebElement radio2 = driver.findElement(By.cssSelector("inputtype= 'radio'][ value = 'First']"));
		radio2.click();
		
		//Select continue
		driver.findElement(By.name("findFlights")).submit();
		System.out.println("After flight finder - No seats Available");
	}

}
