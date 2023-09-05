package Selenium;

import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.RemoteWebElement;

import ru.yandex.qatools.ashot.AShot;
import ru.yandex.qatools.ashot.Screenshot;
import ru.yandex.qatools.ashot.shooting.ShootingStrategies;

public class mouse
{
	public static void main(String[]args) throws InterruptedException, IOException
	{
	/* WebDriver driver =new ChromeDriver();
	driver.get("http://127.0.0.1/login.do");
	driver.findElement(By.name("username")).sendKeys("admin");
	 driver.findElement(By.name("pwd")).sendKeys("manager");
	 driver.findElement(By.id("loginButton")).click();
	 Thread.sleep(3000);
	 driver.findElement(By.linkText("Settings")).click();
	 driver.findElement(By.xpath("//a[text()='Logo & Color Scheme']")).click();
	 Thread.sleep(2000);
	 driver.findElement(By.xpath("//input[@id='uploadNewLogoOption']")).click();
	 Thread.sleep(3000);
	 WebElement choosefile=driver.findElement(By.xpath("(//input[@type='file'])[1]"));
	 Actions act=new Actions(driver);
	 if(choosefile.isEnabled())
	 {
		act.click(choosefile).perform();
		Thread.sleep(2000);
	 }
      Runtime.getRuntime().exec("./upload/upload2.exe");  
		
		
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://stackoverflow.com/");
		AShot screenshot =new AShot();
		Screenshot sh = screenshot.shootingStrategy(ShootingStrategies.viewportPasting(5000)).takeScreenshot(driver);
		ImageIO.write(sh.getImage(), "jpg", new File("c:\\screenshot\\stackoverflow.jpg"));    */
		
	ChromeOptions options = new ChromeOptions();
	options.addArguments("start-maximized");
	options.addArguments("incognito");
	WebDriver driver = new ChromeDriver(options);
}
}