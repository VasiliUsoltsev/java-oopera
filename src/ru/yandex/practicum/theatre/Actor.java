package ru.yandex.practicum.theatre;

import java.util.Objects;

public class Actor extends Person {
    private final double height;      // Рост актера

    public Actor(String name, String surname, double height, Gender gender) {
        super(name, surname, gender);
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    @Override
    public String toString() {
        return  super.toString() + " (" + getHeight() + ")";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Actor actor = (Actor) o;
        return super.equals(o) && (getHeight() == actor.getHeight());
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), getHeight());
    }
}
