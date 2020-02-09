
import org.openqa.selenium.By;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author W7134551
 */
public class CreateOrderViewPage extends Page{
    
        public void Authentication () {

        wd.findElement(By.xpath("//hj-dropdownlist[@data-hj-test-id='authenticationMode']")).click();
        System.out.println("About to Select Workspace Authentication As An Option!");

        wd.findElement(By.xpath("//div[@class='k-animation-container']/descendant::li[contains(.,'Workspace Authentication')]")).click();
        System.out.println("Workspace Authentication Option Selected!");

        sendKeys("//input[@class='k-textbox' and @placeholder='User Name']", "Yonela");
        sendKeys("//input[@class='k-textbox' and @placeholder='Password']", "YON");

        ClickElementByXpath("//button[@class='k-button']");
        waitForElementToBePresent("//h4[contains(.,'Loading Applications')]");
        waitForElementToBePresent("//div[@class='thread-title' and contains(.,'Home Page')]");

        System.out.println("Logged in successfully!");
 
    }
    
}
