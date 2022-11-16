package com.example.gestionachat.Services;

import com.example.gestionachat.Repository.stockRepository;
import com.example.gestionachat.entity.stock;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class stockServiceImp implements stockService{
    @Autowired
    public stockRepository stockRepository;
    @Override
    public List<stock> retrieveAll() {
        return stockRepository.findAll();
    }

    @Override
    public stock add(stock s) {
    return stockRepository.save(s);
    }

    @Override
    public stock update(stock s) {
        return stockRepository.save(s);

    }

    @Override
    public void delete(Long id) {
        this.stockRepository.deleteById(id);
    }


    @Override
    public stock findById(long id) {
        return stockRepository.findById(id).orElse(null);
    }
}
