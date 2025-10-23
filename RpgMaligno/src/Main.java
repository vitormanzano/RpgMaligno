
import java.util.ArrayList;
import java.util.List;

import Itens.PocaoCura;
import models.*;

public class Main {
    public static void main(String[] args) {
        List<Item> list = new ArrayList<Item>();
        list.add(new PocaoCura());
        Inventario inv = new Inventario(list);
        System.out.println(inv);
    }

    
}
