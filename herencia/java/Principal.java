public class Principal {
    public static void main(String[] args) {
        
        Personaje heroe = new Guerrero("Arturo", 1, 100, 100, 25);

        Personaje orco = new Arquero("Orco Feo", 1, 50, 50, 10);

        System.out.println("Antes del ataque:");
        System.out.println(heroe); 
        System.out.println(orco);

        System.out.println("\n--- ¡Arturo ataca al orco! ---");
        heroe.atacar(orco);

        Mago mi_mago = new Mago("Gandalf", 10, 100, 100, 20);
        Guerrero enemigo = new Guerrero("Orco", 5, 50, 50, 10);
        mi_mago.atacar(enemigo, new Hechizo("Bola de Fuego", 5, 3));

        System.out.println("\nDespués del ataque:");
        System.out.println(orco);
    }
}