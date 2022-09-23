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
public class Logica {
    Usuario usuarioS;

    public Logica() {
    }
    
    public ArrayList<Mona> traerInfo(String equipo){
        ArrayList<Mona> monas = new ArrayList<>();
        monas.add(new Mona(1,"Messi","Argentina","https://github.com/AlejoSuaterna/album-Panini/blob/main/ImagenesPanini/ARGENTINA/MESSI.png?raw=true"));
        usuarioS = new Usuario(1, "hugo","hugo","","", monas);
        return monas;
    }
    
}
