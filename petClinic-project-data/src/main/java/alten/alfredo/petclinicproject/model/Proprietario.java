package alten.alfredo.petclinicproject.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "proprietario")
public class Proprietario extends Persona{

    @Column(name = "indirizzo")
    private String indirizzo;

    @Column(name = "citta")
    private String citta;

    @Column(name = "numero_telefono")
    private String numero_telefono;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "proprietario")
    private Set<AnimaleDomestico> animaliDomestici = new HashSet<>();
}
