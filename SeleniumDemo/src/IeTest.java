import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class IeTest {

	public static void main(String[] args) {
		System.setProperty("webdriver.ie.driver","C:\\Users\\Mehme\\Documents\\Dependencies\\IEDriver\\\\IEDriverServer.exe");
		WebDriver driver = new InternetExplorerDriver();
		driver.get("http://www.gmail.com");
	
	}

}
