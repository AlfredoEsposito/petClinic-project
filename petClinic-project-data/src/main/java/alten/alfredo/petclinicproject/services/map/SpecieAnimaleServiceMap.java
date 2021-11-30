package alten.alfredo.petclinicproject.services.map;

import alten.alfredo.petclinicproject.model.SpecieAnimale;
import alten.alfredo.petclinicproject.services.SpecieAnimaleService;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
public class SpecieAnimaleServiceMap extends AbstractMapService<SpecieAnimale, Long> implements SpecieAnimaleService {

    @Override
    public SpecieAnimale findById(Long id) {
        return super.findById(id);
    }

    @Override
    public Set<SpecieAnimale> findAll() {
        return super.findAll();
    }

    @Override
    public SpecieAnimale save(SpecieAnimale specieAnimale) {
        return super.save(specieAnimale);
    }

    @Override
    public void delete(SpecieAnimale specieAnimale) {
        super.delete(specieAnimale);
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }
}
