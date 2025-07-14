package checkboxalerts;
import java.util.HashSet;
import java.util.List;
import java.util.Random;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Checkbox_Alerts {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver=new ChromeDriver();
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		
		//Selecting proper checkbox//
		
		//driver.findElement(By.xpath("//input[@id='sunday']")).click();
		
		//select all teh checkboxes//
		
		List<WebElement> checkboxes=driver.findElements(By.xpath("//input[@class='form-check-input' and @type='checkbox']"));
			for(WebElement select :checkboxes) {
				select.click();
			}
				
		//select last 3 checkboxes//
			for(int i=4;i<checkboxes.size();i++) {
				checkboxes.get(i).click();
			}
		
		//select first 3 checkboxes//
			for(int i=0;i<=2;i++) {
				checkboxes.get(i).click();
			}
			
			
			//randomly selecting the checkbox
			Random random= new Random();
			Set<Integer> setIndices= new HashSet<>();
			
			while(setIndices.size()<3) {
				int selectrandomchckbox=random.nextInt(checkboxes.size());
				
				if(setIndices.add(selectrandomchckbox)) {
					checkboxes.get(selectrandomchckbox).click();
				}
			}
			
			//driver.quit();
			
		
	}

}
