package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
 
@Service
@Transactional
public class AutomovelService {
 
    @Autowired
    private AutomovelRepository repo;
     
    public List<AutomovelModel> listAll() {
        return repo.findAll();
    }
     
    public void save(AutomovelModel automovel) {
        repo.save(automovel);
    }
     
    public AutomovelModel get(long id) {
        return repo.findById(id).get();
    }
     
    public void delete(long id) {
        repo.deleteById(id);
    }
}
