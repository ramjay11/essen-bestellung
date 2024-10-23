package com.ramjava.essen.bestellung.juristische;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Adresse {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
}
