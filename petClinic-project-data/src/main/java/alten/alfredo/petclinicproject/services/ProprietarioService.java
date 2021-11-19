package alten.alfredo.petclinicproject.services;

import alten.alfredo.petclinicproject.model.Proprietario;

import java.util.Set;

public interface ProprietarioService {

    Proprietario findByCognome(String cognome);
    Proprietario findById(Long id);
    Proprietario save(Proprietario proprietario);
    Set<Proprietario> findAll();
}
