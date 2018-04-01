package core;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class VideoPage extends HelperBase {

    public VideoPage(WebDriver driver) {
        super(driver);
    }

    protected void check() {

    }

    public void SelectPopular () {
        click(By.xpath(".//*[text()='Популярное' and contains(@class,'ellip')]/ancestor::*[contains(@class,'btn')]"));
    }

    public void ClickOnFirstVideoOfChannel(String locator) {
        click(By.xpath(locator));
        Assert.assertTrue("Не найден элемент Play", isElementPresent(By.xpath(".//*[contains(@class, 'html5-vpl_panel_cnt')]")));
    }


}
