package EdRincon.GitTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;


public class App 
{
	protected WebDriver driver;
	
	@Test
	public void tutorial() throws InterruptedException{
		System.setProperty("webdriver.chrome.driver","chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		String eTitle = "Meet Guru99";
		String aTitle = "";
		//
		//Launch browser and go to URL
		//
		driver.get("http://www.guru99.com/");
		//Maximizes the browser window
		driver.manage().window().maximize();
		//Get the actual value of the title
		aTitle = driver.getTitle();
		//Compare the actual title with the expected title
		if (aTitle.contentEquals(eTitle)){
			System.out.println("Test Passed");
		} else{
			System.out.println("Test Failed");
		}
		//Close browser
		//driver.close();
		driver.quit();
	}
	
}