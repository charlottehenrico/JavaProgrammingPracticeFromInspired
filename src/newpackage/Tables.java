package newpackage;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tables {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//displayed in a structured form using rows and columns
		//<table> html tag
		//<th> table header tag
		//<tr> table row tag
		//<td> table data tag
		System.setProperty("webdriver.chrome.driver","C:\\Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		//Set base url
		String baseUrl = "https://demo.guru99.com/test/web-table-element.php";
		driver.get(baseUrl);
		driver.manage().window().maximize();

		//No of columns
		String col1 = driver.findElement(By.xpath(".//*[@id='leftcontainer']/table/thead/tr[1]/th[1]")).getText();
		System.out.println(col1);
		List<WebElement> col = driver.findElements(By.xpath(".//*[@id='leftcontainer']/table/thead/tr/th"));
				System.out.println("no of cols are :" + col.size());
		List<WebElement> rows = driver.findElements(By.xpath(".//*[@id='leftcontainer']/table/tbody/tr/td[1]"));
				System.out.println("no of rows are :" + rows.size());
				String col2 = driver.findElement(By.xpath(".//*[@id='leftcontainer']/table/tbody/tr[2]/td[4]")).getText();
		System.out.println(col2);
				driver.close();
	}

}
