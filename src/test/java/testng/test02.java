package testng;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;

public class test02 {
  @Test
  public void f() {
	  System.out.println("1");
  }
  @BeforeMethod
  public void beforeMethod() {
	  System.out.println("2");
	  
  }

  @BeforeClass
  public void beforeClass() {
	  System.out.println("3");
  }

  @AfterClass
  public void afterClass() {
	  System.out.println("4");
  }

  @AfterTest
  public void afterTest() {
	  System.out.println("5");
  }

}
