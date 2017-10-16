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

    public static ArrayList<Usuario> getUsuarios() {
        if(usuarios == null){
            usuarios = new ArrayList<>();
            return usuarios;
        }
        return usuarios;
    }

    public static void setUsuarios(ArrayList<Usuario> usuarios) {
        BancoUsuarios.usuarios = usuarios;
    }
    
    
    
}
