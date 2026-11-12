public interface Combatiente {
    void atacar(Combatiente objetivo);

    void recibirDano(int cantidad);

    boolean estaVivo();
}
