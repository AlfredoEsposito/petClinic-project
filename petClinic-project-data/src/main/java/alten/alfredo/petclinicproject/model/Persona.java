package alten.alfredo.petclinicproject.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.MappedSuperclass;
//l'annotazione @MappedSuperclass definisce una classe le cui informazioni di mappatura
// vengono ereditate da tutte le entità che la estendono //IMPORTANTE : la classe non sarà una tabella nel db

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@MappedSuperclass
public class Persona extends BaseEntity{

    @Column(name = "nome")
    private String nome;

    @Column(name = "cognome")
    private String cognome;

    public Persona(Long id, String nome, String cognome) {
        super(id);
        this.nome = nome;
        this.cognome = cognome;
    }
}
