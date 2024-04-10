package org.example;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;
import java.util.List;
import java.util.NoSuchElementException;

public class download extends base {

    @Test
    public void rajwap() throws InterruptedException {

         Thread.sleep(10000000);

        OpenChrom();
        driver.get("https://rajwap.me/");
        driver.findElement(By.id("login")).click();
        Thread.sleep(2000);

        driver.findElement(By.name("username")).sendKeys("werwsds");
        driver.findElement(By.name("pass")).sendKeys("werwsds");
        driver.findElement(By.xpath("//*[@class=\"inpbutton auth\"]")).click();
        Thread.sleep(6000);

        for (int i = 20; i <= 1010; i++) {
            driver.get("https://rajwap.me/fresh/?p=" + i);

            DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
            LocalDateTime now = LocalDateTime.now();

            System.out.println(dtf.format(now));
            System.out.println("i=" + i);
            String[] cars = new String[90];                                                             
            int j = 0;

            List<WebElement> elm = driver.findElements(By.xpath("//*[@class=\"kt_imgrc\"]"));
            for (WebElement url : elm) {

                cars[j] = url.getAttribute("href").toString();
                j = j + 1;

            }
            try {
                for (String lastURL : cars) {
                    driver.get(lastURL);
                    driver.findElement(By.className("down_video")).click();
                    Thread.sleep(3000);
                    driver.findElement(By.id("vidlinks")).click();
                    Thread.sleep(10000);
                    Thread.sleep(10000);

                }
                FileWriter writer2 = new FileWriter("I:\\12c.txt", true);

                writer2.write(i + System.lineSeparator());
                writer2.close();

            } catch (Exception e) {

            }

        }

    }

    @Test
    public void kashtanka() throws InterruptedException {


        //Thread.sleep(1700000);
       // Thread.sleep(1700000);
       // Thread.sleep(1700000);
        //Thread.sleep(1700000);
       // Thread.sleep(1700000);
       Thread.sleep(1700000);
       
       //  Thread.sleep(1644444);
        OpenChromeHeadLess();
        // Thread.sleep(4444444);
        // Thread.sleep(4444444);
        // OpenChrom();
        driver.get("https://kashtanka.tv/");
        driver.findElement(By.id("login")).click();
        Thread.sleep(2000);

        driver.findElement(By.name("username")).sendKeys("sdfedf");
        driver.findElement(By.name("pass")).sendKeys("sdfedf");
        driver.findElement(By.xpath("//*[@class=\"inpbutton auth\"]")).click();
        Thread.sleep(6000);

        driver.get("https://kashtanka.tv/latest/");

        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
        LocalDateTime now = LocalDateTime.now();

        System.out.println(dtf.format(now));
        String[] cars = new String[120];
        int j = 0;

        List<WebElement> elm = driver.findElements(By.xpath("//*[@class=\"kt_imgrc\"]"));
        for (WebElement url : elm) {

            cars[j] = url.getAttribute("href").toString();
            j = j + 1;
            System.out.println("Extraxt URL Complete");
        }
        try {
            for (String lastURL : cars) {
                System.out.println("Navigate to URL");
                driver.get(lastURL);
                driver.findElement(By.className("down_video")).click();
                Thread.sleep(2000);

                WebElement vidLink = driver.findElement(By.id("vidlinks"));
                Thread.sleep(2000);
                Actions action = new Actions(driver);
                action.moveToElement(vidLink).click().perform();
                Thread.sleep(28000);

            }

        } catch (Exception e) {

        }

        for (int i = 999; i <= 1100; i++) {
            driver.get("https://kashtanka.tv/latest/?p=" + i);

            DateTimeFormatter dtf1 = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
            LocalDateTime now1 = LocalDateTime.now();

            System.out.println(dtf1.format(now1));
            System.out.println("i=" + i);
            String[] cars1 = new String[120];
            int j1 = 0;

            List<WebElement> elm1 = driver.findElements(By.xpath("//*[@class=\"kt_imgrc\"]"));
            for (WebElement url1 : elm1) {

                cars1[j1] = url1.getAttribute("href").toString();
                j1 = j1 + 1;

            }
            try {
                for (String lastURL : cars1) {
                    driver.get(lastURL);
                    driver.findElement(By.className("down_video")).click();
                    Thread.sleep(2000);

                    WebElement vidLink = driver.findElement(By.id("vidlinks"));
                    Thread.sleep(2000);
                    Actions action = new Actions(driver);
                    action.moveToElement(vidLink).click().perform();
                    Thread.sleep(28000);

                }

            } catch (Exception e) {

            }

        }

    }

    @Test
    public void fry99() throws IOException, InterruptedException {

        OpenChrom();

        for (int i=1;i<30;i++) {
            driver.get("https://mydesi2.net/page/" + i + "/");
            String[] URL = new String[50];
            List<WebElement> elm = driver.findElements(By.xpath("//*[@class=\"infos\"]"));
            int j1 = 0;
            for (WebElement url1 : elm) {

                URL[j1] = url1.getAttribute("href").toString();
                j1 = j1 + 1;

            }
          //  URL.removeAll(Arrays.asList("", null));

          //  Arrays.stream(URL).filter(Utils::isEmpty).toArray(String[]::new);
            driver.close();  OpenChrom();

            for (String url1 : URL) {

                Thread.sleep(3000);
                driver.navigate().to(url1);
                String durl = driver.findElement(By.xpath("//*[@id=\"video-rate\"]/a")).getAttribute("href");
                System.out.println(durl);

                driver.close();
                OpenChrom();
                driver.get(durl);

                WebElement e = null;
                String aa = null;
                try {
                    e = driver.findElement(By.xpath("//*[@class=\"btn btn-primary\"]"));
                    aa = e.getAttribute("href");
                } catch (Exception s) {

                }



                FileWriter writer2 = new FileWriter("I:\\111.txt", true);
                System.out.println(aa);
                writer2.write(aa + System.lineSeparator());
                writer2.close();


                driver.close();
                OpenChrom();
            }
            System.out.println(i+"finish");
        }
        driver.close();  OpenChrom();


    }

    @Test
    public void exceptiontest() {

        double a = 1.34;

        OpenChromeHeadLess();
        driver.get("https://www.google.com/");
        try {
            driver.findElement(By.id("login")).click();

        } catch (NoSuchElementException e) {
            System.out.println(e);
            System.out.println("ss");
        }

        driver.quit();
    }

    @Test
    public void fry992() throws IOException {


        OpenChrom();
        for (int i = 1; i < 30; i++) {
            driver.get("https://mydesi2.net/page/" + i + "/");
            String[] URL = new String[50];
            List<WebElement> elm = driver.findElements(By.xpath("//*[@class=\"video-img img-fluid loaded\"]"));
            int j1 = 0;

            for (WebElement url1 : elm) {

                URL[j1] = url1.getAttribute("src").toString();
                FileWriter writer2 = new FileWriter("I:\\qq.txt", true);

                writer2.write(url1 + System.lineSeparator());
                writer2.close();

            }
            driver.close();  OpenChrom();
        }
    }
}
