package LearnWebDriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebPageValidation {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.selenium.dev/");
		String exptitle="Selenium";
		String actTitle=driver.getTitle();
		System.out.println("actual title is "+actTitle);
		driver.close();
		if(exptitle.equals(actTitle))
		{
			System.out.println("pass "+actTitle);
		}
		else
		{
			System.out.println("fail "+actTitle);
		}
	}

}
