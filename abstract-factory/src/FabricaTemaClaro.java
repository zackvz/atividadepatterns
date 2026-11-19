public class FabricaTemaClaro implements FabricaDeComponentesUI {
    @Override
    public Botao criarBotao() {
        return new BotaoClaro();
    }

    @Override
    public CaixaDeTexto criarCaixaDeTexto() {
        return new CaixaDeTextoClara();
    }

    @Override
    public CaixaDeSelecao criarCaixaDeSelecao() {
        return new CaixaDeSelecaoClara();
    }
}
