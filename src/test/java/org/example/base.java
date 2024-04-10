package org.example;

import java.util.Collections;
import java.util.HashMap;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

public class base {

    public WebDriver driver;


    public void OpenChrom() {
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
        driver = new ChromeDriver(opt);

        int width = 1024;
        int height = 1024;
        Dimension dimension = new Dimension(width, height);
        driver.manage().window().setSize(dimension);

    }

    public void OpenChromExistingBrowser() {
        System.setProperty("webdriver.chrome.driver", "C:\\Driver\\chromedriver.exe");

        String userProfile= "C:\\Users\\cja\\AppData\\Local\\Google\\Chrome\\User Data\\Default\\";
        ChromeOptions options = new ChromeOptions();
        options.addArguments("user-data-dir="+userProfile);
        options.addArguments("chrome.switches", "--disable-extensions");

        options.addArguments("--start-maximized");
        driver = new ChromeDriver(options);
        driver.get("http://www.google.com");
        driver.manage().window().maximize();

    }


    public void edge()
    {
        System.setProperty("webdriver.edge.driver", "C:\\Users\\cja\\Downloads\\edgedriver_win64\\msedgedriver.exe");

//Creating an object of EdgeDriver
         driver = new EdgeDriver();
    }

    public void OpeHTMLUnit() {
       // System.setProperty("webdriver.chrome.driver", "C:\\Driver\\chromedriver.exe");
        driver = new HtmlUnitDriver();
        driver.manage().window().maximize();
    }

    public void OpenChromeHeadLess() {
        System.setProperty("webdriver.chrome.driver", "C:\\Driver\\chromedriver.exe");

        ChromeOptions opt = new ChromeOptions();
//#chrome_options.add_argument("--disable-extensions")
//#chrome_options.add_argument("--disable-gpu")
//#chrome_options.add_argument("--no-sandbox") #linux only
        opt.addArguments("--headless --window-size=1500,1200");
        opt.addArguments("download.default_directory","C:\\Driver\\");

        String downloadFilepath = "C:\\Driver\\";
        HashMap<String, Object> chromePrefs = new HashMap<String, Object>();
              chromePrefs.put("profile.default_content_settings.popups", 0);
              chromePrefs.put("download.default_directory", downloadFilepath);
              //ChromeOptions options = new ChromeOptions();
              opt.setExperimentalOption("prefs", chromePrefs);
              DesiredCapabilities cap = DesiredCapabilities.chrome();
              cap.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);
              cap.setCapability(ChromeOptions.CAPABILITY, opt);
        //driver = new ChromeDriver(cap);
        driver = new ChromeDriver(opt);

       // driver = webdriver.Chrome(options = chrome_options)
    }
}
