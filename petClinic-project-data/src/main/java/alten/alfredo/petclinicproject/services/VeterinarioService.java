package alten.alfredo.petclinicproject.services;

import alten.alfredo.petclinicproject.model.Veterinario;

public interface VeterinarioService extends CrudService<Veterinario, Long> {

    Veterinario findByCognome(String cognome);
}
