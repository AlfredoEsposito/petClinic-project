package alten.alfredo.petclinicproject.model;

import lombok.Getter;
import lombok.Setter;
import lombok.extern.slf4j.Slf4j;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Slf4j
@Entity
@Table(name = "specializzazione")
public class Specializzazione extends BaseEntity{

    @Getter @Setter
    @Column(name = "descrizione")
    private String descrizione;

    //relazione many to many unidirezionale con Veterinario, l'altro lato della relazione non conosce questo lato,
    // per cui non verra dichiarato nessun attributo della classe concorrente
}
