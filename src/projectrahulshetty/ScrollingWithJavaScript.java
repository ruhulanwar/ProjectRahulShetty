package projectrahulshetty;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

public class ScrollingWithJavaScript {
	
	WebDriver driver;
	public ScrollingWithJavaScript(WebDriver driver){
		this.driver = driver;
	}
	
	

	public void scrollingWithJavaScriptMethod() throws InterruptedException{
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,500)");
		Thread.sleep(1000);
		js.executeScript("document.querySelector('.tableFixHead').scrollTop=5000");
		
	}

}
