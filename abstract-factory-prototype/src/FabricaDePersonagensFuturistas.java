public class FabricaDePersonagensFuturistas implements FabricaDePersonagens {
    private final Personagem guerreiroBase = new Personagem("Guerreiro Base", "Soldado Ciborgue", 1, 150, 20);
    private final Personagem magoBase = new Personagem("Mago Base", "Tecnomante", 1, 90, 30);

    @Override
    public Personagem criarGuerreiro() {
        return guerreiroBase.clone();
    }

    @Override
    public Personagem criarMago() {
        return magoBase.clone();
    }
}
