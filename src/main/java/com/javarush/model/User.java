package com.javarush.model;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Data
@Entity
@Table (name = "users")
@NoArgsConstructor
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int user_id;

    @Column
    private String name;
    //можно не указывать Column name, если оно совпадает с названием столбца в таблице
    private int age;

    @OneToMany(mappedBy = "user", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Auto> autos ;

    public User(String name, int age) {
        this.name = name;
        this.age = age;
        autos = new ArrayList<Auto>();
    }

    public void addAuto(Auto auto) {
        autos.add(auto);
    }
}