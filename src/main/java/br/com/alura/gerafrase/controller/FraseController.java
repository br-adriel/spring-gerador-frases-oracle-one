package br.com.alura.gerafrase.controller;

import br.com.alura.gerafrase.model.Frase;
import br.com.alura.gerafrase.service.FraseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/series/frases")
public class FraseController {
    @Autowired
    private FraseService fraseService;

    @GetMapping("")
    public List<Frase> getFrases() {
        return fraseService.getAll();
    }
}
