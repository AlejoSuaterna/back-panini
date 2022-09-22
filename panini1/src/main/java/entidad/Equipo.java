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
public class Equipo {
    ArrayList<Mona> jugadores;
    String nombre;
    int id;

    public Equipo(ArrayList<Mona> jugadores, String nombre, int id) {
        this.jugadores = jugadores;
        this.nombre = nombre;
        this.id = id;
    }
    
}
