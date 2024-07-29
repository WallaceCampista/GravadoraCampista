package com.gravadoracampista.repository;

import com.gravadoracampista.model.entities.Avaliacao.Avaliacao_Musica_Table;
import com.gravadoracampista.model.entities.Musica;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface AvaliacaoMusicaRepository extends JpaRepository<Avaliacao_Musica_Table, Long> {
  List<Avaliacao_Musica_Table> findByMusicaID(Musica musica);
}