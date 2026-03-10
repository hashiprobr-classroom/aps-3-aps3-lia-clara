import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ComunidadeDeJogoTest {
    private ComunidadeDeJogo cj;
    private List<Usuario> membros;
    private Jogo jogo;

    @BeforeEach
    void setUp(){
        membros = new ArrayList<>();
        jogo = new Jogo(0,"getmobile");
        cj = new ComunidadeDeJogo(membros,jogo);
    }

    @Test
    void adicionaDoisInvalidos(){
        cj.adicionaMembro(new Usuario("list","lia"));
        cj.adicionaMembro(new Usuario("clarusca","clara"));
        assertEquals(List.of(),cj.apelidosMembros());
    }

    @Test
    void adicionaUmInvalidoUmValido(){
        jogo.avalia("list",10);
        cj.adicionaMembro(new Usuario("list","lia"));
        cj.adicionaMembro(new Usuario("clarusca","clara"));
        assertEquals(List.of("list"),cj.apelidosMembros());
    }

    @Test
    void adicionaDoisValidos(){
        jogo.avalia("list",10);
        jogo.avalia("clarusca",7);
        cj.adicionaMembro(new Usuario("list","lia"));
        cj.adicionaMembro(new Usuario("clarusca","clara"));
        assertEquals(List.of("list","clarusca"),cj.apelidosMembros());
    }
}
