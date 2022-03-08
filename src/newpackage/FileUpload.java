package newpackage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUpload {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Selenium\\chromedriver.exe");
		WebDriver d = new ChromeDriver();
		
		String baseUrl = "https://monsterindia.com/seeker/registration";
		
		d.manage().window().maximize();
		d.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		d.get(baseUrl);
		d.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Thread.sleep(1000);
		
		//File upload using send keys
		WebElement browse =d.findElement(By.xpath("//input[@id='file-upload']"));
		//Select file to upload
		browse.sendKeys("C:\\JavaProject\\Notes.docx");
		System.out.println("File was uploaded successfully");
		
		//To scroll up and down
		//JavascriptExecutor js = (JavascriptExecutor)d;
		//js.executeScript("window.scrollBy(0,380)");
		Thread.sleep(1000);

	}

}
