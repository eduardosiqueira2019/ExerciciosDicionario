package br.com.digitalhouse.Exercicio4;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        //criar um cenário em que alguém guarda duas peças,
        //recebe o código e depois retira suas peças.

        GuardaVolumes volumesPecas = new GuardaVolumes();
        List<String> listaMain = new ArrayList<>();

        listaMain.add("teste");

        volumesPecas.setListaClassPeca(listaMain);

        volumesPecas.setMarcaDaPeca("Nike");
        volumesPecas.setMarcaDaPeca("Adidas");
        volumesPecas.setModeloDaPeca("Esportivo");
        volumesPecas.setModeloDaPeca("Social");







    }
}
