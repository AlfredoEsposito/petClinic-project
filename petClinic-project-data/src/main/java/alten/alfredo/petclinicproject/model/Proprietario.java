package alten.alfredo.petclinicproject.model;

import lombok.Getter;
import lombok.Setter;
import lombok.extern.slf4j.Slf4j;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Slf4j
@Entity
@Table(name = "proprietario")
public class Proprietario extends Persona{

    @Getter @Setter
    @Column(name = "indirizzo")
    private String indirizzo;

    @Getter @Setter
    @Column(name = "citta")
    private String citta;

    @Getter @Setter
    @Column(name = "numero_telefono")
    private String numTel;

    @Getter @Setter
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "proprietario")
    private Set<AnimaleDomestico> animaliDomestici = new HashSet<>();
}
