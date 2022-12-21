import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;

public class SelenideTest {
    @Test
    void SoftAssertions() {
        open("https://github.com/selenide/selenide");
        $("[id=\"wiki-tab\"]").click();
        $(byText("Show 2 more pages…")).click();
        $("[href=\"/selenide/selenide/wiki/SoftAssertions\"]").shouldHave(text("SoftAssertions"));
        $("[href=\"/selenide/selenide/wiki/SoftAssertions\"]").click();
        $("[id=\"user-content-3-using-junit5-extend-test-class\"]"). parent().shouldHave(text("Using JUnit5 extend test class"));

    }
}
