import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ComunidadeTest {
    private Comunidade comunidade;
    private List<Usuario> membros;

    @BeforeEach
    void setUp(){
        membros = new ArrayList<>();
        comunidade = new Comunidade(membros);
    }

    @Test
    void constroi(){
        assertEquals(List.of(),comunidade.apelidosMembros());
    }

    @Test
    void adicionaUmMembro(){
        comunidade.adicionaMembro(new Usuario("list","lia"));
        assertEquals(List.of("list"),comunidade.apelidosMembros());
    }

    @Test
    void adicionaDoisMembros(){
        comunidade.adicionaMembro(new Usuario("list","lia"));
        comunidade.adicionaMembro(new Usuario("clarusca","clara"));
        assertEquals(List.of("list","clarusca"),comunidade.apelidosMembros());

    }
}
