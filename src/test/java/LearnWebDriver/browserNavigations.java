package LearnWebDriver;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class browserNavigations {

	public static void main(String[] args) throws MalformedURLException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://www.meesho.com/");
		driver.switchTo().newWindow(WindowType.TAB);
		
		driver.navigate().to(new URL("https://online.kfc.co.in/"));
		System.out.println("program run sucessfull");
		driver.navigate().forward();
		driver.navigate().back();
		driver.navigate().refresh();
	}

}
