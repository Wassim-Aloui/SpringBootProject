package com.example.gestionachat.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Reglement {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false)
    private long idReglement;
    private float montantPaye;
    private float montantRestant;
    private boolean paye;
    @Temporal(TemporalType.DATE)
    private Date dateReglement;
    @ManyToOne
    private facture facture;
}
