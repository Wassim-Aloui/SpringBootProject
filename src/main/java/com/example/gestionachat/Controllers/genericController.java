package com.example.gestionachat.Controllers;


import com.example.gestionachat.Services.GService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

public class genericController<T,ID> {
    @Autowired
    GService<T,ID> GService;

    @GetMapping()
    public List<T> getAll(){

        return GService.retrieveAll();

    }

    @PostMapping("/add")
    public ResponseEntity<T> add(@RequestBody T e){

        return ResponseEntity.ok(GService.add(e));
    }

    // @PutMapping(path ="{id}")
    @PutMapping("/update/{id}")
    public ResponseEntity<T>update(@RequestBody T e){

        return ResponseEntity.ok(this.GService.update(e));


    }

    @GetMapping("/{id}")
    public T retrieveById(@PathVariable("id") ID id) {

        return this.GService.findById(id);

    }

    @DeleteMapping("/delete/{id}")
    public void remove(@PathVariable("id") ID id) {

        this.GService.delete(id);

    }

}
