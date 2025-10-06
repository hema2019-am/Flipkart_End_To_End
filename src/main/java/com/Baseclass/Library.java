package com.Baseclass;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;
import java.util.concurrent.TimeUnit;


public class Library {
    private static final Logger logger = LogManager.getLogger(Library.class);
    public static WebDriver driver;
    public static Properties properties ;
    public void launchApplication() throws IOException {
        FileInputStream fileInputStream = new FileInputStream("src/main/resources/Properties/config.properties");
        properties = new Properties();
        properties.load(fileInputStream);

        try{
           if (properties.getProperty("browser").equals("chrome")){
               ChromeOptions options = new ChromeOptions();
               options.addArguments("--remote-allow-origins=*");
               options.addArguments("--disable-dev-shm-usage");
               options.addArguments("--no-sandbox");
               options.addArguments("--disable-gpu");
               WebDriverManager.chromedriver().setup();
               driver = new ChromeDriver(options);
               logger.info("Chrome driver has been initialized");
           }else if (properties.getProperty("browser").equals("firefox")){
               WebDriverManager.firefoxdriver().setup();
               driver =new FirefoxDriver();
               logger.info("Firfox driver has been initialized");

           }
           driver.manage().window().maximize();
           driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
           driver.get(properties.getProperty("url"));
            logger.info("Browser Launched");

        }catch (Exception e){
            System.out.println("Error in launch application");
        }
    }

    public void teardown(){
        driver.close();
    }
}
