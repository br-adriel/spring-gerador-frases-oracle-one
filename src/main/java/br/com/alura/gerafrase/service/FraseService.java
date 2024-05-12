package br.com.alura.gerafrase.service;

import br.com.alura.gerafrase.model.Frase;
import br.com.alura.gerafrase.repository.FraseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FraseService {
    @Autowired
    private FraseRepository fraseRepository;

    public List<Frase> getAll() {
        return fraseRepository.findAll();
    }
}
