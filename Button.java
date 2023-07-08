package week2day2;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import java.time.Duration;
import io.github.bonigarcia.wdm.WebDriverManager;
import java.util.List;

public class Button {
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.leafground.com/button.xhtml");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.xpath("//h5[text()='Click and Confirm title.']/following-sibling::button[@aria-disabled='false']")).click();		
		driver.findElement(By.xpath("//span[text()='Element']/ancestor::a")).click();
		driver.findElement(By.xpath("//span[text()='Element']/following::a[@href='/button.xhtml']")).click();
		System.out.println("The button is Enabled --> "+driver.findElement(By.xpath("//h5[text()='Confirm if the button is disabled.']/following-sibling::button")).isEnabled());
		WebElement BGColor = driver.findElement(By.xpath("//h5[text()='Mouse over and confirm the color changed']//following::span[1]"));
		Actions act = new Actions(driver);
		act.moveToElement(BGColor).clickAndHold().pause(15).perform();
		String clourChange = BGColor.getCssValue("background-color");
        driver.findElement(By.xpath("//h5[text()='Click Image Button and Click on any hidden button']//following::button[contains(@id,'imageBtn')]")).click();
		List<WebElement> Button = driver.findElements(By.xpath("//h5[text()='How many rounded buttons are there?']/following-sibling::button"));
		int size = Button.size();
	    driver.close();
}
}
