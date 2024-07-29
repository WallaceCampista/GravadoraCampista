package com.gravadoracampista.repository;

import com.gravadoracampista.model.entities.Album;
import com.gravadoracampista.model.entities.Avaliacao.Avaliacao_Album_Table;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface AvaliacaoAlbumRepository extends JpaRepository<Avaliacao_Album_Table, Long> {
  List<Avaliacao_Album_Table> findByAlbumID(Album album);
}