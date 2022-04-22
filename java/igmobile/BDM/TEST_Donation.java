package igmobile.BDM;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TEST_Donation {

		public static void main(String[] args) throws Exception {
			
					System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELL\\Downloads\\chromedriver_win32 (3)\\chromedriver.exe");
					WebDriver driver = new ChromeDriver();
					driver.manage().window().maximize();
					
					 driver.get("https://www.impactguru.com");
					 driver.findElement(By.id("header-browse-fundraiser")).click();
					 driver.findElement(By.id("bf-card-donate")).click();
					 driver.getWindowHandle();
					 // Perform the click operation that opens new window
					 for(String winHandle : driver.getWindowHandles()){  // Switch to new window opened
					     driver.switchTo().window(winHandle);
					 }
					 // Perform the actions on new window
					 // Close the new window, if that window no more required
					// driver.close();
					 // Switch back to original browser (first window)
					 //driver.switchTo().window(winHandleBefore);
					 // Continue with original browser (first window)
			 		driver.findElement(By.id("full_name")).sendKeys("Test abhijeet donation");
			        driver.findElement(By.id("email_receipt")).sendKeys("Abhijeet.paval@impactguru.com");
			        driver.findElement(By.id("mobile")).sendKeys("8976569627");
			        driver.findElement(By.id("city_text")).sendKeys("Mumbai");
			        driver.findElement(By.xpath("//*[@id=\"userDetailsForm\"]/div[8]/div[2]/div[1]/label")).click();
			        driver.findElement(By.id("story-popup-donate-button")).click();
			        new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(By.cssSelector("#payment-netbanking-nav"))).click();
			        new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(By.cssSelector("#payment-netbanking-tab > div > div.btn-toolbar-new.mb-3.mt-3 > div:nth-child(4) > button"))).click();
			        driver.findElement(By.id("donate-netbanking-contribute")).click();
			        new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(By.cssSelector(" #wrapper > section > div > div.row.mb-2.d-flex > div.col-md-12.col-lg-6.col-xl-6.pl-lg-0 > div > div > div.pl-3 > ul > li:nth-child(1) > a\r\n"
			        		+ "	"))).click();
			        
			       }
	
}
