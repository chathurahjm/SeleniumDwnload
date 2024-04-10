package org.example;

import com.machinepublishers.jbrowserdriver.JBrowserDriver;
import com.machinepublishers.jbrowserdriver.Settings;
import com.machinepublishers.jbrowserdriver.Timezone;
import com.machinepublishers.jbrowserdriver.UserAgent;
import org.apache.http.cookie.Cookie;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import javax.swing.text.Document;
import java.util.HashMap;
import java.util.logging.Level;

public class jbrowser {
    Cookie cookie;
    JBrowserDriver jBrowserDriver = null;


    public JBrowserDriver getDriver(Boolean headless) {
        if (jBrowserDriver == null) {

            //log.info("JBrowser was null, initalizing");

            jBrowserDriver = new JBrowserDriver(Settings.builder()
                    .timezone(Timezone.EUROPE_BERLIN)
                    .ssl("compatible")
                    .cache(true)
                    .javascript(true)
                    .headless(headless)
                    .userAgent(UserAgent.CHROME)
                    .logTrace(true)
                    .loggerLevel(Level.ALL)
                    .build());

        }
        return jBrowserDriver;
    }

@Test
    private void testFunction() {

    getDriver(true);
    // ..
        jBrowserDriver.get("https://cloudflare.site");
//    cookie = (Cookie) jBrowserDriver.manage().getCookies();
//
//        HashMap<String, String> cookieMap = new HashMap<>();
//
//    cookie.forEach(cookie -> cookieMap.put(cookie.getName(), cookie.getValue()));
//
//        Document document = Jsoup.connect(requestPage).cookies(cookieMap).get();
//
//    }
}
}
