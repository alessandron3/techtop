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

    public void adicionaItem(String dado) {
        //TODO implementar a funcao de adicionar um item na lista

    }


    public void removerItem(String dado) {
        //TODO implementar funcao de remover um item

    }

}
