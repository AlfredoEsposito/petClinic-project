package alten.alfredo.petclinicproject.model;

import lombok.*;

import javax.persistence.*;
import java.time.LocalDate;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Table(name = "visita")
public class Visita extends BaseEntity{

    @Column(name = "data_visita")
    private LocalDate dataVisita;

    @Column(name = "descrizone")
    private String descrizione;

    @ManyToOne
    @JoinColumn(name = "id_animaledomestico")
    private AnimaleDomestico animale_domestico;
}
