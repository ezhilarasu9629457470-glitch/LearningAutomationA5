package LearningtakesScreenshot;

import java.io.File;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class WebPageScreenshot {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		 WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.saucedemo.com/");
		
		TakesScreenshot ts=(TakesScreenshot)driver;
		
		File temppath=ts.getScreenshotAs(OutputType.FILE);
		
		File permanentPath =new File("./src/test/resources/TestScreenshot/screenshot.png");
		
		FileHandler.copy(temppath, permanentPath);
		
		System.out.println("screenshot task done sucessfully");
		driver.close();

	}

}
