package alten.alfredo.petclinicproject.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
import java.io.Serializable;
//l'annotazione @MappedSuperclass definisce una classe le cui informazioni di mappatura
// vengono ereditate da tutte le entità che la estendono //IMPORTANTE : la classe non sarà una tabella nel db

@Getter
@Setter
@MappedSuperclass
public class BaseEntity implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
}
