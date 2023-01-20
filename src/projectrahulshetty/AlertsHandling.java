package projectrahulshetty;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AlertsHandling {

	WebDriver driver;
	
	public AlertsHandling(WebDriver driver) {
		this.driver = driver;
	}

	public void alertsHandlingMethod() throws InterruptedException {
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");

		driver.findElement(By.xpath("//*[@id='alertbtn']")).click();
		Thread.sleep(1000);
		driver.switchTo().alert().accept();
		Thread.sleep(1000);

		driver.findElement(By.xpath("//*[@id='confirmbtn']")).click();
		Thread.sleep(1000);
		driver.switchTo().alert().accept();
		Thread.sleep(1000);

		driver.findElement(By.xpath("//*[@id='confirmbtn']")).click();
		Thread.sleep(1000);
		driver.switchTo().alert().dismiss();

		
	}

}
