package models;

public class Item {
    private String nome;
    private String descricao;
    private String efeito;
    private byte quantidade;

    public Item(String nome, String descricao, String efeito, byte quantidade) {
        this.nome = nome;
        this.descricao = descricao;
        this.efeito = efeito;
        this.quantidade = quantidade;
    }

    public void aumentarQuantidade() {
        this.quantidade++;
    }

    public void diminuirQuantidade() {
        this.quantidade--;
    }

    public byte getQuantidade() {
        return this.quantidade;
    }

    @Override
    public String toString()
    {
        return "Nome: " + this.nome +
                " Descrição: " + this.descricao +
                " Efeito: " + this.efeito +
                " Quantidade: " + this.quantidade;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;
        if (this.getClass() != obj.getClass()) return false;

        Item other = (Item) obj;
        if (!this.nome.equals(other.nome) ||
        !this.descricao.equals(other.descricao) ||
        !this.efeito.equals(other.efeito) ||
        this.quantidade != other.quantidade) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int hash = 1;
        hash = hash * 7 + this.nome.hashCode();
        hash = hash * 7 + this.descricao.hashCode();
        hash = hash * 7 + this.efeito.hashCode();
        hash = hash * 7 + ((Byte)this.quantidade).hashCode();
        return hash;
    }
}
