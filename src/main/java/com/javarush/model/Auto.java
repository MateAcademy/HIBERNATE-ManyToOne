package com.javarush.model;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
@Data
@NoArgsConstructor
@Entity
@Table(name = "autos")
public class Auto {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int autos_id;

    @Column (name = "model")
    private String model;

    //можно не указывать Column name, если оно совпадает с названием столбца в таблице
    private String color;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id")
    private User user;


    public Auto(String model, String color) {
        this.model = model;
        this.color = color;
    }

}