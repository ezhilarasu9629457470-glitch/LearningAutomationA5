package LearnWebDriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwitchingMechanism {

	public static void main(String[] args) {
		// TODO Auto-generated method
		//step 1 : open chrome browser
		WebDriver driver =new ChromeDriver();
		//step 2: pass the url
		driver.get("https://mail.google.com/");
		driver.manage().window().maximize();
		//step 3: use switchTO abstact method to go new tab
		driver.switchTo().newWindow(WindowType.TAB);
		driver.get("https://www.selenium.dev/");
		//step 3: use switchTO abstact method to go new Window
		driver.switchTo().newWindow(WindowType.WINDOW);
		driver.get("https://www.youtube.com/");
		//step 4:close the window
		driver.close();
	}

}
