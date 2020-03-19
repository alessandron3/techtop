package com.alessandron3;

import com.alessandron3.model.Item;

public class ListaSimplesmenteEncadeada {
    public Item primeiro;
    public Item ultimo;
    public int quantidadeItens = 0;

    public ListaSimplesmenteEncadeada(String[] dados) {

        for(String dado: dados)
            this.adicionaItem(dado);
    }


    /**
     *
     * Eu quero ADD A
     *
     * 1) | C |
     *
     * 2) | C |  | A |
     *
     * @param dado
     */
    public void adicionaItem(String dado) {
        //TODO implementar a funcao de adicionar um item na lista

        if(primeiro == null && ultimo == null) {
            Item item = new Item(dado);
            primeiro = item;
            ultimo = item;
        } else {
            Item item = new Item(dado);
            ultimo.proximo = item; //Criei a seta para o proximo
            ultimo = item;
        }


    }


    /**
     *
     * 1) | A |
     *
     * 2) | C |  | A |  | D |
     *
     *
     *
     * @param dado
     */
    public void removerItem(String dado) {
        //TODO implementar funcao de remover um item

        if(primeiro.dado.equals(dado)) {
            Item proximo = primeiro.proximo;
            primeiro = proximo;
        } else {

            Item aux = primeiro.proximo;
            Item anterior = primeiro;

            while (aux != null) {
                if(aux.dado.equals(dado)) {
                    anterior.proximo = aux.proximo;
                    ultimo = aux;
                    break;
                }
                anterior = aux;
                aux = aux.proximo;

            }
        }
    }

}
