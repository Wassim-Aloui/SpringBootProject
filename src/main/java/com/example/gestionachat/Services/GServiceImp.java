package com.example.gestionachat.Services;

import com.example.gestionachat.Repository.genericRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


public class GServiceImp<T,ID> implements  GService<T,ID>{
    @Autowired
    public genericRepository<T,ID> genericRepository ;

    @Override
    public List<T> retrieveAll() {
        return genericRepository.findAll();
    }

    @Override
    public T add(T t) {
       return   genericRepository.save(t);

    }

    @Override
    public T update(T t) {
        return  genericRepository.save(t);

    }

    @Override
    public void delete(ID id) {
        genericRepository.deleteById(id);
    }

    @Override
    public T findById(ID id) {
        return genericRepository.findById(id).orElse(null);
    }


}
