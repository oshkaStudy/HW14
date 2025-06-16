package pages;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;
import tests.TestBase;

import static com.codeborne.selenide.CollectionCondition.sizeGreaterThan;
import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.*;

public class BlogPage extends TestBase {

    @Step("Открываем страницу Блог")
    public BlogPage OpenBlogPage() {
        open("/blog");
        return this;
    }

    private final SelenideElement blogBanner = $("[field=title]");

    @Step("Проверяем, что баннер отобразился")
    public BlogPage CheckBannerIsVisible() {
        blogBanner.shouldBe(visible);
        blogBanner.shouldHave(text("Блог Coffeelogia"));
        return this;
    }

    private final ElementsCollection posts = $$(".t404__col");

    @Step("Проверяем, что есть посты")
    public void CheckPostsVisibility() {
        posts.shouldHave(sizeGreaterThan(0));
    }

}
