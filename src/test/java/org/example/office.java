package org.example;

import org.junit.Test;
import org.openqa.selenium.By;

import java.util.ArrayList;

public class office extends base {
    @Test
    public void NewTab() {

        OpenChrom();
        driver.get("https://mathiasbynens.github.io/rel-noopener/");
        String oldTab = driver.getWindowHandle();
        driver.findElement(By.xpath("/html/body/a[1]/b")).click();

        ArrayList<String> newTab = new ArrayList<String>(driver.getWindowHandles());
        //newTab.remove(oldTab);
        // change focus to new tab
        driver.switchTo().window(newTab.get(0));
        System.out.println(driver.getTitle().toString());
        driver.switchTo().window(newTab.get(1));
        System.out.println(driver.getTitle().toString());

    }

    int j =0;
    @Test
    public void testloop() {

        if (1 == 10) {
            while (j==3) {

                testloop();
                j = j + 1;
            }

        }
    }
}
