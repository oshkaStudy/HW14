package pages.components;

import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;

public class CartModal {

    private final SelenideElement modalCart = $(".t706__cartwin-content");

    @Step("Проверяем, что модальное окно корзины открылось")
    public CartModal CheckModalIsOpened() {

        modalCart.shouldBe(visible);
        return this;
    }

    @Step("Проверяем, что товар добавлен в корзину")
    public void CheckProductNameInCart(String name) {

        modalCart.shouldHave(text(name));

    }

}
