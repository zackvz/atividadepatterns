import java.util.ArrayList;
import java.util.List;

public class Pasta implements ComponenteSistemaDeArquivos {
    private final String nome;
    private final List<ComponenteSistemaDeArquivos> componentes = new ArrayList<>();

    public Pasta(String nome) {
        this.nome = nome;
    }

    @Override
    public String getNome() {
        return nome;
    }

    @Override
    public long getTamanho() {
        long total = 0;
        for (ComponenteSistemaDeArquivos componente : componentes) {
            total += componente.getTamanho();
        }
        return total;
    }

    @Override
    public void exibir(String indentacao) {
        System.out.println(indentacao + nome + "/");
        String base = indentacao.replace("├─ ", "│  ").replace("└─ ", "   ");
        for (int i = 0; i < componentes.size(); i++) {
            boolean ultimo = i == componentes.size() - 1;
            componentes.get(i).exibir(base + (ultimo ? "└─ " : "├─ "));
        }
    }

    @Override
    public void adicionar(ComponenteSistemaDeArquivos componente) {
        componentes.add(componente);
    }

    @Override
    public void remover(ComponenteSistemaDeArquivos componente) {
        componentes.remove(componente);
    }
}
