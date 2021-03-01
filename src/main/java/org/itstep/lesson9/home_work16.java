package org.itstep.lesson9;
// Открыть веб-браузер и загрузить страницу select.html.
//2. В первом выпадающем списке "Multiple select" необходиом выбрать "Cheese"
//3. Проверить наличие выбранного элемента "Cheese" в select элементе с id = out2
//4. Далее выбрать "Pepperoni"
//5. Проверить наличие выбранного элемента "Cheese" и "Pepperoni" в select элементе с id = out2
//6. Далее выбрать "Mushrooms"
//7. Проверить наличие выбранного элемента "Cheese" и "Pepperoni" и "Mushrooms" в select элементе с id = out2
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import java.io.IOException;
import java.util.List;
public class home_work16 {
    public static void main(String[] args) throws IOException {
        System.setProperty("webdriver.chrome.driver", "C:\\Webdrivers\\chromedriver.exe ");
        WebDriver webDriver = new ChromeDriver();
        System.out.println("Start test");
        String str = " file:///C:/Users/%D0%9B%D0%B8%D0%BB%D0%B8%D1%8F/Downloads/Lesson8%20hw/select.html ";
        webDriver.get(str);
        Actions actions = new Actions(webDriver);
        try {
            List<WebElement> value = webDriver.findElements(By.tagName("option"));//получаю список всех элемнтов
            actions
                    .click( value.get(0))//кликаю по второму элменту
                    .keyDown(Keys.CONTROL)//нажатие на клавишу control
                    .perform();
            String output1 = webDriver.findElement(By.id("out2")).getText();
            //System.out.println(output1);
            if (output1.equals("Cheese")) {
                System.out.println("Pass");
            } else {
                System.out.println("Error");
            }

            actions.moveToElement(value.get(2))
                    .pause(2000)
                    .click()
                    .perform();
            String output2 = webDriver.findElement(By.id("out2")).getText();
            //System.out.println(output2);
            if (output2.equals("Cheese\nPepperoni")) {
                System.out.println("Pass");
            } else {
                System.out.println("Error");
            }
            actions.moveToElement(value.get(4))
                    .pause(2000)
                    .click()
                    .perform();
            String output3 = webDriver.findElement(By.id("out2")).getText();
            //System.out.println(output3);
            if (output3.equals("Cheese\nPepperoni\nMushrooms")) {
                System.out.println("Pass");
            } else {
                System.out.println("Error");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        webDriver.quit();
        System.out.println("End test");
    }
}