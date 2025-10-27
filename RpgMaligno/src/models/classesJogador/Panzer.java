package models.classesJogador;

import Itens.Firewall;
import Itens.Nanogel;
import models.Inventario;
import models.personagem.Personagem;

public class Panzer extends Personagem implements Cloneable {

    public Panzer() { }

    public Panzer(String nome, byte pontosVida, byte maxPontosVida, byte ataque, byte defesa, byte nivel, Inventario inventario) throws Exception {
        super(nome, pontosVida, maxPontosVida, ataque, defesa, nivel, inventario);
    }

    public Panzer(String nome) throws Exception {
        super(nome, (byte)100, (byte)100, (byte)20, (byte)50, (byte)1, criarInventario());
    }

    public Panzer(Panzer modelo) throws Exception {
        if (modelo == null) 
            throw new Exception("Modelo inválido");

        this.setNome(modelo.getNome());
        this.setPontosVida(modelo.getPontosVida());;
        this.setAtaque(modelo.getAtaque());
        this.setDefesa(modelo.getDefesa());
        this.setNivel(modelo.getNivel());
        this.setInventario(new Inventario(modelo.getInventario()));
    }

    private static Inventario criarInventario() throws Exception {
        Inventario inv = new Inventario();
        inv.adicionarItem(new Firewall());
        inv.adicionarItem(new Nanogel((byte) 3));
        return inv;
    }

    @Override
    public Object clone() {
        Panzer ret = null;
        try {
            ret = new Panzer(this);
        }
        catch (Exception e) { }
        return ret;
    }
}
