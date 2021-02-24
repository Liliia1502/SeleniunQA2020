package org.itstep.lesson1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Application {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Webdrivers\\chromedriver.exe");
        WebDriver webDriver = new ChromeDriver();
        String url = "http://rozetka.com.ua";
        webDriver.get(url);
        //webDriver.get("http://rozetka.com.ua");
        Thread.sleep(1000);
        System.out.println(webDriver.getCurrentUrl());
        if (url.equals(webDriver.getCurrentUrl())) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
        System.out.println("OK");
        webDriver.close();


    }
}
