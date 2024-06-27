package testng;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterMethod;

public class NewTest {
	WebDriver driver;
	
  @Test(priority= 1, enabled= false)
  public void rightclick() {
		
WebElement abc=driver.findElement(By.xpath("//span[normalize-space()='Buses']"));
Actions act =new Actions(driver);
act.contextClick(abc).build().perform();

  }
  @Test(priority=2)
  public void mhover() {

	  WebElement kbc1=driver.findElement(By.xpath("//a[contains(text(),'My Account')]"));
	  Actions act1 =new Actions(driver);
	  act1.moveToElement(kbc1).perform();
	  driver.close();
  
  }

  @AfterMethod
  public void afterMethod() {
	  driver.close();
  }

}
