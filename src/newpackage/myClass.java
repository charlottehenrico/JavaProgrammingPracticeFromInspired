package newpackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class myClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Declaration and instantiation of objects and variables
		System.setProperty("webdriver.chrome.driver","C:\\Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		String baseUrl = "https://demo.guru99.com/test/newtours/";
		String expectedTitle = "Welcome: Mercury Tours";
		String actualTitle = "";
		
		//Launch chrome and direct to base url
		driver.get(baseUrl);
		
		//get actual value of title
		actualTitle = driver.getTitle();
		
		//Compare actual title of page with expected one and print result as Passed or Failed
		if(actualTitle.contentEquals(expectedTitle)) {
			System.out.println("Test Passed");
		}else {
			System.out.println("Test Failed");
		}
		
		//close
		driver.close();
	
	}

}
