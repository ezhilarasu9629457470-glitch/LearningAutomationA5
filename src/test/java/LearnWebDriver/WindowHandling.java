package LearnWebDriver;

import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//step1: open chrome browser and maximize the window
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		//step2: pass the url
		driver.get("https://www.youtube.com/");
		
		//step3: use getwindowhandle to get the parent adress or current address

		String parent_address=driver.getWindowHandle();
		System.out.println(parent_address);
		
		//step4: refresh or reload to check whether it gives same address without switching
		driver.navigate().refresh();
		
		//driver.switchTo().newWindow(WindowType.TAB);
		
		System.out.println(driver.getWindowHandle());
		
		//step5: use switchTo to move on to the next window or Tab
		driver.switchTo().newWindow(WindowType.WINDOW);
		
		//step6: use new url for new window check with getwindowhandle
		driver.navigate().to("https://www.selenium.dev/");
		System.out.println(driver.getWindowHandle());
		//check with getwindowhandles to get all adresss in set
		Set<String> alladress=driver.getWindowHandles();
		System.out.println(alladress);
		driver.quit();
	}

}

