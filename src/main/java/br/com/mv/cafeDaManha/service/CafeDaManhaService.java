package br.com.mv.cafeDaManha.service;

import br.com.mv.cafeDaManha.model.CafeDaManha;
import br.com.mv.cafeDaManha.model.CafeDaManhaTeste;
import br.com.mv.cafeDaManha.repository.CafaDaManhaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.Date;
import java.util.List;

@Service
public class CafeDaManhaService {
    @Autowired
    CafaDaManhaRepository cafaDaManhaRepository;

    public Iterable<CafeDaManha> listaCafes() {
        return cafaDaManhaRepository.findAll();
    }

    public Iterable<CafeDaManha> listaCafe(int id) {
        return cafaDaManhaRepository.findAllById(Collections.singleton(id));
    }
    public void salvaCafe(CafeDaManha cafeDaManha){
        System.out.println(cafeDaManha);
       cafaDaManhaRepository.save(cafeDaManha);
    }
    public void salvaCafeteste(CafeDaManhaTeste cafeDaManhaTeste){
        System.out.println((cafeDaManhaTeste));
    }

}


