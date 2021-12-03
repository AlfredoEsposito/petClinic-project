package alten.alfredo.petclinicproject.services.map;

import alten.alfredo.petclinicproject.model.Visita;
import alten.alfredo.petclinicproject.services.VisitaService;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
public class VisitaServiceMap extends AbstractMapService<Visita, Long> implements VisitaService {

    @Override
    public Visita findById(Long id) {
        return super.findById(id);
    }

    @Override
    public Set<Visita> findAll() {
        return super.findAll();
    }

    @Override
    public Visita save(Visita visita) {
        if(visita.getAnimale_domestico()==null || visita.getAnimale_domestico().getId()==null
        || visita.getAnimale_domestico().getProprietario().getId() == null){
            throw new RuntimeException("Visita non valida!!!");
        }
        return super.save(visita);
    }

    @Override
    public void delete(Visita visita) {
        super.delete(visita);
    }

    @Override
    public void deleteById(Long id) {
        deleteById(id);
    }
}
