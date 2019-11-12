package mohsin;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class google {
public static void main(String args[]) throws Exception{
	//test case steps
	System.setProperty("webdriver.chrome.driver","E:\\drivers\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.navigate().to("https://www.google.com/");
	Thread.sleep(4000);
	driver.findElement(By.name("q")).sendKeys("selenium");
	Thread.sleep(4000);
	driver.findElement(By.name("q")).sendKeys(Keys.ARROW_DOWN);
	System.out.println("Down arraow for 1st time");
	Thread.sleep(4000);
	driver.findElement(By.name("q")).sendKeys(Keys.ARROW_DOWN);
	System.out.println("Down arraow for 2nd time");
	Thread.sleep(4000);
	driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
	System.out.println("Enter");
	Thread.sleep(4000);
	driver.close();
}
}
