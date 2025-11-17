package ru.yandex.practicum.theatre;

public class Person {
    private final String name;            // Имя режиссера
    private final String surname;         // Фамилия режиссера
    private final Gender gender;

    public Person(String name, String surname, Gender gender) {
        this.name = name;
        this.surname = surname;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public Gender getGender() {
        return gender;
    }
}
