package br.com.digitalhouse.Exercício2;

public class Principal {

    public static void main(String[] args) {

        //lista 1
        Listas listas = new Listas();

        listas.setIntegerList(1);
        listas.setIntegerList(5);
        listas.setIntegerList(5);
        listas.setIntegerList(6);
        listas.setIntegerList(7);
        listas.setIntegerList(8);
        listas.setIntegerList(8);
        listas.setIntegerList(8);

        System.out.println(listas.getIntegerList().toString());

        //lista 2
        listas.setIntegerSet(1);
        listas.setIntegerSet(5);
        listas.setIntegerSet(5);
        listas.setIntegerSet(6);
        listas.setIntegerSet(7);
        listas.setIntegerSet(8);
        listas.setIntegerSet(8);
        listas.setIntegerSet(8);

        System.out.println(listas.getIntegerSet().toString());

    }
}
