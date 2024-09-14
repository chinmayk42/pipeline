package TVP_Test_cases.Jenkins_trail;

import java.time.Duration;

import java.io.IOException;
import java.time.Duration;

import javax.swing.text.Document;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;




public class TVP {

	public static void base1() throws InterruptedException {
		// TODO Auto-generated method stub
				//System.setProperty("webdriver.edge.driver", "E:\\eclip\\GEBB\\msedgedriver.exe");
				System.setProperty("webdriver.chrome.driver", "C:\\Users\\om\\Desktop\\chromedriver.exe");
				//browser = new Browser(driver : new EdgeDriver())
				//WebDriver driver=new EdgeDriver();
				WebDriver driver=new ChromeDriver();
				driver.get("https://totalvaluesplus.stage-affinionservices.com/sign-in");
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
				driver.manage().window().maximize();
				//driver.findElement(By.ByXPath.xpath("(//span[text()='Sign In'])[1]")).click()

				//driver.findElement(By.xpath("(//span[text()='Sign In'])[1]")).click();
				//driver.findElement(By.xpath("(//span[@class='MuiBottomNavigationAction-label'])[2]")).click();
				//driver.findElement(By.name("Username")).sendKeys("TVP_55703169");
				driver.findElement(By.xpath("//input[@name='username']")).sendKeys("TVP_55703169");
				
				driver.findElement(By.xpath("//input[@name='password']")).sendKeys("Password1");
				driver.findElement(By.xpath("//button[@type='submit']")).click();
				//driver.navigate().to("https://totalvaluesplus.stage-affinionservices.com/home");
				driver.findElement(By.xpath("//input[@id='searchKey']")).sendKeys("SmileDirectClub");
				
				driver.findElement(By.xpath("//button[@type='submit']")).click();
				Thread.sleep(30000);
				driver.findElement(By.id("static-offerid-414595228-AD")).click();
				//ok//WebElement Offer=driver.findElement(By.xpath("//section[@id='cardContainer']"));
				WebElement Offer=driver.findElement(By.xpath("//section[@id='cardContainer']//div[@class='jss1017']"));
				//WebElement Offer=driver.findElement(By.xpath("//section[@id='cardContainer']//div[@style='margin-top: 0vw; opacity: 1; width: 100%; margin-left: 0vw;']"));
				//WebElement Offer=driver.findElement(By.xpath("//section[@id='cardContainer']//div[@style='margin-top: 0vw; opacity: 1; width: 100%; margin-left: 0vw;']//div[@class='jss1970'] "));
				//ok//WebElement Offer=driver.findElement(By.xpath("//img[contains(@src,'SmileDirectClub')]"));
				//String color=Offer.getCssValue("background-color");
				String color=Offer.getCssValue("background-color");
				System.out.println("SimleDirectClub"+color);
				//driver.findElement(By.name("password")).sendKeys("Password1");
	}
		public static void main(String[] args) throws InterruptedException {
			base1();
		}
		

	}


