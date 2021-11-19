package alten.alfredo.petclinicproject.model;

import lombok.Getter;
import lombok.Setter;
import lombok.extern.slf4j.Slf4j;

import java.time.LocalDate;

@Slf4j
public class AnimaleDomestico {

    @Getter @Setter private TipoAnimale tipo;
    @Getter @Setter private Proprietario proprietario;
    @Getter @Setter private LocalDate dataNascita;

}
