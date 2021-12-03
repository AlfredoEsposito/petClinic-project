package alten.alfredo.petclinicproject.services.springdatajpaservices;

import alten.alfredo.petclinicproject.model.AnimaleDomestico;
import alten.alfredo.petclinicproject.repositories.AnimaleDomesticoRepository;
import alten.alfredo.petclinicproject.services.AnimaleDomesticoService;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Set;

@Service
@Profile("springdatajpa")
public class AnimaleDomesticoSDJpaService implements AnimaleDomesticoService {

    private final AnimaleDomesticoRepository animaleDomesticoRepository;

    public AnimaleDomesticoSDJpaService(AnimaleDomesticoRepository animaleDomesticoRepository) {
        this.animaleDomesticoRepository = animaleDomesticoRepository;
    }

    @Override
    public AnimaleDomestico findById(Long aLong) {
        /*Optional<AnimaleDomestico> animaleDomesticoOptional = animaleDomesticoRepository.findById(aLong);
        if(animaleDomesticoOptional.isPresent()){
            return animaleDomesticoOptional.get();
        }else{
            return null;
        }*/
        return animaleDomesticoRepository.findById(aLong).orElse(null);
    }

    @Override
    public Set<AnimaleDomestico> findAll() {
        Set<AnimaleDomestico> animaliDomestici = new HashSet<>();
        animaleDomesticoRepository.findAll().forEach(animaliDomestici::add);
        return animaliDomestici;
    }

    @Override
    public AnimaleDomestico save(AnimaleDomestico object) {
        return animaleDomesticoRepository.save(object);
    }

    @Override
    public void delete(AnimaleDomestico object) {
        animaleDomesticoRepository.delete(object);
    }

    @Override
    public void deleteById(Long aLong) {
        animaleDomesticoRepository.deleteById(aLong);
    }
}
