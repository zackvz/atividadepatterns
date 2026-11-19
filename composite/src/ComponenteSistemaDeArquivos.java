import java.util.Locale;

public interface ComponenteSistemaDeArquivos {
    String getNome();

    long getTamanho();

    void exibir(String indentacao);

    void adicionar(ComponenteSistemaDeArquivos componente);

    void remover(ComponenteSistemaDeArquivos componente);

    static String emMB(long bytes) {
        return String.format(Locale.US, "%.1f MB", bytes / (1024.0 * 1024.0));
    }
}
