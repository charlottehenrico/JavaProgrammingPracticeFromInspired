package newpackage;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WriteToFile {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
//		System.setProperty("webdriver.chrome.driver","C:\\Selenium\\chromedriver.exe");
//		WebDriver d = new ChromeDriver();
//		
//		String baseUrl = "https://monsterindia.com/seeker/registration";
		String Testfile = ("C:\\JavaProject\\Testfile.docx");
		File FC = new File(Testfile);//created object of java file class
		FC.createNewFile();//create new file
		
		//Writing into new file
		//Create object of Java Bufferedwriter and Filewriter class
		FileWriter FW = new FileWriter(Testfile);
		BufferedWriter BW = new BufferedWriter(FW);
		BW.write("This is the first line");
		BW.newLine();
		BW.write("This is a new second line");
		BW.write("This is the third line");
		BW.close();
		
		//Reading from file
		//create object of the Java file reader class
		FileReader FR = new FileReader (Testfile);
		BufferedReader BR = new BufferedReader (FR);
		String content = "";
		
		//Loop to read all lines from file line for line
		while((content = BR.readLine())!= null) {
			System.out.println(content);
		}
		
	}

}
