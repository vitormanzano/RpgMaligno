package models;

public class Inventario {
    public Item[] itens;

    public void adicionarItem(Item item) {

    }

    public void removerItem(Item item) {

    }

    public void listarItens() {

    }
    @Override
    public String toString() {
        for (Item item : itens) {
            System.out.println(item);
        }
        return "";
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;
        if (this.getClass() != obj.getClass()) return false;
        Inventario other = (Inventario) obj;
        for (int i = 0; i < itens.length; i++) {
            if (!itens[i].equals(other.itens[i])) return false;
        }
        return true;
    }

    @Override
    public int hashCode() {
        int hash = 1;
        for (Item item : itens) {
            hash = hash * 7 + item.hashCode();
        }
        return hash;
    }
}
