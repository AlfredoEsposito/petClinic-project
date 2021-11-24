package alten.alfredo.petclinicproject.services.map;

import alten.alfredo.petclinicproject.model.Proprietario;
import alten.alfredo.petclinicproject.services.ProprietarioService;

import java.util.Set;

public class ProprietarioServiceMap extends AbstractMapService<Proprietario, Long> implements ProprietarioService {


    @Override
    public Proprietario findById(Long id) {
        return super.findById(id);
    }

    @Override
    public Set<Proprietario> findAll() {
        return super.findAll();
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }

    @Override
    public void delete(Proprietario proprietario) {
        super.delete(proprietario);
    }

    @Override
    public Proprietario save(Proprietario proprietario) {
        return super.save(proprietario.getId(), proprietario);
    }

    @Override
    public Proprietario findByCognome(String cognome) {
        return null;
    }
}
