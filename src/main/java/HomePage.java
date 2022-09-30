import org.openqa.selenium.Webdriver;

import javax.naming.directory.DirContext;

public class wHomePage extends anasayfa {

   SearchBox searchBox ;


    public HomePage(WebDriver driver) {
        super(driver);
    }
searchBox = new SearchBox(driver);
    public SearchBox searchBox(){
 return this.searchBox;
    }

    public void goToCart() {
    }
}
