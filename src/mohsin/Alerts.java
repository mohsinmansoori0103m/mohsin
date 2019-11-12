package mohsin;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



public class Alerts {
public static void main (String args[])throws Exception {
	System.setProperty("webdriver.chrome.driver", "E:\\drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
	driver.navigate().to("http://127.0.0.1/orangehrm-2.6/login.php");
	driver.findElement(By.name("txtUserName")).sendKeys("admin");
driver.findElement(By.name("Submit")).click();
Thread.sleep(3000);
Alert a= driver.switchTo().alert();
System.out.println(a.getText());
a.accept();
driver.findElement(By.name("txtPassword")).sendKeys("admin");
driver.findElement(By.name("Submit")).click();
Thread.sleep(3000);
driver.findElement(By.linkText("Logout")).click();
driver.quit();

}
}
