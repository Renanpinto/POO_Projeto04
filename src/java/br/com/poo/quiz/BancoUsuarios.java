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
    private static ArrayList<Quiz> QuizzesEfetuados;
    public static ArrayList<Usuario> getUsuarios() {
        if(usuarios == null){
            usuarios = new ArrayList<>();
            
        }
        return usuarios;
    }
    
    private static ArrayList<Quiz> getQuizzesEfetuados(){
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
    
    public static boolean atualizarMediaUser(String nomeUsuario, double acertosQuiz){
        int i = 0;
        for(Usuario u: BancoUsuarios.getUsuarios()){
            if(u.getNmUsuario().equals(nomeUsuario)){
                double mediaNota = 0;
                if(u.getMediaNota() == 0){
                    mediaNota = acertosQuiz;
                }else{
                    mediaNota = (u.getMediaNota() + acertosQuiz)/2;
                }
                u.setMediaNota(mediaNota);
                BancoUsuarios.getUsuarios().remove(i);
                BancoUsuarios.getUsuarios().add(i, u);
                return true;
            }
            i++;
        }
        return false;
    }
    
     public static double obterMediaUser(String nomeUser){
        for(Usuario u : BancoUsuarios.getUsuarios()){
           if(u.getNmUsuario().equals(nomeUser)){
                return u.getMediaNota();
           }
        }
        
        return Usuario.getMediaNota();
    }
     public static boolean addQuizEfetuado(Quiz quiz){
        BancoUsuarios.getQuizzesEfetuados().add(quiz);
        return true;
    }
    public static Usuario getUser(int i){
        return BancoUsuarios.getUsuarios().get(i);
    }
    public static int totalUsers(){
        return BancoUsuarios.getUsuarios().size();
    }
    public static Quiz getQuizEfetuado(int i){
        return BancoUsuarios.getQuizzesEfetuados().get(i);
    }
    public static int totalQuizzesEfetuados(){
        return BancoUsuarios.getQuizzesEfetuados().size();
    }
}
