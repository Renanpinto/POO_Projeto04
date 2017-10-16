
package br.com.poo.quiz;

import java.util.ArrayList;

public class Quiz {
    public static int quantidade;
    public static double soma;
    private static ArrayList<Questao> questoes;
    
    public static double getMédia(){
        return soma / (double)quantidade;
    }
    
    public static ArrayList<Questao> setQuestoes(){
        Questao primeiraQuestao = new Questao(
        "1 - O que é, o que é, clara e salgada. Cabe em um olho e pesa uma tonelada?",
                "Racionais - Jesus Chorou",
                new String[] {"Seu pai", "Sua mae", "Seu tio", "Racionais - Jesus Chorou"}
        );
        questoes.add(primeiraQuestao);
        Questao segundaQuestao =  new Questao(
        "2 - Nosso suor sagrado, é bem mais belo que esse sangue amargo.",
                "k",
                new String[] {"Seu pai", "Sua mae", "Seu tio", "Legião Urbana - Tempo Perdido"}
        );
        questoes.add(segundaQuestao);
        Questao terceiraQuestao = new Questao(
        "",
                "",
                new String[] {"Seu pai", "Sua mae", "Seu tio", "Racionais - Jesus Chorou"}
        );
        questoes.add(terceiraQuestao);
        Questao quartaQuestao = new Questao(
        "",
                "",
                new String[] {"Seu pai", "Sua mae", "Seu tio", "Racionais - Jesus Chorou"}
        );
        questoes.add(quartaQuestao);
        Questao quintaQuestao = new Questao(
        "5 - Veja, olhe outra vez o rosto na multidão, a multidão é um monstro sem rosto e coração.",
                "Racionais - Negro Drama",
                new String[] {"Seu pai", "Sua mae", "Seu tio", "Racionais - Jesus Chorou"}
        );
        questoes.add(quintaQuestao);
        Questao sextaQuestao = new Questao(
        "",
                "",
                new String[] {"Seu pai", "Sua mae", "Seu tio", "Racionais - Jesus Chorou"}
        );
        questoes.add(sextaQuestao);
        Questao setimaQuestao = new Questao(
        "",
                "",
                new String[] {"Seu pai", "Sua mae", "Seu tio", "Racionais - Jesus Chorou"}
        );
        questoes.add(setimaQuestao);
        Questao oitavaQuestao = new Questao(
        "",
                "",
                new String[] {"Seu pai", "Sua mae", "Seu tio", "Racionais - Jesus Chorou"}
        );
        questoes.add(oitavaQuestao);
        Questao nonaQuestao = new Questao(
        "",
                "",
                new String[] {"Seu pai", "Sua mae", "Seu tio", "Racionais - Jesus Chorou"}
        );
        questoes.add(nonaQuestao);
        Questao decimaQuestao = new Questao(
        "",
                "",
                new String[] {"Seu pai", "Sua mae", "Seu tio", "Racionais - Jesus Chorou"}
        );
        questoes.add(decimaQuestao);
        
        return questoes;
        
    }
    
    public static ArrayList<Questao> getQuestoes(){
        if (questoes == null){
            questoes = new ArrayList<>();
            questoes = setQuestoes();
        }
    return questoes;
    }
    
    
}
