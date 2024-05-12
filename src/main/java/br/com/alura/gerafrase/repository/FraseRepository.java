package br.com.alura.gerafrase.repository;

import br.com.alura.gerafrase.model.Frase;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FraseRepository extends JpaRepository<Frase, Long> {
}
