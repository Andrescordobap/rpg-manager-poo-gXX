from abc import ABC, abstractmethod


class Personaje(ABC):
    def __init__(self, nombre, nivel, vida, vida_maxima, ataque):
        self.__nombre = nombre
        self.__nivel = nivel
        self.__vida = vida
        self.__vida_maxima = vida_maxima
        self.__ataque = ataque

    @property
    def vida(self):
        return self.__vida

    @vida.setter
    def vida(self, nueva_vida):
        if nueva_vida < 0:
            self.__vida = 0
        elif nueva_vida > self.__vida_maxima:
            self.__vida = self.__vida_maxima
        else:
            self.__vida = nueva_vida

    def recibir_dano(self, cantidad):
        self.vida = self.vida - cantidad

    def esta_vivo(self):
        return self.vida > 0

    def atacar(self, objetivo):
        objetivo.recibir_dano(self.__ataque)

    @abstractmethod
    def habilidad_especial(self):
        pass

    def __str__(self):
        return f"{self.__nombre} (LVL {self.__nivel}) - Vida: {self.vida}/{self.__vida_maxima}"