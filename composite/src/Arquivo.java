public class Arquivo implements ComponenteSistemaDeArquivos {
    private final String nome;
    private final long tamanho;

    public Arquivo(String nome, long tamanho) {
        this.nome = nome;
        this.tamanho = tamanho;
    }

    @Override
    public String getNome() {
        return nome;
    }

    @Override
    public long getTamanho() {
        return tamanho;
    }

    @Override
    public void exibir(String indentacao) {
        System.out.println(indentacao + nome + " (" + ComponenteSistemaDeArquivos.emMB(tamanho) + ")");
    }

    @Override
    public void adicionar(ComponenteSistemaDeArquivos componente) {
        throw new UnsupportedOperationException("Arquivo não pode conter componentes");
    }

    @Override
    public void remover(ComponenteSistemaDeArquivos componente) {
        throw new UnsupportedOperationException("Arquivo não pode conter componentes");
    }
}
