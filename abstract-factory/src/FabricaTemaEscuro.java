public class FabricaTemaEscuro implements FabricaDeComponentesUI {
    @Override
    public Botao criarBotao() {
        return new BotaoEscuro();
    }

    @Override
    public CaixaDeTexto criarCaixaDeTexto() {
        return new CaixaDeTextoEscura();
    }

    @Override
    public CaixaDeSelecao criarCaixaDeSelecao() {
        return new CaixaDeSelecaoEscura();
    }
}
