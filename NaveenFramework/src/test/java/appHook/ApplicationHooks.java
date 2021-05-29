package appHook;

import java.util.Properties;

import javax.sound.midi.VoiceStatus;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeMethod;

import cucumber.api.java.Before;
import qa.factory.DriverFactory;
import qa.utilities.ConfigReader;

public class ApplicationHooks {

	private DriverFactory driverFactory;
	private WebDriver driver;
	private ConfigReader configReader;
	Properties  prop;
	@Before(order=0)
	public void getProperty() {
		configReader=new ConfigReader();
		prop=configReader.int_prop();
	}
	
	public void launchBrowser() {
		String browserNameString = prop.getProperty("Browser");
		driverFactory= new DriverFactory();
		driverFactory.int_driver(browserNameString);
	}
	
	
	
	
	
}
