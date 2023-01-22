package nina.example;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ProjectSelenium {
    WebDriver driver;

    @Before
    public void setup() {
        System.setProperty("webdriver.chrome.driver", "resources/chromedriver");
        driver = new ChromeDriver();
    }

    @Test
    public void ProjectSelenium(){
        String baseURL = "https://staging.cicle.app/signin";
        driver.get(baseURL);

        String title = driver.getTitle();
        String PageURL = driver.getCurrentUrl();
        Assertions.assertTrue(PageURL.contains(baseURL));
        String PageSource = driver.getPageSource();

        System.out.println("Page Title Name : " + title);
        System.out.println("Page Title Length : " + title.length());
        System.out.println("Page Source Length : " + PageSource.length());
    }

    @After
    public void tearDown(){
        driver.quit();
    }
}
