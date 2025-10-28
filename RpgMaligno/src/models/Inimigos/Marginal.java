package models.Inimigos;

import Itens.ModuloCamuflagem;
import models.Inimigo;
import models.Inventario;

public class Marginal extends Inimigo {
    public Marginal() {

    }

    public Marginal(String nome) throws Exception {
        super(nome, (byte)25, (byte)25, (byte)15, (byte)10, (byte)1, criarInventario());
    }

    private static Inventario criarInventario() throws Exception {
        Inventario inv = new Inventario();
        inv.adicionarItem(new ModuloCamuflagem());
        return inv;
    }
}
