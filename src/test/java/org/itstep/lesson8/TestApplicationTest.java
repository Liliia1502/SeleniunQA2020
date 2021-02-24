package org.itstep.lesson8;

import junit.framework.TestCase;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.junit.Assert.*;

public class TestApplicationTest  {
    WebDriver webDriver = null;
    @Before
    public void init(){
        System.setProperty("webdriver.chrome.driver", "C:\\Webdrivers\\chromedriver.exe");
        webDriver = new ChromeDriver();
    }
    @Test
    public void test(){
        webDriver.get("https://www.google.com ");
        String actual = webDriver.getTitle();
        String expected = "Google";
        Assert.assertEquals(expected, actual);




    }
    @After
    public void close(){
        webDriver.quit();

    }

}