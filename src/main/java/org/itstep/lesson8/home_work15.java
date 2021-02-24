package org.itstep.lesson8;
//Кликнуть по кнопке “New Browser Tab”, что приведет к появлению вкладки браузера
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Collections;
import java.util.Set;
public class home_work15 {
    private static Object Set;

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Webdrivers\\chromedriver.exe");
        WebDriver webDriver = new ChromeDriver();
        webDriver.get("file:///C:/Users/F7B9~1/AppData/Local/Temp/Rar$EXa7740.49606/Lesson7%20hw/windows.html ");
        System.out.println("Start test");
        WebElement button = null;

        try {
            button = webDriver.findElement(By.cssSelector(" #content > p:nth-child(5) > button"));
            button.click();
            WebDriver.TargetLocator targetLocator = webDriver.switchTo();
            Alert alert = targetLocator.alert();

            alert.accept();

            Thread.sleep(2000);
        }catch (NoSuchElementException e){
            System.out.println("Элемент не найден");
        }

        webDriver.quit();
        System.out.println("End test");
        System.out.println("Start test2");
        try {
            button = webDriver.findElement(By.cssSelector("#academy_app"));
            button.click();

            WebDriver.TargetLocator targetLocator = webDriver.switchTo();
            Alert alert = targetLocator.alert();

            Thread.sleep(2000);
            alert.dismiss();
            Thread.sleep(2000);

            System.out.println("Все прошло хорошо");
        } catch (NoSuchElementException | InterruptedException e) {
            System.out.println("Элемент не найден");
        }
        webDriver.quit();
        System.out.println("End test2");
    }
}



