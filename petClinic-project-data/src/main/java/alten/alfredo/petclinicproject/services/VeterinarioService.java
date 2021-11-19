package alten.alfredo.petclinicproject.services;

import alten.alfredo.petclinicproject.model.Veterinario;

import java.util.Set;

public interface VeterinarioService {

    Veterinario findById(Long id);
    Veterinario save(Veterinario veterinario);
    Set<Veterinario> findAll();
}
