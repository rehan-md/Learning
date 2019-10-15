package testNG_Basic;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParameterTest {

WebDriver driver;

@Test
@Parameters({"url","emailId","password"})
public void zebcoLogin(String a, String b, String c) {
	System.setProperty("webdriver.chrome.driver", "E:\\Selenium\\chromedriver_win32\\chromedriver.exe");
	driver= new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().deleteAllCookies();
	driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
	driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
	driver.get(a);
	driver.findElement(By.xpath("//i[@class='fa fa-user d-none d-lg-inline-block']")).click();
	Assert.assertEquals(driver.getTitle(), "Customer Login", "Error found");
	driver.findElement(By.xpath("//input[@name='login[username]']")).sendKeys(b);
	driver.findElement(By.xpath("//input[@name='login[password]']")).sendKeys(c);
}
}
