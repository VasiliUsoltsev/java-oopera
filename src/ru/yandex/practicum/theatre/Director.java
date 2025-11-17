package ru.yandex.practicum.theatre;

import java.util.Objects;

public class Director extends Person {
    private final int numberOfShows;      // кол-во поставленных спектаклей

    public Director(String name, String surname, Gender gender, int numberOfShows) {
     super(name, surname, gender);
     this.numberOfShows = numberOfShows;
    }

    public int getNumberOfShows() {
        return numberOfShows;
    }

    /*
    По идее, исходя из задания, необходимо вывести имя и фамилие режисера, а переопределенный метод
    toString() в классе Person, полностью удовлетворяет этому условию. Переопределять, в данном классе и
    использовать super.toString(), не нужно.
    */

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Director director = (Director) o;
        return super.equals(o) && (getNumberOfShows() == director.getNumberOfShows());
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), getNumberOfShows());
    }
}
