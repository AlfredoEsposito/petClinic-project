package alten.alfredo.petclinicproject.services.map;

import alten.alfredo.petclinicproject.model.Proprietario;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Set;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

class ProprietarioServiceMapTest {

    ProprietarioServiceMap proprietarioServiceMap;

    Long id = 1L;
    String test = "Test";

    @BeforeEach
    void setUp() {
        proprietarioServiceMap = new ProprietarioServiceMap(new SpecieAnimaleServiceMap(), new AnimaleDomesticoServiceMap());
        proprietarioServiceMap.save(Proprietario.builder().id(id).cognome(test).build());
    }

    @Test
    void findById() {
        Proprietario proprietario = proprietarioServiceMap.findById(id);
        assertEquals(id, proprietario.getId());

    }

    @Test
    void findAll() {
        Set<Proprietario> proprietari = proprietarioServiceMap.findAll();
        assertEquals(1, proprietari.size());
    }

    @Test
    void deleteById() {
        proprietarioServiceMap.deleteById(id);
        assertEquals(0, proprietarioServiceMap.findAll().size());
    }

    @Test
    void delete() {
        proprietarioServiceMap.delete(proprietarioServiceMap.findById(id));
        assertEquals(0, proprietarioServiceMap.findAll().size());
    }

    @Test
    void saveExistingId() {
        Proprietario proprietarioSalvato = proprietarioServiceMap.save(Proprietario.builder().id(id).build());
        assertEquals(id, proprietarioSalvato.getId());
    }

    @Test
    void saveNoId() {
        Proprietario proprietarioSalvato = proprietarioServiceMap.save(Proprietario.builder().build());
        assertNotNull(proprietarioSalvato);
        assertNotNull(proprietarioSalvato.getId());
    }

    @Test
    void findByCognome() {
        Proprietario proprietario = proprietarioServiceMap.findByCognome(test);
        assertNotNull(proprietario);
        assertEquals(test, proprietario.getCognome());
    }
}