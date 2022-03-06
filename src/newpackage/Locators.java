package newpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		//String baseUrl = "http://demoqa.com/";
		String practiceUrl = "https://demoqa.com/automation-practice-form";
		driver.get(practiceUrl);
		String guruUrl = "https://demo.guru99.com/test/newtours/";
		
		//play
		WebElement firstName = driver.findElement(By.id("firstName"));
		firstName.sendKeys("Johnny");
		boolean isDisplayedStatusFirstName = firstName.isDisplayed();
		boolean isEnabledStatusFirstName = firstName.isEnabled();
		System.out.println(isDisplayedStatusFirstName + " " + isEnabledStatusFirstName);
		driver.findElement(By.id("firstName")).clear();
		driver.findElement(By.id("lastName"));
		//System.out.println("Found first name");
		WebElement genderRadio = driver.findElement(By.name("gender"));
		genderRadio.click();
		boolean isSelectedStatusGenderRadio = genderRadio.isSelected();
		System.out.println(isSelectedStatusGenderRadio);
		driver.findElement(By.className("practice-form-wrapper"));
		driver.findElement(By.className("left-pannel"));
		//driver.findElement(By.tagName("Name"));
		driver.findElement(By.cssSelector("input[id='firstName'][type='text']"));
		driver.findElement(By.cssSelector("input[id='userEmail'][type='text']"));
		driver.findElement(By.xpath("//input[@id='firstName']"));
		driver.findElement(By.xpath("//input[@id='userEmail']"));
		driver.findElement(By.cssSelector("input[type= 'radio'][value='business']")).click();
		System.out.println("demoqa elements all found");
		
		//Different url
		driver.get(guruUrl);
		driver.findElement(By.name("userName"));
		driver.findElement(By.linkText("SUPPORT"));
		driver.findElement(By.linkText("SIGN-ON"));
		driver.findElement(By.partialLinkText("SU"));
		System.out.println("guru elements all found");
		
		
		driver.close();

	}

}
