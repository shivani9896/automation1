package demo;



	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;
	class demo {

	 public static void main(String[] args) 
	  throws InterruptedException
	 {
	  
	  
	  ChromeDriver obj = new ChromeDriver();
	  obj.get("https://practice.expandtesting.com/login");
	  Thread.sleep(1000);

	  obj.findElement(By.xpath("//input[@name='username']")).sendKeys("practice");
	  Thread.sleep(1000);
	  obj.findElement(By.xpath("//input[@name='password']")).sendKeys("SuperSecretPassword!");
	  Thread.sleep(1000);
	  obj.findElement(By.xpath("//button[@type='submit']")).click();
	   
	  obj.findElement(By.xpath("//i[@class='icon-2x icon-signout']")).click();
	  

	 }
	}
