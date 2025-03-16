package me.sungbin;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class Note {

    @Id
    @GeneratedValue
    private Integer id;

    private String text;

    public Note(Integer id, String text) {
        this.id = id;
        this.text = text;
    }
}
