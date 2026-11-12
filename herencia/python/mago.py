from personaje import Personaje

class Mago(Personaje):
    def __init__(self, nombre, nivel, vida, vida_maxima, ataque):
        super().__init__(nombre, nivel, vida, vida_maxima, ataque)
        self.mana = 15

    def habilidad_especial(self):
        print("¡El Mago invoca su magia!")

    def atacar(self, objetivo, hechizo=None):
        if hechizo is None:
            super().atacar(objetivo)
            return

        if self.mana < hechizo.costo_mana:
            print("¡El Mago no tiene suficiente maná para lanzar el hechizo!")
            return

        self.mana -= hechizo.costo_mana
        hechizo.lanzar(objetivo)