package LearnWebDriver;


import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class browserWindowManagement {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
	
		driver.manage().window().maximize();
		
		//driver.manage().window().minimize();
	
		driver.manage().window().fullscreen();
		
		Dimension size=driver.manage().window().getSize();
		System.out.println(size);
		Point position=driver.manage().window().getPosition();
		System.out.println(position);
		
		
		driver.manage().window().setSize(new Dimension(1000,50));
		//Thread.sleep(6000);
		driver.manage().window().setPosition(new Point(90,90));
		//Thread.sleep(6000);
		
		driver.quit();

	}

}
