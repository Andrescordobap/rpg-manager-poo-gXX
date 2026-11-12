public class Item {
    private String nombre;
    private int valor;

    public Item(String nombre, int valor) {
        this.nombre = nombre;
        this.valor = valor;
    }

    public String getNombre() {
        return nombre;
    }

    public int getValor() {
        return valor;
    }

    @Override
    public String toString() {
        return "Item{" + "nombre='" + nombre + '\'' + ", valor=" + valor + '}';
    }
}
