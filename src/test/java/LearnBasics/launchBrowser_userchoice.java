package LearnBasics;
import java.util.Scanner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
public class launchBrowser_userchoice
{
	public static void main(String[] args) throws Exception
	{
	    Scanner sc = new Scanner(System.in);

	    System.out.println("Select Browser:");
	    System.out.println("1 - Chrome");
	    System.out.println("2 - Firefox");
	    System.out.println("3 - Edge");
	    System.out.print("Enter your choice: ");

	    int choice = sc.nextInt();
	    WebDriver driver = null;

	    switch (choice) 
	    {

	        case 1:
	            driver = new ChromeDriver();
	            System.out.println("Chrome launched.");
	            break;

	        case 2:
	            driver = new FirefoxDriver();
	            System.out.println("Firefox launched.");
	            break;

	        case 3:
	            driver = new EdgeDriver();
	            System.out.println("Edge launched.");
	            break;
	        default:
	            System.out.println("Invalid choice! Enter 1, 2, or 3.");
	            break;
	    }
	    driver.close();
	}
	
}