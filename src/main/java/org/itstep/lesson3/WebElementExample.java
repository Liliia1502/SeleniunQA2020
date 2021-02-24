package org.itstep.lesson3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class WebElementExample {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\Webdrivers\\chromedriver.exe");
        WebDriver webDriver = new ChromeDriver();
        String url = "file:///C:/automation-practice-table.html";

        System.out.println("Start test");
        webDriver.get(url);

        //WebElement h2 = webDriver.findElement(By.tagName("h2"));//для однго эл-та
        List<WebElement> td = webDriver.findElements(By.tagName("td"));//для нескольких эл-тов

        for(WebElement w : td) {
            System.out.println("text = " + w.getText());
           // System.out.println("tagName = " + w.getTagName());
           // System.out.println("size = " + w.getSize());
           // System.out.println("display = " + w.isDisplayed());
           // w.clear();
           // System.out.println("==========================");
        }
        webDriver.quit();
        System.out.println("End test");

    }
}
