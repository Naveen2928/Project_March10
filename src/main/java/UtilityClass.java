

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class UtilityClass {
	public static	WebDriver driver;
	public static WebDriver BrowserLaunch() {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		return driver;
	}
	
	public static WebDriver
	launchBrowser(String browsername) {
		if(browsername.equalsIgnoreCase("chrome")) {
		WebDriverManager.chromedriver().setup();
		 driver = new ChromeDriver();
		}
		else if(browsername.equalsIgnoreCase("edge")) {
			WebDriverManager.edgedriver().setup();
			 driver = new EdgeDriver();
			
		}
		else if(browsername.equalsIgnoreCase("firefox")) {
			WebDriverManager.firefoxdriver().setup();
			 driver = new FirefoxDriver();
			
		}
		return driver;
	}
	 
		 
	public static void urlLaunch(String url) {
		driver.get(url);
		driver.manage().window().maximize();
	}
	public static void implicitWait(int a) {
		driver.manage().timeouts().implicitlyWait(a,TimeUnit.SECONDS);

	}
	
	public static void sendKeys(WebElement e,String value) {
		e.sendKeys(value);
	
	}
	public static void click(WebElement e) {
		e.click();

	}
	public static String getCurrentUrl() {
		//String currentUrl = driver.getCurrentUrl();
		return driver.getCurrentUrl();
	
	}
	public static String getTitle() {
		//String title = driver.getTitle();
		return driver.getTitle();

	}
	public static String getText(WebElement e) {
	//	String text = e.getText();
		return  e.getText();
	}
	public static String getAttribute(WebElement e) {
	//String attribute = e.getAttribute("value");
	return  e.getAttribute("value");
	

	}
	public static void moveToElement(WebElement trget) {
		Actions a=new Actions(driver);
		a.moveToElement(trget).perform();
	}
	
	public static void dragAndDrop(WebElement source,WebElement trget) {
		Actions a=new Actions(driver);
		a.dragAndDrop(source, trget).perform();
		
	}
	
	public static void conTextClick(WebElement click) {
		Actions a=new Actions(driver);
		a.contextClick(click).perform();
	}
	public static void dobleClick() {
		Actions a=new Actions(driver);
		a.doubleClick().perform();

	}
	public static void click() {
		Actions a=new Actions(driver);
		a.click().perform();

	}
	
	public static void selectByIndex(WebElement e,int index) {
		Select s=new Select(e);
		s.selectByIndex(index);
	}
	public static void selectByValue(WebElement e,String value) {
		Select s=new Select(e);
		s.selectByValue( value);
	
	}
	public static void selectByVisibleText(WebElement e,String text) {
		Select s=new Select(e);
		s.selectByVisibleText(text);

	}
	public static boolean isMultiple(WebElement e) {
		Select s=new Select(e);
		//boolean multiple = s.isMultiple();
		return s.isMultiple();

	}
	
	public static void deSelectByIndex(WebElement e,int index) {
		Select s=new Select(e);
		s.deselectByIndex(index);

	}
	
	public static void deSelectByValue(WebElement e,String value) {
		Select s=new Select(e);
		s.deselectByValue(value);
	}
	public static  void deSelectByVisibleText(WebElement e,String text) {
		Select s=new Select(e);
		s.deselectByValue(text);

	}
	
	public static void deSelectAll(WebElement e) {
		Select s=new Select(e);
		s.deselectAll();

	}
	
	public static void getScreenshot() {
		TakesScreenshot sc= (TakesScreenshot)driver;
		sc.getScreenshotAs(OutputType.FILE);

	}
	
	
	
	
	
}
