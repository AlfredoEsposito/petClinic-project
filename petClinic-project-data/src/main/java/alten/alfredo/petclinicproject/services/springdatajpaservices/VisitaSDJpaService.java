package alten.alfredo.petclinicproject.services.springdatajpaservices;

import alten.alfredo.petclinicproject.model.Visita;
import alten.alfredo.petclinicproject.repositories.VisitaRepository;
import alten.alfredo.petclinicproject.services.VisitaService;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Set;

@Service
@Profile("springdatajpa")
public class VisitaSDJpaService implements VisitaService {

    private final VisitaRepository visitaRepository;

    public VisitaSDJpaService(VisitaRepository visitaRepository) {
        this.visitaRepository = visitaRepository;
    }

    @Override
    public Visita findById(Long aLong) {
        /*Optional<Visita> visitaOptional = visitaRepository.findById(aLong);
        if(visitaOptional.isPresent()){
            return visitaOptional.get();
        }else{
            return null;
        }*/
        return visitaRepository.findById(aLong).orElse(null);
    }

    @Override
    public Set<Visita> findAll() {
        Set<Visita> visite = new HashSet<>();
        visitaRepository.findAll().forEach(visite::add);
        return visite;
    }

    @Override
    public Visita save(Visita object) {
        return visitaRepository.save(object);
    }

    @Override
    public void delete(Visita object) {
        visitaRepository.delete(object);
    }

    @Override
    public void deleteById(Long aLong) {
        visitaRepository.deleteById(aLong);
    }
}
