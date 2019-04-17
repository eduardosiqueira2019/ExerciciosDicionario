package br.com.digitalhouse.Exercicio4;


import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GuardaVolumes extends Peca {

    private Map<Integer,String> dicionarioDePecas = new HashMap<>();
    private Integer contador = 0;



    public Integer guardarPecas(List<Peca> listaDePeca){
        contador += listaDePeca.size();
        dicionarioDePecas.put(contador,listaDePeca.get(contador).toString());
        return contador;
    }

    public void mostrarPecas(){
        for (Integer indice:dicionarioDePecas.keySet()) {
            System.out.println(indice + " - " + dicionarioDePecas.get(indice).toString());
        }
    }

    public void mostrarPecas(Integer numero) {
        for(Integer indice: dicionarioDePecas.keySet()) {
            if (indice == numero){
                System.out.println(dicionarioDePecas.get(numero).toString());
            }
        }
    }

    public void devolverPecas(Integer numero) {
        for(Integer indice: dicionarioDePecas.keySet()){
            if (numero==indice){
                dicionarioDePecas.remove(numero);
            }
        }
    }


}
