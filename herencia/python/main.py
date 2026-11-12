from guerrero import Guerrero
from mago import Mago

heroe = Guerrero("Arturo", 1, 100, 100, 25)

orco = Mago("Orco Feo", 1, 50, 50, 10)

print("Antes del ataque:")
print(heroe)
print(orco)

print("\n--- ¡Arturo ataca al orco! ---")
heroe.atacar(orco)

print("\nDespués del ataque:")
print(orco)

orco = Mago("Orco Feo", 1, 50, 50, 10)

guerrero = Guerrero("Conan", 1, 100, 100, 30)

print("--- Antes del combate ---")
print(guerrero)
print(orco)

print("\n--- ¡Empieza la batalla! ---")
guerrero.atacar(orco)
orco.atacar(guerrero)

print("\n--- Después del combate ---")
print(guerrero)
print(orco)