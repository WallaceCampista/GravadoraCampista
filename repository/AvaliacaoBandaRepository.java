package com.gravadoracampista.repository;

import com.gravadoracampista.model.entities.Avaliacao.Avaliacao_Banda_Table;
import com.gravadoracampista.model.entities.Banda;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface AvaliacaoBandaRepository extends JpaRepository<Avaliacao_Banda_Table, Long> {
  List<Avaliacao_Banda_Table> findByBandaID(Banda banda);
}