package models.personagem;

import models.Inventario;

public abstract class Personagem {
    private String nome;
    private byte pontosVida, maxPontosVida, ataque, defesa, nivel;
    private Inventario inventario;

    public Personagem() { }

    public Personagem(String nome, byte pontosVida, byte maxPontosVida, byte ataque, byte defesa, byte nivel, Inventario inventario) throws Exception {
        this.nome = nome;
        this.pontosVida = pontosVida;
        this.maxPontosVida = pontosVida;
        this.ataque = ataque;
        this.defesa = defesa;
        this.nivel = nivel;
        this.inventario = new Inventario(inventario);
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public byte getPontosVida() {
        return this.pontosVida;
    }

    public void setPontosVida(byte pontosVida) {
        this.pontosVida = pontosVida;
    }

    public byte getMaxPontosVida() {
        return this.maxPontosVida;
    }

    public void setMaxPontosVida(byte maxPontosVida) {
        this.maxPontosVida = maxPontosVida;
    }

    public byte getAtaque() {
        return this.ataque;
    }

    public void setAtaque(byte ataque) {
        this.ataque = ataque;
    }

    public byte getDefesa() {
        return this.defesa;
    } 

    public void setDefesa(byte defesa) {
        this.defesa = defesa;
    }

    public byte getNivel() {
        return this.nivel;
    }

    public void setNivel(byte nivel) {
        this.nivel = nivel;
    }

    public Inventario getInventario() {
        return this.inventario;
    }

    public void setInventario(Inventario inventario) {
        this.inventario = inventario;
    }

    public void aumentarNivel() {
        this.nivel++;
        this.maxPontosVida = (byte)(this.maxPontosVida + (this.maxPontosVida + 3));
        this.pontosVida = (byte)(this.pontosVida + (this.pontosVida + 3));
        this.ataque = (byte)(this.ataque + 3);
        this.defesa = (byte)(this.defesa + 3);
    }

    public boolean estaVivo() {
        return this.pontosVida > 0;
    }

    public void recebeuAtaque(byte danoAtaque) {
        if (this.defesa > danoAtaque)
            return;
        this.pontosVida = (byte)(this.pontosVida - (danoAtaque - this.defesa));
    }

    public byte atacarInimigo() {
        byte valorDado = rolarDado();
        return (byte)((valorDado + ataque));
    }

    public static byte rolarDado() {
        System.out.print("🎲 Rolando o dado");
        for (int i = 0; i < 3; i++) {
            try {
                Thread.sleep(400);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
            System.out.print(".");
        }
        byte resultado = (byte)(Math.random() * 20 + 1);

        System.out.println("\n➡ Você tirou: " + resultado);
        return resultado;
    }

    public String toString() {
        return "Nome: " + this.nome +
                " | Nível: " + this.nivel +
                " | HP: " + this.pontosVida + "/" + this.maxPontosVida +
                " | Ataque: " + this.ataque +
                " | Defesa: " + this.defesa;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;
        if (this.getClass() != obj.getClass()) return false;

        Personagem other = (Personagem) obj;
        if (!this.nome.equals(other.nome) ||
                this.pontosVida != other.pontosVida ||
                this.ataque != other.ataque ||
                this.defesa != other.defesa ||
                this.nivel != other.nivel ||
                this.inventario.equals(other.inventario)) return false;
        return true;
    }

    @Override
    public int hashCode() {
        int hash = 1;

        hash = hash * 7 + (nome.hashCode());
        hash = hash * 7 + ((Byte)this.pontosVida).hashCode();
        hash = hash * 7 + ((Byte)this.ataque).hashCode();
        hash = hash * 7 + ((Byte)this.defesa).hashCode();
        hash = hash * 7 + ((Byte)this.nivel).hashCode();
        hash = hash * 7 + inventario.hashCode();
        
        if (hash < 0) hash = -hash;

        return hash;
    }
}
