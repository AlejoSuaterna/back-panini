/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidad;

import java.util.ArrayList;

/**
 *
 * @author a
 */
public class Usuario {
    String user;
    int id;
    String password;
    String nombre;
    String apellido;
    ArrayList<Mona> monas;

    public Usuario( int id, String user, String password, String nombre, String apellido, ArrayList<Mona> monas) {
        this.user = user;
        this.id = id;
        this.password = password;
        this.nombre = nombre;
        this.apellido = apellido;
        this.monas = monas;
    }
    
}
