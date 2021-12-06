package alten.alfredo.petclinicproject.services.springdatajpaservices;

import alten.alfredo.petclinicproject.model.Veterinario;
import alten.alfredo.petclinicproject.repositories.VeterinarioRepository;
import alten.alfredo.petclinicproject.services.VeterinarioService;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Set;

@Service
@Profile("springdatajpa")
public class VeterinarioSDJpaService implements VeterinarioService {

    private final VeterinarioRepository veterinarioRepository;

    public VeterinarioSDJpaService(VeterinarioRepository veterinarioRepository) {
        this.veterinarioRepository = veterinarioRepository;
    }

    @Override
    public Veterinario findById(Long aLong) {
       /* Optional<Veterinario> veterinarioOptional = veterinarioRepository.findById(aLong);
        if(veterinarioOptional.isPresent()){
            return veterinarioOptional.get();
        }else{
            return null;
        } */

        return veterinarioRepository.findById(aLong).orElse(null);
    }

    @Override
    public Set<Veterinario> findAll() {
        Set<Veterinario> veterinari = new HashSet<>();
        veterinarioRepository.findAll().forEach(veterinari::add);
        return veterinari;
    }

    @Override
    public Veterinario save(Veterinario object) {
        System.out.println("Sono nel metodo save del Service Veterinario sdjpa");
        return veterinarioRepository.save(object);
    }

    @Override
    public void delete(Veterinario object) {
        veterinarioRepository.delete(object);
    }

    @Override
    public void deleteById(Long aLong) {
        veterinarioRepository.deleteById(aLong);
    }

    @Override
    public Veterinario findByCognome(String cognome) {
        return veterinarioRepository.findByCognome(cognome);
    }
}
