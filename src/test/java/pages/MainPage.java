package pages;

import com.codeborne.selenide.ElementsCollection;
import io.qameta.allure.Step;
import pages.components.ProductCardModal;
import tests.TestBase;

import static com.codeborne.selenide.CollectionCondition.sizeGreaterThan;
import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.*;

public class MainPage extends TestBase {

    @Step("Открываем главную страницу")
    public MainPage OpenMainPage() {

        open("");
        return this;

    }

    private final ElementsCollection mainBannerElements = $$(".tn-atom");

    @Step("Проверяем наличие главного баннера")
    public MainPage CheckMainBannerText() {

        mainBannerElements.findBy(text("КОФЕ ПРЕМИАЛЬНОГО КАЧЕСТВА")).shouldBe(visible);
        return this;

    }

    private final ElementsCollection productsList = $$("div.js-store-grid-cont div.js-product");

    @Step("Проверяем, что список товаров не пустой")
    public void CheckProductListVisibility() {

        productsList.shouldHave(sizeGreaterThan(0));

    }

    @Step("Проверяем наличие товара по названию страны")
    public MainPage CheckProductIsAvailableByCountry(String country) {

        productsList.findBy(text(country)).shouldBe(visible);
        return this;
    }

    @Step("Открываем карточку товара")
    public ProductCardModal OpenProductCardByName(String name) {

        productsList.findBy(text(name)).click();
        return new ProductCardModal();

    }
}
