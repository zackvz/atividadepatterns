public class FabricaDePersonagensMedievais implements FabricaDePersonagens {
    private final Personagem guerreiroBase = new Personagem("Guerreiro Base", "Cavaleiro", 1, 100, 15);
    private final Personagem magoBase = new Personagem("Mago Base", "Feiticeiro", 1, 70, 25);

    @Override
    public Personagem criarGuerreiro() {
        return guerreiroBase.clone();
    }

    @Override
    public Personagem criarMago() {
        return magoBase.clone();
    }
}
