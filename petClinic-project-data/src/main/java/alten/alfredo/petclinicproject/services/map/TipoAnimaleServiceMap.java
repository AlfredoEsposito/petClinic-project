package alten.alfredo.petclinicproject.services.map;

import alten.alfredo.petclinicproject.model.TipoAnimale;
import alten.alfredo.petclinicproject.services.TipoAnimaleService;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
public class TipoAnimaleServiceMap extends AbstractMapService<TipoAnimale, Long> implements TipoAnimaleService {

    @Override
    public TipoAnimale findById(Long id) {
        return super.findById(id);
    }

    @Override
    public Set<TipoAnimale> findAll() {
        return super.findAll();
    }

    @Override
    public TipoAnimale save(TipoAnimale tipoAnimale) {
        return super.save(tipoAnimale);
    }

    @Override
    public void delete(TipoAnimale tipoAnimale) {
        super.delete(tipoAnimale);
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }
}
