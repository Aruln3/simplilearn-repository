package lesson1.phase5;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class login {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Hp\\Desktop\\Java FSD\\phase5\\chromedriver.exe");
     WebDriver driver = new ChromeDriver();
//Register
driver.get("https://demo.wpjobmanager.com/my-account/");
driver.findElement(By.id("reg_email")).sendKeys("aruln31@gmail.com");
driver.findElement(By.id("reg_password")).sendKeys("arul0311");
driver.findElement(By.name("register")).click();
driver.findElement(By.xpath("//*[@id=\"post-65\"]/div/div/div/p[1]/a")).click();

//Login

driver.findElement(By.id("username")).sendKeys("aruln31@gmail.com");
driver.findElement(By.id("password")).sendKeys("arul0311");
driver.findElement(By.name("login")).click();
 }
}