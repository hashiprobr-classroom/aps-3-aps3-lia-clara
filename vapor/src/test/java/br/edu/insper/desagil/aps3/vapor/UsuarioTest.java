import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class UsuarioTest {
    private Usuario usuario;

    @BeforeEach
    void setUp(){
        usuario = new Usuario("list", "lia");
    }

    @Test
    void constroi(){
        assertEquals("list",usuario.getApelido());
        assertEquals("lia",usuario.getNome());
    }

    @Test
    void mudaNome(){
         usuario.setNome("clara");
         assertEquals("clara",usuario.getNome());
    }
}
