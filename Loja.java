import java.util.ArrayList;
import java.util.List;

public class Loja {
    private String nome;
    private List<Entrega> entregas;

    public Loja(String nome) {
        this.nome = nome;
        this.entregas = new ArrayList<>();
    }

    public String getNome() {
        return nome;
    }

    public void adicionarEntrega(Entrega entrega) {
        entregas.add(entrega);
    }

    public List<Entrega> getEntregas() {
        return entregas;
    }
}