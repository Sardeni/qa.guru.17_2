import com.codeborne.selenide.SelenideElement;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.exactText;
import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;

public class SelenideTest {
    @Test
    void softAssertions() {
        open("https://github.com/selenide/selenide");
        $("#wiki-tab").click();
        $(byText("Show 2 more pages…")).click();
        $("[href=\"/selenide/selenide/wiki/SoftAssertions\"]").shouldHave(text("SoftAssertions")).click();
        $("#user-content-3-using-junit5-extend-test-class").parent().shouldHave(text("Using JUnit5 extend test class"));
    }
    @Test
    void hoverSolutions() {
        open("https://github.com");
        $(byText("Solutions")).hover();
        $("[href=\"/enterprise\"]").shouldHave(text("Enterprise")).click();
        $("h1").shouldHave(exactText("Build like the best"));
    }
    @Test
    void replaceWithDragAndDrop() {
        open("https://the-internet.herokuapp.com/drag_and_drop");
        $("[id=column-a]").dragAndDropTo("[id=column-b]");
        $("[id=column-a]").shouldHave(text("B"));
    }
}
