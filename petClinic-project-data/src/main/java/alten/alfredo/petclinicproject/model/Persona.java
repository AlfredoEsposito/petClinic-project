package alten.alfredo.petclinicproject.model;

import lombok.Getter;
import lombok.Setter;
import lombok.extern.slf4j.Slf4j;

import javax.persistence.Column;
import javax.persistence.MappedSuperclass;
//l'annotazione @MappedSuperclass definisce una classe le cui informazioni di mappatura
// vengono ereditate da tutte le entità che la estendono //IMPORTANTE : la classe non sarà una tabella nel db
@Slf4j
@MappedSuperclass
public class Persona extends BaseEntity{

    @Getter @Setter
    @Column(name = "nome")
    private String nome;

    @Getter @Setter
    @Column(name = "cognome")
    private String cognome;


}
