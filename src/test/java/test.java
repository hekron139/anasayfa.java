import io.github.bonigarcia.wdn.WebDriverManager;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.TestInstance;
import org.openqa.selenium.WebDriver;



@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class test {
    WebDriver driver ;

 @BeforeAll
     public static void  setUp(){
            WebDriverManager.chromedriver().setup();
            driver.get("Network PAGE")
            driver.manage().window().maximize();

 }
 @AfterAll
    public void tearDown(){
     driver.quit();
 }
}
