package executionEngine;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


/*
 * 模拟百度登录的过程
 * */

public class DriverScript {
	
	private static WebDriver driver = null;
	
	public static void main(String[] args) throws InterruptedException {
		
		//System.setProperty("webdriver.chrome.driver", ".\\libs\\chromedriver.exe");
		
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(8, TimeUnit.SECONDS);
		driver.get("https://www.baidu.com/");
		Thread.sleep(2000);
		
		//点击登录链接
		driver.findElement(By.xpath(".//*[@id='u1']/a[text()='登录']")).click();
		
		//点击用户名密码登录
		driver.findElement(By.id("TANGRAM__PSP_10__footerULoginBtn")).click();
		
		//输入账号和密码登录
		driver.findElement(By.id("TANGRAM__PSP_10__userName")).sendKeys("13826515408");
		driver.findElement(By.id("TANGRAM__PSP_10__password")).sendKeys("hsh13141365");
		
		//点击登录
		driver.findElement(By.id("TANGRAM__PSP_10__submit")).click();
		
	}
}
