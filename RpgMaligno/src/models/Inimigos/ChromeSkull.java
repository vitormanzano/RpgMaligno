package models.Inimigos;

import Itens.NanogelPrime;
import models.Inimigo;
import models.Inventario;

public class ChromeSkull extends Inimigo {
    public ChromeSkull() {
    }

    public ChromeSkull(String nome) throws Exception {
        super(nome, (byte)125, (byte)125, (byte)20, (byte)25, (byte)3, criarInventario());
    }

    private static Inventario criarInventario() throws Exception {
        Inventario inv = new Inventario();
        inv.adicionarItem(new NanogelPrime());
        return inv;
    }
}

