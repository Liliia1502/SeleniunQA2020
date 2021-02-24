package org.itstep.lesson7;
//Запустить браузер
//Открыть страницу https://www.w3schools.com/tags/tryit.asp?filename=tryhtml_iframe
// Переключиться на iframe#iframeResult
//Получить title - должен быть "W3Schools Online Web Tutorials"
//Закрыть браузер
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

import java.awt.*;

public class home_work9 {
    private static Label alert;

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Webdrivers\\chromedriver.exe");
        WebDriver webDriver = new ChromeDriver();
        System.out.println("Start test");
        webDriver.get("https://www.w3schools.com/tags/tryit.asp?filename=tryhtml_iframe ");
        WebElement iframe = null;
        try {
            iframe = webDriver.findElement(By.cssSelector("#iframeResult"));
        } catch (NotFoundException e) {
            System.out.println("Элемент не найден");
        }
        WebDriver frame = webDriver.switchTo().frame(0);
        String page = frame.getPageSource();
        System.out.println(page);

       // String Str = new String("W3Schools Online Web Tutorials");
        //if (page.equals("W3Schools Online Web Tutorials")) {

          //  System.out.println("tru");
       // } else {
       //     System.out.println("false");
       // }

       if(page.contains("W3Schools Free Online Web Tutorials")) {
        System.out.println("Заголовок страницы содержит «ожидаемый текст»");
        }else {
           System.out.println("Заголовок страницы не содержит «ожидаемого текста»");
        }

        webDriver.quit();
        System.out.println("End test");
}
}






