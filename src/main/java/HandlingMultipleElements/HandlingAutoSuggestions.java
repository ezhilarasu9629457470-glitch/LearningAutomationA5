package HandlingMultipleElements;


import java.time.Duration;
import java.util.List;
import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingAutoSuggestions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String searchdata=sc.next();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofMinutes(20l));
		driver.get("https://www.amazon.in/");
		
		WebElement searchbox=driver.findElement(By.id("twotabsearchtextbox"));
		
		
		
		searchbox.sendKeys(searchdata);
		
		
		 List<WebElement> allsuggestions=driver.findElements(By.xpath("//div[text()='"+searchdata+"']"));
		 
		 for(int i=0;i<allsuggestions.size();i++)
		 {
			 System.out.println(allsuggestions.get(i).getText());
		 }
		
		driver.quit();

	}

}
