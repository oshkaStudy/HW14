package helpers;

import java.util.concurrent.ThreadLocalRandom;

public class RandomUtils {

    public static int getRandomInt(int min, int max) {
        return ThreadLocalRandom.current().nextInt(min, max + 1);
    }

    public static String getRandomItemFromArray(String[] array) {
        int index = getRandomInt(0, array.length - 1);

        return array[index];
    }

    public static String getRandomCountry() {
        String[] countries = {"Эфиопия", "Колумбия", "Бразилия"};

        return getRandomItemFromArray(countries);
    }

    public static String getRandomProductName() {
        String[] names = {"Вьетнам Далат (VIETNAM DALAT)",
                "Колумбия Супремо (Colombia Supremo)",
                "Колумбия Супремо (ВЕНСКАЯ) Colombia Supremo",};
        return getRandomItemFromArray(names);
    }

}
