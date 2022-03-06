package newpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practiceform {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		//Set base url
		String baseUrl = "https://demoqa.com/automation-practice-form";
		driver.get(baseUrl);
		driver.manage().window().maximize();
		
		//Select checkbox and validate it is selected
		WebElement checkbox1 = driver.findElement(By.cssSelector("label[for='hobbies-checkbox-1'][class='custom-control-label']"));
		Boolean isSelected =checkbox1.isSelected();
		
		//Click if not selected
		if(isSelected == false) {
			checkbox1.click();
		}
		
		//Select checkbox and validate it is displayed
		WebElement checkbox2 = driver.findElement(By.cssSelector("label[for='hobbies-checkbox-2']"));
		Boolean isDisplayed =checkbox1.isDisplayed();
		
		//Click if not selected
		if(isDisplayed == true) {
			checkbox2.click();
		}
		
		//Select checkbox and validate it is enabled
				WebElement checkbox3 = driver.findElement(By.cssSelector("label[for='hobbies-checkbox-3']"));
				Boolean isEnabled =checkbox1.isEnabled();
				
				//Click if not selected
				if(isEnabled == true) {
					checkbox3.click();
				}		
		System.out.println("All 3 checkboxes done");
	}

}
