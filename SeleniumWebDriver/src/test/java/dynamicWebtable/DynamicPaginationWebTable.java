
package dynamicWebtable;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DynamicPaginationWebTable {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
		driver.get("https://practice.expandtesting.com/dynamic-pagination-table?utm_source=chatgpt.com");
		driver.manage().window().maximize();

		// find total no.of pages/entries available
		String page = driver.findElement(By.xpath("//div[text()='Showing 1 to 3 of 10 entries']")).getText();
		System.out.println(page);

		// get the total no.of entries
		int startIndex = page.indexOf("of") + 3;
		int endIndex = page.indexOf("entries") - 1;

		int entries = Integer.parseInt(page.substring(startIndex, endIndex));
		System.out.println(entries + " entries are there for the whole table");

		// to get total no.of pages
		List<WebElement> x = driver.findElements(By.xpath(
				"//ul[@class='pagination']/li[not(contains(@class,'previous')) and not(contains(@class,'next'))]"));
		int totalPages = x.size();
		System.out.println(totalPages + " pages are available to click or move");

		// finding a pop-up message which stops user to click- on other page and we need to
		// close it//

		Thread.sleep(10000);

		// ------ clicking on each page till u reach last page to check if all pages are
		// click-able-------//
		for (int p = 1; p <= totalPages; p++) // starting with 2 because 1 is already clicked
		{
			if (p > 1) {
				WebElement onPage = driver.findElement(By.xpath(
						"//ul[@class='pagination']/*[not(contains(@class,'previous')) and not(contains(@class,'next'))]/*[text()="
								+ p + "]"));
				onPage.click();
			}

			// reading table data

			WebElement table = driver.findElement(By.xpath("//div[@class='table-responsive']"));

			// ------------------------------//rows
			int row = driver
					.findElements(By.xpath("//table//tbody//tr[contains(@class, 'odd') or contains(@class, 'even')]"))
					.size();

			// --------------------------------------//cells
			int cells = driver.findElements(By.xpath("//table//thead//tr//th[contains(@class, 'sorting')]")).size();

			// reading data from the data where your fetching row data from 1st column
			for (int r = 1; r <= row; r++) {
				String stdName = driver.findElement(By.xpath("//table//tbody//tr[" + r + "]//td[1]")).getText();
				String gender = driver.findElement(By.xpath("//table//tbody//tr[" + r + "]/td[2]")).getText();
				String classLevel = driver.findElement(By.xpath("//table//tbody//tr[" + r + "]/td[3]")).getText();

				System.out.println(stdName + "\t" + gender + "\t" + classLevel);

			}

		}

		 driver.quit();

	}

}
//a[text()='Dynamic Pagination Table']
