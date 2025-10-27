package models;

import models.personagem.Personagem;

public class Inimigo extends Personagem {
    public Inimigo(){};

    public Inimigo(String nome, byte pontosVida, byte ataque, byte defesa, byte nivel, Inventario inventario) throws Exception {
        this.setNome(nome);
        this.setPontosVida(pontosVida);
        this.setAtaque(ataque);
        this.setDefesa(defesa);
        this.setNivel(nivel);
        this.setInventario(new Inventario(inventario));
    }
}
