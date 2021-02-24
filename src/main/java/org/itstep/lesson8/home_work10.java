package org.itstep.lesson8;
        //Запустить браузер
        // Открыть файл “windows.html”
        // Получить имя текущего окна (используя метод getWindowHandle)

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Collections;
import java.util.Set;

public class home_work10 {
    private static Object Set;

    public static void main(String[] args)  {
        System.setProperty("webdriver.chrome.driver", "C:\\Webdrivers\\chromedriver.exe");
        WebDriver webDriver = new ChromeDriver();
        System.out.println("Start test1");
        webDriver.get(" file:///C:/Users/F7B9~1/AppData/Local/Temp/Rar$EXa7740.49606/Lesson7%20hw/windows.html " );
        WebElement a = webDriver.findElement(By.cssSelector(" #content > h1" ));
        Set <String> windowHandles  = webDriver.getWindowHandles();
        System.out.println("Before open window");
        a.click();
        for (String windowHandle : webDriver.getWindowHandles()) {
            System.out.println("windowHandle = " + windowHandle);
        }
        System.out.println("After open window");

        webDriver.quit();
        System.out.println("End test");
    }
}
































