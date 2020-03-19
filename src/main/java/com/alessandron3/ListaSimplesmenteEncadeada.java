package com.alessandron3;

import com.alessandron3.model.Item;

public class ListaSimplesmenteEncadeada {
    public Item primeiro;
    public Item ultimo;
    public int quantidadeItens = 0;

    public ListaSimplesmenteEncadeada(String[] dados) {
        //TODO implementar o insert dos dados na lista

        for(String dado: dados)
            this.adicionaItem(dado);
    }

    public void adicionaItem(String dado) {
        //TODO implementar a funcao de adicionar um item na lista

        Item item = new Item(dado);
        if(primeiro == null && ultimo == null) {
            primeiro = item;
        } else {
            ultimo.proximo = item;
        }
        ultimo = item;
        quantidadeItens++;

    }


    public void removerItem(String dado) {
        //TODO implementar funcao de remover um item

        if(primeiro.dado.equals(dado)) {
            primeiro = primeiro.proximo;
            quantidadeItens--;
        } else {
            Item aux = primeiro.proximo;
            Item anterior = primeiro;

            while (aux != null) {
                if(aux.dado.equals(dado)) {
                    anterior.proximo = aux.proximo;
                    quantidadeItens--;

                    if(aux.proximo == null)
                        ultimo = anterior;
                    break;
                }
                anterior = aux;
                aux = aux.proximo;
            }
        }
    }

}
