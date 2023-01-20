package projectrahulshetty;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CalenderHandling {
	WebDriver driver;

	public CalenderHandling(WebDriver driver) {
		this.driver = driver;
	}

	public void calenderHandlingMethod() {
		driver.get("https://www.path2usa.com/travel-companion/");
		driver.findElement(By.xpath("//*[@id='form-field-travel_comp_date']")).sendKeys(Keys.ENTER);
		
		driver.findElement(By.xpath("//*[@class='flatpickr-current-month']")).sendKeys(Keys.ENTER);
		WebElement months = driver.findElement(By.xpath("//*[@class='flatpickr-current-month']"));
		boolean monthFinder = months.getText().contains("April");
		while(!monthFinder){
			driver.findElement(By.xpath("/html/body/div[10]/div[1]/span[2]")).sendKeys(Keys.ENTER);
		}
		
		List<WebElement> dates = driver.findElements(By.className("flatpickr-day"));
		int countOfDays = driver.findElements(By.className("flatpickr-day")).size();
		for (int i = 0; i < countOfDays; i++) {
			String text = dates.get(i).getText();
			if (text.equalsIgnoreCase("23")) {
				dates.get(i).sendKeys(Keys.ENTER);
				break;
			}
		}
	}
}
