package models.Inimigos;

import models.Inimigo;
import models.Inventario;

public class Drone extends Inimigo {
    public Drone() {
    }

    public Drone(String nome, byte pontosVida, byte ataque, byte defesa, byte nivel, Inventario inventario) throws Exception {
        super(nome, pontosVida, ataque, defesa, nivel, inventario);
    }

    public Drone(String nome) throws Exception {
        super("Drone de Vigilância", (byte)100, (byte)50, (byte)25, (byte)3, criarInventario());
    }
    private static Inventario criarInventario() throws Exception {
        Inventario inv = new Inventario();
        return inv;
    }
}

