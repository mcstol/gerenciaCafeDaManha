package br.com.mv.cafeDaManha.controller;


import br.com.mv.cafeDaManha.model.CafeDaManha;
import br.com.mv.cafeDaManha.service.CafeDaManhaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;
import java.util.List;

@RestController
@RequestMapping("/cafes-da-manha")
public class CafeDaManhaController {

    @Autowired
    CafeDaManhaService cafeDaManhaService;

    @GetMapping
    public ResponseEntity<Iterable<CafeDaManha>> get() {
//       Iterable<CafeDaManha> listaCafes = cafeDaManhaService.listaCafes();

        return new ResponseEntity(cafeDaManhaService.listaCafes(), HttpStatus.OK);
    }
}