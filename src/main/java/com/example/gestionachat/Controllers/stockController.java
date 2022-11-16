package com.example.gestionachat.Controllers;

import com.example.gestionachat.Services.stockServiceImp;
import com.example.gestionachat.entity.stock;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
@RestController
@RequestMapping("/stock")
public class stockController {
    @Autowired
    stockServiceImp stockServiceImp;

    @GetMapping
    public List<stock> getAll() {

            return stockServiceImp.retrieveAll();

    }

    @PostMapping
    public stock addStock(@RequestBody stock s) {
        return stockServiceImp.add(s);

    }

    @PutMapping
    public stock updateStock(@RequestBody stock s) {
        return stockServiceImp.update(s);

    }

    @DeleteMapping("/{id}")
    private  void deleteStock(@PathVariable("id") Long id ){
        stockServiceImp.delete(id);
    }

    @GetMapping("/{id}")
    public stock getStockByID(@PathVariable(value ="id")long id) {
        return stockServiceImp.findById(id);
    }
}
