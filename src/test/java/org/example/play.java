package org.example;
import com.microsoft.playwright.*;
import org.testng.annotations.Test;


public class play {

    @Test
    public void plsytest()
    {
        Playwright playwright = Playwright.create();
        Browser browser = playwright.chromium().launch();
        Page page = browser.newPage();
        page.navigate("http://playwright.dev");
        System.out.println(page.title());
    }

}
