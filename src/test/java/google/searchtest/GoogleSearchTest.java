package google.searchtest;

import com.codeborne.selenide.Configuration;
import org.junit.Test;

import static com.codeborne.selenide.Selenide.*;
import static org.openqa.selenium.support.ui.ExpectedConditions.titleIs;

/**
 * Created by Alex on 7/11/2017.
 */
public class GoogleSearchTest {

  @Test
  public void searchAndFollowFirstResultTest() {

    Configuration.browser = "chrome";
    Configuration.timeout = 20_000;

    open("https://app.glip.com/");

    $(".email-widget-wrapper").find("input").setValue("email");
    $(".password-widget-wrapper").find("input").setValue("password").pressEnter();

    Wait().until(titleIs("Glip"));

  }

}
