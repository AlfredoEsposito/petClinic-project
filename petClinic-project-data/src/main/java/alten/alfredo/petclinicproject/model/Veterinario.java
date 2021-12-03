package alten.alfredo.petclinicproject.model;

import lombok.Getter;
import lombok.Setter;
import lombok.extern.slf4j.Slf4j;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Slf4j
@Entity
@Table(name = "veterinario")
public class Veterinario extends Persona{

    @Getter @Setter
    @ManyToMany(fetch = FetchType.EAGER)
    @JoinTable(name = "specializzazioni_veterinario",
               joinColumns = @JoinColumn(name = "id_veterinario"),
               inverseJoinColumns = @JoinColumn(name = "id_specializzazione"))
    private Set<Specializzazione> specializzazioni = new HashSet<>();

}
