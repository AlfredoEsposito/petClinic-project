package alten.alfredo.petclinicproject.services.map;

import alten.alfredo.petclinicproject.model.AnimaleDomestico;
import alten.alfredo.petclinicproject.services.CrudService;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
public class AnimaleDomesticoServiceMap extends AbstractMapService<AnimaleDomestico, Long> implements CrudService<AnimaleDomestico, Long> {

    @Override
    public AnimaleDomestico findById(Long id) {
        return super.findById(id);
    }

    @Override
    public Set<AnimaleDomestico> findAll() {
        return super.findAll();
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }

    @Override
    public void delete(AnimaleDomestico animale) {
        super.delete(animale);
    }

    @Override
    public AnimaleDomestico save(AnimaleDomestico animale) {
        return super.save(animale.getId(), animale);
    }
}
