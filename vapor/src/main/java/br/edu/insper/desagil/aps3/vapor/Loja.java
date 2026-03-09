import java.util.List;

public class Loja {
    private Usuario dono;
    private List<Jogo> jogos;

    public Loja(Usuario dono, List<Jogo> jogos){
        this.dono = dono;
        this.jogos = jogos;
    }

    public int numeroAvaliados(Usuario usuario){
        int soma = 0;
        for (Jogo jogo:jogos){
            if (jogo.avaliado(usuario.getApelido())){
                soma += 1;
            }
        }
        return soma;
    }

    public Usuario getDono() {
        return dono;
    }
}
