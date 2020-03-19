package com.alessandron3;


import com.alessandron3.model.ItemDuplo;

public class ListaDuplamenteEncadeada {
    public ItemDuplo primeiro;
    public ItemDuplo ultimo;
    public int quantidadeItens = 0;

    public ListaDuplamenteEncadeada(String[] dados) {
        for(String dado: dados) {
            adicionarItem(dado);
        }
    }

    public void adicionarItem(String dado) {
        ItemDuplo item = new ItemDuplo(dado);
        if(primeiro == null && ultimo == null)
            primeiro = item;
        else {
            ultimo.proximo = item;
            item.anterior = ultimo;
        }
        ultimo = item;
        quantidadeItens++;
    }

    public void removerItem(String dado) {

        if(primeiro.dado.equals(dado)) {
            primeiro = primeiro.proximo;
            primeiro.anterior = null;
            quantidadeItens--;
        } else {
            ItemDuplo aux = primeiro.proximo;
            ItemDuplo anterior = aux.anterior;
            while (aux != null) {
                if(aux.dado.equals(dado)) {
                    aux.anterior.proximo = aux.proximo;

                    if(aux.proximo != null)
                        aux.proximo.anterior = anterior;
                    else
                        ultimo = null;
                    quantidadeItens--;
                    break;
                }

                aux = aux.proximo;
                anterior = aux.anterior;
            }
        }
    }


}
