package ru.yandex.practicum.theatre;

import java.util.ArrayList;

public class Show {
    protected final String title;                       // Название спектакля
    protected final int duration;                       // Длительность спектакля в минутах
    protected final Director director;                  // Режиссер
    protected final ArrayList<Actor> listOfActors;      // Список актеров

    public Show(String title, int duration, Director director, ArrayList<Actor> listOfActors) {
        this.title = title;
        this.duration = duration;
        this.director = director;
        this.listOfActors = listOfActors;
    }

    public String getTitle() {
        return title;
    }

    public int getDuration() {
        return duration;
    }

    public Director getDirector() {
        return director;
    }

    public ArrayList<Actor> getListOfActors() {
        return listOfActors;
    }

    public void printDirectorShow() {
        System.out.println(getDirector());
    }

    public void printListOfActors() {
        System.out.println("Актеры из спектакля - " + getTitle());
        int count = 1;
        for (Actor actor: listOfActors) {
            System.out.println( count++ + ") " + actor);
        };
    }

    public void addActor(Actor newActor) {
        for (Actor actor: listOfActors) {
            if (actor.equals(newActor)) {
                System.out.println("Ошибка добавления - данный актер уже участвует в спектакле!");
                return;
            }
        }
        listOfActors.add(newActor);
    }

    public void replaceActor(Actor newActor, String surnameReplaceActor) {
        for (Actor actor: listOfActors) {
            if (actor.getSurname().equals(surnameReplaceActor)) {
                listOfActors.remove(actor);
                listOfActors.add(newActor);
                System.out.println("В спектакле " + '\'' + getTitle() + '\'' + " произведена замена актера " + surnameReplaceActor +
                        " на " + newActor.getSurname());
                return;
            }
        }
        System.out.println("Заменяемый актер, " + surnameReplaceActor + ", не участвует в спектакле или была введена неккоректная фамилия!");
    }
}
