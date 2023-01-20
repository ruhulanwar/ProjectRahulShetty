package projectrahulshetty;

import java.util.Iterator;
import java.util.Set;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class WindowHandling {
	
	WebDriver driver;
	public WindowHandling(WebDriver driver){
		this.driver = driver;
	}
	
		public void windowHandling(){
		driver.get("https://rahulshettyacademy.com/loginpagePractise/");
		driver.findElement(By.xpath("//*[@class='blinkingText']")).click();
		Set<String> windows = driver.getWindowHandles(); 
		Iterator<String> it = windows.iterator();
		String parentId = it.next();
		String childId = it.next();
		
		driver.switchTo().window(childId);
		String username= driver.findElement(By.xpath("//*[@class='im-para red']")).getText().split("at ")[1].split(" ")[0];
		driver.switchTo().window(parentId);
		System.out.println(username);
		driver.findElement(By.xpath("//*[@id = 'username']")).sendKeys(username);
		}
}
