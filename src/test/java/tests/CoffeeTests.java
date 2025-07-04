package tests;

import io.qameta.allure.Owner;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import pages.BlogPage;
import pages.MainPage;
import pages.components.NavigateBar;

public class CoffeeTests extends TestBase{

    MainPage mainPage = new MainPage();
    NavigateBar navBar = new NavigateBar();
    BlogPage blogPage = new BlogPage();

    @Test
    @Owner("oshkaStudy")
    @Tag("Global")
    @DisplayName("Проверка отображения элементов главной страницы")
    public void checkMainPageLoading() {

        mainPage.OpenMainPage()
                .CheckMainBannerText()
                .CheckProductListVisibility();

        navBar.CheckNavBarIsVisible();

    }

    @Test
    @Owner("oshkaStudy")
    @Tag("Global")
    @DisplayName("Проверка отображения опций навигационного меню")
    public void checkNavBarOptions() {

        mainPage.OpenMainPage();
        navBar.CheckNavBarOptionsAreVisible();

    }

    @Test
    @Owner("oshkaStudy")
    @Tag("Global")
    @DisplayName("Проверка отображения элементов страницы Блог")
    public void checkBlogPageLoading() {

        blogPage.OpenBlogPage()
                .CheckBannerIsVisible()
                .CheckPostsVisibility();

    }

    @Test
    @Owner("oshkaStudy")
    @Tag("Shop")
    @DisplayName("Проверка наличия карточек товара из случайной страны")
    public void checkProductByCountry() {

        //Инициация нового набора тестовых данных
        TestData testData = new TestData();

        mainPage.OpenMainPage()
                .CheckProductIsAvailableByCountry(testData.country);
    }


    @Test
    @Owner("oshkaStudy")
    @Tag("Shop")
    @DisplayName("Проверка добавления товара в корзину")
    public void takeProductToCart() {

        //Инициация нового набора тестовых данных
        TestData testData = new TestData();

        mainPage.OpenMainPage()
                .OpenProductCardByName(testData.productName)
                .CheckProductModalIsOpened()
                .CheckProductNameInProductCard(testData.productName)
                .TakeProductToCart()
                .CheckModalIsOpened()
                .CheckProductNameInCart(testData.productName);

    }

}
