package automation;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class FirstTestCase {
	
	/*{	 
	 System.setProperty("webdriver.chrome.driver", "D:\\automation\\chromeExeFile\\chromedriver.exe");
     WebDriver driver = new ChromeDriver();
     
     System.setProperty("webdriver.gecko.driver", "D:\\automation\\Firefox\\geckodriver.exe");
     WebDriver driver = new FirefoxDriver();
	} */

	
	// keep test annotation to run with testNg, comment test annotation and uncomment main class to run without testNg(Java application)
	
	@Test
	public void test(){
	
//	public static void main(String[] args) {
		
	 System.setProperty("webdriver.chrome.driver", "D:\\automation\\chromeExeFile\\chromedriver.exe");
     WebDriver driver = new ChromeDriver();
   
     driver.navigate().to("https://www.imdb.com/");   
     driver.manage().window().maximize();
     Actions actions = new Actions(driver);
     
     
   /*driver.findElement(By.xpath("//*[@href='/registration/signin?ref=nv_generic_lgin']")).click();
     System.out.println("Clicked on sign in to create new account");
  
     driver.findElement(By.xpath("//*[text()='Create a New Account']")).click();
     
     actions.sendKeys("xyz").sendKeys(Keys.TAB).sendKeys("vibhadewangan@gmail.com").sendKeys(Keys.TAB).sendKeys("password").sendKeys(Keys.TAB).sendKeys("password").sendKeys(Keys.TAB).click().perform();
     System.out.println("successfully created new account");*/
     
    driver.navigate().refresh();
    driver.navigate().to("https://www.imdb.com/registration/signin");

     driver.findElement(By.xpath("//*[text()='Sign in with IMDb']" )).click();
     WebElement SignInElement =  driver.findElement(By.id("signInSubmit"));

     actions.sendKeys("vibhadewangan04@gmail.com").sendKeys(Keys.TAB).sendKeys("vibha@0101")
     .moveToElement(SignInElement).click()
     .perform();
     
     System.out.println("logged in successfully");
     
     driver.manage().timeouts().implicitlyWait(3,TimeUnit.SECONDS) ;
		driver.findElement(By.id("imdbHeader-navDrawerOpen--desktop")).click();
		
		   WebDriverWait wait = new WebDriverWait(driver, 10);			
		    WebElement MoviesElement = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[text()='Top Rated Movies']")));
		//driver.manage().timeouts().implicitlyWait(3,TimeUnit.SECONDS) ;
	
	actions.moveToElement(MoviesElement).pause(1000).click().perform();
	System.out.println("Clicked on top rated movies");
		
//		driver.findElement(By.id("lister-sort-by-options"));
		
		Select select = new Select(driver.findElement(By.id("lister-sort-by-options")));
		
	//	select.selectByValue("us:descending");
		select.selectByVisibleText("Release Date");
		 System.out.println("sorted by release date");
		
		driver.findElement(By.xpath("//*[@id='main']/div/span/div/div/div[3]/table/tbody/tr[250]/td[2]/a")).click();

		
	String text =driver.findElement(By.xpath("//a[@href='/title/tt0012349/releaseinfo?ref_=tt_ov_inf']")).getText();
		System.out.println("Month and year of the release is "+ text);
		
		driver.close();
		
 }
	 
	 
	 
	
	
	
	
	
	
	
	
	
}

	