package org.itstep.lesson7;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Iterator;
import java.util.Set;

public class WindowExample {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\webdrivers\\chromedriver_win32 (1)\\chromedriver.exe");
        WebDriver webDriver = new ChromeDriver();
        System.out.println("Start test");
        webDriver.get("C:\\Users\\Lukashyk\\IdeaProjects\\SeleniumQA2020\\src\\main\\resources\\windows.html");

        WebElement btn = webDriver.findElement(By.cssSelector("#btm > button"));
        Set<String> windowHandles = webDriver.getWindowHandles();
        System.out.println("Before open window");
        showWindows(windowHandles);
        System.out.println("------------------------------------");
        btn.click();

        Thread.sleep(2000);

        String s = showWindows(windowHandles);
        System.out.println("After open window");
        webDriver.switchTo().window(s);

        System.out.println("Title = " + webDriver.getTitle());

        webDriver.quit();
        System.out.println("End test");
    }
    public static String showWindows(Set<String> windowHandles) {
        Iterator<String> iterator = windowHandles.iterator();
        while (iterator.hasNext()) {
            String next = iterator.next();
            System.out.println("handler = " + next);
            return next;
        }
        return null;
    }
}
