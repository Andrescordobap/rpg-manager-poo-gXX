import java.util.ArrayList;
import java.util.List;

public class Inventario {
    private final List<Item> items = new ArrayList<>();

    public void agregarItem(Item item) {
        items.add(item);
    }

    public void eliminarItem(Item item) {
        items.remove(item);
    }

    public List<Item> getItems() {
        return items;
    }

    public void mostrarItems() {
        for (Item item : items) {
            System.out.println(item);
        }
    }
}
