package Itens;

import models.Item;

public class Firewall extends Item {
    public Firewall(){
        super("Escudo Firewall", "Blindagem experimental com reator térmico embutido. Projetada para refletir ataques e manter a linha sob fogo pesado.",
                "Reflexão Prismática (50% chance de refletir metado do dano do ataque ao inimigo)", (byte) 1
        );
    }

}