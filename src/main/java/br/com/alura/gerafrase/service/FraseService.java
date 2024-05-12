package br.com.alura.gerafrase.service;

import br.com.alura.gerafrase.dto.FraseDTO;
import br.com.alura.gerafrase.model.Frase;
import br.com.alura.gerafrase.repository.FraseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FraseService {
    @Autowired
    private FraseRepository fraseRepository;

    private FraseDTO fromFrasetoFraseDTO(Frase frase) {
        return new FraseDTO(
                frase.getTitulo(),
                frase.getFrase(),
                frase.getPersonagem(),
                frase.getPoster()
        );
    }

    public FraseDTO getRandom() {
        return fromFrasetoFraseDTO(fraseRepository.findOneRandom());
    }
}
