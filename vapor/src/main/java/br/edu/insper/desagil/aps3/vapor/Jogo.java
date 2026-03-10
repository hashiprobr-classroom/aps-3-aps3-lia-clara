import java.util.HashMap;
import java.util.Map;

public class Jogo {
    private int id;
    private String nome;
    private Map<String,Integer> avaliacoes;

    public Jogo(int id, String nome){
        this.id = id;
        this.nome = nome;
        this.avaliacoes = new HashMap<>();
    }

    public String getNome() {
        return nome;
    }

    public int getId() {
        return id;
    }

    public void avalia(String apelido,int avaliacao){
        avaliacoes.put(apelido,avaliacao);
    }

    public boolean avaliado(String apelido){
        return avaliacoes.containsKey(apelido);
    }

    public double media(){
        double soma = 0;
        if (avaliacoes.isEmpty()){
            return 0;
        }
        for (int avaliacao:avaliacoes.values()){
            soma += avaliacao;
        }
        return soma/avaliacoes.size();
    }
}
