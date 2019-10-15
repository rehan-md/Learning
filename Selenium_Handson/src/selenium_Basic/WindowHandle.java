package selenium_Basic;


import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandle {
static WebDriver driver;
public static void main(String[] args) {
	
	System.setProperty("webdriver.chrome.driver", "E:\\Selenium\\chromedriver_win32\\chromedriver.exe");
	driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().deleteAllCookies();
	driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
	driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
	driver.get("https://www.seleniumeasy.com/test/window-popup-modal-demo.html");
	driver.findElement(By.xpath("//a[@class='btn btn-primary followeasy']")).click();
	String parentWindow=driver.getWindowHandle();
	System.out.println(parentWindow);
    Set<String> WindowHandle=driver.getWindowHandles();
	Iterator<String> it=WindowHandle.iterator();
	while(it.hasNext()) {
		String childWindow=it.next();
		
	
		if(!childWindow.equals(parentWindow)) {
			System.out.println(childWindow);
			driver.switchTo().window(childWindow);
			System.out.println(driver.getTitle());
			driver.close();
		}
	}
	
//	for(String handle:WindowHandle) {
//		if(!handle.equals(parentWindow)) {
//			driver.switchTo().window(handle);
//			System.out.println(driver.getTitle());
//			driver.close();
//		}
//		
//	}
	driver.switchTo().window(parentWindow);
	System.out.println(driver.getTitle());
}
}
