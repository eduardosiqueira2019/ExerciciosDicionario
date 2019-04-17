package br.com.digitalhouse.Exercicio4;

import java.util.ArrayList;
import java.util.List;

public abstract class Peca {

    private String marcaDaPeca;
    private String modeloDaPeca;
    private List<String> listaClassPeca = new ArrayList<>();


    public String getMarcaDaPeca(){
        return marcaDaPeca;
    }

    public void setMarcaDaPeca(String novaMarca){
        marcaDaPeca = novaMarca;
    }

    public String getModeloDaPeca(){
        return modeloDaPeca;
    }

    public void setModeloDaPeca(String novoModelo){
        modeloDaPeca = novoModelo;
    }

    public List<String> getListaClassPeca() {
        return listaClassPeca;
    }

    public void setListaClassPeca(List<String> listaClassPeca) {
        this.listaClassPeca = listaClassPeca;
    }
}
