package com.example.gestionachat.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class detailFacture {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false)
    private long idDetailFacture;
    private int qteCommande;
    private float prixTotalDetail;
    private int pourcentageRemise;
    private float montantRemise;
    @ManyToOne
    private facture facture;
    @ManyToOne
    private produit produit;

}
