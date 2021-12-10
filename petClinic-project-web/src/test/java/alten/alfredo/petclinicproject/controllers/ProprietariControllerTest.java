package alten.alfredo.petclinicproject.controllers;

import alten.alfredo.petclinicproject.model.Proprietario;
import alten.alfredo.petclinicproject.services.ProprietarioService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import java.util.HashSet;
import java.util.Set;

import static org.hamcrest.Matchers.hasSize;
import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

@ExtendWith(MockitoExtension.class)
class ProprietariControllerTest {

    @Mock
    ProprietarioService proprietarioService;

    @InjectMocks
    ProprietariController proprietariController;

    Set<Proprietario> proprietari;

    MockMvc mockMvc;

    @BeforeEach
    void setUp() {
        proprietari = new HashSet<>();
        proprietari.add(Proprietario.builder().id(1L).build());
        proprietari.add(Proprietario.builder().id(1L).build());

        mockMvc = MockMvcBuilders.standaloneSetup(proprietariController).build();
    }

    @Test
    void mostraProprietari() throws Exception {
        when(proprietarioService.findAll()).thenReturn(proprietari);
        mockMvc.perform(get("/proprietari/ownersIndex")) // url che invoca il metodo nella classe controller
                .andExpect(status().isOk())
                .andExpect(view().name("proprietari/ownersIndex")) //percorso della pagina di view
                .andExpect(model().attribute("proprietari", hasSize(2)));

    }
}