package com.ex_001_ipa_crud;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

/**
 * @author Sergey Klunniy
 */

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "ex_001_ipa_crud")
public class Client {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    private int id;

    @Column
    private String name;

    @Column
    private int age;

    @Column
    private String phone;

}