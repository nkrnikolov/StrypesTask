package helpers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverManager {
    private static WebDriverManager instance;
    private WebDriver driver;

    private WebDriverManager(){
        init();
    };

    public static WebDriverManager getInstance() {
        if(instance == null) instance = new WebDriverManager();
        return instance;
    }

    private WebDriver init() {
        this.driver = new ChromeDriver();
        this.driver.manage().window().maximize();
        this.driver.get("https://ict-strypes.eu/");
        return driver;
    }

    public void tearDriver(){
        if (driver != null) {
            driver.quit();
            driver = null;
        }
    }

    public WebDriver getWebDriver() {
        if (driver == null) {
            init();
        }
        return driver;
    }
}
