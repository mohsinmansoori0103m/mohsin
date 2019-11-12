package mohsin;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;
public class Mouse_over {
	public static void main  (String args[])throws Exception {
		System.setProperty("webdriver.chrome.driver", "E:\\drivers\\chromedriver.exe" );
		WebDriver driver=new ChromeDriver() ;
		driver.get("http://127.0.0.1/orangehrm-2.6/login.php");
		driver.manage().window().maximize();
		if (driver.getTitle().equals("Orange HRM-New Level of HR Management")){
			System.out.println("title match");
		}
		else {
			System.out.println("title not match expected result"+driver.getTitle());
			Thread.sleep(3000);
		}
		driver.findElement(By.xpath("//*[@id=\"Table_01\"]/tbody/tr[1]/td[2]/table/tbody/tr[2]/td[2]/input")).sendKeys("admin");
		driver.findElement(By.xpath("//*[@id=\"Table_01\"]/tbody/tr[1]/td[2]/table/tbody/tr[3]/td[2]/input")).sendKeys("admin");
		driver.findElement(By.xpath("//*[@id=\"Table_01\"]/tbody/tr[1]/td[2]/table/tbody/tr[4]/td[1]/input")).click();
	WebElement element=driver.findElement(By.linkText("PIM"));
	Actions action=new Actions (driver);
	action.moveToElement(element).perform();
	Thread.sleep(3000);
	driver.findElement(By.linkText("Add Employee")).click();
	Thread.sleep(3000);
	System.out.println("clicked on sub menu");
	driver.quit();
	
	}

}
