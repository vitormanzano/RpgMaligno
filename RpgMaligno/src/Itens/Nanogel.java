package Itens;

import models.Item;

public class Nanogel extends Item {
    public Nanogel() {
        super("Nanogel", "Gel de nanotecnologia regenerativa.", "A vida do jogador é restaurada em 15 pontos", (byte)1);
    }

    public Nanogel(byte quantidade) {
        super("Nanogel", "Gel de nanotecnologia regenerativa.", "A vida do jogador é restaurada em 15 pontos", quantidade);

    }
}
