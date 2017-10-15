/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package br.com.poo.quiz;

/**
 * 
 * @author Sammy Guergachi <sguergachi at gmail.com>
 */
public class Usuario {
    private int cdUsuario;
    private String nmUsuario;
    private String nmSenhaUsuario;
    private int qtPontuacaoUsuario;
    private int qtMediaPontuacaoUsuario;
    private int[] qtUltimaPontuacaoUsuario;

    public int getCdUsuario() {
        return cdUsuario;
    }

    public void setCdUsuario(int cdUsuario) {
        this.cdUsuario = cdUsuario;
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

    public int getQtPontuacaoUsuario() {
        return qtPontuacaoUsuario;
    }

    public void setQtPontuacaoUsuario(int qtPontuacaoUsuario) {
        this.qtPontuacaoUsuario = qtPontuacaoUsuario;
    }

    public int getQtMediaPontuacaoUsuario() {
        return qtMediaPontuacaoUsuario;
    }

    public void setQtMediaPontuacaoUsuario(int qtMediaPontuacaoUsuario) {
        this.qtMediaPontuacaoUsuario = qtMediaPontuacaoUsuario;
    }

    public int[] getQtUltimaPontuacaoUsuario() {
        return qtUltimaPontuacaoUsuario;
    }

    public void setQtUltimaPontuacaoUsuario(int[] qtUltimaPontuacaoUsuario) {
        this.qtUltimaPontuacaoUsuario = qtUltimaPontuacaoUsuario;
    }
    
    
}
