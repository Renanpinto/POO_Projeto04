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
            usuarios = setUsuarios();
            return usuarios;
        }
        return usuarios;
    }

    public static ArrayList<Usuario> setUsuarios() {
        Usuario vitor = new Usuario(
        "Vitor",
                "123",
                0
        );
        usuarios.add(vitor);
        Usuario Renan = new Usuario(
        "Renan",
                "123",
                0
        );
        usuarios.add(Renan);
        Usuario Victor = new Usuario(
        "Victor",
                "123",
                0
        );
        usuarios.add(Victor);
        Usuario Fabin = new Usuario(
        "Fabin",
                "123",
                0
        );
        usuarios.add(Fabin);
        return usuarios;
    }
    
    
    
}
