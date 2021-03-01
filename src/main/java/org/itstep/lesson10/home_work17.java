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

        Robot robot = new Robot();
        robot.keyPress(KeyEvent.VK_F11);
        WebElement element = webDriver.findElement(By.cssSelector("body > div > section > div > div > div > p > span "));
        //int x = element.getLocation().getX();
        //int y = element.getLocation().getY();

        //System.out.println(" х = " + x);
        //System.out.println(" y = " + y);
        //robot.mouseMove(x, y);
        //robot.delay(1000);
        robot.mousePress(InputEvent.BUTTON3_DOWN_MASK); // щелчок ()
        robot.mouseRelease(InputEvent.BUTTON3_DOWN_MASK);
        Thread.sleep(2000);
        // webDriver.quit();
        System.out.println("End test1");

        Thread.sleep(2000);
        System.out.println("Start test2");
        Actions actions = new Actions(webDriver);


        try {
            List<WebElement> li = webDriver.findElements(By.tagName("li"));//получаю список всех элемнтов
            actions.click(li.get(5))
                    //.keyDown(Keys.)//нажатие на клавишу control
                    .click()
                    .perform();//метод запускает выполнение

        } catch (Exception e) {
            e.printStackTrace();
        }
        WebElement button = null;

        try {
            button = webDriver.findElement(By.name("Quit"));
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

















