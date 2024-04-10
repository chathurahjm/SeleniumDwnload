package org.example;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.util.Calendar;
import java.util.Date;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class youtube {

    @Test
    public void navigateYoutube() throws InterruptedException {

        Thread.sleep(4000000); // Sleep
        Thread.sleep(4000000); // Sl// eep

        long startTime = System.currentTimeMillis();

        // Run the loop for one hour (3600 seconds)
        while (System.currentTimeMillis() - startTime < TimeUnit.HOURS.toMillis(7)) {
            // Initialize WebDriver
            WebDriver driver = new ChromeDriver();

            // Navigate to Google
            driver.get("https://www.youtube.com/@day2day/playlists");

            //Thread.sleep(8000); // Sleep
            WebElement element = driver.findElement(By.xpath("(//*[@class='yt-simple-endpoint style-scope ytd-playlist-thumbnail'])[4]"));

            // Simulate pressing the space button on the element
            element.click();
            Thread.sleep(2000000);


            driver.quit();
        }
            // Close WebDriver after navigating

    }

    // Calculate the initial delay to start at 1:00 AM
    private static long calculateInitialDelay() {
        Calendar calendar = Calendar.getInstance();
        calendar.set(Calendar.HOUR_OF_DAY, 1);
        calendar.set(Calendar.MINUTE, 0);
        calendar.set(Calendar.SECOND, 0);
        Date now = new Date();
        long initialDelay = calendar.getTimeInMillis() - now.getTime();
        if (initialDelay < 0) {
            // If current time is past 1:00 AM, add 24 hours to delay
            initialDelay += TimeUnit.HOURS.toMillis(24);
        }
        return initialDelay;
    }

    // Calculate the delay until 7:00 AM
    private static long calculateShutdownDelay() {
        Calendar calendar = Calendar.getInstance();
        calendar.set(Calendar.HOUR_OF_DAY, 7);
        calendar.set(Calendar.MINUTE, 0);
        calendar.set(Calendar.SECOND, 0);
        Date now = new Date();
        long shutdownDelay = calendar.getTimeInMillis() - now.getTime();
        if (shutdownDelay < 0) {
            // If current time is past 7:00 AM, add 24 hours to delay
            shutdownDelay += TimeUnit.HOURS.toMillis(24);
        }
        return shutdownDelay;
    }

    }
