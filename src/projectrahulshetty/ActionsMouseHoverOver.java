package projectrahulshetty;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class ActionsMouseHoverOver {
	
	WebDriver driver;
	WebElement moveToMyAccount;
	public ActionsMouseHoverOver(WebDriver driver) {
		this.driver = driver;
	}

	public void actionsMouseHoverOver(){
		Actions actions = new Actions(driver);
		moveToMyAccount = driver.findElement(By.xpath("//*[@id='nav-link-accountList']"));
		actions.moveToElement(driver.findElement(By.xpath("//*[@id='twotabsearchtextbox']"))).click().keyDown(Keys.SHIFT).sendKeys("Hello").doubleClick().build().perform();
		actions.moveToElement(moveToMyAccount).contextClick().build().perform();
			
	}
}
