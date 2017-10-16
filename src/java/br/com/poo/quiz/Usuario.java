/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package br.com.poo.quiz;

import java.util.List;

/**
 * 
 * @author Sammy Guergachi <sguergachi at gmail.com>
 */
public class Usuario {
    private String nmUsuario;
    private String nmSenhaUsuario;
    private List<Double> qtPontuacaoUsuario;
    private double qtUltimaPontuacaoUsuario;

    public List<Double> getQtPontuacaoUsuario() {
        return qtPontuacaoUsuario;
    }

    public void setQtPontuacaoUsuario(List<Double> qtPontuacaoUsuario) {
        this.qtPontuacaoUsuario = qtPontuacaoUsuario;
    }
    
    public double CalculaMediaPontuacaoUsuario(int quantidadeQuizRespondidos){
        double soma = 0;
        for(Double pontuacao : qtPontuacaoUsuario){
            soma+=pontuacao;
        }
        return soma/quantidadeQuizRespondidos;
    }

    public double getQtUltimaPontuacaoUsuario() {
        //seleciona a posicao na lista da ultima pontuacao, e retorna a pontuacao da posicao selecionada (a ultima nesse caso)
        return qtPontuacaoUsuario.get(qtPontuacaoUsuario.lastIndexOf(qtPontuacaoUsuario));
    }

    public String getNmUsuario() {
        return nmUsuario;
    }

    public void setNmUsuario(String nmUsuario) {
        this.nmUsuario = nmUsuario;
    }

    public String getNmSenhaUsuario() {
        return nmSenhaUsuario;
    }

    public void setNmSenhaUsuario(String nmSenhaUsuario) {
        this.nmSenhaUsuario = nmSenhaUsuario;
    }

    
}
