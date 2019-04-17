package br.com.digitalhouse.Exercicio1.Parte1;

import java.util.HashMap;
import java.util.Map;

public class Principal {

    public static void main(String[] args) {

        Map<Integer,String> loteria = new HashMap<>();

        loteria.put(0,"Ovos");
        loteria.put(1,"Água");
        loteria.put(2,"Escopeta");
        loteria.put(3,"Cavalo");
        loteria.put(4,"Dentista");
        loteria.put(5,"Fogo");

        for (Integer chave:loteria.keySet()) {
            System.out.println(loteria.get(chave));
        }



    }
}
