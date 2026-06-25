package HandlingMultipleElements;

import java.time.Duration;
import java.util.List;
import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingWebTable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the index number to find");
		int nth=sc.nextInt();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20l));
		driver.get("https://vinothqaacademy.com/webtable/");
		//to get the 3rd employee name
		WebElement findname=driver.findElement(By.xpath("//table[@id='myTable']//tr[3]/td[2]"));
		System.out.println(findname.getText()); 
		
		//to get all the emp name
		
		List<WebElement> allEmployeeNames=driver.findElements(By.xpath("//table[@id='myTable']//tr/td[2]"));
		System.out.println("---------------employee names are----------------");
		for(int i=0;i<allEmployeeNames.size();i++)
		{
			System.out.println(allEmployeeNames.get(i).getText());
		}
		//vinoth details
		List<WebElement> employeVinothDetails=driver.findElements(By.xpath("//table[@id='myTable']//tr[3]/td"));
		System.out.println("---------------deatils of vinoth-------------------");
		for(int i=0;i<employeVinothDetails.size();i++)
		{
			
			System.out.println(employeVinothDetails.get(i).getText());
		}
		
		// nth employee details
		
		WebElement nthname=driver.findElement(By.xpath("//table[@id='myTable']//tr["+nth+"]/td[2]"));
		System.out.println("------------------------");
		System.out.println(nthname.getText());
		driver.quit();

	}

}
