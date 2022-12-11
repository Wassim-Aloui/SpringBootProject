package com.example.gestionachat.Services;

import com.example.gestionachat.Repository.stockRepository;
import com.example.gestionachat.entity.stock;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Slf4j
public class stockServiceImp implements stockService{
    @Autowired
    public stockRepository stockRepository;
    @Override
    public List<stock> retrieveAll() {
        return stockRepository.findAll();
    }

    @Scheduled(fixedDelay = 20000)
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
