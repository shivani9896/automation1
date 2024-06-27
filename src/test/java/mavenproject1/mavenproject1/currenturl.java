package mavenproject1.mavenproject1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class currenturl {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver" ,"C:\\Users\\ABC\\eclipse-workspace\\mavenproject1\\drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver()	;
		driver.get(" https://www.amazon.in/");
		driver.manage().window().maximize();
		//String abc= driver.getCurrentUrl();
		//System.out.println("the current url"  +abc);
		//String jd = driver.getPageSource();
		//System.out.println("page source"  +jd);
		String ad= driver.getTitle();
		System.out.println("get tittle :"  +ad);
		
		driver.close();
	}

}
