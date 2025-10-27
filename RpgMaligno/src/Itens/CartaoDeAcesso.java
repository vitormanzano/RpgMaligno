package Itens;

import models.Item;

public class CartaoDeAcesso extends Item {
    public CartaoDeAcesso(){
        super("Cartão de Acesso", "Cartão metálico da Monolith provavelmente usado para abrir alguma porta.",
                "Abre o portão principal do armazém da Monolith", (byte) 1
        );
    }

}