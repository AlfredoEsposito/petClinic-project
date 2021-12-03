package alten.alfredo.petclinicproject.services.map;

import alten.alfredo.petclinicproject.model.Specializzazione;
import alten.alfredo.petclinicproject.model.Veterinario;
import alten.alfredo.petclinicproject.services.SpecializzazioneService;
import alten.alfredo.petclinicproject.services.VeterinarioService;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
public class VeterinarioServiceMap extends  AbstractMapService<Veterinario, Long> implements VeterinarioService {

    private final SpecializzazioneService specializzazioneService;

    public VeterinarioServiceMap(SpecializzazioneService specializzazioneService) {
        this.specializzazioneService = specializzazioneService;
    }

    @Override
    public Veterinario findById(Long id) {
        return super.findById(id);
    }

    @Override
    public Set<Veterinario> findAll() {
        return super.findAll();
    }

    //Simulazione salvataggio specializzazione veterinario con hiberrnate
    @Override
    public Veterinario save(Veterinario veterinario) {
        if(veterinario.getSpecializzazioni().size()>0){
            veterinario.getSpecializzazioni().forEach(specializzazione -> {
                if(specializzazione.getId()==null){
                    Specializzazione savedSpec = specializzazioneService.save(specializzazione);
                    specializzazione.setId(savedSpec.getId());
                }
            });
        }
        return super.save(veterinario);
    }

    @Override
    public void delete(Veterinario veterinario) {
        super.delete(veterinario);
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }

    @Override
    public Veterinario findByCognome(String cognome) {
        return null;
    }
}
