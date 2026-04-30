/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.t1examen;

import java.util.ArrayList;

/**
 *
 * @author UCC20324
 */
public class Controlador {
    private ArrayList<Trabajador> lista = new ArrayList<>();

    public void agregar(Trabajador t) {
        lista.add(t);
    }

    public void listar() {
        for (Trabajador t : lista) {
            System.out.println(t);
        }
    }
    
}
