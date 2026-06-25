package LearningWebElement;
 
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearningFetchValues {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.saucedemo.com/");
		
		WebElement logo=driver.findElement(By.xpath("//div[contains(text(),'Labs')]"));
		
		String actualtextvalue=logo.getText();
		System.out.println(actualtextvalue);
		String expectedTextvalue="Swag Labs";
		if(actualtextvalue.equals(expectedTextvalue))
		{
			System.out.println("expected Textvalue and actual Textvalue is same");
		}
		else
		{
			System.out.println("expected Textvalue and actual Textvalue is not same");
		}
		
		
		String actualtagname=logo.getTagName();
		System.out.println(actualtagname);
		String expectedtagname="div";
		if(actualtagname.equals(expectedtagname))
		{
			System.out.println("expected tagname and actual tagname is same");
		}
		else
		{
			System.out.println("expected tagname and actual tagname is not same");
		}
		
		
		String actualAttributes=logo.getAttribute("class");
		System.out.println(actualAttributes);
		String expectedAttributes="login_logo";
		if(actualAttributes.equals(expectedAttributes))
		{
			System.out.println("actualAttributes and expectedAttributes is not same");
		}
		else
		{
			System.out.println("actualAttributes and expectedAttributes is not same");
		}
		
		
		String actualcssproperty1=logo.getCssValue("padding");
		System.out.println(actualcssproperty1);
		String expectedcssproperty1="24px";
		if(actualcssproperty1.equals(expectedcssproperty1))
		{
			System.out.println("actualcssproperty1 and expectedcssproperty1 is same");
		}
		else
		{
			System.out.println("actualcssproperty1 and expectedcssproperty1 is same");
		}
		
		Dimension actualsize=logo.getSize();
		int actualwidth=actualsize.getWidth();
		int actualheightIs=actualsize.getHeight();
		System.out.println(actualsize);
		System.out.println(actualwidth);
		System.out.println(actualheightIs);
		int expectedwidth=1351;
		int expectedheight=108;
		if(expectedheight==actualheightIs && expectedwidth==actualwidth)
		{
			System.out.println("element size is verified - pass");
		}
		else
		{
			System.out.println("element size is verified - fail");
		}
		
		Point location=logo.getLocation();
		int actuallocX=location.getX();
		int actuallocY=location.getY();
		System.out.println(location);
		System.out.println(actuallocX);
		System.out.println(actuallocY);
		int expectedlocX=0;
		int expectedlocY=0;
		
		if(actuallocX==actuallocY && expectedlocX==expectedlocY)
		{
			System.out.println("element location is verified - pass");
		}
		else
		{
			System.out.println("element location  is verified - fail");
		}
		
		
		
		driver.close();
		
	}

}
 