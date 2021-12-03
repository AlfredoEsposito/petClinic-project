package alten.alfredo.petclinicproject.services.springdatajpaservices;

import alten.alfredo.petclinicproject.model.SpecieAnimale;
import alten.alfredo.petclinicproject.repositories.SpecieAnimaleRepository;
import alten.alfredo.petclinicproject.services.SpecieAnimaleService;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Set;

@Service
@Profile("springdatajpa")
public class SpecieAnimaleSDJpaService implements SpecieAnimaleService {

    private final SpecieAnimaleRepository specieAnimaleRepository;

    public SpecieAnimaleSDJpaService(SpecieAnimaleRepository specieAnimaleRepository) {
        this.specieAnimaleRepository = specieAnimaleRepository;
    }

    @Override
    public SpecieAnimale findById(Long aLong) {
        /*Optional<SpecieAnimale> specieAnimaleOptional = specieAnimaleRepository.findById(aLong);
        if(specieAnimaleOptional.isPresent()){
            return specieAnimaleOptional.get();
        }else{
            return null;
        }*/
        return specieAnimaleRepository.findById(aLong).orElse(null);
    }

    @Override
    public Set<SpecieAnimale> findAll() {
        Set<SpecieAnimale> specie = new HashSet<>();
        specieAnimaleRepository.findAll().forEach(specie::add);
        return specie;
    }

    @Override
    public SpecieAnimale save(SpecieAnimale object) {
        return specieAnimaleRepository.save(object);
    }

    @Override
    public void delete(SpecieAnimale object) {
        specieAnimaleRepository.delete(object);
    }

    @Override
    public void deleteById(Long aLong) {
        specieAnimaleRepository.deleteById(aLong);
    }
}
