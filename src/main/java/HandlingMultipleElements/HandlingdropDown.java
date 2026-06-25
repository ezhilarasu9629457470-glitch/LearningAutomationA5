package HandlingMultipleElements;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HandlingdropDown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver(); 
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20l));
		
		driver.get("https://www.amazon.in/");
		
		WebElement dropdown =driver.findElement(By.cssSelector("select[id='searchDropdownBox']"));
		// to create a object for Select class
		
		Select selectElement=new Select(dropdown);
		
		//for validation By using isMultiple()
		if(selectElement.isMultiple())
		{
			System.out.println("element is multiple select dropdown");
		}
		else
		{
			System.out.println("element is single select dropdown");

		}
		
	
		
		//for selection by using index
		System.out.println("-------------------------------------------");
		selectElement.selectByIndex(3);
		//System.out.println("element identified by using indexing is "+selectElement.getFirstSelectedOption().getText());
		

		//selection by using values
		System.out.println("-------------------------------------------");
		selectElement.selectByValue("search-alias=office-products");
		//System.out.println("element identified by using value is "+selectElement.getFirstSelectedOption().getText());
		
		// to find out the count of elements present in drop down box
		List<WebElement> countofAll=selectElement.getOptions();
		System.out.println("count is "+countofAll.size());
		
		
		//print all the values in the drop down box
		List<WebElement> allvalues=selectElement.getOptions();
		
		System.out.println("---------------------------------------");
		for(int i=0;i<allvalues.size();i++)
		{
			System.out.println(allvalues.get(i).getText());
		}
		
		//close the window
		driver.close();

	}

}
