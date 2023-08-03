package socialMedia;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Linkdin {
  @Test
  public void snapweb() throws InterruptedException {
	  
 WebDriver driver = new ChromeDriver();
	  
	  driver.get("https://www.linkedin.com/feed/");
	 Thread.sleep(1000);
	  driver.close();
  }
}
