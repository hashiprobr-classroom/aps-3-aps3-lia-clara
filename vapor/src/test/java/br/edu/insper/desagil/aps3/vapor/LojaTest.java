import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class LojaTest {
    private Loja loja;
    private Usuario dono;
    private List<Jogo> jogos;

    @BeforeEach
    void setUp(){
        jogos = new ArrayList<>();
        jogos.add(new Jogo(0,"getmobile"));
        jogos.add(new Jogo(1,"hayday"));
        jogos.add(new Jogo(2,"war"));
        dono = new Usuario("list","lia")
        loja = new Loja(dono,jogos);
    }

    @Test
    void constroi(){
        assertEquals(dono,loja.getDono());
        assertEquals(0,loja.numeroAvaliados(dono));
    }

    @Test
    void umUsuarioAvaliaUmJogo(){
        jogos.get(0).avalia("list",10);
        assertEquals(1,loja.numeroAvaliados(dono));
    }

    @Test
    void umUsuarioAvaliaDoisJogos(){
        jogos.get(0).avalia("list",10);
        jogos.get(1).avalia("list",5);
        assertEquals(2,loja.numeroAvaliados(dono));
    }

    @Test
    void doisUsuariosAvaliamUmJogo(){
        jogos.get(0).avalia("list",10);
        jogos.get(0).avalia("clarusca",5);
        assertEquals(1,loja.numeroAvaliados(dono));
        assertEquals(1,loja.numeroAvaliados(new Usuario("clarusca","clara")));
    }

    @Test
    void doisUsuariosAvaliamDoisJogos(){
        jogos.get(0).avalia("list",10);
        jogos.get(1).avalia("clarusca",5);
        assertEquals(1,loja.numeroAvaliados(dono));
        assertEquals(1,loja.numeroAvaliados(new Usuario("clarusca","clara")));
    }

}
