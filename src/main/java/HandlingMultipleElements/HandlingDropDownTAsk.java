package HandlingMultipleElements;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HandlingDropDownTAsk {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20l));
		
		driver.get("file:///C:/Users/HP/Downloads/EmbededWebpage.html");
		
		
		WebElement dropdown1=driver.findElement(By.xpath("//select[@name='country1']"));
		//select dropdown table single select Drop down
		Select select1=new Select(dropdown1);
		
		//using ismultiple() validate select1 ref variable
		if(select1.isMultiple())
		{
			System.out.println("dropdown box is multiple select dropdown");
		}
		else
		{
			System.out.println("dropdown box is single select dropdown");
		}
		
		//select all values1 by using getoptions fetching value
		
		System.out.println("------------------------elements in 1st dropdown box is----------------------");
		List<WebElement> allvalues1=select1.getOptions();
		for(int i=0;i<allvalues1.size();i++)
		{
			System.out.println(allvalues1.get(i).getText());
		}
		
		//multiple dropdown box
		
		WebElement dropdown2=driver.findElement(By.xpath("//select[@name='country2']"));
		
		Select select2=new Select(dropdown2);
		//using ismultiple validation validate select2 ref variable
		if(select2.isMultiple())
		{
			System.out.println("dropdown box is multiple select dropdown");
		}
		else
		{
			System.out.println("dropdown box is single select dropdown");
		}
		
		//getoptions - fetching value
		List<WebElement> allvalues2=select2.getOptions();
		System.out.println("-----------------dropdown 2 elements are-------------------------");
		for(int i=0;i<allvalues2.size();i++)
		{ 
			System.out.println(allvalues2.get(i).getText());
		}
		
		//select byvalue, byindex(),byvisibletext(),bycontainsvisibletext()
	
		select2.selectByIndex(0);
		select2.selectByValue("usa");
		select2.selectByVisibleText("AUSTRALIA");
		select2.selectByContainsVisibleText("CANA");
		
		//getFirstSelectedOption() - fetching values
		
		System.out.println("-------------firstSelectedOption element is----------------------");
		WebElement firstelementIs=select2.getFirstSelectedOption();
		System.out.println(firstelementIs.getText());
		//getAllSelectedOptions() - fetching values
		
		System.out.println("-----------using getAllSelectedOptions-------------------");
		List<WebElement> allElelementIs=select2.getAllSelectedOptions();
		for(int i=0;i<allElelementIs.size();i++)
		{
			System.out.println(allElelementIs.get(i).getText());
		}
		//getwrappedElements - ffetching values
		WebElement AllwrappedElements = select2.getWrappedElement();
		System.out.println("-------------USING WRAPPED ELEMENTS--------------------");
		System.out.println(AllwrappedElements.getText());
		
		
		 
	//deselect byvalue, deselect byindex(), deselect byvisibletext(), deselect bycontainsvisibletext()
		
		
		select2.deselectByIndex(0);
		select2.deselectByValue("usa");
		select2.deselectByVisibleText("AUSTRALIA");
		select2.deSelectByContainsVisibleText("CAN");
		
	//select byvalue, byindex(),byvisibletext(),bycontainsvisibletext()
		
		select2.selectByIndex(2);
		select2.selectByValue("usa");
		select2.selectByVisibleText("AUSTRALIA");
		select2.selectByContainsVisibleText("CANA");
		
	// deselect all
		select2.deselectAll();
		System.out.println("all elements deselction has done successfully");
		
		
		driver.close();

	}

}
