package alten.alfredo.petclinicproject.services;

import alten.alfredo.petclinicproject.model.AnimaleDomestico;

import java.util.Set;

public interface AnimaleDomesticoService {

    AnimaleDomestico findById(Long id);
    AnimaleDomestico save(AnimaleDomestico animale);
    Set<AnimaleDomestico> findAll();
}
