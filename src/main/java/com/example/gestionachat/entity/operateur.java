package com.example.gestionachat.entity;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class operateur {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false)
    private long idOpertauer;
    private String nom;
    private String prenom;
    private String password;
    @OneToMany(cascade = CascadeType.ALL)
    private List<facture> listFacture;
}
