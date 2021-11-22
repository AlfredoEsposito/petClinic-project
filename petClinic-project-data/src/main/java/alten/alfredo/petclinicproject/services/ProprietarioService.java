package alten.alfredo.petclinicproject.services;

import alten.alfredo.petclinicproject.model.Proprietario;

public interface ProprietarioService extends CrudService<Proprietario, Long>{

    Proprietario findByCognome(String cognome);
}
