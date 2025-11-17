package ru.yandex.practicum.theatre;

import java.util.ArrayList;

public class Theatre {
    public static void main(String[] args) {
        // Создание трёх актеров
        Actor actor1 = new Actor("Василий", "Усольцев", 180.4, Gender.MALE);
        Actor actor2 = new Actor("Валентина", "Георгиева-Васильева", 170.9, Gender.FEMALE);
        Actor actor3 = new Actor("Петр", "Иванов", 185.4, Gender.MALE);

        // Создание двух режиссёров
        Director director1 = new Director("Алексей", "Басков", Gender.MALE, 5);
        Director director2 = new Director("Анатолий", "Банников", Gender.MALE, 12);

        // Создание одного автора музыки и одного хореографа
        String musicAuthor = "Чайковский";
        String choreographer = "Афонасьев";

        // Создание трех спектаклей: обычный, оперный и балет
        Show show = new Show("Обычный спектакль", 120, director1 ,new ArrayList<>());
        Opera opera = new Opera("Опера", 80, director2 ,new ArrayList<>(), musicAuthor, "Пример либретты оперного спектакля", 15);
        Ballet ballet = new Ballet("Балет", 90, director1 ,new ArrayList<>(), musicAuthor, "Пример либретты балетного спектакля", choreographer);

        // Распределение актёров по спектаклям. Используйте для этого метод добавления нового актёра в спектакль. Один актёр может участвовать в нескольких спектаклях.
        show.addActor(actor1);
        show.addActor(actor3);

        opera.addActor(actor2);
        opera.addActor(actor3);

        ballet.addActor(actor1);
        ballet.addActor(actor2);

        // Для каждого спектакля выведите на экран список актёров.
        show.printListOfActors();
        System.out.println();

        ballet.printListOfActors();
        System.out.println();

        opera.printListOfActors();
        System.out.println();

        //  Замените актёра в одном из спектаклей на актёра из другого спектакля и ещё раз выведите для него список актёров.
        show.replaceActor(actor2, actor1.getSurname());
        show.printListOfActors();
        System.out.println();

        // Попробуйте заменить в другом спектакле несуществующего актёра
        ballet.replaceActor(actor3, actor3.getSurname());
        ballet.printListOfActors();
        System.out.println();

        // Для оперного и балетного спектакля выведите на экран текст либретто.
        opera.printLibretToText();
        ballet.printLibretToText();
    }
}
