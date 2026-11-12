public class Guerrero extends Personaje {

    private int armadura;
    private int fuerza;

    public Guerrero(String nombre, int nivel, int vida, int vidaMaxima, int ataque) {
        super(nombre, nivel, vida, vidaMaxima, ataque);
        this.armadura = 10;
        this.fuerza = 15;
    }

    @Override
    public void habilidadEspecial() {
        System.out.println("¡El Guerrero usa su fuerza en una habilidad especial!");
    }

    @Override
    public void recibirDano(int cantidad) {
        int danoReal = cantidad - this.armadura;

        if (danoReal < 0) {
            danoReal = 0;
        }

        super.recibirDano(danoReal);
    }
}
