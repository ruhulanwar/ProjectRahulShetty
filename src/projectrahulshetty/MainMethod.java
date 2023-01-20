package projectrahulshetty;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class MainMethod {

	public static void main(String[] args) throws InterruptedException, IOException {

		ChromeOptions options = new ChromeOptions();	//browser behavior instructions
		options.setAcceptInsecureCerts(true); 			//ignore secure certifications
		WebDriver driver = new ChromeDriver(options);	//Chrome driver
		driver.get("https://www.amazon.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);
		
		System.out.println("----------------------BREAK----------------------");
		ActionsMouseHoverOver actionsMouseHoverOverObj = new ActionsMouseHoverOver(driver);
		//actionsMouseHoverOverObj.actionsMouseHoverOver();
		
		WindowHandling windowHandlingObj = new WindowHandling(driver);
		//windowHandlingObj.windowHandling();
		
		System.out.println("----------------------BREAK----------------------");
		
		SplittedStringIntoChars splittedStringIntoCharsObj = new SplittedStringIntoChars();
		//splittedStringIntoCharsObj.splittedStringIntoChars();
		System.out.println("----------------------BREAK----------------------");

		ReversedString reversedStringObj = new ReversedString();
		//reversedStringObj.reversedString();
		System.out.println("----------------------BREAK----------------------");

		FrameHandling frameHandlingObj = new FrameHandling(driver);
		//frameHandlingObj.frameHandlingMethod();
		
		//............................................................................................................
		
		WebDriverScopeLinksCount webDriverScopeLinksCountObj = new WebDriverScopeLinksCount(driver);
		//webDriverScopeLinksCountObj.webDriverScopeLinksCountMethod();
		System.out.println("----------------------BREAK----------------------");
		
		CalenderHandling calenderHandlingObj = new CalenderHandling(driver);
		//calenderHandlingObj.calenderHandlingMethod();
		
		AlertsHandling alertsHandlingObj = new AlertsHandling(driver);
		//alertsHandlingObj.alertsHandlingMethod();
		
		ScrollingWithJavaScript scrollingWithJavaScriptObj = new ScrollingWithJavaScript(driver);
		//scrollingWithJavaScriptObj.scrollingWithJavaScriptMethod();
		
		ChromeOptionsTesting chromeOptionsTestingObj = new ChromeOptionsTesting(driver);
		//chromeOptionsTestingObj.chromeOptions();
		
		TakeScreenshots takeScreenshotObj = new TakeScreenshots(driver);
		takeScreenshotObj.takeScreenshotsMethod();
		
		Thread.sleep(5000);
		driver.quit();
		
	}

}
