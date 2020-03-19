package com.alessandron3;

import java.util.LinkedList;
import java.util.List;

public class Stack {
    List<String> dados = new LinkedList<>();

    public void push(String dado) {
        dados.add(dado);
    }

    public String pop() {
        if(dados.isEmpty())
            return null;

        return  dados.remove(dados.size() - 1);
    }

    public int size() {
        return dados.size();
    }
}
