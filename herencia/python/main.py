from arena_combate import iniciar_combate
from guerrero import Guerrero
from mago import Mago

if __name__ == "__main__":
    heroe = Guerrero("Arturo", 1, 100, 100, 25)
    oponente = Mago("Orco Feo", 1, 50, 50, 10)

    iniciar_combate(heroe, oponente)