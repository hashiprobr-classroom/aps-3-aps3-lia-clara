import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class JogoTest {
    private static final double DELTA = 0.01;

    private Jogo jogo;

    @BeforeEach
    void SetUp(){
        jogo = new Jogo(0,"getmobile");
    }

    @Test
    void constroi(){
        assertEquals(0,jogo.getId());
        assertEquals("getmobile",jogo.getNome());
        assertEquals(0,jogo.media(),DELTA);
    }

    @Test
    void avaliaUmaVez(){
        jogo.avalia("list",3);
        assertTrue(jogo.avaliado("list"));
        assertFalse(jogo.avaliado("clarusca"));
        assertEquals(3,jogo.media(),DELTA);
    }

    @Test
    void avaliaDuasVezes(){
        jogo.avalia("list",3);
        jogo.avalia("clarusca",4);
        assertTrue(jogo.avaliado("list"));
        assertTrue(jogo.avaliado("clarusca"));
        assertEquals(3.5,jogo.media(),DELTA);
    }

    @Test
    void avaliaTresVezes(){
        jogo.avalia("list",3);
        jogo.avalia("clarusca",4);
        jogo.avalia("list",5);
        assertEquals(4.5,jogo.media(),DELTA);
    }
}
