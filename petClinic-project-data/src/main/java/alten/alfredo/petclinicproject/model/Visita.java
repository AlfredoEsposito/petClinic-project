package alten.alfredo.petclinicproject.model;

import lombok.Getter;
import lombok.Setter;
import lombok.extern.slf4j.Slf4j;

import java.time.LocalDate;

@Slf4j
public class Visita extends BaseEntity{

    @Getter @Setter private LocalDate dataVisita;
    @Getter @Setter private String descrizione;
    @Getter @Setter private AnimaleDomestico animaleDomestico;
}
