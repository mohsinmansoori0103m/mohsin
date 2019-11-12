package mohsin;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
public class TC_verify {
	public static String un="admin";
	public static String pw="admin";
public static void main(String args[])throws Exception {
System.setProperty("webdriver.chrome.driver","E:\\drivers\\chromedriver.exe");
WebDriver driver=new ChromeDriver();
driver.navigate().to("http://127.0.0.1/orangehrm-2.6/login.php");
if(driver.getTitle().equals(" OrangeHRM - New Level of HR Management")) {
	System.out.println("title matched");
}
else    {
    System.out.println("title not matched and expected title is "+driver.getTitle());
}
driver.findElement(By.xpath("//input[@name='txtUserName']")).sendKeys(un);
driver.findElement(By.xpath("//input[@name='txtPassword']")).sendKeys(pw);
System.out.println();
driver.findElement(By.name("Submit")).click();
Thread.sleep(3000);
System.out.println("login completed");
driver.findElement(By.linkText("Logout")).click();
Thread.sleep(3000);
System.out.println("logout completd");
driver.quit();



	

}
}