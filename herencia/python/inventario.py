from typing import List

from item import Item


class Inventario:
    def __init__(self):
        self.items: List[Item] = []

    def agregar_item(self, item: Item) -> None:
        self.items.append(item)

    def eliminar_item(self, item: Item) -> None:
        self.items.remove(item)

    def obtener_items(self) -> List[Item]:
        return self.items

    def mostrar_items(self):
        for item in self.items:
            print(item)