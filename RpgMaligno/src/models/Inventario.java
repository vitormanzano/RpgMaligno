package models;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Inventario implements Cloneable {
    public List<Item> itens = new ArrayList<>();
    private final byte QUANTIDADE_MAXIMA_DE_ITENS = 10;

    public Inventario(List<Item> itens) {
        this.itens = itens;
    }

    public Inventario() { }

    public void adicionarItem(Item item) throws Exception {
        byte quantidadeTotal = getQuantidadeDeItens();

        if (quantidadeTotal == QUANTIDADE_MAXIMA_DE_ITENS) 
            throw new Exception("Quantidade limite de itens atingida!");

        Item itemDoInventario = verificarSeItemJaExisteNoInventario(item);
        if (itemDoInventario == null)
            itens.add(item); // Se esse item nao existir, insiro ele no inventário
        else {
            itemDoInventario.aumentarQuantidade(); // Se já existir, aumento a quantidade
        }
        Collections.sort(this.itens);

    }

    public void removerItem(Item item) throws Exception {
        byte quantidadeTotal = getQuantidadeDeItens();

        if (quantidadeTotal == 0)
            throw new Exception("Não há itens para remover!");

        Item itemInventario = verificarSeItemJaExisteNoInventario(item);

        if (itemInventario != null) {
            itemInventario.diminuirQuantidade();
            if (itemInventario.getQuantidade() == 0)
                itens.remove(itemInventario);
        }
    }

    public void listarItens() {
        System.out.println(this);
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

    public Item getItem(int index) {
        return itens.get(index);
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
