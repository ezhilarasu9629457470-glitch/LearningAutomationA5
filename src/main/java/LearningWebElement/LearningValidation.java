package LearningWebElement;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;


public class LearningValidation {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://automationexercise.com/");
		

		//WebElement homepageTitle=driver.findElement(By.xpath("//img[@alt='Website for automation practice']"));
		System.out.println("home page title is "+driver.getTitle());
		
	
		WebElement loginLink=driver.findElement(By.partialLinkText("Login"));
		
		loginLink.click();
		
		
	
		WebElement newUserNameTextfield=driver.findElement(By.xpath("//input[@placeholder='Name']"));
		WebElement newemailadressTextfield=driver.findElement(By.xpath("//input[@data-qa='signup-email']"));
		WebElement signiupButton=driver.findElement(By.xpath("//button[@data-qa='signup-button']"));
		
		//WebElement signuppageTitle=driver.findElement(By.xpath("//h2[contains(text(),'New User Signup!')]"));
		System.out.println("signup page title is "+driver.getTitle());
		
		if(newUserNameTextfield.isDisplayed() && newemailadressTextfield.isEnabled())
		{
			System.out.println("username textfield isdisplayed and isenabled is displayed and enabled-PASS");
		}
		else
		{
			System.out.println("username textfield isdisplayed and isenabled is not displayed and not enabled-FAIL");
		}
		
		if(newemailadressTextfield.isDisplayed() && newemailadressTextfield.isEnabled())
		{
			System.out.println("emailaddress textfield isdisplayed and isenabled is displayed and enabled-PASS");
		}
		else
		{
			System.out.println("emailaddress textfield isdisplayed and isenabled is not displayed and not enabled-FAIL");
		}
		
		if(signiupButton.isDisplayed() && signiupButton.isEnabled())
		{
			System.out.println("signiupButton textfield isdisplayed and isenabled is displayed and enabled-PASS");
		}
		else
		{
			System.out.println("signiupButton textfield isdisplayed and isenabled is not displayed and not enabled-FAIL");
		}
	
		
		newUserNameTextfield.sendKeys("ezhilarasu");
		newemailadressTextfield.sendKeys("ezhilarasu@gmail.com");
		signiupButton.click();

		//WebElement createAccountpagetitle=driver.findElement(By.xpath("//b[contains(text(),'Enter Account Information')]"));
		System.out.println("createAccount page title is "+driver.getTitle());
		
		WebElement titleRadiobutton=driver.findElement(By.xpath("//input[@id='id_gender1']"));
		titleRadiobutton.click();
		
		WebElement EmailElement=driver.findElement(By.xpath("//input[@id='email']"));
		
		boolean displaystatusEmail=EmailElement.isDisplayed();
		if(displaystatusEmail)
		{
			System.out.println("email display is "+displaystatusEmail);
			
		}
		else
		{
			System.out.println("email display is "+displaystatusEmail);
		}
		
		boolean enabletatusEmail=EmailElement.isEnabled();
		if(enabletatusEmail)
		{
			System.out.println("email enabled is "+enabletatusEmail);
			
		}
		else
		{
			System.out.println("email enabled is "+enabletatusEmail);
		}
		
		boolean selectedstatusEmail=EmailElement.isSelected();
		if(selectedstatusEmail)
		{
			System.out.println("email selected is "+selectedstatusEmail);
			
		}
		else
		{
			System.out.println("email selected is "+selectedstatusEmail);
		}

		WebElement nametxtfieldelement=driver.findElement(By.xpath("//input[@id='name']"));
		
		boolean displayStatusName=nametxtfieldelement.isDisplayed();
		if(displayStatusName)
		{
			System.out.println("name displayed is "+displayStatusName);
		}
		else
		{
			System.out.println("name displayed is "+displayStatusName);
		}
		
		boolean enableStatusName=nametxtfieldelement.isEnabled();
		if(enableStatusName)
		{
			System.out.println("name enabled is "+enableStatusName);
		}
		else
		{
			System.out.println("name enabled is "+enableStatusName);
		}
		
		boolean selectedStatusName=nametxtfieldelement.isSelected();
		if(selectedStatusName)
		{
			System.out.println("name selected is "+selectedStatusName);
		}
		else
		{
			System.out.println("name selected is "+selectedStatusName);
		}
		
		WebElement MrRadiobutton=driver.findElement(By.xpath("//input[@id='id_gender1']"));
		boolean selectedstatusMrRadiobutton =MrRadiobutton.isSelected();
		if(selectedstatusMrRadiobutton)
		{
			System.out.println("MrRadiobutton isSelected is "+selectedstatusMrRadiobutton);
		}
		else
		{
			System.out.println("MrRadiobutton isSelected is "+selectedstatusMrRadiobutton);
		}
		boolean displayedstatusMrRadiobutton =MrRadiobutton.isDisplayed();
		if(displayedstatusMrRadiobutton)
		{
			System.out.println("MrRadiobutton isdisplayed is "+displayedstatusMrRadiobutton);
		}
		else
		{
			System.out.println("MrRadiobutton isdisplayed is "+displayedstatusMrRadiobutton);
		}
		boolean enabledstatusMrRadiobutton =MrRadiobutton.isEnabled();
		if(enabledstatusMrRadiobutton)
		{
			System.out.println("MrRadiobutton isenabled is "+enabledstatusMrRadiobutton);
		}
		else
		{
			System.out.println("MrRadiobutton isenabled is "+enabledstatusMrRadiobutton);
		}
		
		SimpleDateFormat sdf=new SimpleDateFormat("2026-06-17-18-18-01");
		String timestamp=sdf.format(new Date());
		
		TakesScreenshot ts=(TakesScreenshot)driver;
		File tempPath = ts.getScreenshotAs(OutputType.FILE);
		File permannetPath=new File("./src/test/resources/TestScreenshot3/screenshot "+timestamp+".png");
		
		FileHandler.copy(tempPath, permannetPath);
		System.out.println("takes screenshot using timestamp has taken succesfully");
		
		driver.navigate().back();
		
		WebElement emailadressElement=driver.findElement(By.xpath("//input[@placeholder='Name']/..//input[@name='email']"));
		File temppath1=emailadressElement.getScreenshotAs(OutputType.FILE);
		File PermanentPath2=new File("./src/test/resources/TestScreenshot4/screenshot.png");
		FileHandler.copy(temppath1, PermanentPath2);
		System.out.println("takesScreenshot using Webelement has taken successfully");
	
		driver.close();
	}

}