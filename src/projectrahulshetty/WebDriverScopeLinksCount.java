package projectrahulshetty;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class WebDriverScopeLinksCount {

	WebDriver driver;

	public WebDriverScopeLinksCount(WebDriver driver) {
		this.driver = driver;
	}

	public void webDriverScopeLinksCountMethod() throws InterruptedException {
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		System.out.println(driver.findElements(By.tagName("a")).size());

		// Mini Driver Creation
		WebElement footerDriver = driver.findElement(By.id("gf-BIG"));
		System.out.println(footerDriver.findElements(By.tagName("a")).size());

		WebElement columnDriver = driver.findElement(By.xpath("//*[@id='gf-BIG']//ul"));
		System.out.println(columnDriver.findElements(By.tagName("a")).size());

		List<WebElement> links = columnDriver.findElements(By.tagName("a"));

		// click all links to see if they are working
		for (int i = 1; i < links.size(); i++) {
			String clickOnLinks = Keys.chord(Keys.CONTROL, Keys.ENTER);
			links.get(i).sendKeys(clickOnLinks);
		}

		// Grab Title of Opened Windows
		Set<String> windowHandle = driver.getWindowHandles();
		Iterator<String> it = windowHandle.iterator();
		while (it.hasNext()) {
			driver.switchTo().window(it.next());
			System.out.println(driver.getTitle());
		}
	}
}
