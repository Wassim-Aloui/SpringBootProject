package com.example.gestionachat.Services;

import com.example.gestionachat.entity.stock;

import java.util.List;

public interface stockService {
    List<stock> retrieveAll();
    stock add(stock s);
    stock update(stock s);

    void delete(Long id);

    stock findById(long id);
}
