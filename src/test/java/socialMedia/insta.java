package socialMedia;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class insta {
  @Test
  public void instaweb() throws InterruptedException {
	  
 WebDriver driver = new ChromeDriver();
	  
	  driver.get("https://www.instagram.com/");
	 Thread.sleep(1000);
	  driver.close();
  }
}
