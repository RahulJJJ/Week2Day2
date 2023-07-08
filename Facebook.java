
package week2day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Facebook {



public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		
		ChromeDriver driver=new ChromeDriver();
		
		driver.get("https://en-gb.facebook.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3000));
		driver.findElement(By.linkText("Create New Account")).click();
		
	    driver.findElement(By.name("firstname")).sendKeys("rahul");
		driver.findElement(By.name("lastname")).sendKeys("jayaraman");
		driver.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys("rahuljayaraman08@gmail.com");
		driver.findElement(By.xpath("//input[@name='reg_email_confirmation__']")).sendKeys("rahuljayaraman08@gmail.com");
		driver.findElement(By.xpath("//input[@id='password_step_input']")).sendKeys("rahul123");
		WebElement Day= driver.findElement(By.id("day"));
		Select date = new Select(Day);
		date.selectByIndex(2);	
		WebElement month= driver.findElement(By.id("month"));
		Select opt = new Select(month);
		opt.selectByVisibleText("May");
		WebElement year= driver.findElement(By.id("year"));
		Select opt1 = new Select(year);
		opt1.selectByValue("2002");		
		driver.findElement(By.xpath("//input[@value = '2']")).click();
		driver.findElement(By.name("websubmit")).click();
		WebElement findElement = driver.findElement(By.id(null));
		
		 	
     }	
		
		
   }
