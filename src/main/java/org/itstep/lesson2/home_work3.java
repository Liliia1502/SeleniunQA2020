package org.itstep.lesson2;
//Написать автотест по сценарию:
//        1. Открыть браузер
//        2. Загрузить страницу по адресу https://itstep.dp.ua/about-academy/
//        3. Проверить title - О нас: история, преимущества и достижения Компьютерной Академии ШАГ.
//        4. Перейти на страницу https://itstep.dp.ua/formy-obucheniya/
//        5. Проверить title - Формы и направления обучения в Компьютерной Академии ШАГ Днепропетровск
//        6. Перейти на страницу https://itstep.dp.ua/testirovanie-po-qa/
//        7. Проверить title - Курсы тестирования ПО, курсы тестировщиков в Днепропетровске – КА ШАГ
//        8. Закрыть браузер
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class home_work3 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Webdrivers\\chromedriver.exe");
        WebDriver webDriver = new ChromeDriver();
        String url = "https://www.itstep.dp.ua/";
        webDriver.get(url);
        webDriver.navigate().to("https://itstep.dp.ua/about-academy/");
        System.out.println("Loaded itstep.dp.ua/about-academy/");
        Thread.sleep(1000);
        System.out.println(webDriver.getTitle());
        if (url.equals(webDriver.getCurrentUrl())) {
            System.out.println("Pass");
        } else {
            System.out.println("Error");
        }
        String url1 = "https://www.itstep.dp.ua/";
        webDriver.get(url);
        webDriver.navigate().to("https://itstep.dp.ua/formy-obucheniya/");
        System.out.println("Loaded itstep.dp.ua/formy-obucheniya/");
        Thread.sleep(1000);
        System.out.println(webDriver.getTitle());
        if (url1.equals(webDriver.getCurrentUrl())) {
            System.out.println("Pass");
        } else {
            System.out.println("Error");
            String url2 = "https://www.itstep.dp.ua/";
            webDriver.get(url);
            webDriver.navigate().to("https://itstep.dp.ua/testirovanie-po-qa/");
            System.out.println("Loaded itstep.dp.ua/testirovanie-po-qa/");
            Thread.sleep(1000);
            System.out.println(webDriver.getTitle());
            if (url2.equals(webDriver.getCurrentUrl())) {
                System.out.println("Pass");
            } else {
                System.out.println("Error");
                webDriver.quit();
            }
        }
    }
}








