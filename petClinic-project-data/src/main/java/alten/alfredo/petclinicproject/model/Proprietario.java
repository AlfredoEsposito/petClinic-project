package alten.alfredo.petclinicproject.model;

import lombok.*;

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

    @Builder
    public Proprietario(Long id, String nome, String cognome, String indirizzo, String citta, String numero_telefono, Set<AnimaleDomestico> animaliDomestici) {
        super(id, nome, cognome);
        this.indirizzo = indirizzo;
        this.citta = citta;
        this.numero_telefono = numero_telefono;
        if(animaliDomestici!=null){
            this.animaliDomestici = animaliDomestici;
        }
    }
}
