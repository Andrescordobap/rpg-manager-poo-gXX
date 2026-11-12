public class Principal {
    public static void main(String[] args) {
        
        Personaje heroe = new Personaje("Arturo", 1, 100, 100, 25);

        Personaje orco = new Personaje("Orco Feo", 1, 50, 50, 10);

        System.out.println("Antes del ataque:");
        System.out.println(heroe); 
        System.out.println(orco);

        System.out.println("\n--- ¡Arturo ataca al orco! ---");
        heroe.atacar(orco);

        System.out.println("\nDespués del ataque:");
        System.out.println(orco);
    }
}