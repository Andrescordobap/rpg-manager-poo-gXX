class Item:
    def __init__(self, nombre: str, valor: int):
        self.nombre = nombre
        self.valor = valor

    def __str__(self) -> str:
        return f"Item(nombre={self.nombre}, valor={self.valor})"
