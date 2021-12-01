package alten.alfredo.petclinicproject.model;

import lombok.Getter;
import lombok.Setter;
import lombok.extern.slf4j.Slf4j;

import java.util.HashSet;
import java.util.Set;

@Slf4j
public class Veterinario extends Persona{

    @Getter @Setter private Set<Specializzazione> specializzazioni = new HashSet<>();

}
