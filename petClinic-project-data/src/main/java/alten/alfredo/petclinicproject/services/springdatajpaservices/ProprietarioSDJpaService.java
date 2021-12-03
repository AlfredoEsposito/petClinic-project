package alten.alfredo.petclinicproject.services.springdatajpaservices;

import alten.alfredo.petclinicproject.model.Proprietario;
import alten.alfredo.petclinicproject.repositories.ProprietarioRepository;
import alten.alfredo.petclinicproject.services.ProprietarioService;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Set;

@Service
@Profile("springdatajpa")
public class ProprietarioSDJpaService implements ProprietarioService {

    private final ProprietarioRepository proprietarioRepository;

    public ProprietarioSDJpaService(ProprietarioRepository proprietarioRepository) {
        this.proprietarioRepository = proprietarioRepository;
    }

    @Override
    public Proprietario findById(Long aLong) {
        /* Optional<Proprietario> optionalProprietario = proprietarioRepository.findById(aLong);
       if(optionalProprietario.isPresent()){
           return optionalProprietario.get();
       }else{
           return null;
       }*/

        return proprietarioRepository.findById(aLong).orElse(null);
    }

    @Override
    public Set<Proprietario> findAll() {
        Set<Proprietario> proprietari = new HashSet<>();
        proprietarioRepository.findAll().forEach(proprietari::add);
        return proprietari;
    }

    @Override
    public Proprietario save(Proprietario object) {
        System.out.println("#########################");
        System.out.println("#########################");
        System.out.println("#########################");
        System.out.println("#########################");
        System.out.println("#########################");
        System.out.println("#########################");
        return proprietarioRepository.save(object);
    }

    @Override
    public void delete(Proprietario object) {
        proprietarioRepository.delete(object);
    }

    @Override
    public void deleteById(Long aLong) {
        proprietarioRepository.deleteById(aLong);
    }

    @Override
    public Proprietario findByCognome(String cognome) {
        return proprietarioRepository.findByCognome(cognome);
    }
}
