package todoApplication;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class positiveScenarios {

	public static void main(String[] args) throws InterruptedException, AWTException {
		
		System.setProperty("webdriver.chrome.driver","C:\\chrome\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://todomvc.com/examples/angular2/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		
		//1. Check with character limit validation
		WebElement text1 = driver.findElement(By.xpath("//input[@placeholder='What needs to be done?']"));
		text1.sendKeys("aabbccddmn");
		Robot robot1 = new Robot();
		robot1.keyPress(KeyEvent.VK_ENTER);
		robot1.keyRelease(KeyEvent.VK_ENTER);
		
		//2. Check with some with Uppercase text
		WebElement text2 = driver.findElement(By.xpath("//input[@placeholder='What needs to be done?']"));
		text2.sendKeys("ROBOT");
		Robot robot2 = new Robot();
		robot2.keyPress(KeyEvent.VK_ENTER);
		robot2.keyRelease(KeyEvent.VK_ENTER);
		
		//3. Check with uppercase and lowercase combined
		WebElement text3 = driver.findElement(By.xpath("//input[@placeholder='What needs to be done?']"));
		text3.sendKeys("TextRobotFILE");
		Robot robot3 = new Robot();
		robot3.keyPress(KeyEvent.VK_ENTER);
		robot3.keyRelease(KeyEvent.VK_ENTER);	
		
		//4. Check with some Lowercase text 
		WebElement text4 = driver.findElement(By.xpath("//input[@placeholder='What needs to be done?']"));
		text4.sendKeys("lowercase");
		Robot robot4 = new Robot();
		robot4.keyPress(KeyEvent.VK_ENTER);
		robot4.keyRelease(KeyEvent.VK_ENTER);
		
		//5. Selecting particular list to delete
		WebElement editbox2 = driver.findElement(By.xpath("(//input[@type='checkbox'])[2]"));
		editbox2.click();
		
		//6. Clear the deleted item from the list
		WebElement editbox3 = driver.findElement(By.xpath("//button[contains(text(),'Clear completed')]"));
		editbox3.click();
		
		driver.quit();
}
}
