package alten.alfredo.petclinicproject.repositories;

import alten.alfredo.petclinicproject.model.Veterinario;
import org.springframework.data.repository.CrudRepository;

public interface VeterinarioRepository extends CrudRepository<Veterinario, Long> {

    Veterinario findByCognome(String cognome);
}
