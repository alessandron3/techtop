package com.alessandron3;

import java.util.LinkedList;
import java.util.List;

public class Stack {
    List<String> dados = new LinkedList<>();

    public void push(String dado) {
        //TODO implementar funcao para add item na pilha
        dados.add(dado);
    }

    public String pop() {
        //TODO Implementar funcao para remover item da pilha
        //?
        return dados.remove(dados.size() - 1);
    }

    public int size() {
        //TODO Implementar funcao para verificar quantidade de itens na pilha

        return dados.size();
    }
}
