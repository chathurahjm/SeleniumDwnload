package org.example;

import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class ekimg extends base {
    
    @Test
    public void imgdwnlod() throws IOException, InterruptedException
    {
       
        OpenChromeHeadLess();
        System.out.println("WW");
        for(int i =0; i<600;i++)
        { 
        driver.get("https://elakiri.com/threads/%E0%B6%85%E0%B6%AD%E0%B7%8A-%E0%B7%80%E0%B7%90%E0%B6%A9.1791466/page-"+i);
       
        Thread.sleep(3000);
        List<WebElement> elm = driver.findElements(By.xpath("//div[@class=\"bbWrapper\"]/div[@class=\"bbImageWrapper  js-lbImage\"]"));
    
       
        for (WebElement iterable_element : elm) {
            
            FileWriter writer2 = new FileWriter("E:\\New folder\\New folder (4)\\errorrrr.txt", true);

            writer2.write(iterable_element.getAttribute("data-src")+ System.lineSeparator());
            writer2.close();
        }
       

      


    }
    }
}
