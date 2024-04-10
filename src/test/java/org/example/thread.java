package org.example;

import org.junit.Test;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.CapabilityType;

import java.io.FileWriter;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Collections;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class thread {

    @Test
    public void  createURLsThread() throws IOException {


        int threads = 20; // Number of threads for concurrent processing
        ExecutorService executor = Executors.newFixedThreadPool(threads);

        for (int i = 0; i <= 111; i++) {
            final int currentURL = i;
            executor.submit(() -> {
                System.setProperty("webdriver.chrome.driver", "C:\\Driver\\chromedriver.exe");


                ChromeOptions opt = new ChromeOptions();

                opt.addArguments("--disable-blink-features=AutomationControlled");
                opt.addArguments("--disable-notifications");
                opt.addArguments("--disable-web-security");
                opt.addArguments("--allow-running-insecure-content");

                opt.setExperimentalOption("excludeSwitches", Collections.singletonList("enable-automation"));
                opt.setExperimentalOption("useAutomationExtension", "False");
                opt.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);
                opt.setCapability(CapabilityType.ACCEPT_INSECURE_CERTS,true);
                ChromeDriver driver = new ChromeDriver(opt);

                int width = 1024;
                int height = 1024;
                Dimension dimension = new Dimension(width, height);
                driver.manage().window().setSize(dimension);
                driver.get("https://www.google.com/");

            });
        }

        executor.shutdown();
        while (!executor.isTerminated()) {
            // Wait for all threads to finish
        }

    }
}

