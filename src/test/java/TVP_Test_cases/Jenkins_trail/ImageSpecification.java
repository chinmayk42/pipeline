package TVP_Test_cases.Jenkins_trail;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class ImageSpecification {
	
	WebDriver driver;
	
	@BeforeTest
	public void setup() {
		System.setProperty("webdriver.chrome.driver", "E:\\eclip\\TVPtest\\target\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.manage().window().maximize();
		
	}
	@Test(priority=1)
	public void EDS() {
		driver.get("https://everydaysavings.stage-affinionservices.com/sign-in");
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("EDS55723857");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("Password1@");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
	}
	@Test(priority=1,enabled=false)
	public void FYE() {
		driver.get("https://fye.stage-affinionservices.com/sign-in");
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("FYE_55746439");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("Password1");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
	}
	@Test(priority=1,enabled=false)
	public void TVP() {
		driver.get("https://totalvaluesplus.stage-affinionservices.com/sign-in");
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("TVP_55703169");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("Password1");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
	}
	@Test(priority=2)
	public void  SmileDirectClub() throws InterruptedException {
		
		driver.findElement(By.xpath("//input[@id='searchKey']")).sendKeys("Papa John's");
		Thread.sleep(5000);
//		WebElement Text=driver.findElement(By.xpath("//input[@id='searchKey']"));
//		String value=Text.getAttribute("value");
//		System.out.println(value);
//		if(value!=null) {
//			int valLen=value.length();
//			for(int i=0;i<valLen;i++) {
//				Text.sendKeys(Keys.BACK_SPACE);
//			}
//		}
		//Text.clear();

		
		
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		Thread.sleep(8000);
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
		WebElement samllIamge=driver.findElement(By.xpath("//img[contains(@src,'https://static.accessdevelopment')]"));
		String s1=samllIamge.getCssValue("height");
		String w1=samllIamge.getCssValue("width");
		System.out.println("Small"+s1);
		System.out.println(w1);
		
		WebElement medium=driver.findElement(By.xpath("//div[contains(@style,'background-image')]"));
		String medium1=medium.getCssValue("height");
		String medium2=medium.getCssValue("width");
		System.out.println(medium1);
		System.out.println(medium2);
		
		
		driver.findElement(By.id("static-offerid-446086570-AD")).click();
		WebElement image=driver.findElement(By.xpath("//section[@id='cardContainer']//div[contains(@style,'background-image')]"));
		String dimension=image.getCssValue("height");
		String dimension2=image.getCssValue("width");
		
		System.out.println(dimension);
		System.out.println(dimension2);
		
		//int xcordinate=image.getLocation().getX();
		//int ycordinate=image.getLocation().getY();
		
		//System.out.println(xcordinate);
		//System.out.println(ycordinate);
		
		int height=image.getSize().getHeight();
		int width= image.getSize().getWidth();
		System.out.println(height);
		System.out.println(width);
		driver.close();
}

}
