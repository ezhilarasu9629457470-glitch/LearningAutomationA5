package LearningtakesScreenshot;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class getscreenshot2 {
	public static void main(String[] args) throws IOException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.saucedemo.com/");
		
		//step1: perform typecasting from webdriver type to takesscreenshot type
		TakesScreenshot ts=(TakesScreenshot)driver;
		//step2: take a screenshot by calling a getScreenshotAs method and pass the argument as outputtype.file by using ts reference variable
		//step3:store it in a temppath
		File Temppath=ts.getScreenshotAs(OutputType.FILE);
		//step4: create a permanent path to store the screenshot
		File permanentpath=new File("./src/test/resources/TestScreenshot2/screenshot.png");
		//step5: copy a screenshot from temppath to permanent path
		FileHandler.copy(Temppath, permanentpath);
		System.out.println("Screenshot taken Successfully");
		driver.close();
		
		
	}

}
