package ru.netology;

import com.github.javafaker.Faker;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Random;

public class DataGenerator {

    private DataGenerator() {
    }

    static Faker faker = new Faker(new Locale("ru"));

    public static String generateName() {
        Faker faker = new Faker(new Locale("ru"));
        return faker.name().fullName().replaceAll("ё", "е");
    }

    public static String generatePhone() {
        Faker faker = new Faker(new Locale("ru"));
        String phone = faker.phoneNumber().phoneNumber();
        return phone;
    }

    public static String[] cities = new String[]{
            "Уфа", "Петрозаводск", "Саранск", "Казань", "Ижевск",
            "Пермь", "Владивосток", "Калининград", "Омск", "Екатеринбург"
    };

    public static String generateCity() {
        Random generator = new Random();
        int randomIndex = generator.nextInt(10);
        return cities[randomIndex];
    }

    public static String generateDate(int days) {
        String date = LocalDate.now().plusDays(days).format(DateTimeFormatter.ofPattern("dd.MM.yyyy"));
        return date;
    }
}
