package com.example.gestionachat.Repository;

import com.example.gestionachat.entity.stock;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface stockRepository extends JpaRepository<stock,Long> {

    @Query("SELECT count(s) from stock s ")
    Integer getNbStock();



}

