package models.classesJogador;

import Itens.Firewall;
import Itens.Nanogel;
import Itens.Trojan;
import models.Inventario;
import models.personagem.Personagem;

public class Panzer extends Personagem {

    public Panzer() { }

    public Panzer(String nome, byte pontosVida, byte ataque, byte defesa, byte nivel, Inventario inventario) throws Exception {
        super(nome, pontosVida, ataque, defesa, nivel, inventario);
    }

    public Panzer(String nome) throws Exception {
        super(nome, (byte)100, (byte)20, (byte)50, (byte)1, criarInventario());
    }

    public Panzer(Panzer modelo) throws Exception {
        if (modelo == null) 
            throw new Exception("Modelo inválido");

        this.setNome(modelo.getNome());
        this.setPontosVida(modelo.getPontosVida());;
        this.setAtaque(modelo.getAtaque());
        this.setDefesa(modelo.getDefesa());
        this.setNivel(modelo.getNivel());
        this.setInventario(modelo.getInventario());
    }

    private static Inventario criarInventario() throws Exception {
        Inventario inv = new Inventario();
        inv.adicionarItem(new Firewall());
        inv.adicionarItem(new Nanogel((byte) 3));
        return inv;
    }
}
