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
public class fournisseur {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false)
    private long idFournisseur;
    private String codeFournisseur;
    private String libelleFournisseur;
    @Enumerated(EnumType.STRING)
    categorieFournisseur categorieFournisseur;
    @ManyToMany
    private List<secteurAvtivite> listSecteurAtivite;
    @OneToOne
    private detailFournisseur detailFournisseur;
    @OneToMany(mappedBy = "four")
    private List<facture> listFact;

}
