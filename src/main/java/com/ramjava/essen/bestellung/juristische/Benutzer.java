package com.ramjava.essen.bestellung.juristische;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.ramjava.essen.bestellung.dto.RestaurantDto;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Entity @Data @NoArgsConstructor @AllArgsConstructor
public class Benutzer {

    @Id @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String fullName;
    private String email;
    private String password;
    private UserRole role;
    @JsonIgnore @OneToMany(cascade = CascadeType.ALL, mappedBy = "benutzer")
    private List<Befehl> bestellungen;
    @ElementCollection
    private List<RestaurantDto> favoriten = new ArrayList<>();
    @OneToMany(cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Adresse> adressen = new ArrayList<>();
}
