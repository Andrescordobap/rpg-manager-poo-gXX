from typing import Protocol


class Combatiente(Protocol):
    def atacar(self, objetivo: "Combatiente") -> None:
        ...

    def recibir_dano(self, cantidad: int) -> None:
        ...

    def esta_vivo(self) -> bool:
        ...
