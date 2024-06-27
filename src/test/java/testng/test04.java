package testng;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterMethod;

public class test04 {
	WebDriver driver;
  @Test
  public void rightclick() {
	 
		
WebElement abc=driver.findElement(By.xpath(" //span[@class='demo-icon icon-hotels']"));
Actions act =new Actions(driver);
act.contextClick(abc).build().perform();
  }


@Test
public void mhover() {


WebElement kbc1=driver.findElement(By.xpath("//a[contains(text(),'My Account')]"));
Actions act1 =new Actions(driver);
act1.moveToElement(kbc1).perform();
driver.close();

  }
  @BeforeMethod
  public void beforeMethod() {
	  System.setProperty("webdriver.chrome.driver" ,"C:\\Users\\ABC\\eclipse-workspace\\mavenproject1\\drivers\\chromedriver.exe");
	  WebDriver driver=new ChromeDriver()	;
		driver.manage().window().maximize();
driver.get("https://www.yatra.com/ ");
	 
  }

  @AfterMethod
  public void afterMethod() {
	  driver.close();
  }

}
