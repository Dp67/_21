package tests;

import core.GroupMainPage;
import core.SessionHelper;
import core.UserMainPageHelper;
import core.VideoPage;
import model.TestBot;
import org.junit.Test;

public class SecondTest extends TestBase{

    @Test
    public void testGroupCreation() throws Exception {
        new SessionHelper(driver).doLogin(new TestBot("QA18testbot100", "QA18testbot"));
        new UserMainPageHelper(driver).clickVideosOnToolbat();
        VideoPage videopage = new VideoPage(driver);
        videopage.SelectPopular();
        videopage.ClickOnFirstVideoOfChannel((".//*[contains(@class, 'subscriptions')][2]//*[contains(@class,'slider_i')][1]"));
    }
}