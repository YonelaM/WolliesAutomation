/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package scanners;

import java.util.concurrent.TimeUnit;
//import static scanners.Selenium.driver;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import static scanners.Scanners.wd;
import org.openqa.selenium.support.ui.Select;

/**
 *
 * @author User
 */
public class Page {
    private Object webElement;
    private Object formfield;
    
    public void setUp(){
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\W7134551\\Desktop\\Softwares\\chromedriver_win32\\chromedriver.exe");
        wd = new ChromeDriver();
    }
    
    public void navigateToUrl(String Url){
        System.out.println("Launching chrome browser");
        wd.get(Url);
        wd.manage().window().maximize();
    }
    
    public void signIn(String ServerName, String PortNumber, String DeviceName){
          wd.findElement(By.xpath("//input[@name='server_name']")).sendKeys(ServerName);
          wd.findElement(By.xpath("//input[@name='port_number']")).sendKeys(PortNumber);
          wd.findElement(By.xpath("//input[@name='terminal_name']")).sendKeys(DeviceName);
          Select screensize = new Select(wd.findElement(By.name("screen_size")));
	  screensize.selectByVisibleText("8x40");
 
          wd.findElement(By.xpath("//input[@value='Submit']")).click();
          wd.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
          
//          String validate = driver.findElement(By.xpath("//td[text()='Manger Id : mngr209200']")).getText();
//          System.out.println("The value: "+validate);
//            
//            if (validate.contains("mngr209200")){
//                System.out.println("Successfully Logged in!!");
//            }
    }
    public void Login (String userid){
        wd.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//        driver.findElement(By.xpath("//a[text()='New Customer']")).click();
        wd.findElement(By.xpath("//input[@name='inputdata']")).sendKeys(userid);
        wd.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        wd.findElement(By.xpath("//input[@value='Submit']")).click();
//        driver.findElement(By.xpath("//input[@value='f']")).click();
//        driver.findElement(By.xpath("//input[@id='dob']")).sendKeys(Keys.TAB); 
//        driver.findElement(By.xpath("//input[@id='dob']")).sendKeys("09/19");
//        driver.findElement(By.xpath("//textarea[@name='addr']")).sendKeys("Unit 203 Skyways");
//        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//        
//        
//         String validate = driver.findElement(By.xpath("//p[contains(.,'Customer Registered Successfully!!!')]")).getText();
//         String ID = driver.findElements(By.xpath("//table[@id='customer']//tbody//tr")).get(3).getText();
//         String userID = ID.substring(12);
//         
//            if (validate.contains("Customer Registered Successfully!!!")) {
//                
//                System.out.println("Customer Registered Successfully!");
//                driver.findElements(By.xpath("//a[@href='Managerhomepage.php']")).get(1).click();
//                System.out.println("Customer ID: "+userID);
//                
//             } else {
//                
//                driver.getWindowHandle();
//                System.out.println("Failed");
//            
//            }
    }
    public void Password (String pass){
//         driver.findElement(By.xpath("//a[text()='Edit Customer']")).click();
         wd.findElement(By.xpath("//input[@name='inputdata']")).sendKeys(pass);
         wd.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
         wd.findElement(By.xpath("//input[@value='Submit']")).click();
  
    }
    public void Trolley (String back){
         wd.findElement(By.xpath("//input[@name='inputdata']")).sendKeys(back);
//         driver.findElement(By.xpath("//input[@name='inputdata']")).sendKeys(equipment);
         wd.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
         wd.findElement(By.xpath("//input[@value='Submit']")).click();
         wd.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
         
           
//         driver.switchTo().alert().accept();
//         driver.switchTo().alert().accept();
//         

}
    }
