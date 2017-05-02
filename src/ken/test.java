package ken;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class test {
	
	@Test
	public void my_test() {
		WebDriver driver = new FirefoxDriver();
		driver.get("http://way2automation.com/way2auto_jquery/index.php");
		driver.findElement(By.cssSelector("div#load_box input.button")).click();
	}

}
