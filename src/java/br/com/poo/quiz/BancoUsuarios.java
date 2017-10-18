/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.poo.quiz;


import java.util.ArrayList;

/**
 *
 * @author vitor
 */
public class BancoUsuarios {
    
    public static ArrayList<Usuario> usuarios;
    public static ArrayList<Usuario> QuizzesEfetuados;
    
    public static ArrayList<Usuario> getUsuarios() {
        if(usuarios == null){
            usuarios = new ArrayList<>();
            
        }
        return usuarios;
    }
    
    public static ArrayList<Usuario> getQuizzesEfetuados(){
        if (QuizzesEfetuados == null){
            QuizzesEfetuados = new ArrayList<>();
        }
        return QuizzesEfetuados;
    }

    public static ArrayList<Usuario> setUsuarios(String nmUsuario, String nmSenhaUsuario) {
        Usuario newUser = new Usuario(nmUsuario,nmSenhaUsuario,0);
        usuarios.add(newUser);
        return usuarios;
    }
    
    public static void setNovaPontuacaoUsuario(String usuario, int acertos){
        for (Usuario u : BancoUsuarios.getUsuarios()) {
            if(u.getNmUsuario().equals(usuario))
                u.setQtPontuacoesUsuario(100.0 * ((double) acertos / 10.0));
        }
    }
    
     public static double obterMediaUser(String usuario){
        for(Usuario u : BancoUsuarios.getUsuarios()){
           if(u.getNmUsuario().equals(usuario)){
                return u.CalculaMediaPontuacao();
           }
        }
        
        return 0;
    }
     public static boolean addQuizEfetuado(Usuario quiz){
        BancoUsuarios.getQuizzesEfetuados().add(quiz);
        return true;
    }
    public static Usuario getUser(int i){
        return BancoUsuarios.getUsuarios().get(i);
    }
    public static Usuario getQuizEfetuado(int i){
        return BancoUsuarios.getQuizzesEfetuados().get(i);
    }
    public static int totalQuizzesEfetuados(){
        return BancoUsuarios.getQuizzesEfetuados().size();
    }
}
