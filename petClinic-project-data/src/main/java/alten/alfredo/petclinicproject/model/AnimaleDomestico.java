package alten.alfredo.petclinicproject.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "animale_domestico")
public class AnimaleDomestico extends BaseEntity{

    @Column(name = "nome")
    private String nome;

    @ManyToOne
    @JoinColumn(name = "id_specie")
    private SpecieAnimale specie;

    @ManyToOne
    @JoinColumn(name = "id_propietario")
    private Proprietario proprietario;

    @Column(name = "data_nascita")
    private LocalDate data_nascita;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "animale_domestico")
    private Set<Visita> visite = new HashSet<>();

}
