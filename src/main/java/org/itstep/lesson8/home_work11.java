package org.itstep.lesson8;
//Кликнуть по кнопке “New Browser Window”, что приведет к появлению нового окна браузера
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Collections;
import java.util.Set;
public class home_work11 {
    private static Object Set;

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Webdrivers\\chromedriver.exe");
        WebDriver webDriver = new ChromeDriver();
        webDriver.get(" file:///C:/Users/F7B9~1/AppData/Local/Temp/Rar$EXa7740.49606/Lesson7%20hw/windows.html ");
        System.out.println("Start test");
        WebElement button = null;

        try {
            button = webDriver.findElement(By.cssSelector("#button1 "));
            button.click();
            WebDriver.TargetLocator targetLocator = webDriver.switchTo();
            Alert alert = targetLocator.alert();
            alert.accept();
        }catch (NoSuchElementException e){
            System.out.println("Элемент не найден");
        }
        webDriver.quit();
        System.out.println("End test");
    }
}


