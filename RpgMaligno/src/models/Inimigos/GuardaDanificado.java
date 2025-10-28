package models.Inimigos;

import Itens.CartaoDeAcesso;
import Itens.NucleoInstavel;
import models.Inimigo;
import models.Inventario;

public class GuardaDanificado extends Inimigo {
    public GuardaDanificado() {

    }

    public GuardaDanificado(String nome) throws Exception {
        super(nome, (byte)25, (byte)25, (byte)20, (byte)20, (byte)2, criarInventario());
    }

    private static Inventario criarInventario() throws Exception {
        Inventario inv = new Inventario();
        inv.adicionarItem(new NucleoInstavel());
        return inv;
    }
}
