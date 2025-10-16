package models;

public abstract class Personagem {
    private String nome;
    private byte pontosVida;
    private byte ataque;
    private byte defesa;
    private byte nivel;
    private int inventario;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public byte getPontosVida() {
        return pontosVida;
    }

    public void setPontosVida(byte pontosVida) {
        this.pontosVida = pontosVida;
    }

    public byte getAtaque() {
        return ataque;
    }

    public void setAtaque(byte ataque) {
        this.ataque = ataque;
    }

    public byte getDefesa() {
        return defesa;
    }

    public void setDefesa(byte defesa) {
        this.defesa = defesa;
    }

    public byte getNivel() {
        return nivel;
    }

    public void setNivel(byte nivel) {
        this.nivel = nivel;
    }

    public int getInventario() {
        return inventario;
    }

    public void setInventario(int inventario) {
        this.inventario = inventario;
    }
}
