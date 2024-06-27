package mavenproject1.mavenproject1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class classo6 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver" ,"C:\\Users\\ABC\\eclipse-workspace\\mavenproject1\\drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver()	;
		driver.get(" https://www.amazon.in/");
		driver.manage().window().maximize();
		
		Thread.sleep(2000);
	/*	 String abc=driver.getCurrentUrl();
		System.out.println(" the current url : " + abc);
		String jd=driver.getPageSource();
		System.out.println("page source" +jd);
		
		//driver.getTitle();
		
		//System.out.println(driver.getTitle());
		String gh=driver.getTitle();
		// System.out.println(" get tittle :" +gh);*/
		driver.navigate().forward();
		driver.get(" https://www.yatra.com/");
		
		driver.navigate().back();
		//driver.navigate().to("https://www.yatra.com/ ");
		Thread.sleep(3000);
		 driver.close();
		
		
		
		
		
		
		
		
			}

}
