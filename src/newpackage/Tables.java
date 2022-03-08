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
		
//		//Set base url
//		String baseUrl = "https://demo.guru99.com/test/web-table-element.php";
//		driver.get(baseUrl);
//		driver.manage().window().maximize();
//
//		//No of columns
//		String col1 = driver.findElement(By.xpath(".//*[@id='leftcontainer']/table/thead/tr[1]/th[1]")).getText();
//		System.out.println(col1);
//		List<WebElement> col = driver.findElements(By.xpath(".//*[@id='leftcontainer']/table/thead/tr/th"));
//				System.out.println("no of cols are :" + col.size());
//		List<WebElement> rows = driver.findElements(By.xpath(".//*[@id='leftcontainer']/table/tbody/tr/td[1]"));
//				System.out.println("no of rows are :" + rows.size());
//				String col2 = driver.findElement(By.xpath(".//*[@id='leftcontainer']/table/tbody/tr[2]/td[4]")).getText();
//		System.out.println(col2);
//				driver.close();
				
		String baseUrl = "https://demo.guru99.com/test/table.php";
		driver.get(baseUrl);
		
		WebElement mytable = driver.findElement(By.xpath("/html/body/table/tbody"));
		List <WebElement> rows_table = mytable.findElements(By.tagName("tr"));
		//to calculate the number of rows in a table
		int row_count = rows_table.size();
		//Loop will execute till last
		for (int row = 0;row < row_count; row++) {
			List <WebElement> columns_row = rows_table.get(row).findElements(By.tagName("td"));
			//To calculate no of columns in specific row
			int columns_count = columns_row.size();
			System.out.println("Number of columns in row" + row + " are" + columns_count);
			//Loop will execute till the last cell of that specific row
			for (int column = 0; column < columns_count; column++) {
				//to retrieve the text from that specific cell
				String cell_text = columns_row.get(column).getText();
				System.out.println("Cell value of row number" + row + "and column num" + column + "is" + cell_text);
			}
		}
	}

}
