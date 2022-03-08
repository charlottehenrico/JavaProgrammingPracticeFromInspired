package newpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class iFrames {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://demo.guru99.com/test/guru99home/");
//		int totalbefore = driver.findElements(By.xpath("html/body/a/img")).size();
//		System.out.println("total images" +totalbefore);
//		driver.switchTo().frame("a077aa5e");//switching to the iframe by id
//		int total = driver.findElements(By.xpath("html/body/a/img")).size();
//		System.out.println("total images" +total);
		
		int sizeOfFrame = driver.findElements(By.tagName("iframe")).size(); //switch to iframe by size
		System.out.println(sizeOfFrame);
		
		for(int i = 0; i <= sizeOfFrame ;i++) {
			driver.switchTo().frame(i);
			System.out.println ("index id" + i);
			int total = driver.findElements(By.xpath("html/body/a/img")).size();
			System.out.println("total images" +total);
			driver.switchTo().defaultContent();
	
		}
		
		
	}

}
