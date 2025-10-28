package models.Inimigos;

import models.Inimigo;
import models.Inventario;

public class Falco extends Inimigo {
    public Falco() {

    }

    public Falco(String nome) throws Exception {
        super(nome, (byte)127, (byte)127, (byte)30, (byte)35, (byte)4, criarInventario());
    }

    private static Inventario criarInventario() throws Exception {
        Inventario inv = new Inventario();
        return inv;
    }
}
