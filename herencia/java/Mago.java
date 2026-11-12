public class Mago extends Personaje {
    private int mana = 20;

    public Mago(String nombre, int nivel, int vida, int vidaMaxima, int ataque) {
        super(nombre, nivel, vida, vidaMaxima, ataque);
    }

    @Override
    public void atacar(Personaje objetivo) {
        int costoMana = 5;

        if (this.mana >= costoMana) {
            this.mana -= costoMana;
            super.atacar(objetivo);
            System.out.println("¡El Mago lanza un hechizo exitoso!");
        } else {
            System.out.println("¡El Mago se quedó sin maná y no puede atacar!");
        }
    }
}