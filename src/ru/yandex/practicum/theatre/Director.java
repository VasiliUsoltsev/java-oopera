package ru.yandex.practicum.theatre;

public class Director extends Person {
    final int numberOfShows;      // кол-во поставленных спектаклей

    public Director(String name, String surname, Gender gender, int numberOfShows) {
     super(name, surname, gender);
     this.numberOfShows = numberOfShows;
    }

    public int getNumberOfShows() {
        return numberOfShows;
    }


    @Override
    public String toString() {
        return "ru.yandex.practicum.theatre.Director{" +
                "name='" + getName() + '\'' +
                ", surname='" + getSurname() + '\'' +
                '}';
    }
}
