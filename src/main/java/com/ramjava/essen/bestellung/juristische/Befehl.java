package com.ramjava.essen.bestellung.juristische;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;

import java.util.Date;
import java.util.List;

@Entity
public class Befehl {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @ManyToOne
    private Benutzer benutzer;
    @JsonIgnore
    @ManyToOne
    private Restaurant restaurant;
    private Long totalAmount;
    private String befehlStatus;
    private Date createdAt;
    @ManyToOne
    private Adresse deliveryAddress;
    @OneToMany
    private List<Bestellartikel> artikel;
    private int totalItems;
    private int totalPrice;
}
