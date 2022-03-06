package newpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		//Set base url
		String baseUrl = "https://demo.guru99.com/test/login.html";
		String expectedTitle = "Login Page";
		String actualTitle = "";
		String expectedSuccessMessage = "Successfully Logged in...";
		String actualMessage = "";
		
		//Get title of page and validate
		driver.get(baseUrl);
		actualTitle = driver.getTitle();
		if(actualTitle.contentEquals(expectedTitle)) {
			System.out.println("Got title");
		}else {
			System.out.println("Dod not get title");
		}
		
		//Get email, password and click sign in, validate successful login
		driver.findElement(By.id("email")).sendKeys("charlottehenrico@gmail.com");
		driver.findElement(By.cssSelector("input[name='passwd']")).sendKeys("Insp1red");
		driver.findElement(By.cssSelector("button[type='submit']")).click();	
		actualMessage = driver.findElement(By.cssSelector("h3")).getText();
		if(actualMessage.contentEquals(expectedSuccessMessage)) {
			System.out.println("Logged in");	
		} else {
			System.out.println("Not logged in");
		}
		
		driver.close();
				
}
}