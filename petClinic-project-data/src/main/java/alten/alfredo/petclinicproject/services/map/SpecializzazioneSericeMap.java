package alten.alfredo.petclinicproject.services.map;

import alten.alfredo.petclinicproject.model.Specializzazione;
import alten.alfredo.petclinicproject.services.SpecializzazioneService;

import java.util.Set;

public class SpecializzazioneSericeMap extends AbstractMapService<Specializzazione, Long> implements SpecializzazioneService {

    @Override
    public Specializzazione findById(Long id) {
        return super.findById(id);
    }

    @Override
    public Set<Specializzazione> findAll() {
        return super.findAll();
    }

    @Override
    public Specializzazione save(Specializzazione specializzazione) {
        return super.save(specializzazione);
    }

    @Override
    public void delete(Specializzazione specializzazione) {
        super.delete(specializzazione);
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }
}
