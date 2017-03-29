import org.openqa.selenium.chrome.ChromeDriver
import org.openqa.selenium.remote.DesiredCapabilities
import org.openqa.selenium.support.ui.WebDriverWait

trait TestSetup {

  val Base_URL = "https://www.flipkart.com/"
  val Email = "user@gmail.com"
  val Password = "password"
  System.setProperty("webdriver.chrome.driver", "/home/knoldus/workSpace/scala/chromedriver")
  val capabilities = DesiredCapabilities.chrome()
  val driver = new ChromeDriver(capabilities)
  val webDriverWait = new WebDriverWait(driver, 10)
  val Name = "Name"
  val Pincode = "000000"
  val Address = "address"
  val City = "City"
  val Phone = "9999999999"

}
