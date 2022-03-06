package newpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButton {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		//Set base url
		String baseUrl = "https://demo.guru99.com/test/radio.html";
		
		//Get radio buttons
		WebElement radio1 = driver.findElement(By.id("vfb-7-1"));
		WebElement radio2 = driver.findElement(By.id("vfb-7-2"));
		
		//Select radio
		radio1.click();
		System.out.println("Radio button 1 selected");
		
		radio2.click();
		System.out.println("Radio button 2 selected");
		
		//Toggle
		radio1.click();
		System.out.println("Radio button 1 selected");
		
		//Get checkboxes and click
		WebElement option1 = driver.findElement(By.id("vfb-6-0"));
		option1.click();
		
		//Check if checkbox is selected
		if(option1.isSelected()) {
			System.out.println("Option 1 is selected");
		}else {
			System.out.println("Option 1 is not selected");
		}
		
		driver.close();
		
	}

}
