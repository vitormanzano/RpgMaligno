package models.Inimigos;

import Itens.CartaoDeAcesso;
import Itens.NucleoInstavel;
import models.Inimigo;
import models.Inventario;

public class GuardaDanificado extends Inimigo {
    public GuardaDanificado() {

    }

    public GuardaDanificado(String nome, byte pontosVida, byte ataque, byte defesa, byte nivel, Inventario inventario) throws Exception {
        super(nome, pontosVida, ataque, defesa, nivel, inventario);
    }

    public GuardaDanificado(String nome) throws Exception {
        super("Guarda Cibernético Danificado", (byte)25, (byte)35, (byte)25, (byte)2, criarInventario());
    }
    private static Inventario criarInventario() throws Exception {
        Inventario inv = new Inventario();
        inv.adicionarItem(new NucleoInstavel());
        return inv;
    }
}
