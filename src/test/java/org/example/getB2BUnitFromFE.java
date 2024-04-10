package org.example;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class getB2BUnitFromFE {

    @Test
    public void b2BLogin() throws InterruptedException, IOException {
        Scanner sc = new Scanner(new File("/Users/chathuraj/Downloads/psvUSerforCleanBasket.txt"));
        List<String> lines = new ArrayList<String>();
        while (sc.hasNextLine()) {
            lines.add(sc.nextLine());
        }

        String[] arr = lines.toArray(new String[0]);

        for (String UserName:arr) {


            System.setProperty("webdriver.chrome.driver", "/Users/chathuraj/Documents/Data/Driver/chromedriver");
            WebDriver driver = new ChromeDriver();
            String baseUrl = "https://accstorefront.cmgii8vaud-brakebros1-s1-public.model-t.cc.commerce.ondemand.com/sign-in";
            driver.get(baseUrl);
            driver.manage().window().maximize();
            driver.findElement(By.name("j_username")).sendKeys(UserName);
            driver.findElement(By.name("j_password")).sendKeys("Syspsv12!");
            Thread.sleep(2000);
            driver.findElement(By.xpath("//*[contains(text(),\"Sign In\")]")).click();

            try {
                WebDriverWait wait = new WebDriverWait(driver, 30);
                wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@class=\"icon icon-user\"]"))).click();
                Thread.sleep(2000);
                WebElement mainNav = driver.findElement(By.xpath("//*[@class=\"account-dropdown__account-id\"]"));


                String a= mainNav.getText();
                FileWriter writer1 = new FileWriter("/Users/chathuraj/Downloads/b2b.txt", true);

                writer1.write(UserName +"="+ a + System.lineSeparator());
                writer1.close();


            }
            catch (Exception e)
            {
                FileWriter writer2 = new FileWriter("/Users/chathuraj/Downloads/errorrrr.txt", true);

                writer2.write(UserName + System.lineSeparator());
                writer2.close();

            }
            System.out.println(UserName);
            driver.quit();

        }
    }
}
