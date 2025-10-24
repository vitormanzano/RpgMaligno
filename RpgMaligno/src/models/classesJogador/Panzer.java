package models.classesJogador;

import models.personagem.Personagem;

public class Panzer extends Personagem {

    public Panzer() { }

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
}
