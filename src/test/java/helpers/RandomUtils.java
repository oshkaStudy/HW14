package helpers;

import com.github.javafaker.Faker;
import java.util.Locale;

public class RandomUtils {

    private static final Faker faker = new Faker(new Locale("ru"));

    public static String getRandomProductName() {
        // Здесь можно использовать faker.commerce().productName(),
        // но если хочешь сохранить стиль кофе — можно кастомизировать:
        return faker.options().option(
                "Бразилия Моджиана (Brazil Mogiana)",
                "Колумбия Супремо (Colombia Supremo)",
                "Колумбия Супремо (ВЕНСКАЯ) Colombia Supremo"
        );
    }

    public static String getRandomCountry() {
        // Здесь можно использовать faker.commerce().productName(),
        // но если хочешь сохранить стиль кофе — можно кастомизировать:
        return faker.options().option(
                "Эфиопия",
                "Колумбия",
                "Бразилия"
        );
    }

}
