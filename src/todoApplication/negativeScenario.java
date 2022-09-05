package todoApplication;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class negativeScenario {
	
	public static void main(String[] args) throws InterruptedException, AWTException {
	
	System.setProperty("webdriver.chrome.driver","C:\\chrome\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://todomvc.com/examples/angular2/");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	
	//1. Check with alphanumeric
	WebElement text1 = driver.findElement(By.xpath("//input[@placeholder='What needs to be done?']"));
	text1.sendKeys("aabbccddmn125456");
	Robot robot1 = new Robot();
	robot1.keyPress(KeyEvent.VK_ENTER);
	robot1.keyRelease(KeyEvent.VK_ENTER);
	
	//2. Check with the text which exceeds 10 character
	WebElement text2 = driver.findElement(By.xpath("//input[@placeholder='What needs to be done?']"));
	text2.sendKeys("abcdefghijklmnoparstuvwxyz");
	Robot robot2 = new Robot();
	robot2.keyPress(KeyEvent.VK_ENTER);
	robot2.keyRelease(KeyEvent.VK_ENTER);
	
	//3. Check with Leadind and trailing spaces entered in name field
	WebElement text4 = driver.findElement(By.xpath("//input[@placeholder='What needs to be done?']"));
	text4.sendKeys("              Informatique               ");
	Robot robot4 = new Robot();
	robot4.keyPress(KeyEvent.VK_ENTER);
	robot4.keyRelease(KeyEvent.VK_ENTER);	
	
	//4. Check with special character
	WebElement text3 = driver.findElement(By.xpath("//input[@placeholder='What needs to be done?']"));
	text3.sendKeys("@#*&^!!");
	Robot robot3 = new Robot();
	robot3.keyPress(KeyEvent.VK_ENTER);
	robot3.keyRelease(KeyEvent.VK_ENTER);
	
	driver.quit();
	
}
}
