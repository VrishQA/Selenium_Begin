import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
public class StaticWebTable {

	public static void main(String[] args) {
		WebDriver driver= new ChromeDriver();
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));

		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		
		
		driver.findElement(By.xpath("//table[@name=\"BookTable\"]"));
		//no of rows to be as below
		int row=driver.findElements(By.xpath("//table[@name=\"BookTable\"]//tr")).size();
		System.out.println(row);
		//no.of columns
		int col=driver.findElements(By.xpath("//table[@name=\"BookTable\"]//th")).size();
		System.out.println(col);
		System.out.println("Another logic to verify the count for whole of rows n cols pf webpage");
		
		//no.of rows and col from tagname
		int rows= driver.findElements(By.tagName("tr")).size();
		int cols= driver.findElements(By.tagName("th")).size();
		System.out.println("Total no.fo rows in whole page "+ rows);
		System.out.println("Total no.fo cols in whole page"+cols);
		
		
		System.out.println("To get specific data from table");
		//specific data from table
		WebElement cell = driver.findElement(By.xpath("//table[@name='BookTable']//tr[4]//td[2]"));
		System.out.println(cell.getText());
		
		//read all data from table
		for(int r=2;r<=row;r++) {//rows
			for(int c=1;c<=col;c++) {//cells
				String value=driver.findElement(By.xpath("//table[@name='BookTable']//tr["+r+"]//td["+c+"]")).getText();
				System.out.print(value+"\t");
			}
			System.out.println();
		}
		
		//finding particular author book name based on author
		for(int r=2;r<=row;r++) {
		String author=driver.findElement(By.xpath("//table[@name='BookTable']//tr["+r+"]//td[2]")).getText();
		
		if(author.equals("Mukesh")) {
		String bookname=driver.findElement(By.xpath("//table[@name='BookTable']//tr["+r+"]//td[1]")).getText();
		System.out.println(bookname+ "          "+ author);
			}
		
		
	}
		//find price of each book n get the sum of it
		int totalCost=0;
		for(int r=2;r<=row;r++) {
		String price=driver.findElement(By.xpath("//table[@name='BookTable']//tr["+r+"]//td[4]")).getText();
		int pr =Integer.parseInt(price);
		
		totalCost=totalCost+pr;
		pr=totalCost;

		if (r==row) {
			System.out.println("The total cost of all the books :" + totalCost);	
		}
		
		
		}
		
		//tc=300 &pr=300
		//tc=800 &pr=800; 
		driver.quit();
	}

}
