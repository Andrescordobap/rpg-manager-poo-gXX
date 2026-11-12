public class Monstruo implements Combatiente {
    private final String nombre;
    private int vida;
    private final int ataque;

    public Monstruo(String nombre, int vida, int ataque) {
        this.nombre = nombre;
        this.vida = vida;
        this.ataque = ataque;
    }

    @Override
    public void atacar(Combatiente objetivo) {
        objetivo.recibirDano(this.ataque);
    }

    @Override
    public void recibirDano(int cantidad) {
        this.vida -= cantidad;
        if (this.vida < 0) {
            this.vida = 0;
        }
    }

    @Override
    public boolean estaVivo() {
        return this.vida > 0;
    }
}
