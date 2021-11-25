package alten.alfredo.petclinicproject.bootstrap;

import alten.alfredo.petclinicproject.model.Proprietario;
import alten.alfredo.petclinicproject.model.Veterinario;
import alten.alfredo.petclinicproject.services.ProprietarioService;
import alten.alfredo.petclinicproject.services.VeterinarioService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements CommandLineRunner {

    private final ProprietarioService proprietarioService;
    private final VeterinarioService veterinarioService;

    public DataLoader(ProprietarioService proprietarioService, VeterinarioService veterinarioService) {
        this.proprietarioService = proprietarioService;
        this.veterinarioService = veterinarioService;
    }

    //Questo processo serve a caricare alcuni dati iniziali con cui poter lavorare

    @Override
    public void run(String... args) throws Exception {

        Proprietario proprietario1 = new Proprietario();
        proprietario1.setId(1L);
        proprietario1.setNome("Pippo");
        proprietario1.setCognome("Baudo");
        proprietarioService.save(proprietario1);

        Proprietario proprietario2 = new Proprietario();
        proprietario2.setId(2L);
        proprietario2.setNome("Nino");
        proprietario2.setCognome("Frassica");
        proprietarioService.save(proprietario2);

        System.out.println("Proprietari salvati...");

        Veterinario veterinario1 = new Veterinario();
        veterinario1.setId(1L);
        veterinario1.setNome("Romeo");
        veterinario1.setCognome("Guzzi");
        veterinarioService.save(veterinario1);

        Veterinario veterinario2 = new Veterinario();
        veterinario2.setId(2L);
        veterinario2.setNome("Salvatore");
        veterinario2.setCognome("Giordano");
        veterinarioService.save(veterinario2);

        System.out.println("Veterinari salvati...");

    }
}
