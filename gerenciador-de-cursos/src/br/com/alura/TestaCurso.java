package br.com.alura;

import java.util.List;

public class TestaCurso {

    public static void main(String[] args) {
        Curso javaColecoes = new Curso("Dominando as coleõões do Java", "Paulo Silveira");


        //javaColecoes.getAulas().add(new Aula("Trabalhando com ArrayList", 21));
        javaColecoes.adiciona(new Aula("Trabalhando com ArrayList", 21));
        javaColecoes.adiciona(new Aula("Criando uma aula", 20));
        javaColecoes.adiciona(new Aula("Modelando com coleções", 22));

        List<Aula> aulas = javaColecoes.getAulas();
        System.out.println(javaColecoes.getAulas());

        System.out.println(aulas == javaColecoes.getAulas());


    }
}
