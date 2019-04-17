package br.com.digitalhouse.Exercício2;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Listas {

    private List<Integer> integerList = new ArrayList<>();
    private Set<Integer> integerSet = new HashSet<>();

    public List<Integer> getIntegerList(){
        return integerList;
    }
    public void setIntegerList(Integer valor){
        integerList.add(valor);
    }

    public Set<Integer> getIntegerSet (){
        return integerSet;
    }
    public void setIntegerSet(Integer valor){
       integerSet.add(valor);
    }

}
