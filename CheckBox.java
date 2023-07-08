package week2day2;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class CheckBox  {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.leafground.com/checkbox.xhtml");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.xpath("//h5[text()='Basic Checkbox']/following::span[text()='Basic']")).click();
		driver.findElement(By.xpath("//h5[text()='Notification']/following::span[text()='Ajax']")).click();
		driver.findElement(By.xpath("//h5[text()='Choose your favorite language(s)']/following::label[text()='Java']")).click();
		driver.findElement(By.xpath("//h5[text()='Choose your favorite language(s)']/following::label[text()='Python']")).click();
		driver.findElement(By.xpath("//h5[text()='Tri State Checkbox']/following::div[contains(@id,'ajaxTriState')]")).click();
		driver.findElement(By.xpath("//h5[text()='Toggle Switch']/following::div[contains(@class,'toggleswitch')][2]")).click();
		driver.findElement(By.xpath("//h5[text()='Select Multiple']/following::ul[@data-label='Cities']")).click();
		driver.findElement(By.xpath("//h5[text()='Select Multiple']/following::label[text()='London'][2]")).click();
		driver.findElement(By.xpath("//h5[text()='Select Multiple']/following::label[text()='Paris'][2]")).click();
		driver.findElement(By.xpath("//h5[text()='Select Multiple']/following::ul[@data-label='Cities']")).click();
		
	}

}




