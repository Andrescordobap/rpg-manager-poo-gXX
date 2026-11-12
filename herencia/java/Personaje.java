public abstract class Personaje implements Combatiente {
    private String nombre;
    private int nivel;
    private int vida;
    private int vidaMaxima;
    private int ataque;
    private Inventario inventario;


    public Personaje(String nombre, int nivel, int vida, int vidaMaxima, int ataque) {
        this.nombre = nombre;
        this.nivel = nivel;
        this.vida = vida;
        this.vidaMaxima = vidaMaxima;
        this.ataque = ataque;
    }

    public int getVida() {
        return this.vida;
    }

    public void setVida(int nuevaVida) {
        if (nuevaVida < 0) {
            this.vida = 0;
        } else if (nuevaVida > this.vidaMaxima) {
            this.vida = this.vidaMaxima;
        } else {
            this.vida = nuevaVida;
        }
    }

    public void recibirDano(int cantidad) {
        this.setVida(this.getVida() - cantidad);
    }

    public boolean estaVivo() {
        return this.getVida() > 0;
    }

    public void atacar(Combatiente objetivo) {
        objetivo.recibirDano(this.ataque);
    }

    public abstract void habilidadEspecial();

    @Override
    public String toString() {
        return String.format("%s (LVL %d) - Vida: %d/%d", 
                             this.nombre, this.nivel, this.getVida(), this.vidaMaxima);
    }
}