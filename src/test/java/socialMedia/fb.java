package socialMedia;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class fb {
  @Test
  public void fbweb() throws InterruptedException 
  {
	  
 WebDriver driver = new ChromeDriver();
	  
	  driver.get("https://www.facebook.com/");
	 Thread.sleep(1000);
	  driver.close();
  }
}
