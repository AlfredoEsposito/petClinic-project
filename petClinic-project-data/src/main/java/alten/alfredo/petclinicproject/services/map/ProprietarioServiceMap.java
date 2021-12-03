package alten.alfredo.petclinicproject.services.map;

import alten.alfredo.petclinicproject.model.AnimaleDomestico;
import alten.alfredo.petclinicproject.model.Proprietario;
import alten.alfredo.petclinicproject.services.AnimaleDomesticoService;
import alten.alfredo.petclinicproject.services.ProprietarioService;
import alten.alfredo.petclinicproject.services.SpecieAnimaleService;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
@Profile({"default","map"})
public class ProprietarioServiceMap extends AbstractMapService<Proprietario, Long> implements ProprietarioService {

    private final SpecieAnimaleService specieAnimaleService;
    private final AnimaleDomesticoService animaleDomesticoService;

    public ProprietarioServiceMap(SpecieAnimaleService specieAnimaleService, AnimaleDomesticoService animaleDomesticoService) {
        this.specieAnimaleService = specieAnimaleService;
        this.animaleDomesticoService = animaleDomesticoService;
    }

    @Override
    public Proprietario findById(Long id) {
        return super.findById(id);
    }

    @Override
    public Set<Proprietario> findAll() {
        return super.findAll();
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }

    @Override
    public void delete(Proprietario proprietario) {
        super.delete(proprietario);
    }

    //Simulazione salvataggio animale domestico con hiberrnate
    @Override
    public Proprietario save(Proprietario proprietario) {
        if (proprietario!=null){
            if (proprietario.getAnimaliDomestici()!=null){
                proprietario.getAnimaliDomestici().forEach(animaleDomestico -> {
                    if (animaleDomestico.getSpecie()!=null){
                        if(animaleDomestico.getId()==null){
                            animaleDomestico.setSpecie(specieAnimaleService.save(animaleDomestico.getSpecie()));
                        }
                    }else{
                        throw new RuntimeException("la specie è obbligatoria");
                    }
                    if (animaleDomestico.getId()==null){
                        AnimaleDomestico savedPet = animaleDomesticoService.save(animaleDomestico);
                        animaleDomestico.setId(savedPet.getId());
                    }
                });
            }
            return super.save(proprietario);
        }else{
            return null;
        }
    }

    @Override
    public Proprietario findByCognome(String cognome) {
        return null;
    }
}
