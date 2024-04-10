package org.example;


import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class Gmail extends base {


    WebDriver driver1;
    String ChromeDriverPath = "/Users/chathuraj/Documents/Data/Driver/chromedriver";

    @Test
    public void gmil() {
        OpenChrom();
        driver.get("https://www.youtube.com");

        driver.findElement(By.name("firstName")).sendKeys("asdasdasd");
        driver.findElement(By.name("lastName")).sendKeys("sqwqwe");
        driver.findElement(By.name("Username")).sendKeys("sqwqwe123213csw");
        driver.findElement(By.name("Passwd")).sendKeys("TBNUxe5g8P8kZwEt");
        driver.findElement(By.name("Passwd")).sendKeys("ConfirmPasswd");
        driver.findElement(By.xpath("//*[@id=\"accountDetailsNext\"]/div")).click();


    }

    public String[] proxyList() {
        String[] proxies = new String[500];
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--headless");
        System.setProperty("webdriver.chrome.driver", ChromeDriverPath);
        ChromeDriver driver = new ChromeDriver(options);

        driver1.get("https://github.com/clarketm/proxy-list/blob/master/proxy-list.txt");

        List<WebElement> elm = driver.findElements(By.xpath("//*[@class=\"blob-code blob-code-inner js-file-line\"]"));

        // Foo[] array = new Foo[list.size()];

        for (int i = 0; i <= elm.size() - 1; i++) {

            String a = elm.get(i).getText();
            if (elm.get(i).getText().contains("+") && !elm.get(i).getText().contains("!")) {
                proxies[i] = elm.get(i).getText();

            }

        }


        String[] removedNull = Arrays.stream(proxies).filter(value -> value != null && value.length() > 0).toArray(size -> new String[size]);
        String[] removedNull2 = new String[10];
        String[] removedNull3 = new String[300];
        for (int k = 2; k <= removedNull.length - 1; k++) {
            removedNull2 = removedNull[k].split(" ");

            removedNull3[k] = removedNull2[0];

        }
        String[] removedNull4 = Arrays.stream(removedNull3).filter(value -> value != null && value.length() > 0).toArray(size -> new String[size]);

        //driver.quit();
        return removedNull4;


    }

    // @Test
    public String[] proxyListUS() {
        String[] proxies = new String[500];
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--headless");
        System.setProperty("webdriver.chrome.driver", ChromeDriverPath);
        ChromeDriver driver = new ChromeDriver(options);

        driver.get("https://github.com/clarketm/proxy-list/blob/master/proxy-list.txt");

        List<WebElement> elm = driver.findElements(By.xpath("//*[@class=\"blob-code blob-code-inner js-file-line\"]"));

        // Foo[] array = new Foo[list.size()];

        for (int i = 0; i <= elm.size() - 1; i++) {

            String a = elm.get(i).getText();
            if (elm.get(i).getText().contains("US") && elm.get(i).getText().contains("S")) {
                proxies[i] = elm.get(i).getText();

            }

        }


        String[] removedNull = Arrays.stream(proxies).filter(value -> value != null && value.length() > 0).toArray(size -> new String[size]);
        String[] removedNull2 = new String[10];
        String[] removedNull3 = new String[300];
        for (int k = 2; k <= removedNull.length - 1; k++) {
            removedNull2 = removedNull[k].split(" ");

            removedNull3[k] = removedNull2[0];

        }
        String[] removedNull4 = Arrays.stream(removedNull3).filter(value -> value != null && value.length() > 0).toArray(size -> new String[size]);

        //driver.quit();
        return removedNull4;


    }

    @Test
    public void ChromOptions() throws InterruptedException {


        String[] proxies = {"45.79.230.234:80", "23.234.213.157:6666"};
        //String[] proxies = proxyListUS();

        for (int i = 0; i < proxies.length; i++) {
            System.setProperty("webdriver.chrome.driver", ChromeDriverPath);

            ChromeOptions options = new ChromeOptions();
            options.addArguments("--proxy-server=" + proxies[i] + "");
            options.addArguments("--no-sandbox");
            options.addArguments("--disable-gpu");
            // options.addArguments("--headless");
            options.addArguments("--allow-insecure-localhost");
            options.addArguments("acceptInsecureCerts");
            options.addArguments("--ignore-certificate-errors");
            ChromeDriver driver = new ChromeDriver(options);
            driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);


            driver.get("http://search4.info/recommend/?q=Insurance&u=220401535");

            Thread.sleep(400);


//            List<WebElement> elm = driver.findElements(By.tagName("div"));
//
//            if(elm.size()<50)
//            {
//                driver.quit();
//            }
//            else {
//
//                try {
//                    driver.findElement(By.xpath("(//*[@src=\"https://b.blogmura.com/original/1274049\"])[1]")).click();
//                    Thread.sleep(5000);
//                    driver.quit();
//                } catch (Exception e) {
//
//                }
            driver.quit();

            // }

        }

    }

    @Test
    public void filewrite() throws IOException, InterruptedException {

        for (int i = 0; i < 3000; i++) {
            String URL = "https://canadanewsmedia.ca/coping-with-a-lawsuit-4-things-that-can-help/";
            FileWriter writer1 = new FileWriter("/Users/chathuraj/Downloads/office/office/BackOffice.javab2bid.txt", true);


            writer1.write(URL + "-" + java.time.LocalDateTime.now() + "" + System.lineSeparator());
            writer1.close();

            Thread.sleep(4000);
        }
    }


    @Test
    public void premiumbeat() throws IOException {
        OpenChrom();
        driver.get("https://www.premiumbeat.com/royalty-free-music?c3api=9782%2C127746415855%2C576056013528&gclid=Cj0KCQiAi9mPBhCJARIsAHchl1wP66ufzxXVQM5dZtj6u5POvHIGiYnW6aBOxaEgDl8L6HV3cV3TMGYaAqdSEALw_wcB&utm_campaign=PremiumBeat_GMAPAC_rtconv_ChooseyMusic&utm_content=ChooseyMusic_EN_Display-Image_RFM&utm_medium=acq_display&utm_source=adwords");


        List<WebElement> elm = driver.findElements(By.xpath("//a[contains(@id,\"E2E_Song\")]"));
        String SongName[] = new String[elm.size()];
        int i = 0;
        for (WebElement name : elm) {


            SongName[i] = name.getText();
            i++;
        }

        List<WebElement> elmDuration = driver.findElements(By.xpath("//div[contains(@id,\"E2E_SongListItemDuration\")]"));
        String SongNameDUration[] = new String[elm.size()];
        int j = 0;
        for (WebElement nameduration : elmDuration) {


            SongNameDUration[j] = nameduration.getText();
            j++;
        }

        List<WebElement> BPM = driver.findElements(By.xpath("//div[contains(@id,\"E2E_SongListItemBPM\")]"));
        String BPMData[] = new String[elm.size()];
        int k = 0;
        for (WebElement _BPM : BPM) {


            BPMData[k] = _BPM.getText();
            k++;
        }


        for (int a = 0; a < SongName.length; a++) {
            FileWriter writer1 = new FileWriter("/Users/chathuraj/Documents/Data/fi/Sample.txt", true);


            writer1.write("Title : " + SongName[a] + ",Duration : " + SongNameDUration[a] + ",BPM : " + BPMData[a] + "-" + java.time.LocalDateTime.now() + "" + System.lineSeparator());
            writer1.close();
        }

    }

    @Test
    public void gumtree() throws IOException {
        OpenChrom();
        driver.get("https://www.gumtree.com.au/s-r5?hpgAds=y");


        List<WebElement> img = driver.findElements(By.xpath("//*[contains(@class,\"main-image-wrapper\")]//*[@class=\"user-ad-image__thumbnail image image--is-visible\"]"));

        List<String> imgArry = new ArrayList<String>();
        List<String> TitleArry = new ArrayList<String>();
        List<String> DescriptionArry = new ArrayList<String>();
        List<String> location = new ArrayList<String>();


        for (WebElement rlm : img) {
            imgArry.add(rlm.getAttribute("src"));

        }

        List<WebElement> Title = driver.findElements(By.xpath("//*[@class=\"user-ad-row-new-design__title-span\"]"));
        for (WebElement Title1 : Title) {
            TitleArry.add(Title1.getText());

        }


        List<WebElement> description = driver.findElements(By.xpath("//*[@class=\"user-ad-row-new-design__description-text\"]"));

        for (WebElement description1 : description) {
            DescriptionArry.add(description1.getText());

        }

        List<String> newPrice = new ArrayList<String>();

        for (int i = 1; i < description.size(); i++) {
            try {
                WebElement price = driver.findElements(By.xpath("//*[@class=\"user-ad-price-new-design user-ad-row-new-design__price\"]")).get(i);
                WebElement aa = price.findElement(By.tagName("span"));
                newPrice.add(aa.getText());
            } catch (Exception e) {

            }


        }
        List<WebElement> loca = driver.findElements(By.xpath("//*[@class=\"user-ad-row-new-design__location\"]"));
        for (WebElement loc1 : loca) {
            location.add(loc1.getText());

        }

        for (int a = 0; a < imgArry.size(); a++) {
            FileWriter writer1 = new FileWriter("/Users/chathuraj/Documents/Data/fi/Sample1.txt", true);


            writer1.write("ImgURL : " + imgArry.get(a) + ">Title : " + TitleArry.get(a) + ">Description : " + DescriptionArry.get(a) + ">Location : " + location.get(a) + ">Price :" + newPrice.get(a) + java.time.LocalDateTime.now() + "" + System.lineSeparator());
            writer1.close();
        }


    }

    @Test
    public void Canibes() throws InterruptedException, IOException {
        OpenChrom();
        driver.get("https://www.contactcanada.com/database/companies.php?portal=6&s=0&l=90");

        List<WebElement> list = driver.findElements(By.xpath("//*[@class=\"rowOdd\"]/a"));
        List<String> newURL = new ArrayList<String>();

        for (WebElement URL : list) {
            newURL.add(URL.getAttribute("href"));
        }

        for (String url1 : newURL) {


            String url;
            driver.get(url1);
            Thread.sleep(3000);
            String head = driver.findElement(By.className("headingCompany")).getText();
            String profileAddress = driver.findElement(By.className("profileAddress")).getText();
            String profileNumbers = driver.findElement(By.className("profileNumbers")).getText();

            try {
                url = driver.findElement(By.xpath("//*[@class=\"linkExternal iconNewWindowLeave\"]")).getText();

            } catch (Exception e) {
                url = "";
            }
            String profileContact1 = driver.findElement(By.className("profileContact1")).getText();
            String profileContact2 = driver.findElement(By.className("profileContact2")).getText();
            String profileContact3 = driver.findElement(By.className("profileContact3")).getText();
            String profileContact4 = driver.findElement(By.className("profileContact4")).getText();
            String profileFounded = driver.findElement(By.className("profileFounded")).getText();
            String profileRevenue = driver.findElement(By.className("profileRevenue")).getText();
            String profileStaff = driver.findElement(By.className("profileStaff")).getText();
            String profileSpecialtyBox = driver.findElement(By.className("profileSpecialtyBox")).getText();
            String profileSummary = driver.findElement(By.className("profileSummary")).getText();

            FileWriter writer1 = new FileWriter("/Users/chathuraj/Documents/Data/fi/contactcanada.txt", true);


            writer1.write(head + "," + profileAddress + "," + url + "," + profileNumbers + "," + profileContact1 + "," + profileContact2 + "," + profileContact3 + "," + profileContact4 + "," + profileFounded + "," + profileFounded + "," + profileRevenue + "," + profileStaff + "," + profileSpecialtyBox + "," + profileSummary + System.lineSeparator());
            writer1.close();


        }


    }

    @Test
    public void fiverPinkSales() throws IOException, InterruptedException {

        for (int i = 0; i < 3000; i++) {
            String URL = "https://www.benoakley.co.uk";
            //OpenChrom();
            //driver.get(URL);

            //driver.navigate().refresh();
            //Thread.sleep(4000);
            FileWriter writer1 = new FileWriter("/Users/chathuraj/Downloads/benoakley.txt", true);


            writer1.write(URL + "-" + java.time.LocalDateTime.now() + "" + System.lineSeparator());
            writer1.close();

            Thread.sleep(4000);
            //driver.quit();
        }


    }

    @Test
    public void temp()
    {
        String[] menuList = {"dairy","meat-poultry","dry-store","fresh-produce"};


        for(int i=0;i<=menuList.length-1;i++)
        {
            System.out.println(menuList[i]);
        }

    }


}
