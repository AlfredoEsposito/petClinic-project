package alten.alfredo.petclinicproject.services.springdatajpaservices;

import alten.alfredo.petclinicproject.model.Proprietario;
import alten.alfredo.petclinicproject.repositories.ProprietarioRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.HashSet;
import java.util.Optional;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.anyLong;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
class ProprietarioSDJpaServiceTest {

    String test = "test";
    Long id = 1L;

    Proprietario returnProprietario;

    @Mock //crea un mock
    ProprietarioRepository proprietarioRepository;

    @InjectMocks // crea un'istanza della classe e inietta i mock creati precedentemente in questa istanza
    ProprietarioSDJpaService proprietarioSDJpaService;

    @BeforeEach
    void setUp() {
        returnProprietario = Proprietario.builder().id(id).cognome(test).build();
    }

    @Test
    void findById() {
        when(proprietarioRepository.findById(anyLong())).thenReturn(Optional.of(returnProprietario));
        Proprietario proprietario = proprietarioSDJpaService.findById(id);
        assertNotNull(proprietario);
    }

    @Test
    void findByIdNotFound() {
        when(proprietarioRepository.findById(anyLong())).thenReturn(Optional.empty());
        Proprietario proprietario = proprietarioSDJpaService.findById(id);
        assertNull(proprietario);
    }

    @Test
    void findAll() {
        Set<Proprietario> returnProprietari = new HashSet<>();
        returnProprietari.add(Proprietario.builder().id(1L).build());
        returnProprietari.add(Proprietario.builder().id(2L).build());
        when(proprietarioRepository.findAll()).thenReturn(returnProprietari);
        Set<Proprietario> proprietari = proprietarioSDJpaService.findAll();
        assertNotNull(proprietari);
        assertEquals(2, proprietari.size());
    }

    @Test
    void save() {
        when(proprietarioRepository.save(any())).thenReturn(returnProprietario);
        Proprietario proprietario= proprietarioSDJpaService.save(Proprietario.builder().id(id).build());
        assertNotNull(proprietario);
    }

    @Test
    void delete() {
        proprietarioSDJpaService.delete(returnProprietario);
    }

    @Test
    void deleteById() {
        proprietarioSDJpaService.deleteById(returnProprietario.getId());
    }

    @Test
    void findByCognome() {
        when(proprietarioRepository.findByCognome(any())).thenReturn(returnProprietario);
        Proprietario proprietario = proprietarioSDJpaService.findByCognome(test);
        assertEquals(test, proprietario.getCognome());
    }
}