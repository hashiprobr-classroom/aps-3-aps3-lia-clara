import org.junit.jupiter.api.BeforeEach;

import java.util.ArrayList;
import java.util.List;

public class ComunidadeTest {
    private Comunidade comunidade;
    private List<Usuario> membros;

    @BeforeEach
    void setUp(){
        membros = new ArrayList<>();
        comunidade = new Comunidade(membros);
    }
}
