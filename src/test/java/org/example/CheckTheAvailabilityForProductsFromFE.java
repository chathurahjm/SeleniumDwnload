package org.example;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CheckTheAvailabilityForProductsFromFE {

    @Test
    public void getProducts() throws IOException, InterruptedException {
        Scanner sc = new Scanner(new File("/Users/chathuraj/Downloads/psvUSerforCleanBasket.txt"));
        List<String> WrongPasswordUserList = new ArrayList<String>();
        while (sc.hasNextLine()) {
            WrongPasswordUserList.add(sc.nextLine());
        }

        String[] _user = WrongPasswordUserList.toArray(new String[0]);


        for (String user:_user ) {


            System.setProperty("webdriver.chrome.driver", "/Users/chathuraj/Documents/Data/Driver/chromedriver");
            WebDriver driver = new ChromeDriver();

            String baseUrl = "https://accstorefront.cmgii8vaud-brakebros1-s1-public.model-t.cc.commerce.ondemand.com/sign-in";
            driver.get(baseUrl);
            driver.manage().window().maximize();
            Thread.sleep(2000);
            driver.findElement(By.name("j_username")).sendKeys(user);
            driver.findElement(By.name("j_password")).sendKeys("Syspsv12!");
            Thread.sleep(2000);
            try {


                driver.findElement(By.xpath("//*[contains(text(),\"Sign In\")]")).click();
                Thread.sleep(3000);

                String[] productCodes = {"70215", "70201", "70325", "70327", "120893", "71035", "29177", "29175", "74516"};

                String price;
                for (int i = 0; i < 9; i++) {
                    driver.findElement(By.id("js-site-search-input")).clear();
                    Thread.sleep(2000);

                    driver.findElement(By.id("js-site-search-input")).sendKeys(productCodes[i]);
                    Thread.sleep(2000);
                    driver.findElement(By.xpath("//*[@class=\"btn js_search_button site-search__submit-btn input-group-btn\"]")).click();
                    Thread.sleep(3000);

                    try {
                        price = driver.findElement(By.xpath("(//span[@class='product-details-price--current-price js-loadPriceValue '])[1]")).getText();
                        if (price.equalsIgnoreCase("Price Unavailable")) {
                            FileWriter writer2 = new FileWriter("/Users/chathuraj/Downloads/pricenotavailable.txt", true);
                            writer2.write(user + System.lineSeparator());
                            writer2.close();
                            break;
                        }
                        else {
                            FileWriter writer4 = new FileWriter("/Users/chathuraj/Downloads/good.txt", true);
                            writer4.write(user +"="+price+"="+productCodes[i]+ System.lineSeparator());
                            writer4.close();
                        }
                    } catch (Exception e) {
                        FileWriter writer3 = new FileWriter("/Users/chathuraj/Downloads/errors.txt", true);
                        writer3.write(user + System.lineSeparator());
                        writer3.close();
                        break;
                    }
                }

            }
            catch (Exception e)
            {

            }
            System.out.println(user);

            driver.quit();
        }
    }
}
