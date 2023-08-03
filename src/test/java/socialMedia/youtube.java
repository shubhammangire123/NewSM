package socialMedia;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class youtube {
  @Test
  public void utubeweb() throws InterruptedException {
	  
 WebDriver driver = new ChromeDriver();
	  
	  driver.get("https://www.youtube.com/");
	 Thread.sleep(1000);
	  driver.close();
  }
}
