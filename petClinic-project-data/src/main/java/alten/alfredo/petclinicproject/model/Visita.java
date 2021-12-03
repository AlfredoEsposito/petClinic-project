package alten.alfredo.petclinicproject.model;

import lombok.Getter;
import lombok.Setter;
import lombok.extern.slf4j.Slf4j;

import javax.persistence.*;
import java.time.LocalDate;

@Slf4j
@Entity
@Table(name = "visita")
public class Visita extends BaseEntity{

    @Getter @Setter
    @Column(name = "data_visita")
    private LocalDate dataVisita;

    @Getter @Setter
    @Column(name = "descrizone")
    private String descrizione;

    @Getter @Setter
    @ManyToOne
    @JoinColumn(name = "id_animaledomestico")
    private AnimaleDomestico animale_domestico;
}
