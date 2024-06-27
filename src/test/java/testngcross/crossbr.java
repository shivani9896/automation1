package testngcross;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;

public class crossbr {
	WebDriver  driver;
	private WebDriver newfirefox;
	private WebDriver newFirefox;
  @Test
  public void f() {
	  driver.get(" https://demo.automationtesting.in/Register.html");
	  driver.manage().window().maximize();
	   WebElement abc = driver.findElement(By.xpath("//a[normalize-space()='Interactions']"));
	   Actions act=new Actions(driver);
	   act.contextClick(abc).build().perform();
  }
  @BeforeTest
  @Parameters("browser")
  public void beforeTest( String browser) throws Exception {
	  if(browser.equalsIgnoreCase("firefox"))
	  {
		  driver=new FirefoxDriver ();
	  }else if(browser.equalsIgnoreCase("chrome"))
	  {
	  
driver=new ChromeDriver();
	  }
	  else {
		  throw new Exception("browser is not working");
	  }
	  driver.manage().timeouts().implicitlyWait(Duration.ofMillis(3000));
  }
  
}
 
  
