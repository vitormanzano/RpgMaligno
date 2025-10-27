package Itens;

import models.Item;

public class NanogelPrime extends Item {
    public NanogelPrime() {
        super("Nanogel Prime", "Gel de nanotecnologia regenerativa de ponta.", "A vida do jogador é restaurada em 30 pontos", (byte)1);
    }

    public NanogelPrime(byte quantidade) {
        super("Nanogel", "Gel de nanotecnologia regenerativa de ponta.", "A vida do jogador é restaurada em 30 pontos", quantidade);

    }
}
