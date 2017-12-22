package ru.byulent.chgkrating.entity;

/**
 * Created by Бюлент on 22.12.2017.
 */

public class Player {
    private int id;
    private int rating;
    private String name;
    private String surname;
    private String patronymic;
    String comment;
    String dbChgkInfoTag;

    Player (int id, int rating, String name, String surname, String patronymic, String comment, String dbChgkInfoTag){
        this.id = id;
        this.rating = rating;
        this.name = name;
        this.surname = surname;
        this.patronymic = patronymic;
        this.comment = comment;
        this.dbChgkInfoTag = dbChgkInfoTag;
    }

    Player (int id, int rating, String ... strings){
        this(id, rating, strings[0], strings[1], strings[2], strings[3], strings[4]);
    }

    public int getId() {
        return id;
    }

    public int getRating() {
        return rating;
    }

    public String getName() {
        return name;
    }
}
