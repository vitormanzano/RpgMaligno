package models.classesJogador;

import Itens.Disassembler;
import Itens.Nanogel;
import models.Inventario;
import models.Item;
import models.personagem.Personagem;

import java.util.ArrayList;
import java.util.List;

public class Bladerunner extends Personagem {

    public Bladerunner() { }

    public Bladerunner(String nome, byte pontosVida, byte ataque, byte defesa, byte nivel, Inventario inventario) throws Exception {
        super(nome, pontosVida, ataque, defesa, nivel, inventario);
    }

    public Bladerunner(String nome) throws Exception {
        super(nome, (byte)75, (byte)30, (byte)30, (byte)1, criarInventario());
    }

    public Bladerunner(Bladerunner modelo) throws Exception {
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
        inv.adicionarItem(new Disassembler());
        inv.adicionarItem(new Nanogel((byte) 3));
        return inv;
    }
}

