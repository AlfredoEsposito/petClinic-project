package alten.alfredo.petclinicproject.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "specie_animale")
public class SpecieAnimale extends BaseEntity{

    @Column(name = "nome_specie")
    private String nome_specie;

    //relazione many to one unidirezionale con AnimaleDomestico, l'altro lato della relazione non conosce questo lato,
    // per cui non verra dichiarato nessun attributo della classe concorrente


}
