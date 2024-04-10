package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class cleanBasketFromFE {

    @Test
    public void CleanBasket() throws IOException, InterruptedException {

        Scanner sc1 = new Scanner(new File("/Users/chathuraj/Downloads/psvUSerforCleanBasket.txt"));
        List<String> newB2B = new ArrayList<String>();
        while (sc1.hasNextLine()) {
            newB2B.add(sc1.nextLine());
        }

        String[] userlist = newB2B.toArray(new String[0]);

        System.setProperty("webdriver.chrome.driver", "/Users/chathuraj/Documents/Data/Driver/chromedriver");
        WebDriver driver = new ChromeDriver();

        String baseUrl = "https://accstorefront.cmgii8vaud-brakebros1-s1-public.model-t.cc.commerce.ondemand.com/sign-in";
        driver.get(baseUrl);
        driver.manage().window().maximize();

        for (String user : userlist) {


            driver.findElement(By.name("j_username")).sendKeys(user);
            driver.findElement(By.name("j_password")).sendKeys("Syspsv12!");
            Thread.sleep(2000);
            driver.findElement(By.xpath("//*[contains(text(),\"Sign In\")]")).click();
            Thread.sleep(3000);


            WebElement count = driver.findElement(By.xpath("(//*[@class=\"nav-items-total\"])[2]"));
            int count1 = Integer.parseInt(count.getText());
            if (count1 != 0) {

                try {
                    driver.findElement(By.xpath("(//*[@class=\"mini-cart-link btn js-miniCartHeader ga-nav-bar-5 p0\"])[2]")).click();
                    Thread.sleep(3000);

                    WebElement elm = driver.findElement(By.xpath("//*[@class=\"cart__clear-items hidden-xs hidden-sm\"]"));

                    elm.click();


                    Thread.sleep(3000);

                    driver.findElement(By.xpath("(//*[@id=\"clearCartItemsPost\"])[1]/button[2]")).click();
                    Thread.sleep(3000);
                    driver.findElement(By.xpath("//*[@class=\"icon icon-user\"]")).click();
                    Thread.sleep(2000);

                    System.out.printf(user);
                    Thread.sleep(1000);

                    driver.findElement(By.xpath("//*[@class=\"icon icon-logout account-action__icon\"]")).click();
                } catch (Exception e) {
                    FileWriter writer2 = new FileWriter("/Users/chathuraj/Downloads/psvUSerforCleanBasketError.txt", true);


                    writer2.write(user + System.lineSeparator());
                    writer2.close();
                    System.out.printf("errrrr"+user);
                    driver.navigate().back();
                    Thread.sleep(4000);
                    driver.findElement(By.xpath("//*[@class=\"icon icon-user\"]")).click();
                    Thread.sleep(2000);

                    driver.findElement(By.xpath("//*[@class=\"icon icon-logout account-action__icon\"]")).click();
                    Thread.sleep(2000);
                }
            }
            else {
                driver.findElement(By.xpath("//*[@class=\"icon icon-user\"]")).click();
                Thread.sleep(2000);

                driver.findElement(By.xpath("//*[@class=\"icon icon-logout account-action__icon\"]")).click();
                Thread.sleep(2000);
            }



            Thread.sleep(1000);
            String baseUrl1 = "https://accstorefront.cmgii8vaud-brakebros1-s1-public.model-t.cc.commerce.ondemand.com/sign-in";
            driver.get(baseUrl1);
            Thread.sleep(2000);
        }
        driver.quit();
    }
}
