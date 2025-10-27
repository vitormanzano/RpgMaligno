package models.Inimigos;

import models.Inimigo;
import models.Inventario;

public class ChromeSkull extends Inimigo {
    public ChromeSkull() {
    }

    public ChromeSkull(String nome, byte pontosVida, byte ataque, byte defesa, byte nivel, Inventario inventario) throws Exception {
        super(nome, pontosVida, ataque, defesa, nivel, inventario);
    }

    public ChromeSkull(String nome) throws Exception {
        super("Membro da Chrome Skulls", (byte)125, (byte)50, (byte)25, (byte)3, criarInventario());
    }
    private static Inventario criarInventario() throws Exception {
        Inventario inv = new Inventario();
        return inv;
    }
}

