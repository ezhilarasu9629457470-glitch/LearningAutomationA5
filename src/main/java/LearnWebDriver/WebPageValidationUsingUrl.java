package LearnWebDriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebPageValidationUsingUrl {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.selenium.dev/");
		String expurl="https://www.selenium.com";
		String actUrl=driver.getCurrentUrl();
		System.out.println(actUrl);
		
		
		if(expurl.equals(actUrl))
		{
			System.out.println("pass "+actUrl);
		}
		else
		{
			System.out.println("fail "+actUrl);
		}
		driver.close();
	}

}
