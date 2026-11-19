public class Principal {
    private static final long MB = 1024 * 1024;

    public static void main(String[] args) {
        ComponenteSistemaDeArquivos root = new Pasta("root");

        ComponenteSistemaDeArquivos docs = new Pasta("docs");
        docs.adicionar(new Arquivo("projeto.pdf", 2 * MB));
        docs.adicionar(new Arquivo("relatorio.docx", MB));

        ComponenteSistemaDeArquivos familia = new Pasta("familia");
        familia.adicionar(new Arquivo("casal.jpg", 2 * MB));
        familia.adicionar(new Arquivo("filhos.jpg", MB));

        ComponenteSistemaDeArquivos fotos = new Pasta("fotos");
        fotos.adicionar(new Arquivo("vacacao.jpg", 3 * MB));
        fotos.adicionar(familia);

        root.adicionar(docs);
        root.adicionar(fotos);
        root.adicionar(new Arquivo("readme.txt", MB / 2));

        root.exibir("");

        System.out.println();
        System.out.println("Tamanho total: " + ComponenteSistemaDeArquivos.emMB(root.getTamanho()));
        System.out.println("Tamanho da pasta '" + docs.getNome() + "': " + ComponenteSistemaDeArquivos.emMB(docs.getTamanho()));
        System.out.println("Tamanho da pasta '" + familia.getNome() + "': " + ComponenteSistemaDeArquivos.emMB(familia.getTamanho()));
    }
}
