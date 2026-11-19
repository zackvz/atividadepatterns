public class Aplicacao {
    private final FabricaDeComponentesUI fabrica;

    public Aplicacao(FabricaDeComponentesUI fabrica) {
        this.fabrica = fabrica;
    }

    public void renderizarInterface() {
        fabrica.criarBotao().renderizar();
        fabrica.criarCaixaDeTexto().renderizar();
        fabrica.criarCaixaDeSelecao().renderizar();
    }

    public static void main(String[] args) {
        System.out.println("=== Tema Claro ===");
        new Aplicacao(new FabricaTemaClaro()).renderizarInterface();

        System.out.println();
        System.out.println("=== Tema Escuro ===");
        new Aplicacao(new FabricaTemaEscuro()).renderizarInterface();
    }
}
