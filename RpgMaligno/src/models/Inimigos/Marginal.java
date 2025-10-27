package models.Inimigos;

import Itens.ModuloCamuflagem;
import models.Inimigo;
import models.Inventario;

public class Marginal extends Inimigo {
    public Marginal() {

    }

    public Marginal(String nome, byte pontosVida, byte ataque, byte defesa, byte nivel, Inventario inventario) throws Exception {
        super(nome, pontosVida, ataque, defesa, nivel, inventario);
    }

    public Marginal(String nome) throws Exception {
        super("Marginal", (byte)25, (byte)25, (byte)10, (byte)1, criarInventario());
    }
    private static Inventario criarInventario() throws Exception {
        Inventario inv = new Inventario();
        inv.adicionarItem(new ModuloCamuflagem());
        return inv;
    }
}
