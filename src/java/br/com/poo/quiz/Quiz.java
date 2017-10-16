
package br.com.poo.quiz;

import java.util.ArrayList;

public class Quiz {
    public static int quantidade;
    public static double soma;
    private static ArrayList<Questao> questoes;
    
    public static double getMédia(){
        return soma / (double)quantidade;
    }
    
    private static ArrayList<Questao> setQuestoes(){
        Questao primeiraQuestao = new Questao(
        "1 - O que é, o que é, clara e salgada. Cabe em um olho e pesa uma tonelada?",
                "Racionais - Jesus Chorou",
                new String[] {"Seu pai", "Sua mae", "Seu tio", "Racionais - Jesus Chorou"}
        );
        questoes.add(primeiraQuestao);
        Questao segundaQuestao =  new Questao(
        "2 - Nosso suor sagrado, é bem mais belo que esse sangue amargo.",
                "Legião Urbana - Tempo Perdido",
                new String[] {"Seu pai", "Sua mae", "Seu tio", "Legião Urbana - Tempo Perdido"}
        );
        questoes.add(segundaQuestao);
        Questao terceiraQuestao = new Questao(
        "3 - Alguém te perguntou como é que foi seu dia? Uma palavra amiga, uma notícia boa. Isso faz falta no dia a dia...",
                "Charlie Brown Jr. - Céu Azul",
                new String[] {"Seu pai", "Sua mae", "Seu tio", "Charlie Brown Jr. - Céu Azul"}
        );
        questoes.add(terceiraQuestao);
        Questao quartaQuestao = new Questao(
        "4 - Sei lá",
                "",
                new String[] {"Seu pai", "Sua mae", "Seu tio", "Charlie Brown - Lugar ao Sol"}
        );
        questoes.add(quartaQuestao);
        Questao quintaQuestao = new Questao(
        "5 - Veja, olhe outra vez o rosto na multidão, a multidão é um monstro sem rosto e coração.",
                "Racionais - Negro Drama",
                new String[] {"Seu pai", "Sua mae", "Seu tio", "Racionais - Negro Drama"}
        );
        questoes.add(quintaQuestao);
        Questao sextaQuestao = new Questao(
        "5 - Sei lá",
                "",
                new String[] {"Seu pai", "Sua mae", "Seu tio", "Racionais - Jesus Chorou"}
        );
        questoes.add(sextaQuestao);
        Questao setimaQuestao = new Questao(
        "6 - Eu descobri que azul é a cor da parede da casa de Deus, e não há mais ninguém como você e eu.",
                "Charlie Brown - Lugar ao Sol",
                new String[] {"Seu pai", "Sua mae", "Seu tio", "Charlie Brown - Lugar ao Sol"}
        );
        questoes.add(setimaQuestao);
        Questao oitavaQuestao = new Questao(
        "7 - Sei lá",
                "",
                new String[] {"Seu pai", "Sua mae", "Seu tio", "Racionais - Jesus Chorou"}
        );
        questoes.add(oitavaQuestao);
        Questao nonaQuestao = new Questao(
        "8 - Sei lá",
                "",
                new String[] {"Seu pai", "Sua mae", "Seu tio", "Racionais - Jesus Chorou"}
        );
        questoes.add(nonaQuestao);
        Questao decimaQuestao = new Questao(
        "9 - Sei lá",
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
