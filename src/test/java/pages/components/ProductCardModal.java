package pages.components;

import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;

public class ProductCardModal {

    private final SelenideElement modalProduct = $(".t-popup");

    @Step("Проверяем, что модальное окно карточки товара открылось")
    public ProductCardModal CheckProductModalIsOpened() {

        modalProduct.shouldBe(visible);
        return this;
    }

    @Step("Проверяем, что открылась карточка выбранного товара")
    public ProductCardModal CheckProductNameInProductCard(String name) {

        modalProduct.shouldHave(text(name));
        return this;
    }

    private final SelenideElement buyButton = $("a[href='#order']");

    @Step("Кладем товар в корзину")
    public CartModal TakeProductToCart() {

        buyButton.shouldBe(visible);
        buyButton.click();

        return new CartModal();

    }

}
