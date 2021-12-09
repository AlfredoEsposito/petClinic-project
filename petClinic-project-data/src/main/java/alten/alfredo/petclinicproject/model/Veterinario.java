package alten.alfredo.petclinicproject.model;

import lombok.*;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Table(name = "veterinario")
public class Veterinario extends Persona{

    @ManyToMany(fetch = FetchType.EAGER)
    @JoinTable(name = "specializzazioni_veterinario",
               joinColumns = @JoinColumn(name = "id_veterinario"),
               inverseJoinColumns = @JoinColumn(name = "id_specializzazione"))
    private Set<Specializzazione> specializzazioni = new HashSet<>();

}
