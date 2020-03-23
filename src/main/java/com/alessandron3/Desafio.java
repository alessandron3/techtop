package com.alessandron3;

import java.util.HashMap;
import java.util.Map;

public class Desafio {

    /**
     *  Um Bracket é considerado qualquer um dos seguintes caracteres: (,), {,}, [ou].
     *
     *  Dois Brackets são considerados um par correspondido se um Bracket de abertura
     *  ou seja, (, [, ou {  ocorrer à esquerda de um Bracket de fechamento, ou seja ), ] ou } do mesmo tipo.
     *
     *  Existem três tipos de pares de Bracket correspondentes: [], {} e ().
     *
     *  Um par de Brackets correspondente não é balanceado se o conjunto de Brackets
     *  que ele inclui não for correspondido. Por exemplo, {[(])} não está equilibrado porque o conteúdo
     *
     *  {   [   (   ]    )    }
     *  entre [ ] não está equilibrado. O par de Brackets encerra um único suporte de abertura desequilibrado
     *
     *  Por essa lógica, dizemos que uma sequência de Brackets é balanceada se as seguintes condições
     *  forem atendidas:
     *
     *  - Não contém Brackets inigualáveis.
     *  - O subconjunto de colchetes fechado dentro dos limites de um par de colchetes
     *      correspondente também é um par de colchetes correspondente.
     *
     *
     *
     *  Desafio: Complete a funcao abaixo para retornar true caso a sequencia de Brackets esteja balanceada
     *      caso contrario retorne falso.
     *
     *
     *  Dica: Use uma das estruturas de dados que aprendemos na primeira aula para resolver esse desafio.
     *
     *
     *  1) verifica se o Item corrente é de abertura |   (    {    [   |
     *  2) se for de abertura add o Item na Pilha
     *
     *  3) se o Item corrente for de fechamento:
     *  3.1) faz um pop um pilha
     *  3.2) veficia se o item corrente é o fechamento o item que foi popado da pilha
     *  3.3) caso posito continue a operação
     *  3.4) caso negativo a lista é desbalanceada
     *
     *
     */
    public static boolean estaBalanceado(String s) {

        //Map = Chave, Valor
        Map map = new HashMap<String, String>();

        map.put("(", ")");
        map.put("[", "]");
        map.put("{", "}");



        String fechamento = "]";
        String abertura = "(";

        //             ")"                               "("
        String aberturaFeachamento = (String) map.get(abertura);

        aberturaFeachamento.equals(fechamento);



        return false;
    }

}
