package mohsin;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;
public class java_examples {
	static String username = "suresh";
	static String password = "suresh123";
public static void main(String args[]) throws Exception{
	//Test case steps
	System.setProperty("webdriver.chrome.driver","E:\\drivers\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.navigate().to("http://127.0.0.1/orangehrm-2.6/login.php");
	//verify title 
	    //A.R                   E.R
	if(driver.getTitle().equals("OrangeHRM - New Level of HR Management")) {
		System.out.println("Title matched");
	}
	else {
		System.out.println("Title not matched and expected title " + driver.getTitle());
	}
	driver.findElement(By.name("txtUserName")).sendKeys(username);
	driver.findElement(By.xpath("//input[@name='txtPassword']")).sendKeys(password);
	driver.findElement(By.name("Submit")).click();
	Thread.sleep(3000);
	System.out.println("Login completed");
	driver.findElement(By.linkText("Logout")).click();
	System.out.println("Logout completed");
	Thread.sleep(3000);
	driver.quit();
}
}

