package ru.netology.web;

import com.github.javafaker.Faker;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

@Data
@NoArgsConstructor
public class DataGenerator {

    public static Faker faker = new Faker(new Locale("ru"));
    public static Faker fakereng = new Faker(new Locale("eng"));

    public static String getRandomCity() {
        String city = faker.address().cityName();
        return city;
    }

    public static String getNotCorrectCity() {
        String notCorrectCity = fakereng.address().cityName();
        return notCorrectCity;
    }

    public static String getCorrectDate(int days) {
        String dateOfDelivery = LocalDate.now().plusDays(days).format(DateTimeFormatter.ofPattern("dd.MM.yyyy"));
        return dateOfDelivery;
    }

    public static String getNotCorrectDate() {
        String notCorrectDate = LocalDate.now().format(DateTimeFormatter.ofPattern("dd.MM.yyyy"));
        return notCorrectDate;
    }

    public static String getRandomName() {
        String name = faker.name().fullName();
        return name;
    }

    public static String getNotCorrectName() {
        String notCorrectName = fakereng.name().fullName();
        return notCorrectName;
    }

    public static String getRandomPhone() {
        String phone = faker.phoneNumber().phoneNumber();
        return phone;
    }

    public static String getNotCorrectPhone() {
        String notCorrectPhone = fakereng.phoneNumber().subscriberNumber();
        return notCorrectPhone;
    }

}
