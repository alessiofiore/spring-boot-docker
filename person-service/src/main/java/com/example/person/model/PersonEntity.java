package com.example.person.model;

import lombok.*;

import javax.persistence.*;

/**
 * @author alessiofiore
 */
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
public class PersonEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, name = "name", length= 50)
    private String name;
}



