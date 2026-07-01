package LearningPopUP;

import java.io.File;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearningFileUploadPopUp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20l));
		driver.get("https://the-internet.herokuapp.com/upload");
		
		WebElement ChoosefileBtn=driver.findElement(By.id("file-upload"));
		
		//create the file
		
		File actualfile=new File("./src/test/resources/data/Notes.txt");
		
		ChoosefileBtn.sendKeys(actualfile.getAbsolutePath());
		
		System.out.println("program executed succesfully");
		driver.close();

	}

}
