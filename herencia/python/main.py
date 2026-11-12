from personaje import Personaje
from guerrero import Guerrero

heroe = Personaje("Arturo", 1, 100, 100, 25)

orco = Personaje("Orco Feo", 1, 50, 50, 10)

print("Antes del ataque:")
print(heroe)
print(orco)

print("\n--- ¡Arturo ataca al orco! ---")
heroe.atacar(orco)

print("\nDespués del ataque:")
print(orco)

from herencia.java.herencia.python.personaje import Personaje
from herencia.java.herencia.python.guerrero import Guerrero  

orco = Personaje("Orco Feo", 1, 50, 50, 10)

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