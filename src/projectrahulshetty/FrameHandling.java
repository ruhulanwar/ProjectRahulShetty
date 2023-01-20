package projectrahulshetty;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class FrameHandling {

	WebDriver driver;

	public FrameHandling(WebDriver driver) {
		this.driver = driver;
	}

	public void frameHandlingMethod() {
		driver.get("https://jqueryui.com/droppable/");
		driver.switchTo().frame(driver.findElement(By.xpath("//*[@class='demo-frame']")));
		driver.findElement(By.xpath("//*[@id='draggable']")).click();
		Actions actions = new Actions(driver);
		WebElement source = driver.findElement(By.xpath("//*[@id='draggable']"));
		WebElement target = driver.findElement(By.xpath("//*[@id='droppable']"));
		actions.dragAndDrop(source, target).build().perform();
	}
}
