package testng;

import org.testng.annotations.Test;

public class test03 {
	
  @Test (groups = {"addtocart"},priority=2)
  
  public void addtocart() {
	  System.out.println("addtocart");
  }
 @Test (groups = {"payment"},priority=3)
  
  public void payment() {
	  System.out.println("payment");
  }

 @Test (groups = {"login"},priority=4)
 
 public void login() {
	  System.out.println("login");
  }

 @Test (groups = {"signup"},priority=1)
 
 public void signup() {
	  System.out.println("signup");
  
  }

}
