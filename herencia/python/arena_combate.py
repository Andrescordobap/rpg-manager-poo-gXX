from combatiente import Combatiente


def iniciar_combate(heroe: Combatiente, oponente: Combatiente) -> None:
    print("Antes del combate:")
    print(heroe)
    print(oponente)

    while heroe.esta_vivo() and oponente.esta_vivo():
        print(f"\n--- {heroe} ataca ---")
        heroe.atacar(oponente)
        print(oponente)

        if oponente.esta_vivo():
            print(f"\n--- {oponente} contraataca ---")
            oponente.atacar(heroe)
            print(heroe)

    print("\nDespués del combate:")
    print(heroe)
    print(oponente)
