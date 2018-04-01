package core;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class UserMainPageHelper extends HelperBase{

    public UserMainPageHelper(WebDriver driver) {
        super(driver);
    }

    protected void check() {

    }

    public void clickVideosOnToolbat(){
        click(By.xpath(".//*[@class='toolbar_nav']//*[ text()='Видео']"));
    }

    public void clickGroupsOnToolbar() {
        click(By.xpath(".//*[contains(@data-l,'userAltGroup')]"));
    }
}