package alten.alfredo.petclinicproject.model;

import lombok.Getter;
import lombok.Setter;
import lombok.extern.slf4j.Slf4j;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Slf4j
@Entity
@Table(name = "specie_animale")
public class SpecieAnimale extends BaseEntity{

    @Getter @Setter
    @Column(name = "nome_specie")
    private String nome_specie;

    //relazione many to one unidirezionale con AnimaleDomestico, l'altro lato della relazione non conosce questo lato,
    // per cui non verra dichiarato nessun attributo della classe concorrente


}
