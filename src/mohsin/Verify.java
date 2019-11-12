package mohsin;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By;
public class Verify {
public static String un="admin";
public static String pw="admin";
public static void main (String args[])throws Exception {
	System.setProperty("webdriver.chrome.driver", "E:\\drivers\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("http://127.0.0.1/orangehrm-2.6/login.php");
	if(driver.getTitle().equals("Orange HRM-New Level of HR Management")) {
	System.out.println("title matched");
}
	else {
		System.out.println("title not matched and expected title is"+driver.getTitle());
	}
	driver.findElement(By.xpath("//*[@id=\"Table_01\"]/tbody/tr[1]/td[2]/table/tbody/tr[2]/td[2]/input")).sendKeys(un);
	driver.findElement(By.xpath("//*[@id=\"Table_01\"]/tbody/tr[1]/td[2]/table/tbody/tr[3]/td[2]/input")).sendKeys(pw);
	driver.findElement(By.xpath("//*[@id=\"Table_01\"]/tbody/tr[1]/td[2]/table/tbody/tr[4]/td[1]/input")).click();
	Thread.sleep(3000);
	
	System.out.println("login completed");
	driver.findElement(By.linkText("Logout")).click();
	System.out.println("logout completd");
		driver.close();	
	
	
}
}
