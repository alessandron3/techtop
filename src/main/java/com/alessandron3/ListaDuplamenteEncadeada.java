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
        //TODO implementar a funcao de adicionar um item na lista
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
        //TODO Implementar funcao que remove item

        if(primeiro.dado.equals(dado)) {
            primeiro = primeiro.proximo;
            primeiro.anterior = null;
            quantidadeItens--;
        } else {
            ItemDuplo aux = primeiro.proximo; //Aux = Item corrente
            ItemDuplo anterior = aux.anterior; // Aux - 1 / Item antes do Aux


            // | A | -> | C | -> | F |
            while (aux != null) {
                if(aux.dado.equals(dado)) {
                    // | A | -> Proximo = F
                    aux.anterior.proximo = aux.proximo;
                    //dados = C | C é o item a ser removido

                    //Verifico se Axu é o  ultimo ou nao
                    if(aux.proximo != null) {
                        //Aux = C | aux.proximo = F | F.anterior = A
                        aux.proximo.anterior = anterior;
                        // | A | -> | C | -> | F | -> null
                        //Aux = C
                        // (Aux.proximo) = F
                        // Aux.proximo.anterior = A
                    } else {
                        ultimo = null;
                    }
                    quantidadeItens--;
                    break;
                }

                aux = aux.proximo;
                anterior = aux.anterior;
            }
        }
    }


}
