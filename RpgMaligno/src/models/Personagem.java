package models;

public abstract class Personagem {
    private String nome;
    private byte pontosVida;
    private byte ataque;
    private byte defesa;
    private byte nivel;
    private Inventario inventario;

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

    public Inventario getInventario() {
        return inventario;
    }

    public void setInventario(Inventario inventario) {
        this.inventario = inventario;
    }

    @Override
    public String toString() {
        return "Nome: " + this.nome + "\n" +
                "Nível: " + this.nivel + "\n" +
                "HP: " + this.pontosVida + "\n" +
                "Ataque: " + this.ataque + "\n" +
                "Defesa: " + this.defesa + "\n" +
                "Inventário: " + this.inventario;
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
