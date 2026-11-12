from combatiente import Combatiente


class Monstruo:
    def __init__(self, nombre: str, vida: int, ataque: int):
        self.nombre = nombre
        self.vida = vida
        self.ataque = ataque

    def atacar(self, objetivo: Combatiente) -> None:
        objetivo.recibir_dano(self.ataque)

    def recibir_dano(self, cantidad: int) -> None:
        self.vida -= cantidad
        if self.vida < 0:
            self.vida = 0

    def esta_vivo(self) -> bool:
        return self.vida > 0
