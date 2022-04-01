package methods;

import org.apache.commons.lang3.RandomStringUtils;

import java.util.Locale;

public class RandomsMethods {

    public static CharSequence printGenerator() {
        com.github.javafaker.Faker faker = new com.github.javafaker.Faker(new Locale("no"));
        return faker.dog().name();
    }

    public static String generatorRandom () {
        return RandomStringUtils.randomAlphabetic(6).substring(0, 6).toUpperCase() + RandomStringUtils.randomAlphabetic(6);
    }

    public static String emailGenerator() {
        com.github.javafaker.Faker faker = new com.github.javafaker.Faker();
        return faker.internet().emailAddress();
    }

    public static String myEmailGenerator () {
        com.github.javafaker.Faker faker = new com.github.javafaker.Faker();
        return faker.name().firstName().substring(0, 4).toLowerCase() + "." + faker.name().lastName().substring(0,5).toLowerCase() + "@email.com";

    }
}
