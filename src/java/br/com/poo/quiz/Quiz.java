
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
        "3 - Alguém te perguntou como é que foi seu dia?<br> Uma palavra amiga, uma notícia boa.<br> Isso faz falta no dia a dia...",
                "Charlie Brown Jr. - Céu Azul",
                new String[] {"Seu pai", "Sua mae", "Seu tio", "Charlie Brown Jr. - Céu Azul"}
        );
        questoes.add(terceiraQuestao);
        Questao quartaQuestao = new Questao(
        "4 - Mama, oh!<br>" +
"Didn't mean to make you cry.<br>" +
"If I'm not back again this time tomorrow,<br>" +
"Carry on, carry on.",
                "Queen - Bohemian Rhapsody",
                new String[] {"Seu pai", "Sua mae", "Seu tio", "Queen - Bohemian Rhapsody"}
        );
        questoes.add(quartaQuestao);
        Questao quintaQuestao = new Questao(
        "5 - Veja, olhe outra vez o rosto na multidão, a multidão é um monstro sem rosto e coração.",
                "Racionais - Negro Drama",
                new String[] {"Seu pai", "Sua mae", "Seu tio", "Racionais - Negro Drama"}
        );
        questoes.add(quintaQuestao);
        Questao sextaQuestao = new Questao(
        "6 - Disparo balas de canhão<br>" +
"É inútil pois existe um grão-vizir<br>" +
"Há tantas violetas velhas sem um colibri<br>" +
"Queria usar, quem sabe, uma camisa de força ou de " +
"vênus<br>" +
"Mas não vou gozar de nós apenas um cigarro<br>" +
"Nem vou lhe beijar, gastando assim o meu batom",
                "",
                new String[] {"Seu pai", "Sua mae", "Seu tio", "Zé Ramalho - Chão de Giz"}
        );
        questoes.add(sextaQuestao);
        Questao setimaQuestao = new Questao(
        "7 - Eu descobri que azul é a cor da parede da casa de Deus, e não há mais ninguém como você e eu.",
                "Charlie Brown - Lugar ao Sol",
                new String[] {"Seu pai", "Sua mae", "Seu tio", "Charlie Brown - Lugar ao Sol"}
        );
        questoes.add(setimaQuestao);
        Questao oitavaQuestao = new Questao(
        "8 - We don't need no education <br>" +
"We don't need no thought control",
                "Pink Floyd - Another Brick In The Wall",
                new String[] {"Seu pai", "Sua mae", "Seu tio", "Pink Floyd - Another Brick In The Wall"}
        );
        questoes.add(oitavaQuestao);
        Questao nonaQuestao = new Questao(
        "9 - Longe do meu domínio<br>" +
"Cê vai de mal a pior<br>" +
"Vem que eu te ensino<br>" +
"Como ser bem melhor...",
                "Kid Abelha - Como eu quero",
                new String[] {"Seu pai", "Sua mae", "Seu tio", "Kid Abelha - Como eu quero"}
        );
        questoes.add(nonaQuestao);
        Questao decimaQuestao = new Questao(
        "10 - So, so you think you can tell\n" +
"Heaven from Hell,<br>" +
"Blue skys from pain.<br>" +
"Can you tell a green field<br>" +
"From a cold steel rail?<br>" +
"A smile from a veil?<br>" +
"Do you think you can tell?",
                "Pink Floyd - Wish You Were Here",
                new String[] {"Seu pai", "Sua mae", "Seu tio", "Pink Floyd - Wish You Were Here"}
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
