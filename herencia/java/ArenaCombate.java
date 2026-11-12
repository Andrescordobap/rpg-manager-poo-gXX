public class ArenaCombate {
    public static void main(String[] args) {
        Personaje heroe = new Guerrero("Arturo", 1, 100, 100, 25);
        Personaje oponente = new Arquero("Orco Feo", 1, 50, 50, 10);

        iniciarCombate(heroe, oponente);
    }

    public static void iniciarCombate(Combatiente heroe, Combatiente oponente) {
        System.out.println("Antes del combate:");
        System.out.println(heroe);
        System.out.println(oponente);

        while (heroe.estaVivo() && oponente.estaVivo()) {
            System.out.println("\n--- " + heroe + " ataca ---");
            heroe.atacar(oponente);
            System.out.println(oponente);

            if (oponente.estaVivo()) {
                System.out.println("\n--- " + oponente + " contraataca ---");
                oponente.atacar(heroe);
                System.out.println(heroe);
            }
        }

        System.out.println("\nDespués del combate:");
        System.out.println(heroe);
        System.out.println(oponente);
    }
}
