package ru.byulent.chgkrating.stub;

/**
 * Created by Бюлент on 22.12.2017.
 */

public class Player {
    int id;
    int rating;
    String name;
    String surname;
    String patronymic;
    String team;

    public Player(int id, int rating, String name, String surname, String patronymic, String team){
        this.id=id;
        this.rating = rating;
        this.name = name;
        this.surname = surname;
        this.patronymic = patronymic;
        this.team = team;
    }

    public Player(int id, int rating, String name, String surname) {
        this(id, rating, name, surname, "");
    }

    public Player(int id, int rating, String name, String surname, String patronymic){
        this(id,rating,name,surname,"","");
    }
}
