package br.com.poo.quiz;

import java.util.ArrayList;
import java.util.List;


public class Usuario {
    private String nmUsuario;
    private String nmSenhaUsuario;
    public ArrayList<Double> qtPontuacoesUsuario;

    public Usuario(String nmUsuario, String nmSenhaUsuario, double mediaNota) {
        this.nmUsuario = nmUsuario;
        this.nmSenhaUsuario = nmSenhaUsuario;
    }
    
    public double CalculaMediaPontuacao(){
        if(qtPontuacoesUsuario == null)
            return 0;
        double soma = 0;
        for(Double pontuacao : qtPontuacoesUsuario){
            soma+=pontuacao;
        }
        return soma;
    }
    
    public double RetornaUltimaPontuacao(){
        return qtPontuacoesUsuario.get(qtPontuacoesUsuario.lastIndexOf(qtPontuacoesUsuario));
    }

    public ArrayList<Double> getQtPontuacoesUsuario() {
        return qtPontuacoesUsuario;
    }

    public void setQtPontuacoesUsuario(double pontuacao) {
        if(qtPontuacoesUsuario == null){
            qtPontuacoesUsuario = new ArrayList<>();
            this.qtPontuacoesUsuario.add(pontuacao);
        }
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
