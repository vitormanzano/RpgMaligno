package models;

import java.util.List;

public class Inventario implements Cloneable {
    public List<Item> itens;
    private final byte QUANTIDADE_MAXIMA_DE_ITENS = 10;

    public Inventario(List<Item> itens) {
        this.itens = itens;
    }

    public void adicionarItem(Item item) throws Exception {
        byte quantidadeTotal = getQuantidadeDeItens();

        if (quantidadeTotal == QUANTIDADE_MAXIMA_DE_ITENS) 
            throw new Exception("Quantidade limite de itens atingida!");

        Item itemDoInventario = verificarSeItemJaExisteNoInventario(item);
        if (itemDoInventario == null)
            itens.add(item); // Se esse item nao existir, insiro ele no inventário

        itemDoInventario.aumentarQuantidade(); // Se já existir, aumento a quantidade
    }

    public void removerItem(Item item) {

    }

    public void listarItens() {

    }

    public byte getQuantidadeDeItens() {
        byte quantidadeItens = 0;

        for (Item currentItem : itens) {
            quantidadeItens += currentItem.getQuantidade();
        }

        return quantidadeItens;
    }

    private Item verificarSeItemJaExisteNoInventario(Item item) {
        for (Item currentItem : itens) {
            if (currentItem.verificarSeItemEhIgual(item))
                return currentItem;
        }
        return null;
    }

    @Override
    public String toString() {
        for (int i = 0; i < itens.size(); i++) {
            if (itens.get(i) == null)
                continue;
            System.out.println("Item " + (i+1) + ": " + itens.get(i).toString() + "");
        }
        return "";
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this) return true;
        if (obj == null) return false;
        if (obj.getClass() != this.getClass()) return false;

        Inventario inv = (Inventario)obj;

        for (int i = 0; i < itens.size(); i++) {
            Item currentInvItem = inv.itens.get(i);
            Item currentThisItem = this.itens.get(i);

            if (!currentInvItem.equals(currentThisItem)) return false;
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

    public Inventario(Inventario modelo) throws Exception {
        if (modelo == null) 
            throw new Exception("Modelo inválido!");
        this.itens = modelo.itens;
    }

    @Override
    public Object clone() {
        Inventario ret = null;
        try {
            ret = new Inventario(this);
        }
        catch (Exception e) { }
        return ret;
    }
}
