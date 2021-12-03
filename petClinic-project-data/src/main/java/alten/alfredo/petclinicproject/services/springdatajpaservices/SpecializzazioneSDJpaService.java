package alten.alfredo.petclinicproject.services.springdatajpaservices;

import alten.alfredo.petclinicproject.model.Specializzazione;
import alten.alfredo.petclinicproject.repositories.SpecializzazioneRepository;
import alten.alfredo.petclinicproject.services.SpecializzazioneService;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Set;

@Service
@Profile("springdatajpa")
public class SpecializzazioneSDJpaService implements SpecializzazioneService {

    private final SpecializzazioneRepository specializzazioneRepository;

    public SpecializzazioneSDJpaService(SpecializzazioneRepository specializzazioneRepository) {
        this.specializzazioneRepository = specializzazioneRepository;
    }

    @Override
    public Specializzazione findById(Long aLong) {
        /*Optional<Specializzazione> specializzazioneOptional = specializzazioneRepository.findById(aLong);
        if(specializzazioneOptional.isPresent()){
            return  specializzazioneOptional.get();
        }else{
            return null;
        }*/
        return specializzazioneRepository.findById(aLong).orElse(null);
    }

    @Override
    public Set<Specializzazione> findAll() {
        Set<Specializzazione> specializzazioni = new HashSet<>();
        specializzazioneRepository.findAll().forEach(specializzazioni::add);
        return specializzazioni;
    }

    @Override
    public Specializzazione save(Specializzazione object) {
        return specializzazioneRepository.save(object);
    }

    @Override
    public void delete(Specializzazione object) {
        specializzazioneRepository.delete(object);
    }

    @Override
    public void deleteById(Long aLong) {
        specializzazioneRepository.deleteById(aLong);
    }
}
