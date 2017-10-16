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
    public List<Double> qtPontuacoesUsuario;

    public Usuario(String nmUsuario, String nmSenhaUsuario, double pontuacao) {
        this.nmUsuario = nmUsuario;
        this.nmSenhaUsuario = nmSenhaUsuario;
        this.qtPontuacoesUsuario.add(pontuacao);
    }
    
    public double CalculaMediaPontuacao(){
        double soma = 0;
        for(Double pontuacao : qtPontuacoesUsuario){
            soma+=pontuacao;
        }
        return soma;
    }
    
    public double RetornaUltimaPontuacao(){
        return qtPontuacoesUsuario.get(qtPontuacoesUsuario.lastIndexOf(qtPontuacoesUsuario));
    }

    public List<Double> getQtPontuacoesUsuario() {
        return qtPontuacoesUsuario;
    }

    public void setQtPontuacoesUsuario(double pontuacao) {
        this.qtPontuacoesUsuario.add(pontuacao);
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
