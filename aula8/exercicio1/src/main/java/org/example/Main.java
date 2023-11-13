package org.example;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        //Nomes: "Ana", "Roberta", "José","Bel"
        List<String> listaNomes = Arrays.asList("Ana", "Roberta", "José","Bel", "Bel", "José", "Damião", "Lua", "Rodiner");

        //a) Conte o número total de strings na lista.
        //b) Encontre a string mais longa presente na lista.
        //c) Conte quantas vezes cada string aparece na lista e exiba a contagem para as 5 strings mais frequentes.

        long a = listaNomes.stream()
                .count();


        List<String> b = listaNomes.stream()
                .filter(nome -> )
                .collect(Collectors.toList());

        List<String> c = listaNomes.stream()
                .filter(nome -> nome.startsWith("A"))
                .collect(Collectors.toList());

        System.out.println("Nós temos exatamente "+a+" nomes.");
        System.out.println("O nome mais longo da lista é: "+b);
        System.out.println("Essas são os nomes que mais aparecem na lista: "+c);

    }
}