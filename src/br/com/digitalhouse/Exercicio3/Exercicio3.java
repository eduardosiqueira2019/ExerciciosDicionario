package br.com.digitalhouse.Exercicio3;

import java.util.HashSet;
import java.util.Set;

public class Exercicio3 {
    public static void main(String[] args) {
        Prova prova = new Prova();
        Set<Integer> valores = new HashSet<>();

        valores.add(1);
        valores.add(34);
        valores.add(40);
        valores.add(10);
        valores.add(2);
        valores.add(11);
        valores.add(50);
        valores.add(4);
        valores.add(44);
        valores.add(78);
        valores.add(9);

        prova.somaTotal(valores);



    }
}
