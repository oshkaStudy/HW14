package tests;

import static helpers.RandomUtils.*;

public class TestData {

    public String country = getRandomCountry();
    public String productName = getRandomProductName();

    public String[] navOptions= {"О нас", "Кофе", "Чай", "Оборудование",
            "Сервис", "Школа Бариста", "Контакты", "CoffeeBLOG"};

}
