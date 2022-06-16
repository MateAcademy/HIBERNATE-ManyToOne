package com.ex_002_hibernate_intro;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

/**
 * @author Sergey Klunniy
 */
@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "clientsdetails")
public class ClientsDetails {

    @Id
    @GeneratedValue
    private int id;

    @Column
    private String name;

    @Column
    private int age;

    @Column
    private String phone;
}
