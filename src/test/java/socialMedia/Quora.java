package socialMedia;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Quora {
  @Test
  public void TC001quoraweb() throws InterruptedException {
	  
 WebDriver driver = new ChromeDriver();
	  
	  driver.get("https://www.quora.com/");
	 Thread.sleep(1000);
	  driver.close();
  }
}
