public class Principal {
    public static void main(String[] args) {
        Personaje heroe = new Guerrero("Arturo", 1, 100, 100, 25);
        Personaje oponente = new Arquero("Orco Feo", 1, 50, 50, 10);

        ArenaCombate.iniciarCombate(heroe, oponente);
    }
}