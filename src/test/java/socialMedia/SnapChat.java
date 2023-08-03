package socialMedia;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class SnapChat {
  @Test
  public void snapweb() throws InterruptedException {
	  
 WebDriver driver = new ChromeDriver();
	  
	  driver.get("https://www.snapchat.com/");
	 Thread.sleep(1000);
	  driver.close();
  }
}
