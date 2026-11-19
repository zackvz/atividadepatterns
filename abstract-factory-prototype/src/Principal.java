public class Principal {
    public static void main(String[] args) {
        System.out.println("=== Era Medieval ===");
        criarEquipe(new FabricaDePersonagensMedievais(), "Arthur", "Merlin");

        System.out.println();
        System.out.println("=== Era Futurista ===");
        criarEquipe(new FabricaDePersonagensFuturistas(), "Nova", "Cypher");
    }

    private static void criarEquipe(FabricaDePersonagens fabrica, String nomeGuerreiro, String nomeMago) {
        Personagem guerreiro = fabrica.criarGuerreiro();
        guerreiro.setNome(nomeGuerreiro);

        Personagem mago = fabrica.criarMago();
        mago.setNome(nomeMago);

        System.out.println(guerreiro);
        System.out.println(mago);
    }
}
