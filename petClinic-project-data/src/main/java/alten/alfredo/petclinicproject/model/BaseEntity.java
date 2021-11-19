package alten.alfredo.petclinicproject.model;

import lombok.Getter;
import lombok.Setter;
import lombok.extern.slf4j.Slf4j;

import java.io.Serializable;

@Slf4j
public class BaseEntity implements Serializable {

    @Getter @Setter private Long id;
}
