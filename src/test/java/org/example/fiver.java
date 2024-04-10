package org.example;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.awt.AWTException;
import java.awt.Robot;	
import java.awt.event.KeyEvent;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class fiver extends  base {

    @Test
    public  void downloadjpg() throws IOException
    {
        OpenChrom();
        String url ="https://acoirtbbtr.cloudimg.io/https://uploads-ssl.webflow.com/5fb52f5c395aa436ecf981d4/63037c4a30903d866d71b8b2_IMG_8334.jpg";
        
        driver.get(url);
    
        // try (FileWriter fstream = new FileWriter("C://1.webp")) {
        //     BufferedWriter out = new BufferedWriter(fstream);
        //     out.write(driver.getPageSource());
        //      //Close the output stream
        //     out.close();
        //     driver.quit();
        // } catch (IOException e) {
        //     // TODO Auto-generated catch block
        //     e.printStackTrace();
        // }

       // String pageSource=driver.findElement(By.tagName("img")).getAttribute("src").toString();

       String pageSource1=driver.findElement(By.tagName("html")).toString();
       String pageSource = driver.getPageSource();

        //pageSource.replace(url,url);



        FileWriter fstream = new FileWriter("C://11.webp");
        BufferedWriter out = new BufferedWriter(fstream);
       
    //String content = (String)((JavascriptExecutor)driver).executeScript("return $('html').html();"));
        out.write(pageSource);
        out.close();
        driver.quit();
} 

@Test
public  void downloadjpg1() throws IOException, InterruptedException, AWTException
{
    OpenChrom();
    String url ="https://acoirtbbtr.cloudimg.io/https://uploads-ssl.webflow.com/5fb52f5c395aa436ecf981d4/63037c4a30903d866d71b8b2_IMG_8334.jpg";
    
    driver.get(url);
    Thread.sleep(4000);
    Actions action = new Actions(driver); 

    WebElement element =driver.findElement(By.tagName("body"));
    action.contextClick(element).click().perform();
    Thread.sleep(2000);

    Robot robot = new Robot();
    robot.keyPress(KeyEvent.VK_DOWN);
    Thread.sleep(1000);
    
    robot.keyRelease(KeyEvent.VK_DOWN);
    Thread.sleep(1000);

    robot.keyPress(KeyEvent.VK_DOWN);
    Thread.sleep(1000);
    
    robot.keyRelease(KeyEvent.VK_DOWN);
    Thread.sleep(1000);

    robot.keyPress(KeyEvent.VK_ENTER);
    Thread.sleep(1000);
    robot.keyRelease(KeyEvent.VK_ENTER);
    Thread.sleep(5000);

    robot.keyPress(KeyEvent.VK_ENTER);
    Thread.sleep(2000);
    robot.keyRelease(KeyEvent.VK_ENTER);
    Thread.sleep(2000);
    driver.quit();

}
    
}
