package org.itstep.lesson10;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import  java.awt. * ;
import  java.awt.event.InputEvent ;
import  java.awt.event.KeyEvent ;
import java.io.IOException;
import java.util.List;

//Запустить браузер
//Открыть url https://swisnl.github.io/jQuery-contextMenu/demo.html
//Кликнуть правой кнопкой мыши по кнопке "right click me"
//В появившемся конекстном меню нажать на кнопку "Quit"
//Переключится на модальное диалоговое окно alert
//Проверить текст сообщения в "alert: clicked: quit"
//Закрыть модально окно
//Закрыть браузер
public class home_work17 {
    public static void main(String[] args) throws InterruptedException, AWTException {
        System.setProperty("webdriver.chrome.driver", "C:\\Webdrivers\\chromedriver.exe");
        WebDriver webDriver = new ChromeDriver();
        String url = "https://swisnl.github.io/jQuery-contextMenu/demo.html";
        System.out.println("Start test1");
        webDriver.get(url);

        Actions action = new Actions(webDriver).contextClick(webDriver.findElement(By.cssSelector("body > div.wy-grid-for-nav > section > div > div > div > p > span")));
        action.build().perform();
        WebElement button = null;

        try {
            button = webDriver.findElement(By.cssSelector(" body > ul > li.context-menu-item.context-menu-icon.context-menu-icon-quit "));
            button.click();

            WebDriver.TargetLocator targetLocator = webDriver.switchTo();
            Alert alert = targetLocator.alert();
            String expectedText = "clicked: quit ";
            String actualText = alert.getText();
            if (expectedText.equals(actualText)) {
                System.out.println("Passed");
            } else {
                System.out.println("Модальное окно содержит текст " + actualText);
            }
            alert.accept();
            System.out.println("Все прошло хорошо");
        } catch (NoSuchElementException e) {
            System.out.println("Элемент не найден");
        }

        System.out.println("End test2");
        Thread.sleep(2000);

    }
}

















