package scanners;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 *
 * @author User
 */

public class Scanners extends Page{
    
    public static WebDriver wd;
 
    
    public static void main(String[] args){
    
       Page instance = new Page();
        
       
       instance.setUp();
       instance.navigateToUrl("http://hjqa02.woolworths.co.za/webtrmgw/webtrmgw.dll?ProcessStartRequest?inputdata=empty");
       instance.signIn("HJQA02", "4600","WT_019");
       instance.Login("Yonela");
       instance.Password("YON");
       instance.Trolley("F1");
       
//     instance.quit();
     

   }
}
