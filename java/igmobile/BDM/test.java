package igmobile.BDM;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class test {

	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://staging.igstg.com/phpMyAdmin/index.php");
		/*driver.findElement(By.xpath("//input[@name = 'pma_username']")).sendKeys("impact_rajiv");
		driver.findElement(By.xpath("//input[@name = 'pma_password']")).sendKeys("EuQjrBTCkmb8lzZ3");
		driver.findElement(By.xpath("//input[@value = 'Go']")).click();*/
		
		driver.findElement(By.xpath("//button[@class='pt-button auth-button auth-google']")).click();
		driver.findElement(By.xpath("//input[@type = 'email']")).sendKeys("rajiv.jena@impactguru.com");
		
		driver.findElement(By.linkText("Next")).click();
		
		
		Connection connection = DriverManager.getConnection("jdbc:mysql://https://staging.igstg.com/phpMyAdmin/index.php/impactguru_live_staging", "impact_rajiv", "EuQjrBTCkmb8lzZ3");
	if(connection.isClosed()) {
		System.out.println("connectioncloses ");
	}
	else {
		System.out.println("connected sucessfully ");
	}
	
	}

}
