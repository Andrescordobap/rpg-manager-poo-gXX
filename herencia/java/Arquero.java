public class Arquero extends Personaje {
    public Arquero(String nombre, int nivel, int vida, int vidaMaxima, int ataque) {
        super(nombre, nivel, vida, vidaMaxima, ataque);
    }

    @Override
    public void habilidadEspecial() {
        System.out.println("¡El Arquero dispara una flecha precisa!");
    }
}