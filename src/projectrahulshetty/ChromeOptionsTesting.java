package projectrahulshetty;

import org.openqa.selenium.WebDriver;

public class ChromeOptionsTesting {

	WebDriver driver;

	public ChromeOptionsTesting(WebDriver driver) {
		this.driver = driver;
	}

	public void chromeOptions() throws InterruptedException {
		driver.get("https://expired.badssl.com/");
		System.out.println(driver.getTitle());
	}
}
