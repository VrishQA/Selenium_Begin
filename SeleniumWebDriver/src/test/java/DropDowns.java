import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
public class DropDowns {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();

		
		WebElement element= driver.findElement(By.xpath("//select[@id='country']"));
		Select selectCountry= new Select(element);
		
		//select option from dropdown
//		selectCountry.selectByVisibleText("Canada");
//		selectCountry.selectByValue("japan");
		selectCountry.selectByIndex(8);
		
		
		//to find full options available jn drop-down
	List<WebElement>	option=selectCountry.getOptions();
		System.out.println(option.size());
		
		//print all options
		for(WebElement op:option) {
			System.out.println(op.getText());
		}
		driver.quit();
	}

}
