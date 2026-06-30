package handlingNotificationPopup;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class LearningNotificationPopup {
	public static void main(String[] args) {
		ChromeOptions co_obj=new ChromeOptions();
		co_obj.addArguments("--disable-notification");
		WebDriver driver=new ChromeDriver(co_obj);
		driver.get("https://www.goibibo.com/");
	}

}
