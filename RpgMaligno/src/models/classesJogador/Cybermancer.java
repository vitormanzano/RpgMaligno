package models.classesJogador;

import Itens.Disassembler;
import Itens.Nanogel;
import Itens.Trojan;
import models.Inventario;
import models.personagem.Personagem;

public class Cybermancer extends Personagem {

    public Cybermancer() { }

    public Cybermancer(String nome, byte pontosVida, byte ataque, byte defesa, byte nivel, Inventario inventario) throws Exception {
        super(nome, pontosVida, ataque, defesa, nivel, inventario);
    }

    public Cybermancer(String nome, byte pontosVida, byte ataque, byte defesa, byte nivel) throws Exception {
        super(nome, pontosVida, ataque, defesa, nivel, criarInventario());
    }

    public Cybermancer(Cybermancer modelo) throws Exception {
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
        inv.adicionarItem(new Trojan());
        inv.adicionarItem(new Nanogel((byte) 3));
        return inv;
    }
}
