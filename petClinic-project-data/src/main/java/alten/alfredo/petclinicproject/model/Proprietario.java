package alten.alfredo.petclinicproject.model;

import lombok.Getter;
import lombok.Setter;
import lombok.extern.slf4j.Slf4j;

import java.util.Set;

@Slf4j
public class Proprietario extends Persona{

    @Getter @Setter private Set<AnimaleDomestico> animaliDomestici;
}
