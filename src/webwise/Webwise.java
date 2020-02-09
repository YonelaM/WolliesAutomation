package webwise;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import static scanners.Scanners.wd;

/**
 *
 * @author User
 */
public class Webwise{
    
    public static WebDriver driver;
 
    public static void main(String[] args){
    
       WebwisePage instance = new WebwisePage();

        try {
            
            instance.setUp();
            instance.navigateToUrl("https://hjqa02.woolworths.co.za/core/Default.html");
            instance.Authentication();
            instance.tearDown();
    //       ClickElementByXpath("//hj-dropdownlist[@data-hj-test-id='authenticationMode']");
//           driver.findElement(By.xpath("//hj-dropdownlist[@data-hj-test-id='authenticationMode']")).click();
//           driver.findElement(By.xpath("//select//option[@value=2]/ancestor::div[@class='field-control']")).click();
        } catch (Exception e) {
            System.out.println(e);
        }

       
//       driver.close();
//       instance.menu();
//     instance.signIn("HJQA02", "4600","WT_017");
//     instance.addNewCustomer("Lex","Lex24","lex622@gmail.com");
//     istance.EditCustomerForm("34380","thandie123@gmail.com");
//     instance.DeleteCustomer("34380");
//     instance.NewAccount("34380","Savings", "5000"); acc:65641nstance.EditCustomerForm("34380","thandie123@gmail.com");
//     instance.DeleteCustomer("34380");
//     instance.NewAccount("34380","Savings", "5000"); acc:65641

 
//     instance.quit();
     

   }
}
