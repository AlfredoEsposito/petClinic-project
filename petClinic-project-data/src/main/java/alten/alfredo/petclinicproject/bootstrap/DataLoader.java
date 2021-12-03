package alten.alfredo.petclinicproject.bootstrap;

import alten.alfredo.petclinicproject.model.*;
import alten.alfredo.petclinicproject.services.*;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.time.LocalDate;

@Component
public class DataLoader implements CommandLineRunner {

    private final ProprietarioService proprietarioService;
    private final VeterinarioService veterinarioService;
    private final SpecieAnimaleService specieAnimaleService;
    private final SpecializzazioneService specializzazioneService;
    private final VisitaService visitaService;

    public DataLoader(ProprietarioService proprietarioService, VeterinarioService veterinarioService, SpecieAnimaleService specieAnimaleService, SpecializzazioneService specializzazioneService, VisitaService visitaService) {
        this.proprietarioService = proprietarioService;
        this.veterinarioService = veterinarioService;
        this.specieAnimaleService = specieAnimaleService;
        this.specializzazioneService = specializzazioneService;
        this.visitaService = visitaService;
    }

    //Questo processo serve a caricare alcuni dati iniziali con cui poter lavorare

    @Override
    public void run(String... args) throws Exception {
        int count = specieAnimaleService.findAll().size();

        if(count == 0){
            loadData();
        }

    }

    private void loadData() {
        SpecieAnimale cane = new SpecieAnimale();
        cane.setNome_specie("Cane");
        SpecieAnimale specie1 = specieAnimaleService.save(cane);

        SpecieAnimale gatto = new SpecieAnimale();
        gatto.setNome_specie("Gatto");
        SpecieAnimale specie2 = specieAnimaleService.save(gatto);

        Specializzazione radiologia = new Specializzazione();
        radiologia.setDescrizione("Radiologia");
        Specializzazione specializzazione1 = specializzazioneService.save(radiologia);

        Specializzazione chirurgia = new Specializzazione();
        radiologia.setDescrizione("Chirurgia");
        Specializzazione specializzazione2 = specializzazioneService.save(chirurgia);

        Specializzazione odontoiatria = new Specializzazione();
        radiologia.setDescrizione("Odontoiatria");
        Specializzazione specializzazione3 = specializzazioneService.save(odontoiatria);

        //PROPRIETARI

        Proprietario proprietario1 = new Proprietario();
        proprietario1.setNome("Pippo");
        proprietario1.setCognome("Baudo");
        proprietario1.setIndirizzo("Via Garibaldi, 13");
        proprietario1.setCitta("Roma");
        proprietario1.setNumero_telefono("3471228945");

        AnimaleDomestico animaleDiPippo = new AnimaleDomestico();
        animaleDiPippo.setSpecie(specie1);
        animaleDiPippo.setNome("Bobby");
        animaleDiPippo.setData_nascita(LocalDate.now());
        animaleDiPippo.setProprietario(proprietario1);
        proprietario1.getAnimaliDomestici().add(animaleDiPippo);

        proprietarioService.save(proprietario1);

        Proprietario proprietario2 = new Proprietario();
        proprietario2.setNome("Nino");
        proprietario2.setCognome("Frassica");
        proprietario2.setIndirizzo("Via San Carlo, 52");
        proprietario2.setCitta("Messina");
        proprietario2.setNumero_telefono("3617790123");

        AnimaleDomestico animaleDiNino = new AnimaleDomestico();
        animaleDiNino.setSpecie(specie2);
        animaleDiNino.setNome("Fuffy");
        animaleDiNino.setData_nascita(LocalDate.now());
        animaleDiNino.setProprietario(proprietario2);
        proprietario2.getAnimaliDomestici().add(animaleDiNino);

        proprietarioService.save(proprietario2);

        Visita visitaGatto = new Visita();
        visitaGatto.setAnimale_domestico(animaleDiNino);
        visitaGatto.setDataVisita(LocalDate.now());
        visitaGatto.setDescrizione("Gatto raffreddato");

        visitaService.save(visitaGatto);

        System.out.println("Proprietari salvati...");

        //VETERINARI

        Veterinario veterinario1 = new Veterinario();
        veterinario1.setNome("Romeo");
        veterinario1.setCognome("Guzzi");
        veterinario1.getSpecializzazioni().add(specializzazione1);

        veterinarioService.save(veterinario1);

        Veterinario veterinario2 = new Veterinario();
        veterinario2.setNome("Salvatore");
        veterinario2.setCognome("Giordano");
        veterinario2.getSpecializzazioni().add(specializzazione2);
        veterinario2.getSpecializzazioni().add(specializzazione3);

        veterinarioService.save(veterinario2);

        System.out.println("Veterinari salvati...");
    }
}
