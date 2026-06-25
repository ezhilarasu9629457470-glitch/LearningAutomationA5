package LearnBasicslearnWebDriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class learnget {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.instagram.com/");
	    driver.close();
	    System.out.println("Execution is done by ezhilarasu");
	}

}
