package models;

import models.personagem.Personagem;

public class Inimigo extends Personagem {
    public Inimigo(){};

    public Inimigo(String nome, byte pontosVida, byte maxPontosVida, byte ataque, byte defesa, byte nivel, Inventario inventario) throws Exception {
        this.setNome(nome);
        this.setPontosVida(pontosVida);
        this.setMaxPontosVida(maxPontosVida);
        this.setAtaque(ataque);
        this.setDefesa(defesa);
        this.setNivel(nivel);
        this.setInventario(new Inventario(inventario));
    }
}
