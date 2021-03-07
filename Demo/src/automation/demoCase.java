package automation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class demoCase {

	
	public static void main(String[] args) {
		
		 System.setProperty("webdriver.chrome.driver", "D:\\automation\\chromeExeFile\\chromedriver.exe");
	     WebDriver driver = new ChromeDriver();
	   
	     driver.navigate().to("https://www.imdb.com/");   
	     driver.manage().window().maximize();
	     Actions actions = new Actions(driver);
	     
	     Select select = new Select(null);
	     
	}
	
}
