/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.t1examen;

/**
 *
 * @author UCC20324
 */
public class Trabajador {
    private String nombre;
    private String tipoDoc;
    private String numDoc;
    private String regimen;
    private String pension;
    private double sueldo;
    private int hijos;
    private boolean turnoNoche;

    public Trabajador(String nombre, String tipoDoc, String numDoc,
                      String regimen, String pension, double sueldo,
                      int hijos, boolean turnoNoche) {

        this.nombre = nombre;
        this.tipoDoc = tipoDoc;
        setNumDoc(numDoc); 
        this.regimen = regimen;
        this.pension = pension;
        this.sueldo = sueldo;
        this.hijos = hijos;
        this.turnoNoche = turnoNoche;
    }

   
    public void setNumDoc(String numDoc) {
        if (tipoDoc.equalsIgnoreCase("DNI") && numDoc.length() != 8) {
            throw new IllegalArgumentException("DNI debe tener 8 dígitos");
        }
        if (tipoDoc.equalsIgnoreCase("CE") && numDoc.length() != 11) {
            throw new IllegalArgumentException("CE debe tener 11 dígitos");
        }
        this.numDoc = numDoc;
    }

    
    public double calcularPension() {
        switch (pension.toUpperCase()) {
            case "INTEGRA": return sueldo * 0.121;
            case "PRIMA": return sueldo * 0.125;
            case "HABITAT": return sueldo * 0.127;
            case "ONP": return sueldo * 0.13;
            default: return 0;
        }
    }

    
    public double calcularBonos() {
        double bono = 0;

        if (regimen.equals("728")) {
            bono += 100; 
        }

        if (hijos > 0) {
            bono += 50;
        }

        if (turnoNoche) {
            bono += 80;
        }

        return bono;
    }

   
    public double calcularSueldoFinal() {
        return sueldo + calcularBonos() - calcularPension();
    }

   @Override  // ESTO AYUDA A QUE DIFERENCIE MAYUSCULA Y MINUSCULA
    public String toString() {
        return "Nombre: " + nombre +
               "\nDoc: " + numDoc +
               "\nRegimen: " + regimen +
               "\nPension: " + pension +
               "\nSueldo Final: " + calcularSueldoFinal() +
               "\n---------------------------";
    }
}
