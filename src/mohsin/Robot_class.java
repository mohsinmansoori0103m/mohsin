package mohsin;

import java.awt.Robot;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.sun.glass.events.KeyEvent;

public class Robot_class {
public static void main(String args[]) throws Exception {
	System.setProperty("webdriver.chrome.driver","E:\\drivers\\chromedriver.exe" );
	WebDriver driver= new ChromeDriver();
	driver.get("http://127.0.0.1/orangehrm-2.6/login.php");
	System.out.println("application opened");
	if (driver.getTitle().equals("OrangerHRM - NEW LEVEL OF HR MANAGEMENT"))  {
		System.out.println("TITLE MATCHED");		
	}
	else {
		System.out.println("title not matched and expected title is" + driver.getTitle());
	
	}
	driver.findElement(By.name("txtUserName")).sendKeys("admin");
	driver.findElement(By.name("txtPassword")).sendKeys("admin");
			Robot r=new Robot();
		r.keyPress(KeyEvent.VK_TAB);
		r.keyRelease(KeyEvent.VK_TAB);
		r.keyPress(KeyEvent.VK_ENTER);
	r.keyRelease(KeyEvent.VK_ENTER);
		
Thread.sleep(3000);
System.out.println("login complted");
driver.findElement(By.linkText("Logout")).click();
System.out.println("logout completed");
driver.quit();
}
}
