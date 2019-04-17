package br.com.digitalhouse.Exercicio1.Parte2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Exercicio1 {

    public static void main(String[] args) {

        List<String> joao = new ArrayList<>();
        List<String> miguel = new ArrayList<>();
        List<String> maria = new ArrayList<>();
        List<String> lucas = new ArrayList<>();

        joao.add("Juan");
        joao.add("Fissura");
        joao.add("Maromba");

        miguel.add("Night Watch");
        miguel.add("Bruce Wayne");
        miguel.add("Tampinha");

        maria.add("Wonder Woman");
        maria.add("Mary");
        maria.add("Marilene");

        lucas.add("Lukinha");
        lucas.add("Jorge");
        lucas.add("George");

        Map<String, List<String>> apelidos = new HashMap<>();

        apelidos.put("joao",joao);
        apelidos.put("miguel",miguel);
        apelidos.put("maria",maria);
        apelidos.put("lucas",lucas);

        for (String chave: apelidos.keySet()  ) {
            System.out.println(chave + " - " + apelidos.get(chave));
        }



    }
}
