package pages.components;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;

import static com.codeborne.selenide.CollectionCondition.texts;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;

public class NavigateBar {

    private final SelenideElement navBar = $(".t-menu__list");

    @Step("Проверка отображения навигационного меню")
    public NavigateBar CheckNavBarIsVisible() {
        navBar.shouldBe(visible);
        return this;
    }

    private ElementsCollection navOptions = navBar.$$("li.t228__list_item");

    @Step("Проверка отображения всех элементов навигационного меню")
    public void CheckNavBarOptionsAreVisible(String ... options) {
        navOptions.shouldHave(texts(options));
    }

}
