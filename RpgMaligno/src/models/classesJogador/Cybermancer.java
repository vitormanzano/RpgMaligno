package models.classesJogador;

import Itens.Disassembler;
import Itens.Nanogel;
import Itens.Trojan;
import models.Inventario;
import models.personagem.Personagem;

public class Cybermancer extends Personagem implements Cloneable {

    public Cybermancer() { }

    public Cybermancer(String nome, byte pontosVida, byte maxPontosVida, byte ataque, byte defesa, byte nivel, Inventario inventario) throws Exception {
        super(nome, pontosVida, maxPontosVida, ataque, defesa, nivel, inventario);
    }

    public Cybermancer(String nome) throws Exception {
        super(nome, (byte)50, (byte)50, (byte)40, (byte)20, (byte)1, criarInventario());
    }

    public Cybermancer(Cybermancer modelo) throws Exception {
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
        inv.adicionarItem(new Trojan());
        inv.adicionarItem(new Nanogel((byte) 3));
        return inv;
    }

    @Override
    public Object clone() {
        Cybermancer ret = null;
        try {
            ret = new Cybermancer(this);
        }
        catch (Exception e) { }
        return ret;
    }
}
