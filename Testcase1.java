import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Testcase1 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "./softwares/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.validlog.com/contact-us/");
		driver.findElement(By.xpath("//input[@name='form_fields[name]']")).sendKeys("Geeta");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name='form_fields[email]']")).sendKeys("patilgeeta434@gmail.com");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@class='elementor-button elementor-size-md']")).click();
	}

}
