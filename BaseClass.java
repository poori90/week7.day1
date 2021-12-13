package base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;

import io.github.bonigarcia.wdm.WebDriverManager;
import utils.ReadExcel;

public class BaseClass {

	public ChromeDriver driver;
	public String excelFileName;
	//public static Properties prop;
	
	@DataProvider(indices=0)
	public String[][] sendData() throws IOException {
		String[][] readData =ReadExcel.readData(excelFileName);
	return readData;	
	
}
	
	@BeforeMethod
	public void preCondition() throws IOException {
		/*
		 * FileInputStream fis = new
		 * FileInputStream("./src/main/resources/french.properties"); prop=new
		 * Properties(); prop.load(fis);
		 */
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("http://leaftaps.com/opentaps");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

	}
	@AfterMethod
	public void postCondition() {
		driver.close();

	}
}
