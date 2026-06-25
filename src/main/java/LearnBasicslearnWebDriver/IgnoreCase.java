package LearnBasicslearnWebDriver;

import java.util.Scanner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class IgnoreCase {

	public static void main(String[] args) throws InterruptedException {
		// take input from user as chrome
		Scanner sc=new Scanner(System.in);
		System.out.println("enter input ");
		String input=sc.next();
		
		if(input.equalsIgnoreCase("chrome"))
		{
			WebDriver driver=new ChromeDriver();
			driver.close();
			System.out.println("Chrome launched");
		}
		else 
		{
			WebDriver driver =new FirefoxDriver();
			driver.close();
			System.out.println("spelling mismatch");
		}

	}

}
