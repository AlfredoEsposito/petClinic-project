package alten.alfredo.petclinicproject.model;

import lombok.Getter;
import lombok.Setter;
import lombok.extern.slf4j.Slf4j;

import javax.persistence.*;
import java.time.LocalDate;

@Slf4j
@Entity
@Table(name = "animale_domestico")
public class AnimaleDomestico extends BaseEntity{

    @Getter @Setter
    @Column(name = "nome")
    private String nome;

    @Getter @Setter
    @ManyToOne
    @JoinColumn(name = "id_specie")
    private SpecieAnimale specie;

    @Getter @Setter
    @ManyToOne
    @JoinColumn(name = "id_propietario")
    private Proprietario proprietario;

    @Getter @Setter
    @Column(name = "data_nascita")
    private LocalDate dataNascita;

}
