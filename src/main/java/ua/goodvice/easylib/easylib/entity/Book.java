package ua.goodvice.easylib.easylib.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "books")
@Data
public class Book {
    @Id
    @Column(name = "id")
    private int id;
    @Column(name = "type")
    private String type;
    @Column(name = "name")
    private String name;
    @Column(name = "author")
    private String author;
    @Column(name = "book_condition")
    private String book_condition;
    @Column(name = "date_added")
    private String date_added;
}
