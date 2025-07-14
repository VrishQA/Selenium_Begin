import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
public class AutoSuggestDD {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
WebDriver driver= new ChromeDriver();
WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));

driver.get("https://www.google.com/");
driver.manage().window().maximize();

driver.findElement(By.xpath("//textarea[@id='APjFqb']")).sendKeys("selenium");// searchbox
wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//ul[@role='listbox']//li")));


List<WebElement> options=driver.findElements(By.xpath("//ul[@role='listbox']//li//div[@class='pcTkSc']"));
System.out.println(options.size());

for(WebElement values :options) {
	System.out.println(values.getText());
}

	}

}
