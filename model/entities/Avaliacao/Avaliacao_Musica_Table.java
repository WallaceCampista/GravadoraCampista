package com.gravadoracampista.model.entities.Avaliacao;

import com.gravadoracampista.model.entities.Musica;
import com.gravadoracampista.repository.AvaliacaoMusicaRepository;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

@Entity
@Getter @Setter
@Table(name = "Avaliacao_Musica_Table")
public class Avaliacao_Musica_Table {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "FK_Musica_id")
    private Musica musicaID;

    @Column(name = "Nota_Musica")
    private double nota;
}