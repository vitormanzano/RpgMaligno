package models;

public class Item implements Cloneable, Comparable<Item> {
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

    public boolean verificarSeItemEhIgual(Item item) {
        if (this.getClass() != item.getClass()) return false;
        return true;
    }

    @Override
    public String toString()
    {
        return "Nome: " + this.nome +
                "\nDescrição: " + this.descricao +
                "\nEfeito: " + this.efeito +
                "\nQuantidade: " + this.quantidade;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;
        if (this.getClass() != obj.getClass()) return false;

        Item other = (Item) obj;
        if (!this.verificarSeItemEhIgual(other)) return false;

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

    public Item(Item modelo) throws Exception {
        if (modelo == null)
            throw new Exception("Modelo inválido!");

        this.nome = modelo.nome;
        this.descricao = modelo.descricao;
        this.efeito = modelo.efeito;
        this.quantidade = modelo.quantidade;
    }

    @Override
    public Object clone() {
        Item ret = null;
        try {
            ret = new Item(this);
        }
        catch (Exception e) { }
        return ret;
    }

    @Override
    public int compareTo(Item i) {
        return this.nome.compareTo(i.nome);
    }
}
