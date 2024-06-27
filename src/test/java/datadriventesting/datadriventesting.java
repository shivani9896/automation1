package datadriventesting;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.DataProvider;

public class datadriventesting {
	WebDriver driver;
  @Test(dataProvider = "authentication")
  public void f(String  UID, String PWS) {
	  driver.findElement(By.xpath(" //input[@id='email']")).sendKeys("UID");
	  driver.findElement(By.xpath("//input[@id='pass'] ")).sendKeys("PWS");
	  driver.findElement(By.xpath("//button[@name=login")).click();
  }
  @BeforeMethod
  public void beforeMethod() {
	  System.setProperty("webdriver.chrome.driver" ,"C:\\Users\\ABC\\eclipse-workspace\\mavenproject1\\drivers\\chromedriver.exe");
	  WebDriver driver=new ChromeDriver();
	  driver.get(" https://www.facebook.com/");
	  driver.manage().window().maximize();
  }

  @AfterMethod
  public void afterMethod() {
	  driver.close();
	  
  }


  @DataProvider(name="authentication")
  public Object[][] dp() {
    return new Object[][] {
      new Object[] { "shivi", "1234" },
      new Object[] { "surbhi", "2345" },
      new Object[] { "dechen", "7898" },
      new Object[] { "somi", "2345" }
    };
  }
}
