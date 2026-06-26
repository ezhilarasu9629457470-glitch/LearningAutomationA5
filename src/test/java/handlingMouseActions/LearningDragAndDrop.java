package handlingMouseActions;


import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.WheelInput.ScrollOrigin;

public class LearningDragAndDrop {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20l));
		
		driver.get("https://vinothqaacademy.com/mouse-event/");
		Actions actions=new Actions(driver);
		//WebElement dragElement=driver.findElement(By.id("dragItem"));
		//WebElement dropElement=driver.findElement(By.id("dropZone"));
		Thread.sleep(2000);
		actions.dragAndDrop(driver.findElement(By.id("dragItem")), driver.findElement(By.id("dropZone"))).perform();
		System.out.println("drag and drop has done succesfully");
		//refresh and clickAndhold the release 
		driver.navigate().refresh();
		Thread.sleep(2000);
		actions.clickAndHold(driver.findElement(By.id("dragItem"))).release(driver.findElement(By.id("dropZone"))).perform();
		System.out.println("click hold and release has done succesfully");
		
		//using doubleclick()
		Thread.sleep(2000);
		actions.doubleClick(driver.findElement(By.id("doubleBtn"))).perform();
		System.out.println("double click has done succesfully");	
		//right click
		Thread.sleep(1000);
		actions.contextClick(driver.findElement(By.id("rightBtn"))).perform();
		System.out.println("contextClick has done succesfully");
		//hover-move to element
		Thread.sleep(1000);
		actions.moveToElement(driver.findElement(By.id("tooltipTarget"))).perform();
		System.out.println("hover - movetoelement has done succesfully");
		
		//slider-DragAndDropBy
		Thread.sleep(2000);
		actions.dragAndDropBy(driver.findElement(By.id("handle_max")), 200, 0).perform();
		System.out.println("slider-DragAndDropBy has done succesfully");
		
		//Scrolling Operations
		
		//scrollByAmount()
		Thread.sleep(1000);
		actions.scrollByAmount(0, 500).perform();
		System.out.println("scrollByAmount has done succesfully");
		
		//scrollToElement()
		Thread.sleep(1000);
		actions.scrollToElement(driver.findElement(By.id("//h2[contains(text(),'Slider')]"))).perform();
		System.out.println("scrollToElement has done succesfully");
		
		//scrollFromOrigin()
		//Thread.sleep(1000);
		//WebElement origin=driver.findElement(By.id("//h2[contains(text(),'Tool Tip Text')]"));
		//actions.scrollFromOrigin(ScrollOrigin.fromElement(origin), 0, 500).perform();
		//System.out.println("scrollFromOrigin has done succesfully");
		
	
		
		driver.close();
		
		
		
		
		

	}

}
