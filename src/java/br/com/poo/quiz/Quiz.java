package br.com.poo.quiz;

import java.util.ArrayList;
import java.util.Collections;

public class Quiz {
    public static int quantidade;
    public static double soma;
    private static ArrayList<Questao> questoes;
//    private String usuarioTestado;
//
//    public String getUsuarioTestado() {
//        return usuarioTestado;
//    }
//    
//    public Quiz(int quantidade, double soma, String usuarioTestado) {
//        Quiz.quantidade = quantidade;
//        Quiz.soma = soma;
//    }
    
    public static double getMedia(){
        return (soma / (double)quantidade)*10;
    }
    
    
    private static ArrayList<Questao> setQuestoes(){
        
        Questao primeiraQuestao = new Questao(
        "O que é uma CLASSE?",
                "Abstração das características relevantes de um grupo de coisas do mundo real",
                new String[] {"Abstração das características irrelevantes de um grupo de coisas do mundo real.",
                    "Abstração das características elegantes de um grupo de coisas do mundo real.",
                  "Abstração das características relevantes de um grupo de coisas do mundo real",
                  "Abstração das características relevantes de situações reais do mundo."}
        );
        questoes.add(primeiraQuestao);
       Questao segundaQuestao =  new Questao(
        "Um objeto pode representar:",
                "Entidades físicas, conceituais e de software",
                new String[] {"Somente entidades físicas (ex. aluno, carro)", 
                    "Entidades físicas, conceituais e de software",
                    "Somente entidades conceituais (ex. empréstimo, processo)"}
        );
        questoes.add(segundaQuestao);
        
        Questao terceiraQuestao = new Questao(
        "Não é um dos princípios de orientação a objetos:",
                "Tarefas não são realizadas por objetos por meio de requisição de serviços.",
                new String[] {"Tarefas não são realizadas por objetos por meio de requisição de serviços.", 
                    "Qualquer coisa do mundo pode ser um objeto",
                    "Cada objeto é originado a partir de uma classe."}
        );
        questoes.add(terceiraQuestao);
        
        Questao quartaQuestao = new Questao(
        "Um aluno chamado José Carlos do curso de Informática efetua matrícula nas disciplinas de Matemática, Física e Programação. Quais são os objetos da sentença?",
                "José Carlos, Informática, Matemática, Física e Programação",
                new String[] {"Aluno, curso, matrícula e disciplina", 
                    "José Carlos, Informática, Matemática, Física e Programação", 
                    "José Carlos, Informática e disciplinas"}
        );
        questoes.add(quartaQuestao);
        Questao quintaQuestao = new Questao(
        "Em relação aos atributos, é correto dizer que:",
                "São propriedades de uma classe que definem os valores possíveis para as instâncias das propriedades",
                new String[] {"São propriedades de uma classe que definem os valores possíveis para as instâncias das propriedades",
                    "Uma classe deve ter ao menos um atributo",
                    "Atributos e operações são sinônimos"}
        );
        questoes.add(quintaQuestao);
     
        Questao sextaQuestao = new Questao(
        "Um dos criadores do termo \"Programação Orientada a Objetos\"",
                "Alan Curtis Kay",
                new String[] {"Kristen Kay", 
                    "Alan Curtis Kay",
                    "Dahl Kay"}
        );
        questoes.add(sextaQuestao);
        
        Questao setimaQuestao = new Questao(
        "São atributos da Classe Professor:",
                "nome, endereço, telefone.",
                new String[] {"nome, endereço, telefone.",
                    "nome, falar, cor, telefone.",
                    "nome, lecionar, CPF, RG."}
        );
        questoes.add(setimaQuestao);
        Questao oitavaQuestao = new Questao(
        "Marque a alternativa incorreta Em relação à definição de classe:",
                "Classes não representam necessariamente um conjunto de objetos do mundo real, podem representar objetos de software",
                new String[] {"Uma classe é uma coleção de objetos.", 
                    "Classes não representam necessariamente um conjunto de objetos do mundo real, podem representar objetos de software",
                    "Uma classe serve como template(modelo) para se criar objetos."}
        );
        questoes.add(oitavaQuestao);
        
        Questao nonaQuestao = new Questao(
        "Qual Linguagem não é orientada a objetos?",
                "DELPHI",
                new String[] {"SIMULA", 
                    "SMALLTALK",
                    "DELPHI"}
        );
        questoes.add(nonaQuestao);
        
        Questao decimaQuestao = new Questao(
        "O que é INSTÂNCIA?",
                "O ato de a classe criar um novo objeto.",
                new String[] {"O ato de a objeto criar um novo objeto.",
                    "O ato de a classe criar um novo objeto.",
                    "O ato de a classe criar uma nova classe."}
        );
        questoes.add(decimaQuestao);
        
        Collections.shuffle(questoes);
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
