package models.Inimigos;

import Itens.CartaoDeAcesso;
import Itens.Nanogel;
import models.Inimigo;
import models.Inventario;

public class Guarda extends Inimigo {
    public Guarda() {

    }

    public Guarda(String nome, byte pontosVida, byte ataque, byte defesa, byte nivel, Inventario inventario) throws Exception {
        super(nome, pontosVida, ataque, defesa, nivel, inventario);
    }

    public Guarda(String nome) throws Exception {
        super("Guarda Cibernético", (byte)50, (byte)35, (byte)25, (byte)2, criarInventario());
    }
    private static Inventario criarInventario() throws Exception {
        Inventario inv = new Inventario();
        inv.adicionarItem(new CartaoDeAcesso());
        inv.adicionarItem(new Nanogel());
        return inv;
    }
}
