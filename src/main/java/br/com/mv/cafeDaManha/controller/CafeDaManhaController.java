package br.com.mv.cafeDaManha.controller;


import br.com.mv.cafeDaManha.model.CafeDaManha;
import br.com.mv.cafeDaManha.model.CafeDaManhaTeste;
import br.com.mv.cafeDaManha.service.CafeDaManhaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.List;

@RestController
@RequestMapping("/cafes-da-manha")
public class CafeDaManhaController {

    @Autowired
    CafeDaManhaService cafeDaManhaService;

    @GetMapping
    public ResponseEntity<Iterable<CafeDaManha>> get() {

        return new ResponseEntity(cafeDaManhaService.listaCafes(), HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<CafeDaManha> create(@RequestBody CafeDaManha cafeDaManha){
        cafeDaManhaService.salvaCafe(cafeDaManha);
        return new ResponseEntity(HttpStatus.CREATED);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Iterable<CafeDaManha>> getCafe(@PathVariable(value = "id") int id ) {

        return new ResponseEntity(cafeDaManhaService.listaCafe(id), HttpStatus.OK);
    }

    @PostMapping("/teste")
    public ResponseEntity<CafeDaManhaTeste> create(@RequestBody CafeDaManhaTeste cafeDaManhaTeste){
        cafeDaManhaService.salvaCafeteste(cafeDaManhaTeste);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }

}