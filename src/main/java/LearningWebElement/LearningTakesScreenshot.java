package LearningWebElement;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class LearningTakesScreenshot {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.saucedemo.com/");
		
		SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd-hh-mm-ss");
		String timestamp=sdf.format(new Date());
		
		TakesScreenshot ts=(TakesScreenshot)driver;
		File temppath=ts.getScreenshotAs(OutputType.FILE);
		File permanentpath=new File("./src/test/resources/TestScreenshot5/screenshot"+timestamp+".png");
		FileHandler.copy(temppath, permanentpath);
		System.out.println("Screenshot using timestamp has done successfully");
		driver.close();
		
	}

}
