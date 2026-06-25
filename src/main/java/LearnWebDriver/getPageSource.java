package LearnWebDriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class getPageSource {
	public static void main(String[] args) {
		// open the chromebrowser
		
		WebDriver driver=new ChromeDriver();
		//maximixe the browser window
		
		driver.manage().window().maximize();
		
		// pass the string url 
		driver.get("https://www.selenium.dev/");
		
		//fetch source code and print
		System.out.println(driver.getPageSource());
		driver.close();
	}

}
