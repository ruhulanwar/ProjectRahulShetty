package projectrahulshetty;

import java.io.File;
import java.io.IOException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.apache.commons.io.FileUtils;

public class TakeScreenshots {

	WebDriver driver;

	public TakeScreenshots(WebDriver driver) {
		this.driver = driver;
	}

	public void takeScreenshotsMethod() throws InterruptedException, IOException {
		driver.get("https://www.google.com");
		File screenshot = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		long name = System.currentTimeMillis();										//unique number to name a file
		//DateFormat dateFormat = new SimpleDateFormat("MM-dd-yyyy h-m-s");			//file naming only
		//Date date = new Date();													//file naming formating
		FileUtils.copyFile(screenshot, new File("C://screenshots/screenshot"+ name +".png"));
	}
}
