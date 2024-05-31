package it.nextdevs.gestioneEventi.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

import java.time.LocalDate;

@Data
@Entity
@Table(name = "eventi")
public class Evento {
    @Id
    @GeneratedValue
    private Integer id;
    private String titolo;
    private String descrizione;
    private LocalDate data;
    private String luogo;
    private Integer numPostiDisponibili;
}
