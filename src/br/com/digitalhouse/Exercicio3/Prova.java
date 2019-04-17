package br.com.digitalhouse.Exercicio3;

import java.util.Set;

public class Prova {

    private Integer somatoria = 0;

    public void somaTotal(Set<Integer> conjuntoDeInteiros){
        for (Integer valor:conjuntoDeInteiros) {
            somatoria += valor;
        }
        System.out.println("Total Geral:" + somatoria.toString());
    }
}
