package alten.alfredo.petclinicproject.services.map;

import alten.alfredo.petclinicproject.model.Veterinario;
import alten.alfredo.petclinicproject.services.VeterinarioService;

import java.util.Set;

public class VeterinarioServiceMap extends  AbstractMapService<Veterinario, Long> implements VeterinarioService {

    @Override
    public Veterinario findById(Long id) {
        return super.findById(id);
    }

    @Override
    public Set<Veterinario> findAll() {
        return super.findAll();
    }

    @Override
    public Veterinario save(Veterinario veterinario) {
        return super.save(veterinario.getId(), veterinario);
    }

    @Override
    public void delete(Veterinario veterinario) {
        super.delete(veterinario);
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }

    @Override
    public Veterinario findByCognome(String cognome) {
        return null;
    }
}
