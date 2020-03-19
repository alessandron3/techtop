package com.alessandron3;

import java.util.LinkedList;
import java.util.List;

public class Queue {
    List<String> dados = new LinkedList<>();


    public void enqueue(String dado) {
        //TODO implementar add um elemento na fila
        dados.add(dado);
    }

    public String dequeue() {
        //TODO implementar funcao para remover um elemento da fila
        if(!isEmpty())
            return dados.remove(0);
        return null;
    }

    public boolean isEmpty() {
        return dados.isEmpty();
    }
}
