package LearningLocator;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnDemoWebShop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		
		WebElement registerbtn=driver.findElement(By.xpath("//a[contains(text(),'Register')]"));
		registerbtn.click();
		
		WebElement genderradiobtn=driver.findElement(By.xpath("//input[@id='gender-male']"));
		genderradiobtn.click();
		//using and operator
		WebElement firstname=driver.findElement(By.xpath("//input[@name='FirstName' and @data-val='text']"));
		firstname.sendKeys("Ezhil");
		WebElement lastname=driver.findElement(By.xpath("//input[@id='LastName']"));
		lastname.sendKeys("arasu");
		WebElement email=driver.findElement(By.xpath("//input[@id='Email']23"));
		email.sendKeys("ezhilarasu@gmail.com");
		WebElement password=driver.findElement(By.xpath("//input[@id='Password']"));
		password.sendKeys("Ezhil@@@123");
		WebElement confirmpassword=driver.findElement(By.xpath("//input[@id='ConfirmPassword']"));
		confirmpassword.sendKeys("Ezhil@@@123");
		WebElement register=driver.findElement(By.xpath("//input[@id='register-button']"));
		register.click();
		
		
		
		
		
		System.out.println("registration done sucesfully");
		
		
		
		
		driver.close();
	}

}
