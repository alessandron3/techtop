package com.alessandron3;

import java.util.LinkedList;
import java.util.List;

public class Queue {
    List<String> dados = new LinkedList<>();

    //Enfila
    public void enqueue(String dado) {
        //TODO implementar add um elemento na fila
        dados.add(dado);
    }

    //Desenfilera
    public String dequeue() {
        //TODO implementar funcao para remover um elemento da fila
        return dados.remove(0);
    }

    public boolean isEmpty() {
        //TODO Implementar funcao para verificar e a fila esta vazia
        return dados.isEmpty();
    }
}
