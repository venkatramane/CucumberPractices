package pages;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FBBasePage {
	
	public static WebDriver driver;
	public static Properties prop;
	
	
public FBBasePage(){
		
		try{
			prop = new Properties();
			FileInputStream fis = new FileInputStream("C:\\Users\\VENKATRAMAN\\workspace\\CricbuzzCucumber\\src\\main\\java\\cric\\buzz\\config\\config.properties");
			prop.load(fis);
		}catch(IOException e){
			e.getMessage();
		}
	}
	
	public static void initialization() throws Exception{
	
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\VENKATRAMAN\\Downloads\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		
		
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
//		driver.manage().timeouts().pageLoadTimeout(TestUtilll.PAGE_LOAD_TIMEOUT, TimeUnit.SECONDS);
//		driver.manage().timeouts().implicitlyWait(TestUtilll.IMPLICITY_WAIT, TimeUnit.SECONDS);
//		
//		driver.get(prop.getProperty("url"));
		
		driver.manage().timeouts().pageLoadTimeout(80, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(70, TimeUnit.SECONDS);
		
		Thread.sleep(3000);
		driver.get("https://www.facebook.com/campaign/landing.php?campaign_id=1653993517&extra_1=s%7Cc%7C318504238004%7Ce%7Cfacebook%20login%7C&placement=&creative=318504238004&keyword=facebook%20login&partner_id=googlesem&extra_2=campaignid%3D1653993517%26adgroupid%3D63066388443%26matchtype%3De%26network%3Dg%26source%3Dnotmobile%26search_or_content%3Ds%26device%3Dc%26devicemodel%3D%26adposition%3D%26target%3D%26targetid%3Dkwd-1409285535%26loc_physical_ms%3D9061899%26loc_interest_ms%3D%26feeditemid%3D%26param1%3D%26param2%3D&gclid=CjwKCAjwq_D7BRADEiwAVMDdHhWyCJxzVVvr2EfuF3hB36Sr2eHadWg_huqzDKXDBl82esN0pb-alxoCk5QQAvD_BwE");
		
	}


}
