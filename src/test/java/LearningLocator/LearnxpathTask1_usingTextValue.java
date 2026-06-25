package LearningLocator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class LearnxpathTask1_usingTextValue {
	public static void main(String[] args) {
		// step 1 : open the browser
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		// step 2 : navigate to the url 
		driver.get("https://www.saucedemo.com/");
		
		// step 3 : using locator xpath "using attribute-complete value"- find username text field
		WebElement username=driver.findElement(By.xpath("//input[@id='user-name']"));
		
		// step 4 : using locator xpath "using attribute-partial value"- find password text field
		WebElement password=driver.findElement(By.xpath("//input[contains(@id,'pass')]"));
		
		// step 5 : via xpath "using attribute-complete value"- find login button
		WebElement login=driver.findElement(By.xpath("//input[@class=\'submit-button btn_action\']"));
		
		//step 6 : via xpath "using textValue"- find or locate logoname
		WebElement logoname=driver.findElement(By.xpath("//div[text()='Swag Labs']"));
		
		//step 7 : pass the valid username and password 
		username.sendKeys("standard_user");
		password.sendKeys("secret_sauce");
		
		//step 8 : using getTextMethod get the name of a logo
		String text=logoname.getText();
		System.out.println("logo name is"+text);
		
		//step 9 : click on to the login button to enter 
		login.click();
		
		//step 10 : via xpath "using textValue"- find or locate product name and price
		WebElement firstproductName=driver.findElement(By.xpath("//div[contains(text(),'Back')]"));
		
		WebElement firstproductPrice=driver.findElement(By.xpath("//div[text()='29.99']"));
		
		//step 11 : using getTextMethod get the name of a product name and price
		System.out.println("product name is"+firstproductName.getText());
		System.out.println("price is "+firstproductPrice.getText());
		driver.close();

	}

}
