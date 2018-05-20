package executionEngine;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;




public class DriverScript {
	
	private static WebDriver driver = null;
	
	public static void main(String[] args) throws InterruptedException {
		
		//System.setProperty("webdriver.chrome.driver", ".\\libs\\chromedriver.exe");
		
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(8, TimeUnit.SECONDS);
		driver.get("https://www.baidu.com/");
		Thread.sleep(2000);
		
		
		driver.findElement(By.xpath(".//*[@id='u1']/a[text()='��¼']")).click();
		
		
		driver.findElement(By.id("TANGRAM__PSP_10__footerULoginBtn")).click();
		
		
		driver.findElement(By.id("TANGRAM__PSP_10__userName")).sendKeys("13826515408");
		driver.findElement(By.id("TANGRAM__PSP_10__password")).sendKeys("hsh13141365");
		
		
		driver.findElement(By.id("TANGRAM__PSP_10__submit")).click();
		
	}
}
